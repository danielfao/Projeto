package backend.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

public class Relatorio {
	public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("Vendas" + usuario.getNome() + ".txt");
		BufferedWriter buffer = new BufferedWriter (arquivo);
		
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		buffer.write("==============\nVendas do funcionario: " + usuario.getNome() +
				"=============\n");
		for (int i=0; i< vendas.size(); i++){
			if(usuario.getCpf().equals(vendas.get(i).getUsuario().getCpf())){
				temVenda = true;
				if (vendas.get(i).getSeguro().getPessoa()!= null){
					double valorTotal = vendas.get(i).getValorLiquido();
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getPessoa().getNome() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
				else{
					double valorTotal = vendas.get(i).getValorLiquido();
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getEmpresa().getRazaoSocial() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
			}
		}
		
		if(temVenda == false){
			buffer.write("O usuario " + usuario.getNome() + " nao tem vendas.\n");
		}
		
		buffer.flush();
		arquivo.close();
	}
}
