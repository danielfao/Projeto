package backend;

public interface IAlteraSeguro {
	int calculaBonus();
	void realizaEndorsso(Veiculo veiculo);
	boolean temSinistro(Seguro seguro);
}
