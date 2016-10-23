package backend.models;

public class Veiculo {
	private int idVeiculo;
	private String modelo;
	private String chassi;
	private String placa;
	private int anoFabricacao;
	private int anoModelo;
	private long renavam;
	private ClienteFisico clienteFisico;
	private ClienteJuridico clienteJuridico;
	
	public Veiculo(String modelo, String chassi, String placa, int anoFabricacao, int anoModelo, long renavam, ClienteFisico cliente) {
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.clienteFisico = cliente;
		cadastrarVeiculo();
	}
	
	public Veiculo(String modelo, String chassi, String placa, int anoFabricacao, int anoModelo, long renavam, ClienteJuridico cliente) {
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.clienteJuridico = cliente;
		cadastrarVeiculo();
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

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		if(anoModelo >= anoFabricacao)
			this.anoModelo = anoModelo;
		else
			System.out.println("Ano modelo nao pode ser menor que ano de fabricacao");
	}

	public long getRenavam() {
		return renavam;
	}

	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}
	
	public ClienteFisico getClienteFisico() {
		return clienteFisico;
	}

	public void setClienteFisico(ClienteFisico clienteFisico) {
		this.clienteFisico = clienteFisico;
	}

	public ClienteJuridico getClienteJuridico() {
		return clienteJuridico;
	}

	public void setClienteJuridico(ClienteJuridico clienteJuridico) {
		this.clienteJuridico = clienteJuridico;
	}

	@Override
	public String toString(){
		return "Modelo: " + this.modelo + "\nChassi: " + this.chassi + "\nPlaca: " + this.placa + "\nAno de fabricacao: " +
				+ this.anoFabricacao + "\nAno modelo: " + this.anoModelo + "\nRenavam: " + this.renavam + "\n";
				
	}
	
	public void cadastrarVeiculo (){
		System.out.println("Veiculo cadastrado com sucesso!\n");
	}
}
