package backend;

public class ClienteJuridico {
	private String razaoSocial;
	private int cnpj;
	private int telefone;
	private String endereco;
	
	public ClienteJuridico(String razaoSocial, int cnpj, int telefone, String endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void cadastrarClienteJuridico () {
	}
}
