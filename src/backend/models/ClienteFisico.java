package backend.models;

import java.io.IOException;
import java.util.Scanner;

public class ClienteFisico extends Pessoa {
	private String profissao;
	private String estadoCivil;
	Scanner ler = new Scanner(System.in);
	
	public ClienteFisico(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado, String profissao, String estadoCivil) throws IOException {
		super(nome, cpf, dataNascimento, telefone, rua, numero, bairro, cep, cidade, estado);
		this.profissao = profissao;
		this.estadoCivil = estadoCivil;
		cadastrarClienteFisico();
	}
	
	public ClienteFisico(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado, String profissao, String estadoCivil) throws IOException {
		super(nome, cpf, dataNascimento, telefone, rua, numero, complemento, bairro, cep, cidade, estado);
		this.profissao = profissao;
		this.estadoCivil = estadoCivil;
		cadastrarClienteFisico();
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
	
	@Override
	public String toString(){
		String compl = getComplemento();
		if (compl == null){
			return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
				getTelefone() + "\nProfissao: " + this.profissao + "\nEstado Civil: " + this.estadoCivil + "\nEndereco: " + 
				getRua() + ", " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nCidade: " + getCidade() + 
				"\nEstado: " + getEstado() + "\n";
		}
		
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
			getTelefone() + "\nProfissao: " + this.profissao + "\nEstado Civil: " + this.estadoCivil + "\nEndereco: " + 
			getRua() + ", " + getNumero() + "\nComplemento: " + compl + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nCidade: " +
			getCidade() + "\nEstado: " + getEstado() + "\n";		
	}
	
	public void cadastrarClienteFisico() throws IOException{
		/*System.out.println("Cadastro de cliente! Por favor, entre com as informacoes.\nNome: ");
		this.setNome(ler.nextLine());
		System.out.println("CPF: ");
		this.setCpf(ler.nextLine());
		System.out.println("Data de nascimento (dd/mm/aaaa): ");
		this.setDataNascimento(ler.nextLine());
		System.out.println("Telefone (xx)xxxx-xxxx: ");
		this.setTelefone(ler.nextLine());
		System.out.println("Profissao: ");
		this.setProfissao(ler.nextLine());
		System.out.println("Estado civil: ");
		this.setEstadoCivil(ler.nextLine());
		System.out.println("Logradouro: ");
		this.setRua(ler.nextLine());
		System.out.println("Numero: ");
		setNumero(ler.nextInt());
		
		ler.nextLine();//Esvaziar o buffer
		
		System.out.println("Inserir complemento? (s)sim (n)nao : ");
		char compl;
		compl = (char)System.in.read();
		ler.nextLine();//Esvaziar o buffer
		if(compl == 's'){
			System.out.println("Complemento: ");
			this.setComplemento(ler.nextLine());
		}
		
		System.out.println("Bairro: ");
		this.setBairro(ler.nextLine());
		System.out.println("CEP (XXXXX-XXX): ");
		this.setCep(ler.nextLine());
		System.out.println("Cidade: ");
		this.setCidade(ler.nextLine());
		System.out.println("Estado: ");
		this.setEstado(ler.nextLine());*/
		
		System.out.println("Cliente cadastrado com sucesso!\n");
	}
}
