package backend.models;

//import backend.interfaces.IAlteraSeguro;

/** Class Seguro related to create a car insurance that implements the methods 
 * from the interface IAlteraSeguro
 * 
 * @author Daniel Oliveira/ Maisa Rissi/ Airton Romao Jr
 *
 */
public class Seguro /*implements IAlteraSeguro*/{
	private int id, bonus;
	private String inicioVigencia, finalVigencia;
	private String companhia;
	private boolean sinistro=false;
	private boolean ativo=true;
	private int idPessoa;
	private int idVeiculoSeguro;
	private int idEmpresa;
	
	
	public Seguro(){
		
	}
	
	/** Constructor method that calls a object ClienteFisico.
	 * 
	 * @param pessoa
	 * @param veiculo
	 * @param bonus
	 * @param inicio
	 * @param fim
	 * @param companhia
	 */
	public Seguro(int idPessoa, int idVeiculo, int bonus, String inicio, String fim, String companhia){
		this.idPessoa = idPessoa;
		this.idVeiculoSeguro = idVeiculo;
		this.bonus = bonus;
		this.inicioVigencia = inicio;
		this.finalVigencia = fim;
		this.companhia = companhia;
		cadastrarSeguro();
	}
	
	/** Constructor method that calls a object ClienteJuridico.
	 * 
	 * @param empresa
	 * @param veiculo
	 * @param bonus
	 * @param inicio
	 * @param fim
	 * @param companhia
	 */
	/*public Seguro(int idEmpresa, int idVeiculo, int bonus, String inicio, String fim, String companhia){
		this.idEmpresa = idEmpresa;
		this.idVeiculoSeguro = idVeiculo;
		this.bonus = bonus;
		this.inicioVigencia = inicio;
		this.finalVigencia = fim;
		this.companhia = companhia;
		cadastrarSeguro();
	}*/
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return bonus
	 */
	public int getBonus() {
		return bonus;
	}
	
