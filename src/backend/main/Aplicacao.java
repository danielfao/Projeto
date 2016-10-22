package backend.main;

import java.util.ArrayList;
import java.util.List;

import backend.models.ClienteFisico;
import backend.models.ClienteJuridico;
import backend.models.Relatorio;
import backend.models.Seguro;
import backend.models.Usuario;
import backend.models.Veiculo;
import backend.models.Venda;

public class Aplicacao {

	public static void main(String[] args) {
		ClienteFisico clienteF = new ClienteFisico("Jose da Silva", "123", "09/10/1990", "(16)3355-5221", "Rua das Orquideas", 123, "Jd Paola", "13690-000", "Descalvado" , "SP", "Funcionario publico", "Casado");
		Veiculo veiculo1 = new Veiculo("Astra 2.0", "9BD12AUH8123876", "ABC-1992", 2012, 2013, 489374560, clienteF);
		Seguro seguro1 = new Seguro(clienteF, veiculo1, 6, "10/10/2015", "10/10/2016");
		Usuario usuario1 = new Usuario("Maisa Rissi", "234", "10/09/1991", "Rua das Alamedas, 345", "(16)99999-9999", "maisarissi", "123456");
		System.out.println(veiculo1);
		System.out.println("O bonus atual do cliente �: " +seguro1.getBonus());
		seguro1.temSinistro();
		seguro1.temSinistro();
		System.out.println("O bonus atual do cliente �: " + seguro1.getBonus());
		List<Venda> vendas = new ArrayList<Venda>();
		Venda venda = new Venda (usuario1, seguro1, 1234.50);
		System.out.println(venda);
		vendas.add(venda);
		ClienteJuridico clienteJ = new ClienteJuridico("Pizzaria Ze Rissi", "12.345.234/0001-21", "(19)3583-2539", "Papa Joao XXIII", 463, "Centro", "Sala 1", "13690-000", "Descalvado", "SP");
		Veiculo veiculo2 = new Veiculo("Corsa Hatch 1.6", "9BCHJ12H874637", "EPP-0908", 2009, 2010, 8907865, clienteJ);
		Seguro seguro2 = new Seguro(clienteF, veiculo2, 3, "10/05/2016", "10/05/2017");
		System.out.println(veiculo2);
		Venda venda2 = new Venda(usuario1, seguro2, 2300.5);
		vendas.add(venda2);
		System.out.println(venda2);
		Relatorio relatorio = new Relatorio();
		relatorio.gerarVendasPorFuncionario(usuario1, vendas);
	}

}
