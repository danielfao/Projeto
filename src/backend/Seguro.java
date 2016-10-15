package backend;

//import java.util.Date;
public class Seguro /*implements IAlteraSeguro*/{
	/*private int id, bonus;
	private Pessoa pessoaSeguro;
	private Veiculo veiculoSeguro;
	private Date inicioVigencia, finalVigencia;
	private boolean sinistro=false;
	private boolean ativo=true;
	
	public Seguro(int id, Pessoa pessoa, Veiculo veiculo, int bonus, Date inicio, Date fim){
		this.id = id;
		this.pessoaSeguro = pessoa;
		this.veiculoSeguro = veiculo;
		this.bonus = bonus;
		this.inicioVigencia = inicio;
		this.finalVigencia = fim;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		if(this.bonus >= 0){
			this.bonus = bonus;
		}
		else {
			this.bonus = 0;
		}
	}
	
	
	public Pessoa getPessoaSeguro() {
		return pessoaSeguro;
	}
	public void setPessoaSeguro(Pessoa pessoaSeguro) {
		this.pessoaSeguro = pessoaSeguro;
	}
	
	
	public Veiculo getVeiculoSeguro() {
		return veiculoSeguro;
	}
	public void setVeiculoSeguro(Veiculo veiculoSeguro) {
		this.veiculoSeguro = veiculoSeguro;
	}
	
	
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	
	
	public Date getFinalVigencia() {
		return finalVigencia;
	}
	public void setFinalVigencia(Date finalVigencia) {
		this.finalVigencia = finalVigencia;
	}
	
	
	public boolean isSinistro() {
		return sinistro;
	}
	public void setSinistro(boolean sinistro) {
		this.sinistro = sinistro;
	}
	
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public void cadastrarSinistro(){
		if (this.sinistro == true){ //Ja tem sinistro nesse seguro
			System.out.println("O seguro do veiculo " + veiculoSeguro.getModelo + " do cliente " + pessoaSeguro.getNome + " j� teve sinistro nessa vig�ncia.\n");
		}
		else{ //Se o seguro ainda n�o teve sinistro, muda o status da var�avel
			this.sinistro = true;
			System.out.println("Foi cadastro o sinistro no seguro do veiculo " + veiculoSeguro.getModelo + " do cliente " + pessoaSeguro.getNome + "\n");
		}
	}
	
	public void cadastrarSeguro (Pessoa pessoa, Veiculo veiculo){
		
	}
	
	public void cancelarSeguro (Date data){ //Al�m do seguro, passar tamb�m a data do cancelamento
		if (this.ativo == false){ 
			System.out.println("O seguro j� encontra-se cancelado!\n");
		}
		else{ //Se o seguro estava ativo e foi cancelado, muda o status da var�avel e o fim da vigencia
			this.ativo = false;
			this.finalVigencia = data;
			System.out.println("O seguro foi cancelado!\n");
		}
	}*/
}
