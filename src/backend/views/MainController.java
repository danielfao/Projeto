package backend.views;

import java.util.List;
import backend.dao.SeguroDAO;
import backend.models.Seguro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

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
	void cadastrarSeguro(ActionEvent event) {
		//OBS: Coloquei o CRUD aqui apenas para exemplificar - porém cada um é pra uma função específica.

		//descobrir como buscar as informações vindas do formulário para preencher o construtor.
		Seguro seguro = new Seguro();
		//descobrir como pegar as informações vindas do formulário

		SeguroDAO segDAO = new SeguroDAO();
		segDAO.inserir(seguro);

	}

	@FXML
	void cadastrarVenda(ActionEvent event) {

	}

	@FXML
	void limparPesquisa(ActionEvent event) {

	}

	@FXML
	void pesquisar(ActionEvent event) {
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
