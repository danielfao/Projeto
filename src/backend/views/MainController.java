package backend.views;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import backend.dao.SeguroDAO;
import backend.models.ClienteFisico;
import backend.models.Seguro;
import backend.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Popup;

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

	//@FXML
	//private ComboBox<?> cbClienteSeguro;
	
	@FXML
	private ComboBox<String> cbClienteSeguro;
	
	private void popularCB(List<ClienteFisico> clientes){
		this.cbClienteSeguro.getItems().clear();
		
		for (ClienteFisico tmpCliente : clientes){
			this.cbClienteSeguro.getItems().add(tmpCliente.getNome());
		}
		
	}

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
	void cadastrarFuncionario(ActionEvent event) {

	}

	@FXML
	void cadastrarSeguro(ActionEvent event) throws IOException {
		//OBS: Coloquei o CRUD aqui apenas para exemplificar - porém cada um é pra uma função específica.

		//descobrir como buscar as informações vindas do formulário para preencher o construtor.
		Seguro seguro = new Seguro();
		//seguro.setPessoa(this.cbClienteSeguro.getValue());
		//seguro.setVeiculoSeguro(this.cbVeiculoSeguro.getValue());
		seguro.setInicioVigencia(String.valueOf(this.dpInicioVigenciaSeguro.getValue()));
		seguro.setFinalVigencia(String.valueOf(this.dpFimVigenciaSeguro.getValue()));
		seguro.setCompanhia(this.tfCompanhiaSeguro.getText());
		seguro.setBonus(Integer.parseInt(this.tfBonusSeguro.getText()));
		ClienteFisico clienteF1 = new ClienteFisico("Jose da Silva", "123", "09/10/1990", "(16)3355-5221", "Rua das Orquideas", 123, "Jd Paola", "13690-000", "Descalvado" , "SP", "Funcionario publico", "Casado");
		seguro.setPessoa(clienteF1);
		Veiculo veiculo1 = new Veiculo("Astra 2.0", "9BD12AUH8123876", "ABC-1992", 2012, 2013, 489374560, clienteF1);
		seguro.setVeiculoSeguro(veiculo1);
		//seguro.setInicioVigencia("2016-08-20");
		//seguro.setFinalVigencia("2017-08-20");
		//seguro.setCompanhia("Porto Seguro");
		//seguro.setBonus(0);
		SeguroDAO segDAO = new SeguroDAO();
		if(segDAO.inserir(seguro)){
			dpInicioVigenciaSeguro.getEditor().clear();
			dpFimVigenciaSeguro.getEditor().clear();
			tfCompanhiaSeguro.clear();
			tfBonusSeguro.clear();
		}
		else{
			Popup error = new Popup();
			error.show(error);
		}

	}

	@FXML
	void cadastrarVenda(ActionEvent event) {

	}

	@FXML
	void limparPesquisa(ActionEvent event) {

	}

	@FXML
	void pesquisar(ActionEvent event) throws SQLException {
		//Tentar entender o porque dos erros
		Seguro seguro = new Seguro();
		SeguroDAO segDAO = new SeguroDAO();

		List<Seguro> seguros = segDAO.pesquisar(seguro);
		for (Seguro seg : seguros) {
			System.out.println(seg.getBonus() + "Bonus: " + seg.getCompanhia() + "Companhia: " + seg.getVeiculoSeguro() + "Veiculo: "
					+ seg.getInicioVigencia() + " Inicio Vigencia: " + seg.getFinalVigencia() + "Final Vigencia: " + seg.getEmpresa() 
					+ "Cliente Juridico : " + seg.getPessoa() + "Cliente Fisico: "); 
		}

	}
}
