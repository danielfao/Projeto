package backend;

public interface IAlteraSeguro {
	void calculaBonus();
	void realizaEndosso(Veiculo veiculo);
	void temSinistro();
	void cancelarSeguro(String data);
}
