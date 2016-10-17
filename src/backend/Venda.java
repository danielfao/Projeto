package backend;

public class Venda {
	private int idVenda;
	private Usuario usuario;
	private Seguro seguro;
	private double valorLiquido;
	
	public Venda(Usuario usuario, Seguro seguro, double valorLiquido){
		this.usuario = usuario;
		this.seguro = seguro;
		this.valorLiquido = valorLiquido;
	}
	
	public int getIdVenda() {
		return idVenda;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
	public double getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	@Override
	public String toString(){
		if(seguro.getPessoa()!= null){
			return "Usuario: " + usuario.getNome() + "\nSeguro do veículo: " + seguro.getVeiculoSeguro().getModelo() + " do cliente: "
					+ seguro.getPessoa().getNome() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					(valorLiquido*1.0738) + "\n";
		}
		else if (seguro.getEmpresa()!= null){
			return "Usuario: " + usuario.getNome() + "\nSeguro do veículo: " + seguro.getVeiculoSeguro().getModelo() + " do cliente: "
					+ seguro.getEmpresa().getRazaoSocial() + "\nValor Liquido: " + this.valorLiquido + "\nValor total: " + 
					(valorLiquido*1.0738) + "\n";
		}
		return "";
	}
}
