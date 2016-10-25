package backend.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

public class Relatorio {
	public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendas" + usuario.getNome().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter (arquivo);
		
		double totalFuncionario = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de vendas do(a) funcionario(a): " + usuario.getNome() +
				" =============\n");
		for (int i=0; i< vendas.size(); i++){
			if(usuario.getCpf().equals(vendas.get(i).getUsuario().getCpf())){
				double valorTotal = vendas.get(i).getValorLiquido();
				temVenda = true;
				
				if (vendas.get(i).getSeguro().getPessoa()!= null){
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getPessoa().getNome() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
				else{
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getEmpresa().getRazaoSocial() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
				totalFuncionario = totalFuncionario + valorTotal;
			}
		}
		
		if(temVenda == false){
			buffer.write("O usuario " + usuario.getNome() + " nao tem vendas.\n");
		} else {
			buffer.write ("\n============== Somatoria das vendas =============");
			buffer.write ("\nValor total: R$ " + valorFormat.format(totalFuncionario));
		}
		
		System.out.println("Relatorio de venda do(a) usuario(a) " + usuario.getNome() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarVendasTodosFuncionarios(List<Usuario> usuarios, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendasTotais.txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double todosFuncionarios = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio total de vendas =============\n");
		
		for (int i=0; i<usuarios.size(); i++) {
			double valorTotal = 0;
			temVenda = false;
			
			buffer.write("\n============== Funcionario(a): " + usuarios.get(i).getNome() + " =============\n");
			
			for (int j=0; j<vendas.size(); j++) {
				if (usuarios.get(i).getCpf().equals(vendas.get(j).getUsuario().getCpf())){
					temVenda = true;
					double valorVenda = vendas.get(j).getValorLiquido();
					valorVenda = (valorVenda*1.0738);
					valorTotal = valorTotal + valorVenda;
				}	
			}	
		
			todosFuncionarios += valorTotal;
			
			if(temVenda == false){
				buffer.write("O usuario " + usuarios.get(i).getNome() + " nao tem vendas. \n");
			} else {
				buffer.write("Valor total das vendas: R$ " + valorFormat.format(valorTotal) + "\n");
			}
		}
		buffer.write ("\n============== Somatoria das vendas =============");
		buffer.write ("\nValor total: R$ " + valorFormat.format(todosFuncionarios));
		
		System.out.println("Relatorio de vendas totais gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarSegurosAtivosPorClienteFisico(ClienteFisico cliente, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendas" + cliente.getNome().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double totalCliente = 0;
		boolean temSeguroAtivo = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de Seguros do(a) Cliente: " + cliente.getNome() + " =============\n");
		for (Venda v : vendas) {
			if (v.getSeguro().getPessoa() != null){
				if(cliente.getCpf().equals(v.getSeguro().getPessoa().getCpf())){
					if(v.getSeguro().isAtivo() == true){
						double valorTotal = v.getValorLiquido();
						temSeguroAtivo = true;
						valorTotal = (valorTotal*1.0738);
						buffer.write("\nVeiculo: " + v.getSeguro().getVeiculoSeguro().getModelo() + " " + 
								v.getSeguro().getVeiculoSeguro().getAnoFabricacao() + "/" + 
								v.getSeguro().getVeiculoSeguro().getAnoModelo() + "\nValor Total: "	+ 
								valorFormat.format(valorTotal) + "\n");
						totalCliente = totalCliente + valorTotal;
					}
				}
			}	
		}
		
		if(temSeguroAtivo == false){
			buffer.write("O(a) cliente " + cliente.getNome() + " nao tem seguros ativos.\n");
		} 

		System.out.println("Relatorio de seguros do cliente " + cliente.getNome() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarSegurosAtivosPorClienteJuridico(ClienteJuridico cliente, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendas" + cliente.getRazaoSocial().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double totalCliente = 0;
		boolean temSeguroAtivo = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de Seguros do(a) Cliente: " + cliente.getRazaoSocial() + " =============\n");
		for (Venda v : vendas) {
			if (v.getSeguro().getEmpresa() != null){
				if(cliente.getRazaoSocial().equals(v.getSeguro().getEmpresa().getRazaoSocial())){
					if(v.getSeguro().isAtivo() == true){
						double valorTotal = v.getValorLiquido();
						temSeguroAtivo = true;
						valorTotal = (valorTotal*1.0738);
						buffer.write("\nVeiculo: " + v.getSeguro().getVeiculoSeguro().getModelo() + " " + 
								v.getSeguro().getVeiculoSeguro().getAnoFabricacao() + "/" + 
								v.getSeguro().getVeiculoSeguro().getAnoModelo() + "\nValor Total: "	+ 
								valorFormat.format(valorTotal) + "\n");
						totalCliente = totalCliente + valorTotal;
					}
				}
			}	
		}
		
		if(temSeguroAtivo == false){
			buffer.write("O(a) cliente " + cliente.getRazaoSocial() + " nao tem seguros ativos.\n");
		} 

		System.out.println("Relatorio de seguros do cliente " + cliente.getRazaoSocial() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarSegurosInativos (List<Seguro> seguros) throws IOException{
		Writer arquivo = new FileWriter("segurosInativos.txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);

		//boolean isInativo = true;
		
		buffer.write("============== Relatorio de Seguros Inativos =============\n");
		for (Seguro s : seguros) {
			if(s.isAtivo() == false){
				if (s.getPessoa() != null){
					buffer.write("\nCliente: " + s.getPessoa().getNome() + "\nVeiculo: " + s.getVeiculoSeguro().getModelo() + " " + 
						s.getVeiculoSeguro().getAnoFabricacao() + "/" + s.getVeiculoSeguro().getAnoModelo() + "\nVigencia: " + 
						s.getInicioVigencia() + " ate " + s.getFinalVigencia() + "\n");
				}
				else{
					buffer.write("\nCliente: " + s.getEmpresa().getRazaoSocial() + "\nVeiculo: " + s.getVeiculoSeguro().getModelo() + " " + 
							s.getVeiculoSeguro().getAnoFabricacao() + "/" + s.getVeiculoSeguro().getAnoModelo() + "\n"+ "\nVigencia: " + 
							s.getInicioVigencia() + " ate " + s.getFinalVigencia() + "\n");
				}
				//isInativo = false;
			}
		}
		
		/*if (isInativo == false){
			buffer.write("Nao existem seguros inativos!\n");
		}*/
		
		System.out.println("Relatorio de seguros inativos gerado com sucesso!\n");

		buffer.flush();
		arquivo.close();
	}
}
