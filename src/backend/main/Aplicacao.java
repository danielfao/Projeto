package backend.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import backend.models.ClienteFisico;
import backend.models.ClienteJuridico;
import backend.models.Relatorio;
import backend.models.Seguro;
import backend.models.Usuario;
import backend.models.Veiculo;
import backend.models.Venda;

/** Main class responsible for call all methods and create the objects
 * this class will be refactored.
 * 
 * @author Daniel Oliveira / Maisa Rissi
 *
 * @version 1.0
 */
public class Aplicacao {

	public static void main(String[] args) throws IOException {
		List<Venda> vendas = new ArrayList<Venda>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		List<Seguro> seguros = new ArrayList<>();

		ClienteFisico clienteF1 = new ClienteFisico("Jose da Silva", "123", "09/10/1990", "(16)3355-5221", "Rua das Orquideas", 123, "Jd Paola", "13690-000", "Descalvado" , "SP", "Funcionario publico", "Casado");
		//System.out.println(clienteF1);
		
		ClienteJuridico clienteJ1 = new ClienteJuridico("Pizzaria Ze Rissi", "12.345.234/0001-21", "(19)3583-2539", "Papa Joao XXIII", 463, "Sala 1", "Centro", "13690-000", "Descalvado", "SP");
		//System.out.println(clienteJ1);
		
		Veiculo veiculo1 = new Veiculo("Astra 2.0", "9BD12AUH8123876", "ABC-1992", 2012, 2013, 489374560, clienteF1);
		//System.out.println(veiculo1);
		Veiculo veiculo2 = new Veiculo("Corsa Hatch 1.6", "9BCHJ12H874637", "EPP-0908", 2009, 2010, 8907865, clienteJ1);
		//System.out.println(veiculo2);
		Veiculo veiculo3 = new Veiculo("Ford K 1.0", "9BCHJ32H874688", "HIJ-1617", 2013, 2014, 1005634, clienteJ1);
		//System.out.println(veiculo3);

		Seguro seguro1 = new Seguro(clienteF1, veiculo1, 6, "10/10/2015", "10/10/2016", "Porto Seguro");
		//System.out.println(seguro1);
		seguros.add(seguro1);
		Seguro seguro2 = new Seguro(clienteF1, veiculo2, 3, "10/05/2016", "10/05/2017", "Mapfre");
		//System.out.println(seguro2);
		seguros.add(seguro2);
		Seguro seguro3 = new Seguro(clienteJ1, veiculo3, 2, "11/03/2016", "11/03/2017", "Mapfre");
		seguros.add(seguro3);
		
		Usuario usuario1 = new Usuario("Maisa Rissi", "234", "10/09/1991", "(16)99999-9999", "Rua das Alamedas", 345, "Ap-402", "13560-320", "Vila Monteiro", "Sao Carlos", "SP", "maisarissi", "123456");
		//System.out.println(usuario1);
		usuarios.add(usuario1);
		Usuario usuario2 = new Usuario("Sara Pauline", "457", "11/05/1990", "(16)99999-9999", "Rua das Orquideas", 4345, "13580-120", "Vila Nery", "Sao Carlos", "SP", "sarafabricio", "012983");
		//System.out.println(usuario2);
		usuarios.add(usuario2);
		Usuario usuario3 = new Usuario ("Daniel Fernandes", "333.222.444-01", "04/01/1985", "(16)98888-9999", "Rua dos Crisantemos", 454, "13560-060", "Santa Paula", "Sao Carlos", "SP", "danielfao", "12345" );
		//System.out.println(usuario2);
		usuarios.add(usuario3);
		
		Venda venda = new Venda (usuario1, seguro1, 1234.50);
		vendas.add(venda);
		System.out.println(venda);
		
		venda = new Venda(usuario1, seguro2, 2300.5);
		vendas.add(venda);
		System.out.println(venda);
		
		venda = new Venda(usuario3, seguro3, 2050.20);
		vendas.add(venda);
		System.out.println(venda);
		
		seguro1.terSinistro();
		seguro1.terSinistro();
		
		seguro1.cancelarSeguro("01/05/2016");
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarVendasPorFuncionario(usuario1, vendas);
		relatorio.gerarVendasPorFuncionario(usuario2, vendas);
		relatorio.gerarVendasPorFuncionario(usuario3, vendas);
		relatorio.gerarVendasTodosFuncionarios(usuarios, vendas);
		relatorio.gerarSegurosAtivosPorClienteFisico(clienteF1, vendas);
		relatorio.gerarSegurosAtivosPorClienteJuridico(clienteJ1, vendas);
		relatorio.gerarSegurosInativos(seguros);
	}

}
