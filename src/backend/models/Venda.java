package backend.models;

//import java.text.DecimalFormat;

/** Class Venda related to create a sell.
 * 
 * @author Daniel Oliveira/ Maisa Rissi/ Airton Romao Jr
 *
 */
public class Venda {
	private int idVenda;
	private Usuario usuario;
	private Seguro seguro;
	private double valorLiquido;
	
	/** Constructor method.
	 * 
	 * @param usuario
	 * @param seguro
	 * @param valorLiquido
	 */
	public Venda(Usuario usuario, Seguro seguro, double valorLiquido){
		this.usuario = usuario;
		this.seguro = seguro;
		this.valorLiquido = valorLiquido;
		cadastrarVenda();
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return idVenda
	 */
	public int getIdVenda() {
		return idVenda;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return seguro
	 */
	public Seguro getSeguro() {
		return seguro;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param seguro
	 */
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return valorLiquido
	 */
	public double getValorLiquido() {
		return valorLiquido;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param valorLiquido
	 */
	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	/** Method that overrides the output of this class.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
	/*@Override
	public String toString(){
		DecimalFormat valorTotal = new DecimalFormat("#.00");
		if(seguro.getPessoa()!= null){
			return "Usuario: " + usuario.getNome() + "\nSeguro do veiculo " + seguro.getVeiculoSeguro().getModelo() + " do cliente "
					+ seguro.getPessoa().getNome() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					valorTotal.format(valorLiquido*1.0738) + "\n";
		} else {
			return "Usuario: " + usuario.getNome() + "\nSeguro do veiculo " + seguro.getVeiculoSeguro().getModelo() + " do cliente "
					+ seguro.getEmpresa().getRazaoSocial() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					valorTotal.format(valorLiquido*1.0738) + "\n";
		}
	}*/
	
	/** Method responsible to register a sell.
	 * 	Print if a sell was register with success or not.
	 * 
	 */
	public void cadastrarVenda(){
		System.out.println("Venda cadastrada com sucesso!\n");
	}
}
