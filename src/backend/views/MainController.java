package backend.views;

<<<<<<< HEAD
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
=======
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import backend.dao.ClienteFisicoDAO;
import backend.dao.ClienteJuridicoDAO;
import backend.dao.SeguroDAO;
import backend.dao.UsuarioDAO;
import backend.dao.VeiculoDAO;
import backend.models.ClienteFisico;
import backend.models.ClienteJuridico;
import backend.models.Seguro;
import backend.models.Usuario;
import backend.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
>>>>>>> develop
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
<<<<<<< HEAD

public class MainController {

    @FXML
    private Tab tabCadastrar;

    @FXML
    private TextField tfNomeFuncionario;

    @FXML
    private TextField tfCpfFuncionario;

    @FXML
    private DatePicker dpDNFuncionario;

    @FXML
    private TextField tfTelefoneFuncionario;

    @FXML
    private TextField tfEnderecoFuncionario;

    @FXML
    private TextField tfNumeroFuncionario;

    @FXML
    private TextField tfComplementoFuncionario;

    @FXML
    private TextField tfBairroFuncionario;

    @FXML
    private TextField tfCidadeFuncionario;

    @FXML
    private ComboBox<?> cbEstadoFuncionario;

    @FXML
    private TextField tfCepFuncionario;

    @FXML
    private TextField tfLogin;

    @FXML
    private PasswordField pfSenha;

    @FXML
    private Button btnCadastrarFuncionario;

    @FXML
    private Button btnCancelarFuncionario;

    @FXML
    private TextField tfNomeClienteFisico;

    @FXML
    private TextField tfCpfClienteFisico;

    @FXML
    private DatePicker dpDataNClienteFisico;

    @FXML
    private TextField tfTelefoneClienteFisico;

    @FXML
    private TextField tfEnderecoClienteFisico;

    @FXML
    private TextField tfNumeroClienteFisico;

    @FXML
    private TextField tfComplementoClienteFisico;

    @FXML
    private TextField tfBairroClienteFisico;

    @FXML
    private TextField tfCidadeClienteFisico;

    @FXML
    private ComboBox<?> cbEstadoClienteFisico;

    @FXML
    private TextField tfCepClienteFisico;

    @FXML
    private TextField tfProfissaoClienteFisico;

    @FXML
    private TextField tfEstadoCivelClienteFisico;

    @FXML
    private Button btnCadastrarClienteFisico;

    @FXML
    private Button btnCancelarClienteFisico;

    @FXML
    private TextField tfRazaoSocial;

    @FXML
    private TextField tfCnpj;

    @FXML
    private TextField tfTelefoneClienteJuridico;

    @FXML
    private TextField tfEnderecoClienteJuridico;

    @FXML
    private TextField tfNumeroClienteJuridico;

    @FXML
    private TextField tfComplementoClienteJuridico;

    @FXML
    private TextField tfBairroClienteJuridico;

    @FXML
    private TextField tfCidadeClienteJuridico;

    @FXML
    private ComboBox<?> cbEstadoClienteJuridico;

    @FXML
    private TextField tfCepClienteJuridico;

    @FXML
    private Button btnCadastrarClienteJuridico;

    @FXML
    private Button btnCancelarClienteJuridico;

    @FXML
    private ComboBox<?> cbClienteVeiculo;

    @FXML
    private TextField tfCModelo;

    @FXML
    private TextField tfChassi;

    @FXML
    private TextField tfRenavam;

    @FXML
    private DatePicker dpAnoModelo;

    @FXML
    private DatePicker dpAnoFabricacao;

    @FXML
    private Button btnCadastrarVeiculo;

    @FXML
    private Button btnCancelarVeiculo;

    @FXML
    private ComboBox<?> cbClienteSeguro;

    @FXML
    private ComboBox<?> cbVeiculoSeguro;

    @FXML
    private TextField tfBonusSeguro;

    @FXML
    private DatePicker dpInicioVigenciaSeguro;

    @FXML
    private DatePicker dpFimVigenciaSeguro;

    @FXML
    private TextField tfCompanhiaSeguro;

    @FXML
    private Button btnCadastrarSeguro;

    @FXML
    private Button btnCancelarSeguro;

    @FXML
    private TextField tfFuncionarioVenda;

    @FXML
    private ComboBox<?> cbSeguroVenda;

    @FXML
    private Button btnCadastrarVenda;

    @FXML
    private Button btnCancelarVenda;

    @FXML
    private ComboBox<?> cbPesquisa;

