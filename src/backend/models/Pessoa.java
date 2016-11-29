package backend.models;

/** Class Pessoa related to creates a person attributes. It's a father class of ClienteFisico and Usuario.
 * 
 * @author Daniel Oliveira / Maisa Rissi
 *
 */
public abstract class Pessoa {
	private int id=2;
	private String nome = "";
	private String cpf = "";
	private String dataNascimento = "";
	private String telefone = "";
	private String rua = "";
	private int numero = 0;
	private String complemento = "";
	private String bairro = "";
	private String cep = "";
	private String cidade = "";
	private String estado = "";
	
	/** Constructor method without complemento attribute.
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 */
	public Pessoa(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	/** Constructor method with complemento attribute.
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 */
	public Pessoa(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return dataNascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public int getId() {
		return id;
	}
	
}
