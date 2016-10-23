package backend.models;

import java.util.List;

public class Relatorio {
	public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas){
		boolean temVenda = false;
		System.out.println("=========================================\nVendas do funcionario: " + usuario.getNome() +
				"\n=========================================\n");
		for (int i=0; i< vendas.size(); i++){
			if(usuario.getCpf().equals(vendas.get(i).getUsuario().getCpf())){
				temVenda = true;
				if (vendas.get(i).getSeguro().getPessoa()!= null){
					double valorTotal = vendas.get(i).getValorLiquido();
					valorTotal = (valorTotal*1.0738);
					System.out.println("Seguro do cliente: " + vendas.get(i).getSeguro().getPessoa().getNome() + "\nValor Total: "
							+ valorTotal + "\n");
				}
				else{
					double valorTotal = vendas.get(i).getValorLiquido();
					valorTotal = (valorTotal*1.0738);
					System.out.println("Seguro do cliente: " + vendas.get(i).getSeguro().getEmpresa().getRazaoSocial() + "\nValor Total: "
							+ valorTotal + "\n");
				}
			}
		}
		
		if(temVenda == false){
			System.out.println("O usuario " + usuario.getNome() + " nao tem vendas.\n");
		}
	}
}
