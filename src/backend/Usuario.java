package backend;

public class Usuario extends Pessoa{
	private int id;
	private String login;
	private String senha;
	
	public Usuario(String nome, String cpf, String dataNascimento, String endereco, String telefone, int id, String login, String senha) {
		super(nome, cpf, dataNascimento, endereco, telefone);
		this.id = id;
		this.login = login;
		this.senha = senha;
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
}
