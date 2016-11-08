package backend.interfaces;

import backend.models.Veiculo;

/** Interface responsible for implements methods calcularBonus, realizarEndosso, terSinistro, and cancelarSeguro.
 * 
 * @author Daniel Oliveira
 *
 * @version 1.0
 */
public interface IAlteraSeguro {
	void calcularBonus();
	void realizarEndosso(Veiculo veiculo);
	void terSinistro();
	void cancelarSeguro(String data);
}
