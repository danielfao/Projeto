package backend.models;

import java.util.List;

public class Relatorio {
	public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas){
		System.out.println("=========================================\nVendas do funcionário: " + usuario.getNome() +
				"\n=========================================\n\n");
		for (int i=0; i< vendas.size(); i++){
			if(usuario.getCpf().equals(vendas.get(i).getUsuario().getCpf())){
				if (vendas.get(i).getSeguro().getPessoa()!= null){
					double valorTotal = vendas.get(i).getValorLiquido();
					valorTotal = (valorTotal*1.0738);
					System.out.println("Seguro do cliente: " + vendas.get(i).getSeguro().getPessoa().getNome() + "\nValor Total: "
							+ valorTotal);
				}
			}
			else
				System.out.println("Esse usuário não tem vendas.\n");
		}
	}
}
