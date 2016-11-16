package backend.models;

/** Class ClienteJuridico.
 *  Contains attributes to create a legal customer/client.
 * 
 * @author Daniel Oliveira / Maisa Rissi
 * 
 */
public class ClienteJuridico {
	private String razaoSocial;
	private String cnpj;
	private String telefone;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	/** Constructor method with complemento attribute.
	 * 
	 * @param razaoSocial
	 * @param cnpj
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 */
	public ClienteJuridico(String razaoSocial, String cnpj, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;		
		cadastrarClienteJuridico();
	}
	
	/** Constructor method without complemento attribute.
	 * 
	 * @param razaoSocial
	 * @param cnpj
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 */
	public ClienteJuridico(String razaoSocial, String cnpj, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;	
		cadastrarClienteJuridico();
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param razaoSocial
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return rua
	 */
	public String getRua() {
		return rua;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param rua
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return cep
	 */
	public String getCep() {
		return cep;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/** Method that overrides the output of this class depending if it's using the constructor with complemento or without.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
	@Override
	public String toString(){
		String compl = getComplemento();
		if (compl == null){
			return "Nome: " + getRazaoSocial() + "\nCNPJ: " + getCnpj() + "\nTelefone: " + getTelefone() + "\nEndereco: " + 
				getRua() + ", " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nCidade: " + getCidade() + 
				"\nEstado: " + getEstado() + "\n";
		}
		
		return "Nome: " + getRazaoSocial() + "\nCNPJ: " + getCnpj() + "\nTelefone: " + getTelefone() + "\nEndereco: " + 
		getRua() + ", " + getNumero() + "\nComplemento: " + getComplemento() + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + 
		"\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\n";	
	}
	
	/** Method responsible to register a regular client.
	 * 	Print if a client was register with success or not.
	 * 
	 */
	public void cadastrarClienteJuridico () {
		System.out.println("Empresa cadastrada com sucesso!\n");
	}
}
