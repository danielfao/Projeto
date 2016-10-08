package backend;

import java.util.Date;

public class Veiculo extends ClienteFisico{
	private String modelo;
	private String chassi;
	private String placa;
	private Date anoFabricacao;
	private Date anoModelo;
	private String renavam;
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String nome, String cpf, Date dataNascimento, String endereco, int telefone, String profissao,
			String estadoCivil, String modelo, String chassi, String placa, Date anoFabricacao, Date anoModelo, String renavam) {
		super(nome, cpf, dataNascimento, endereco, telefone, profissao, estadoCivil);
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Date getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	
	public void cadastrarVeiculo (ClienteFisico nome, ClienteFisico cpf, String chassi, String placa, Date anoFabricacao, Date anoModelo, String renavam){
		Veiculo veiculo = new Veiculo();
		//relembrar como cadastrar
	}
}