	/** Setter method related to instance of the attribute.
	 * It has a condition in case bonus is smaller than zero, initialize with zero, 
	 * otherwise initialize with bonus.
	 * 
	 * @param bonus
	 */
	public void setBonus(int bonus) {
		if(this.bonus >= 0){
			this.bonus = bonus;
		}
		else {
			this.bonus = 0;
		}
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return pessoa
	 */
	public int getPessoa() {
		return idPessoa;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param pessoa
	 */
	public void setPessoa(int pessoa) {
		this.idPessoa = pessoa;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return empresa
	 */
	public int getEmpresa() {
		return idEmpresa;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param empresa
	 */
	public void setEmpresa(int empresa) {
		this.idEmpresa = empresa;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return veiculoSeguro
	 */
	public int getVeiculoSeguro() {
		return idVeiculoSeguro;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param veiculoSeguro
	 */
	public void setVeiculoSeguro(int veiculo) {
		this.idVeiculoSeguro = veiculo;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return inicioVigencia
	 */
	public String getInicioVigencia() {
		return inicioVigencia;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param inicioVigencia
	 */
	public void setInicioVigencia(String inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return finalVigencia
	 */
	public String getFinalVigencia() {
		return finalVigencia;
	}
	
	/** Setter method related to instance of the attribute.
	 * It has a condition that if finalVigencia is smaller than inicioVigencia print an error, 
	 * otherwise it will compare the finalVigencia with inicioVigencia.
	 * 
	 * @param finalVigencia
	 */
	public void setFinalVigencia(String finalVigencia) {
		this.finalVigencia = finalVigencia;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return companhia
	 */
	public String getCompanhia() {
		return companhia;
	}

	/** Setter method related to instance of the attribute.
	 * 
	 * @param companhia
	 */
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	/** Getter method related to instance of the attribute.
	 * 
	 * @return sinistro
	 */
	public boolean isSinistro() {
		return sinistro;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param sinistro
	 */
	public void setSinistro(boolean sinistro) {
		this.sinistro = sinistro;
	}
	
	/** Getter method related to instance of the attribute.
	 * 
	 * @return ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}
	
	/** Setter method related to instance of the attribute.
	 * 
	 * @param ativo
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	/** Method responsible for set if the vehicle had a car accident or not.
	 * if the car already had a car accident it will decrease the client insurance bonus.
	 * This method also returns a message saying the model of the vehicle, the name of the client,
	 * if the client had or not a car accident and how much is the currently bonus.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
	/*@Override
	public void terSinistro(){
		if(pessoa != null){
			if (this.sinistro == true){ //Ja tem sinistro nesse seguro
				System.out.println("O seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + pessoa.getNome() + 
						" ja teve sinistro nessa vigencia.\nO bonus atual e: " + this.bonus + "\n");
			}
			else{ //Se o seguro ainda não teve sinistro, muda o status da variável
				this.sinistro = true;
				calcularBonus();
				System.out.println("Foi cadastrado o sinistro no seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + 
						pessoa.getNome() + "\nO bonus anterior era " + (this.bonus+1) + " e atualmente desceu para: " + this.bonus + "\n");
			}
		}
		else {
			if (this.sinistro == true){ //Ja tem sinistro nesse seguro
				System.out.println("O seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + pessoa.getNome() + 
						" ja teve sinistro nessa vigencia.\nO bonus atual e: " + this.bonus + "\n");
			}
			else{ //Se o seguro ainda nao teve sinistro, muda o status da variavel
				this.sinistro = true;
				calcularBonus();
				System.out.println("Foi cadastrado o sinistro no seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + 
						empresa.getRazaoSocial() + "\nO bonus anterior era " + (this.bonus+1) + " e atualmente desceu para: " + this.bonus 
						+ "\n");
			}
		}
	}*/
		
	/** Method responsible for cancel the insurance.
	 * 
	 * @param data
	 */
	/*@Override
	public void cancelarSeguro (String data){ //Data de cancelamento
		if (this.ativo == false){ 
			System.out.println("O seguro ja encontra-se cancelado!\n");
		}
		else{ //Se o seguro estava ativo e foi cancelado, muda o status da variavel e o fim da vigencia
			this.ativo = false;
			this.finalVigencia = data;
			System.out.println("O seguro foi cancelado!\n");
		}
	}*/
	
	/** Method responsible for calculate the bonus based if the client already had a car accident or not.
	 * if the client already had a car accident it will decrease the bonus -1, if not it will increase +1.
	 * 
	 */
	/*@Override
	public void calcularBonus(){
		if(this.sinistro == true){ //Se o seguro teve sinistro, bonus diminui em 1
			this.bonus = this.bonus - 1;
		}
		else{ // Se nao teve, bonus aumenta 1
			this.bonus = this.bonus + 1;
		}
	}*/
	
	/** Method responsible for transfer the insurance to another vehicle.
	 * 
	 */
	/*@Override
	public void realizarEndosso(Veiculo veiculo){
		this.veiculoSeguro = veiculo;
	}*/
	
	/** Method that overrides the output of this class.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
	/*@Override
	public String toString(){
		//if(getPessoa()!= null){
			return "Cliente: " + pessoa.getNome() + "\nSeguro do veiculo " + veiculoSeguro.getModelo() + " " + 
				veiculoSeguro.getAnoFabricacao() + "/" + veiculoSeguro.getAnoModelo() + "\n";
		}
		/*else {
			return "Cliente: " + empresa.getRazaoSocial() + "\nSeguro do veiculo " + veiculoSeguro.getModelo() + " " + 
					veiculoSeguro.getAnoFabricacao() + "/" + veiculoSeguro.getAnoModelo() + "\n";
		}
	}*/
	
	/** Method responsible to register a insurance.
	 * 	Print if a insurance was register with success or not.
	 * 
	 */
	public void cadastrarSeguro(){
		System.out.println("Seguro cadastrado com sucesso!\n");
	}
	
}