    @FXML
    private TextField tfPesquisa;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnLimparPesquisa;

    @FXML
    private ComboBox<?> cbRelatorioPorFuncionario;

    @FXML
    private Button cbGerarPorFuncionario;

    @FXML
    private Button btnGerarTodosFuncionarios;

    @FXML
    private ComboBox<?> cbClienteFisicoRelatorio;

    @FXML
    private Button btnGeraClienteFisico;

    @FXML
    private ComboBox<?> cbClienteJuridicoRelatorio;

    @FXML
    private Button btnGeraClienteJuridico;

    @FXML
    private Button btnGeraClienteInativo;

    @FXML
    void cadastrarFuncionario(ActionEvent event) {

    }

=======
import javafx.scene.control.TreeTableColumn;

public class MainController implements Initializable{

	@FXML
	private Tab tabCadastrar;

	@FXML
	private TextField tfNomeFuncionario;

	@FXML
	private TextField tfCpfFuncionario;

	@FXML
	private DatePicker dpDNFuncionario;

	@FXML
	private TextField tfTelefoneFuncionario;

	@FXML
	private TextField tfEnderecoFuncionario;

	@FXML
	private TextField tfNumeroFuncionario;

	@FXML
	private TextField tfComplementoFuncionario;

	@FXML
	private TextField tfBairroFuncionario;

	@FXML
	private TextField tfCidadeFuncionario;

	@FXML
	private ComboBox<String> cbEstadoFuncionario;

	@FXML
	private TextField tfCepFuncionario;

	@FXML
	private TextField tfLogin;

	@FXML
	private PasswordField pfSenha;

	@FXML
	private Button btnCadastrarFuncionario;

	@FXML
	private Button btnCancelarFuncionario;

	@FXML
	private TextField tfNomeClienteFisico;

	@FXML
	private TextField tfCpfClienteFisico;

	@FXML
	private DatePicker dpDataNClienteFisico;

	@FXML
	private TextField tfTelefoneClienteFisico;

	@FXML
	private TextField tfEnderecoClienteFisico;

	@FXML
	private TextField tfNumeroClienteFisico;

	@FXML
	private TextField tfComplementoClienteFisico;

	@FXML
	private TextField tfBairroClienteFisico;

	@FXML
	private TextField tfCidadeClienteFisico;

	@FXML
	private ComboBox<String> cbEstadoClienteFisico;

	@FXML
	private TextField tfCepClienteFisico;

	@FXML
	private TextField tfProfissaoClienteFisico;

	@FXML
	private TextField tfEstadoCivelClienteFisico;

	@FXML
	private Button btnCadastrarClienteFisico;

	@FXML
	private Button btnCancelarClienteFisico;

	@FXML
	private TextField tfRazaoSocial;

	@FXML
	private TextField tfCnpj;

	@FXML
	private TextField tfTelefoneClienteJuridico;

	@FXML
	private TextField tfEnderecoClienteJuridico;

	@FXML
	private TextField tfNumeroClienteJuridico;

	@FXML
	private TextField tfComplementoClienteJuridico;

	@FXML
	private TextField tfBairroClienteJuridico;

	@FXML
	private TextField tfCidadeClienteJuridico;

	@FXML
	private ComboBox<String> cbEstadoClienteJuridico;

	@FXML
	private TextField tfCepClienteJuridico;

	@FXML
	private Button btnCadastrarClienteJuridico;

	@FXML
	private Button btnCancelarClienteJuridico;

	@FXML
	private ComboBox<String> cbClienteVeiculo;

	@FXML
	private TextField tfCModelo;

	@FXML
	private TextField tfChassi;

	@FXML
	private TextField tfRenavam;

	@FXML
	private DatePicker dpAnoModelo;

	@FXML
	private DatePicker dpAnoFabricacao;

	@FXML
	private TextField tfPlaca;
	
	@FXML
	private Button btnCadastrarVeiculo;

	@FXML
	private Button btnCancelarVeiculo;

	//@FXML
	//private ComboBox<?> cbClienteSeguro;

	@FXML
	private ComboBox<String> cbClienteSeguro;

	@FXML
	private ComboBox<?> cbVeiculoSeguro;

	@FXML
	private TextField tfBonusSeguro;

	@FXML
	private DatePicker dpInicioVigenciaSeguro;

	@FXML
	private DatePicker dpFimVigenciaSeguro;

	@FXML
	private TextField tfCompanhiaSeguro;

