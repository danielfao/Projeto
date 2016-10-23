package backend.models;

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

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
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
	
	public void cadastrarClienteJuridico () {
		System.out.println("Empresa cadastrada com sucesso!\n");
	}
}
