package backend.models;

public class ClienteFisico extends Pessoa {
	private String profissao;
	private String estadoCivil;
	
	public ClienteFisico(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado, String profissao, String estadoCivil) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, bairro, cep, cidade, estado);
		this.profissao = profissao;
		this.estadoCivil = estadoCivil;
	}
	
	public ClienteFisico(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado, String profissao, String estadoCivil) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, complemento, bairro, cep, cidade, estado);
		this.profissao = profissao;
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	//public void cadastrarClienteFisico (){}
	
	@Override
	public String toString(){
		String compl = getComplemento();
		if (compl == null){
			return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
				getTelefone() + "\nProfissao: " + this.profissao + "\nEstado Civil: " + this.estadoCivil + "\n-Endereco: " + 
				getRua() + ", " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nCidade: " + getCidade() + 
				"\nEstado: " + getEstado();
		}
		
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
		getTelefone() + "\nProfissao: " + this.profissao + "\nEstado Civil: " + this.estadoCivil + "\n-Endereco: " + 
		getRua() + ", " + getNumero() + "\nComplemento: " + compl + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nCidade: " + getCidade() + 
		"\nEstado: " + getEstado();		
	}
}