	@FXML
	private Button btnCadastrarSeguro;

	@FXML
	private Button btnCancelarSeguro;

	@FXML
	private ComboBox<?> cbSeguroVenda;

	@FXML
	private TextField tfValorLiquido;

	@FXML
	private Button btnCadastrarVenda;

	@FXML
	private Button btnCancelarVenda;

	@FXML
	private ComboBox<?> cbFuncionarioVenda;

	@FXML
	private TextField tfComissaoVenda;

	@FXML
	private ComboBox<?> cbPesquisa;

	@FXML
	private TextField tfPesquisa;

	@FXML
	private TreeTableColumn<?, ?> colIdSeguro;

	@FXML
	private TreeTableColumn<?, ?> colIdJuridico;

	@FXML
	private TreeTableColumn<?, ?> colIdFisico;

	@FXML
	private TreeTableColumn<?, ?> colIdVeiculo;

	@FXML
	private TreeTableColumn<?, ?> colCompanhia;

	@FXML
	private TreeTableColumn<?, ?> colBonus;

	@FXML
	private TreeTableColumn<?, ?> colSinistro;

	@FXML
	private TreeTableColumn<?, ?> colAtivo;

	@FXML
	private TreeTableColumn<?, ?> colDataInicio;

	@FXML
	private TreeTableColumn<?, ?> colDataFim;

	@FXML
	private Button btnPesquisar;

	@FXML
	private Button btnLimparPesquisa;

	@FXML
	private ComboBox<?> cbRelatorioPorFuncionario;

	@FXML
	private Button btnGerarPorFuncionario;

	@FXML
	private Button btnGerarTodosFuncionarios;

	@FXML
	private ComboBox<?> cbClienteFisicoRelatorio;

	@FXML
	private Button btnGeraClienteFisico;

	@FXML
	private ComboBox<?> cbClienteJuridicoRelatorio;

	@FXML
	private Button btnGeraClienteJuridico;

	@FXML
	private Button btnGeraClienteInativo;

