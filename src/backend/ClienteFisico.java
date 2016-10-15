package backend;

import java.util.Date;

public class ClienteFisico extends Pessoa {
	private String profissao;
	private String estadoCivil;
	
	public ClienteFisico() {
		super();
	}
	
	public ClienteFisico(String nome, String cpf, Date dataNascimento, String endereco, int telefone, String profissao, String estadoCivil) {
		super(nome, cpf, dataNascimento, endereco, telefone);
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
	
	public void cadastrarClienteFisico (Pessoa nome, Pessoa cpf, Pessoa dataNascimento, Pessoa telefone, String profissao, String estadoCivil){
		ClienteFisico cliente = new ClienteFisico();
		//relembrar como cadastrar
	}
}