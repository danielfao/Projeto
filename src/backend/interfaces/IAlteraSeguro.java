package backend.interfaces;

import backend.models.Veiculo;

public interface IAlteraSeguro {
	void calcularBonus();
	void realizarEndosso(Veiculo veiculo);
	void terSinistro();
	void cancelarSeguro(String data);
}
