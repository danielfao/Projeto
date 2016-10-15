package backend;

import java.util.Date;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		Veiculo v1 = new Veiculo();
		Seguro s1 = new Seguro(1, p1, v1, 0, "10/25/2015", "10/25/2016"); //verificar como introduzir data
		s1.cadastrarSinistro();
		s1.cancelarSeguro(10-12-2016);
	}

}
