package backend.models;

public class Usuario extends Pessoa{
	private int id;
	private String login;
	private String senha;
	
	public Usuario(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado, String login, String senha) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, bairro, cep, cidade, estado);
		this.login = login;
		this.senha = senha;
		cadastrarUsuario();
	}
	
	public Usuario(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado, String login, String senha) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, complemento, bairro, cep, cidade, estado);
		this.login = login;
		this.senha = senha;
		cadastrarUsuario();
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	@Override
	public String toString(){
		String compl = getComplemento();
		if (compl == null){
			return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
				getTelefone() + "\nEndereco: " + getRua() + ", " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + 
				getCep() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nLogin: " + getLogin() + "\n";
		}
		
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
		getTelefone() + "\nEndereco: " + getRua() + ", " + getNumero() + "\nComplemento: " + compl + "\nBairro: " + getBairro() + 
		"\nCEP: " + getCep() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nLogin: " + getLogin() + "\n";		
	}
	
	public void cadastrarUsuario(){
		System.out.println("Usuario cadastrado com sucesso!\n");
	}
}
