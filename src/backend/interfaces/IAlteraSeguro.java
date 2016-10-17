package backend.interfaces;

import backend.models.Veiculo;

public interface IAlteraSeguro {
	void calculaBonus();
	void realizaEndosso(Veiculo veiculo);
	void temSinistro();
	void cancelarSeguro(String data);
}
