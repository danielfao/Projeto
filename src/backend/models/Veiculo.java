package backend.models;

/** Class Veiculo related to create a vehicle.
 * 
 * @author Daniel Oliveira/ Maisa Rissi/ Airton Romao Jr
 *
 */
public class Veiculo {
	private int idVeiculo=2;
	private String modelo;
	private String chassi;
	private String placa;
	private String anoFabricacao;
	private String anoModelo;
	private long renavam;
	private int idPessoa;
	
	/** Constructor method that calls a object ClienteFisico.
	 * 
	 * @param modelo
	 * @param chassi
	 * @param placa
	 * @param anoFabricacao
	 * @param anoModelo
	 * @param renavam
	 * @param cliente
	 */
	public Veiculo(String modelo, String chassi, String placa, String anoFabricacao, String anoModelo, long renavam, int idPessoa) {
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.idPessoa = idPessoa;
		cadastrarVeiculo();
	}
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return idVeiculo
	 */
	public int getIdVeiculo(){
		return idVeiculo;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return chassi
	 */
	public String getChassi() {
		return chassi;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param chassi
	 */
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return placa
	 */
	public String getPlaca() {
		return placa;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param placa
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return anoFabricacao
	 */
	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param anoFabricacao
	 */
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return anoModelo
	 */
	public String getAnoModelo() {
		return anoModelo;
	}

	/** Setter method related to instance of the attribute.
	 * It's has a condition that if the model year is smaller than the manufacture year it will print a error message.
	 * 
	 * @param anoModelo
	 */
	public void setAnoModelo(String anoModelo) {
		if(anoModelo != anoFabricacao)
			this.anoModelo = anoModelo;
		else
			System.out.println("Ano modelo nao pode ser menor que ano de fabricacao");
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return renavam
	 */
	public long getRenavam() {
		return renavam;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param renavam
	 */
	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}
	
	public int getPessoa() {
		return idPessoa;
	}

	public void setPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	/** Method responsible to register a vehicle.
	 * 	Print if an vehicle was register with success or not.
	 * 
	 */
	public void cadastrarVeiculo (){
		System.out.println("Veiculo cadastrado com sucesso!\n");
	}
}
