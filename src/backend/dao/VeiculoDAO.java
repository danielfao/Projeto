package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backend.models.Veiculo;

public class VeiculoDAO {
	private Connection connection;

	public VeiculoDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (Veiculo veiculo) {
		String sql = "INSERT INTO Veiculo(modelo, chassi, placa, anoFabricacao, anoModelo, "
				+ "renavam, idClienteFisico) " + "VALUES (?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, veiculo.getModelo());
			stmt.setString(2, veiculo.getChassi());
			stmt.setString(3, veiculo.getPlaca());
			stmt.setString(4, veiculo.getAnoFabricacao());
			stmt.setString(5, veiculo.getAnoModelo());
			stmt.setLong(6, veiculo.getRenavam());
			stmt.setInt(7, veiculo.getPessoa());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Veiculo> pesquisar() throws SQLException {
		String sql = "SELECT * FROM Veiculo";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<Veiculo> veiculos = new ArrayList<>();

		while (rs.next()) {
			Veiculo veiculo = new Veiculo();
			veiculo.setModelo(rs.getString("modelo"));
			veiculo.setChassi(rs.getString("chassi"));
			veiculo.setPlaca(rs.getString("placa"));
			veiculo.setAnoFabricacao(rs.getString("anoFabricacao"));
			veiculo.setAnoModelo(rs.getString("anoModelo"));
			veiculo.setRenavam(rs.getLong("renavam"));
			veiculo.setPessoa(rs.getInt("idClienteFisico"));

			veiculos.add(veiculo);
		}

		rs.close();
		stmt.close();
		return veiculos;
	}
}
