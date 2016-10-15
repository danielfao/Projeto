package backend;

import java.util.Date;

public class Usuario extends Pessoa{
	private int id;
	private String login;
	private String senha;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nome, String cpf, Date dataNascimento, String endereco, int telefone, int id, String login, String senha) {
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