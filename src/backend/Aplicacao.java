package backend;

public class Aplicacao {

	public static void main(String[] args) {
		ClienteFisico clienteF = new ClienteFisico("Jose da Silva", "123", "09/10/1990", "Rua das Orquideas,123", "(16)3355-5221", "Funcionario publico", "Casado");
		Veiculo v1 = new Veiculo("Astra 2.0", "9BD12AUH8123876", "ABC-1992", 2012, 2013, 489374560, clienteF);
		System.out.println(v1);
		Seguro s1 = new Seguro(1, clienteF, v1, 6, "10/25/2015", "10/25/2016");
		System.out.println("O bonus atual do cliente é: " +s1.getBonus());
		s1.temSinistro();
		s1.temSinistro();
		System.out.println("O bonus atual do cliente é: " + s1.getBonus());
	}

}
