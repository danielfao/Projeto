package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import backend.models.Seguro;

public class SeguroDAO {
	private Connection connection;

	public SeguroDAO(){
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (Seguro seguro) {
		String sql = "INSERT INTO Seguro(idVeiculo, bonus, companhia, sinistro, ativo, dataInicialVigencia, "
				+ "dataFinalVigencia, idClienteFisico) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setInt(1, seguro.getVeiculoSeguro());
			stmt.setInt(2, seguro.getBonus());
			stmt.setString(3, seguro.getCompanhia());
			stmt.setBoolean(4, seguro.isSinistro());
			stmt.setBoolean(5, seguro.isAtivo());
			stmt.setString(6, seguro.getInicioVigencia());
			stmt.setString(7, seguro.getFinalVigencia());
			stmt.setInt(8, seguro.getPessoa());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Seguro> pesquisar() throws SQLException {
		String sql = "SELECT * FROM Seguro";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<Seguro> seguros = new ArrayList<Seguro>();

		while (rs.next()) {
			Seguro seguro1 = new Seguro();
			seguro1.setVeiculoSeguro(rs.getInt("idVeiculo")); 
			seguro1.setBonus(rs.getInt("bonus")); 
			seguro1.setCompanhia(rs.getString("companhia"));
			seguro1.setSinistro(rs.getBoolean("sinistro"));
			seguro1.setAtivo(rs.getBoolean("ativo"));
			seguro1.setInicioVigencia(rs.getString("dataInicialVigencia"));
			seguro1.setFinalVigencia(rs.getString("dataFinalVigencia"));
			seguro1.setPessoa(rs.getInt("idClienteFisico"));

			seguros.add(seguro1);
		}

		rs.close();
		stmt.close();
		return seguros;
	}

	public void alterar(Seguro seguro) {		
		try {
			String sql = "UPDATE seguro SET idVeiculo = ?, bonus = ?, companhia = ?, sinistro = ?, "
					+ "ativo = ?, dataInicialVigencia = ?, dataFinalVigencia = ? , idClienteFisico = ?"
					+ " WHERE id = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, seguro.getVeiculoSeguro());
			stmt.setInt(2, seguro.getBonus());
			stmt.setString(3, seguro.getCompanhia());
			stmt.setBoolean(4, seguro.isSinistro());
			stmt.setBoolean(5, seguro.isAtivo());
			stmt.setString(6, seguro.getInicioVigencia());
			stmt.setString(7, seguro.getFinalVigencia());
			stmt.setInt(8, seguro.getPessoa());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e); }
	}
}
