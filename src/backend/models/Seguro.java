package backend.models;

import backend.interfaces.IAlteraSeguro;

public class Seguro implements IAlteraSeguro{
	private int id, bonus;
	private ClienteFisico pessoa;
	private ClienteJuridico empresa;
	private Veiculo veiculoSeguro;
	private String inicioVigencia, finalVigencia;
	private boolean sinistro=false;
	private boolean ativo=true;
	
	public Seguro(ClienteFisico pessoa, Veiculo veiculo, int bonus, String inicio, String fim){
		this.pessoa = pessoa;
		this.veiculoSeguro = veiculo;
		this.bonus = bonus;
		this.inicioVigencia = inicio;
		this.finalVigencia = fim;
		cadastrarSeguro();
	}
	
	public Seguro(ClienteJuridico empresa, Veiculo veiculo, int bonus, String inicio, String fim){
		this.empresa = empresa;
		this.veiculoSeguro = veiculo;
		this.bonus = bonus;
		this.inicioVigencia = inicio;
		this.finalVigencia = fim;
		cadastrarSeguro();
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
	
	
	public ClienteFisico getPessoa() {
		return pessoa;
	}
	public void setPessoa(ClienteFisico pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public ClienteJuridico getEmpresa() {
		return empresa;
	}
	public void setEmpresa(ClienteJuridico empresa) {
		this.empresa = empresa;
	}
	
	
	public Veiculo getVeiculoSeguro() {
		return veiculoSeguro;
	}
	public void setVeiculoSeguro(Veiculo veiculoSeguro) {
		this.veiculoSeguro = veiculoSeguro;
	}
	
	
	public String getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(String inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	
	
	public String getFinalVigencia() {
		return finalVigencia;
	}
	public void setFinalVigencia(String finalVigencia) {
		if(finalVigencia.equals(inicioVigencia) == false){
			if(finalVigencia.compareTo(inicioVigencia) == -1){
				this.finalVigencia = finalVigencia;
			}
			else 
				System.out.println("Final de vigencia nao pode ser menor que o inicial.\n");
		}
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
	
	@Override
	public void temSinistro(){
		if(pessoa != null){
			if (this.sinistro == true){ //Ja tem sinistro nesse seguro
				System.out.println("O seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + pessoa.getNome() + 
						" ja teve sinistro nessa vigencia.\nO bonus atual e: " + this.bonus + "\n");
			}
			else{ //Se o seguro ainda não teve sinistro, muda o status da variável
				this.sinistro = true;
				calculaBonus();
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
				calculaBonus();
				System.out.println("Foi cadastrado o sinistro no seguro do veiculo " + veiculoSeguro.getModelo() + " do cliente " + 
						empresa.getRazaoSocial() + "\nO bonus anterior era " + (this.bonus+1) + " e atualmente desceu para: " + this.bonus 
						+ "\n");
			}
		}
	}
		
	@Override
	public void cancelarSeguro (String data){ //Date de cancelamento
		if (this.ativo == false){ 
			System.out.println("O seguro ja encontra-se cancelado!\n");
		}
		else{ //Se o seguro estava ativo e foi cancelado, muda o status da variavel e o fim da vigencia
			this.ativo = false;
			this.finalVigencia = data;
			System.out.println("O seguro foi cancelado!\n");
		}
	}
	
	@Override
	public void calculaBonus(){
		if(this.sinistro == true){ //Se o seguro teve sinistro, bonus diminui em 1
			this.bonus = this.bonus - 1;
		}
		else{ // Se nao teve, bonus aumenta 1
			this.bonus = this.bonus + 1;
		}
	}
	
	@Override
	public void realizaEndosso(Veiculo veiculo){
		this.veiculoSeguro = veiculo;
	}
	
	@Override
	public String toString(){
		if(getPessoa()!= null){
			return "Cliente: " + pessoa.getNome() + "\nSeguro do veiculo " + veiculoSeguro.getModelo() + " " + 
				veiculoSeguro.getAnoFabricacao() + "/" + veiculoSeguro.getAnoModelo() + "\n";
		}
		else {
			return "Cliente: " + empresa.getRazaoSocial() + "\nSeguro do veiculo " + veiculoSeguro.getModelo() + " " + 
					veiculoSeguro.getAnoFabricacao() + "/" + veiculoSeguro.getAnoModelo() + "\n";
		}
	}
	
	public void cadastrarSeguro(){
		System.out.println("Seguro cadastrado com sucesso!\n");
	}
	
}
