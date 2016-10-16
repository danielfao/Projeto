package backend;

import java.util.Date;

public class Veiculo {
	private int idVeiculo;
	private String modelo;
	private String chassi;
	private String placa;
	private Date anoFabricacao;
	private Date anoModelo;
	private String renavam;
	private Pessoa cliente;
	
	public Veiculo(String modelo, String chassi, String placa, Date anoFabricacao, Date anoModelo, String renavam) {
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
	}
	
	public int getIdVeiculo(){
		return idVeiculo;
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
	
	public void cadastrarVeiculo (){
	}
}
