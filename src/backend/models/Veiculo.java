package backend.models;

/** Class Veiculo related to create a vehicle.
 * 
<<<<<<< HEAD
 * @author Daniel Oliveira / Maisa Rissi
 *
 */
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
=======
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
>>>>>>> develop
	
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
<<<<<<< HEAD
	public Veiculo(String modelo, String chassi, String placa, int anoFabricacao, int anoModelo, long renavam, ClienteFisico cliente) {
=======
	public Veiculo(String modelo, String chassi, String placa, String anoFabricacao, String anoModelo, long renavam, int idPessoa) {
>>>>>>> develop
		this.modelo = modelo;
		this.chassi = chassi;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
<<<<<<< HEAD
		this.clienteFisico = cliente;
		cadastrarVeiculo();
	}
	
	/** Constructor method that calls a object ClienteJuridico.
	 * 
	 * @param modelo
	 * @param chassi
	 * @param placa
	 * @param anoFabricacao
	 * @param anoModelo
	 * @param renavam
	 * @param cliente
	 */
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
	
=======
		this.idPessoa = idPessoa;
		cadastrarVeiculo();
	}
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

>>>>>>> develop
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
<<<<<<< HEAD
	public int getAnoFabricacao() {
=======
	public String getAnoFabricacao() {
>>>>>>> develop
		return anoFabricacao;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param anoFabricacao
	 */
<<<<<<< HEAD
	public void setAnoFabricacao(int anoFabricacao) {
=======
	public void setAnoFabricacao(String anoFabricacao) {
>>>>>>> develop
		this.anoFabricacao = anoFabricacao;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return anoModelo
	 */
<<<<<<< HEAD
	public int getAnoModelo() {
=======
	public String getAnoModelo() {
>>>>>>> develop
		return anoModelo;
	}

	/** Setter method related to instance of the attribute.
	 * It's has a condition that if the model year is smaller than the manufacture year it will print a error message.
	 * 
	 * @param anoModelo
	 */
<<<<<<< HEAD
	public void setAnoModelo(int anoModelo) {
		if(anoModelo >= anoFabricacao)
=======
	public void setAnoModelo(String anoModelo) {
		if(anoModelo != anoFabricacao)
>>>>>>> develop
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
	
<<<<<<< HEAD
	/** Getter method related to instance of the attribute
	 * 
	 * @return clienteFisico
	 */
	public ClienteFisico getClienteFisico() {
		return clienteFisico;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param clienteFisico
	 */
	public void setClienteFisico(ClienteFisico clienteFisico) {
		this.clienteFisico = clienteFisico;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return clienteJuridico
	 */
	public ClienteJuridico getClienteJuridico() {
		return clienteJuridico;
	}

	/** Setter method related to instance of the attribute
	 * 
	 * @param clienteJuridico
	 */
	public void setClienteJuridico(ClienteJuridico clienteJuridico) {
		this.clienteJuridico = clienteJuridico;
	}

	
	 /** Method that overrides the output of this class.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
	@Override
	public String toString(){
		return "Modelo: " + this.modelo + "\nChassi: " + this.chassi + "\nPlaca: " + this.placa + "\nAno de fabricacao: " +
				+ this.anoFabricacao + "\nAno modelo: " + this.anoModelo + "\nRenavam: " + this.renavam + "\n";
				
	}
	
=======
	public int getPessoa() {
		return idPessoa;
	}

	public void setPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

>>>>>>> develop
	/** Method responsible to register a vehicle.
	 * 	Print if an vehicle was register with success or not.
	 * 
	 */
	public void cadastrarVeiculo (){
		System.out.println("Veiculo cadastrado com sucesso!\n");
	}
}