	@FXML
	void cadastrarClienteFisico(ActionEvent event) {
		ClienteFisico cliente = new ClienteFisico();

		try{
			cliente.setNome(this.tfNomeClienteFisico.getText());
			cliente.setCpf(this.tfCpfClienteFisico.getText());
			cliente.setDataNascimento(this.dpDataNClienteFisico.getEditor().getText());
			cliente.setRua(this.tfEnderecoClienteFisico.getText());
			cliente.setNumero(Integer.parseInt(this.tfNumeroClienteFisico.getText()));
			cliente.setBairro(this.tfBairroClienteFisico.getText());
			cliente.setCep(this.tfCepClienteFisico.getText());
			cliente.setCidade(this.tfCidadeClienteFisico.getText());
			cliente.setEstado(this.cbEstadoClienteFisico.getEditor().getText());
			cliente.setComplemento(this.tfComplementoClienteFisico.getText());
			cliente.setEstadoCivil(this.tfEstadoCivelClienteFisico.getText());
			cliente.setProfissao(this.tfProfissaoClienteFisico.getText());
			cliente.setTelefone(this.tfTelefoneClienteFisico.getText());

			ClienteFisicoDAO cliDAO = new ClienteFisicoDAO();
			try{
				if(cliDAO.inserir(cliente)){
					this.cbClienteSeguro.getItems().add(cliente.getNome());
					this.cbClienteVeiculo.getItems().add(cliente.getNome());
					tfNomeClienteFisico.clear();
					tfCpfClienteFisico.clear();
					dpDataNClienteFisico.getEditor().clear();
					tfEnderecoClienteFisico.clear();
					tfNumeroClienteFisico.clear();
					tfBairroClienteFisico.clear();
					tfCepClienteFisico.clear();
					tfCidadeClienteFisico.clear();
					tfComplementoClienteFisico.clear();
					tfEstadoCivelClienteFisico.clear();
					tfProfissaoClienteFisico.clear();
					tfTelefoneClienteFisico.clear();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

				}
			} catch (Exception ex){
				JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@FXML
	void cadastrarClienteJuridico(ActionEvent event) {
		ClienteJuridico empresa = new ClienteJuridico();
		
		try{
			empresa.setRazaoSocial(this.tfRazaoSocial.getText());
			empresa.setCnpj(this.tfCnpj.getText());
			empresa.setTelefone(this.tfTelefoneClienteJuridico.getText());
			empresa.setRua(this.tfEnderecoClienteJuridico.getText());
			empresa.setNumero(Integer.parseInt(this.tfNumeroClienteJuridico.getText()));
			empresa.setBairro(this.tfBairroClienteJuridico.getText());
			empresa.setCep(this.tfBairroClienteJuridico.getText());
			empresa.setCidade(this.tfCidadeClienteJuridico.getText());
			empresa.setComplemento(this.tfComplementoClienteJuridico.getText());
			empresa.setEstado(this.cbEstadoClienteJuridico.getEditor().getText());
			
			ClienteJuridicoDAO empDAO = new ClienteJuridicoDAO();
			try {
				if(empDAO.inserir(empresa)){
					this.cbClienteSeguro.getItems().add(empresa.getRazaoSocial());
					this.cbClienteVeiculo.getItems().add(empresa.getRazaoSocial());
					tfRazaoSocial.clear();
					tfCnpj.clear();
					tfTelefoneClienteJuridico.clear();
					tfTelefoneClienteJuridico.clear();
					tfEnderecoClienteJuridico.clear();
					tfNumeroClienteJuridico.clear();
					tfNumeroClienteJuridico.clear();
					tfBairroClienteJuridico.clear();
					tfCepClienteJuridico.clear();
					tfCidadeClienteJuridico.clear();
					tfComplementoClienteJuridico.clear();
					cbEstadoClienteJuridico.getEditor().clear();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void cadastrarFuncionario(ActionEvent event) {
		Usuario usuario = new Usuario();

		try{
			usuario.setNome(this.tfNomeFuncionario.getText());
			usuario.setCpf(this.tfCpfFuncionario.getText());
			usuario.setDataNascimento(this.dpDNFuncionario.getEditor().getText());
			usuario.setRua(this.tfEnderecoFuncionario.getText());
			usuario.setNumero(Integer.parseInt(this.tfNumeroFuncionario.getText()));
			usuario.setBairro(this.tfBairroFuncionario.getText());
			usuario.setCep(this.tfCepFuncionario.getText());
			usuario.setCidade(this.tfCidadeFuncionario.getText());
			usuario.setEstado(this.cbEstadoFuncionario.getEditor().getText());
			usuario.setComplemento(this.tfComplementoFuncionario.getText());
			usuario.setLogin(this.tfLogin.getText());
			usuario.setSenha(this.pfSenha.getText());
			usuario.setTelefone(this.tfTelefoneFuncionario.getText());

			UsuarioDAO userDAO = new UsuarioDAO();
			try{
				if(userDAO.inserir(usuario)){
					this.cbClienteSeguro.getItems().add(usuario.getNome());
					this.cbClienteVeiculo.getItems().add(usuario.getNome());
					tfNomeFuncionario.clear();
					tfCpfFuncionario.clear();
					dpDNFuncionario.getEditor().clear();
					tfEnderecoFuncionario.clear();
					tfNumeroFuncionario.clear();
					tfBairroFuncionario.clear();
					tfCepFuncionario.clear();
					tfCidadeFuncionario.clear();
					tfComplementoFuncionario.clear();
					tfLogin.clear();
					pfSenha.clear();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

				}
			} catch (Exception ex){
				JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@FXML
	void cadastrarSeguro(ActionEvent event){
		Seguro seguro = new Seguro();
		//seguro.setPessoa(this.cbClienteSeguro.getValue());
		//seguro.setVeiculoSeguro(this.cbVeiculoSeguro.getValue());
		try{
			seguro.setInicioVigencia(String.valueOf(this.dpInicioVigenciaSeguro.getValue()));
			seguro.setFinalVigencia(String.valueOf(this.dpFimVigenciaSeguro.getValue()));
			seguro.setCompanhia(this.tfCompanhiaSeguro.getText());
			seguro.setBonus(Integer.parseInt(this.tfBonusSeguro.getText()));
			ClienteFisico clienteF1 = new ClienteFisico("Gilberto Silva", "12345678912", "09/10/1990", "(16)33311111", "Av Sao Carlos", 1245, "Centro", "12345-567", "Sao Carlos" , "SP", "Vendedor", "Casado");
			seguro.setPessoa(clienteF1.getId());
//			Veiculo veiculo1 = new Veiculo("Celta 1.0", "9BHCG134JVH", "DNH-1213", 2012, 2012, 864829018, clienteF1);
//			seguro.setVeiculoSeguro(veiculo1.getIdVeiculo());
			SeguroDAO segDAO = new SeguroDAO();
			try{
				if(segDAO.inserir(seguro)){
					dpInicioVigenciaSeguro.getEditor().clear();
					dpFimVigenciaSeguro.getEditor().clear();
					tfCompanhiaSeguro.clear();
					tfBonusSeguro.clear();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}
			}catch (Exception ex){
				JOptionPane.showMessageDialog(null, "Nao foi possivel realizar o cadastro!");
			}
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!");
		}
	}

	@FXML
	void cadastrarVenda(ActionEvent event) {

	}

	@FXML
	void cadastrarVeiculo(ActionEvent event) {
		Veiculo veiculo = new Veiculo();
		
		try{
			veiculo.setModelo(this.tfCModelo.getText());
			veiculo.setChassi(this.tfChassi.getText());
			veiculo.setAnoFabricacao(String.valueOf(this.dpAnoFabricacao.getValue()));
			veiculo.setAnoModelo(String.valueOf(this.dpAnoModelo.getValue()));
			veiculo.setPlaca(this.tfPlaca.getText());
			veiculo.setRenavam(Long.parseLong(this.tfRenavam.getText()));
			ClienteFisico clienteF1 = new ClienteFisico("Gilberto Silva", "12345678912", "09/10/1990", "(16)33311111", "Av Sao Carlos", 1245, "Centro", "12345-567", "Sao Carlos" , "SP", "Vendedor", "Casado");
			veiculo.setPessoa(clienteF1.getId());
			
			VeiculoDAO vecDAO = new VeiculoDAO();
			try{
				if(vecDAO.inserir(veiculo)){
					dpAnoModelo.getEditor().clear();
					dpAnoFabricacao.getEditor().clear();
					tfCModelo.clear();
					tfChassi.clear();
					tfPlaca.clear();
					tfRenavam.clear();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				}
			}catch (Exception ex){
				JOptionPane.showMessageDialog(null, "Nao foi possivel realizar o cadastro!");
			}
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Favor preencher todos os campos corretamente!");
		}
	}

	@FXML
	void limparPesquisa(ActionEvent event) {

	}

	@FXML
	void pesquisar(ActionEvent event) throws SQLException {

	}

	@FXML
	void cancelarSeguro(ActionEvent event) {
		dpInicioVigenciaSeguro.getEditor().clear();
		dpFimVigenciaSeguro.getEditor().clear();
		tfCompanhiaSeguro.clear();
		tfBonusSeguro.clear();
	}

	@FXML
	void filtrarSeguro(ActionEvent event) {
		SeguroDAO segDAO = new SeguroDAO();

		List<Seguro> seguros;
		try {
			seguros = segDAO.pesquisar();
			for (Seguro seg : seguros) {
				System.out.println("Bonus: " + seg.getBonus() + " Companhia: " + seg.getCompanhia() + " Veiculo: " + seg.getVeiculoSeguro() + 
						" Inicio Vigencia: " + seg.getInicioVigencia() + " Final Vigencia: " + seg.getFinalVigencia() + "Cliente: " + seg.getPessoa()); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	void limparCampoPesquisa(ActionEvent event) {
		tfPesquisa.clear();
	}

	private void popularCBCliente(List<ClienteFisico> clientes){
		this.cbClienteSeguro.getItems().clear();
		this.cbClienteVeiculo.getItems().clear();
		for (ClienteFisico tmpCliente : clientes){
			this.cbClienteSeguro.getItems().add(tmpCliente.getNome());
			this.cbClienteVeiculo.getItems().add(tmpCliente.getNome());
		}

	}

	private void popularCBEstados(){
		this.cbEstadoClienteFisico.getItems().clear();
		this.cbEstadoClienteJuridico.getItems().clear();
		this.cbEstadoFuncionario.getItems().clear();
		this.cbEstadoClienteFisico.getItems().addAll("AC", "AL", "AP", "BA");
		this.cbEstadoClienteJuridico.getItems().addAll("AC", "AL", "AP", "BA");
		this.cbEstadoFuncionario.getItems().addAll("AC", "AL", "AP", "BA");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ClienteFisicoDAO cliDAO = new ClienteFisicoDAO();
//		ClienteJuridicoDAO empDAO = new ClienteJuridicoDAO();
//		List<ClienteJuridico> empresas;
		List<ClienteFisico> clientes;
		try {
//			empresas = empDAO.pesquisar();
			clientes = cliDAO.pesquisar();
			popularCBCliente(clientes);
			popularCBEstados();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
>>>>>>> develop
}
