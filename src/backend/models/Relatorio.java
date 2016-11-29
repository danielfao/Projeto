package backend.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

/** Class Relatorio related to create reports.
 * 
 * @author Daniel Oliveira / Maisa Rissi
 *
 */
public class Relatorio {
	
	/** Method responsible for creating sales reports in *.txt files of each employee.
	 * 
	 * @param usuario
	 * @param vendas
	 * @throws IOException
	 */
	/*public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendas" + usuario.getNome().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter (arquivo);
		
		double totalFuncionario = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de vendas =============\nFuncionario(a): " + usuario.getNome() + "\n");
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
			buffer.write("\nEsse funcionario nao possui vendas.\n");
		} else {
			buffer.write ("\n============== Somatoria das vendas =============");
			buffer.write ("\nValor total: R$ " + valorFormat.format(totalFuncionario));
		}
		
		System.out.println("Relatorio de venda do(a) usuario(a) " + usuario.getNome() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}*/
	
	/** Method responsible for creating sales reports in *.txt files of all employees.
	 * 
	 * @param usuarios
	 * @param vendas
	 * @throws IOException
	 */
	/*public void gerarVendasTodosFuncionarios(List<Usuario> usuarios, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendasTotais.txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double todosFuncionarios = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio total de vendas =============");
		
		for (int i=0; i<usuarios.size(); i++) {
			double valorTotal = 0;
			temVenda = false;
			
			buffer.write("\n\nFuncionario(a): " + usuarios.get(i).getNome() + "\n");
			
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
				buffer.write("Esse funcionario nao possui vendas.\n");
			} else {
				buffer.write("Valor total das vendas: R$ " + valorFormat.format(valorTotal) + "\n");
			}
		}
		buffer.write ("\n========= Somatoria das vendas de todos os funcionarios ========");
		buffer.write ("\nValor total: R$ " + valorFormat.format(todosFuncionarios));
		
		System.out.println("Relatorio de vendas totais gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}*/
	
	/** Method responsible for creating insurance reports that are active, in text files of regular clients.
	 * 
	 * @param cliente
	 * @param vendas
	 * @throws IOException
	 */
	/*public void gerarSegurosAtivosPorClienteFisico(ClienteFisico cliente, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("seguros" + cliente.getNome().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double totalCliente = 0;
		boolean temSeguroAtivo = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de Seguros =============\nCliente: " + cliente.getNome() + "\n");
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
			buffer.write("\nO(a) cliente " + cliente.getNome() + " nao tem seguros ativos.\n");
		} 

		System.out.println("Relatorio de seguros do cliente " + cliente.getNome() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}*/
	
	/** Method responsible for creating insurance reports that are active, in text files, by legal customer/client.
	 * 
	 * @param cliente
	 * @param vendas
	 * @throws IOException
	 */
	/*public void gerarSegurosAtivosPorClienteJuridico(ClienteJuridico cliente, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("seguros" + cliente.getRazaoSocial().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double totalCliente = 0;
		boolean temSeguroAtivo = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("============== Relatorio de Seguros =============\nCliente: " + cliente.getRazaoSocial() + "\n");
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
			buffer.write("\nO(a) cliente " + cliente.getRazaoSocial() + " nao tem seguros ativos.\n");
		} 

		System.out.println("Relatorio de seguros do cliente " + cliente.getRazaoSocial() + " gerado com sucesso!\n");
		
		buffer.flush();
		arquivo.close();
	}*/
	
	/** Method responsible for creating insurance reports that are inactive, in text files.
	 * 
	 * @param seguros
	 * @throws IOException
	 */
	/*public void gerarSegurosInativos (List<Seguro> seguros) throws IOException{
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
		
		
		System.out.println("Relatorio de seguros inativos gerado com sucesso!\n");

		buffer.flush();
		arquivo.close();
	}*/
}
