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

	public void inserir (Seguro seguro) {
		String sql = "INSERT INTO Seguro(idVeiculo, bonus, companhia, sinistro, ativo, dataInicialVigencia, "
				+ "dataFinalVigencia, idClienteJuridico, idClienteFisico) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setObject(1, seguro.getVeiculoSeguro());
			stmt.setInt(2, seguro.getBonus());
			stmt.setString(3, seguro.getCompanhia());
			stmt.setBoolean(4, seguro.isSinistro());
			stmt.setBoolean(5, seguro.isAtivo());
			stmt.setString(6, seguro.getInicioVigencia());
			stmt.setString(7, seguro.getFinalVigencia());
			stmt.setObject(8, seguro.getEmpresa());
			stmt.setObject(9, seguro.getPessoa());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void pesquisar (Seguro seguro) {
		String sql = "SELECT * FROM Seguro";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<Seguro> seguros = new ArrayList<Seguro>();

		while (rs.next()) {
			Seguro seguro = new Seguro();
			seguro.setVeiculoSeguro(rs.getInt("idVeiculo")); 
			seguro.setBonus(rs.getInt("bonus")); 
			seguro.setCompanhia(rs.getString("companhia"));
			seguro.setSinistro(rs.getBoolean("sinistro"));
			seguro.setAtivo(rs.getBoolean("ativo"));
			seguro.setInicioVigencia(rs.getString("dataInicialVigencia"));
			seguro.setInicioVigencia(rs.getString("dataFinalVigencia"));
			seguro.setEmpresa(rs.getObject("idClienteJuridico"));
			seguro.setPessoa(rs.getObject("idClienteFisico"));

			seguros.add(seguro);
		}

		rs.close();
		stmt.close();
	}

	public void alterar(Seguro seguro) {
		String sql = "UPDATE seguro SET idVeiculo = ?, bonus = ?, companhia = ?, sinistro = ?, "
				+ "ativo = ?, dataInicialVigencia = ?, dataFinalVigencia = ?, idClienteJuridico = ? , idClienteFisico = ?"
				+ " WHERE id = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setObject(1, seguro.getVeiculoSeguro());
			stmt.setInt(2, seguro.getBonus());
			stmt.setString(3, seguro.getCompanhia());
			stmt.setBoolean(4, seguro.isSinistro());
			stmt.setBoolean(5, seguro.isAtivo());
			stmt.setString(6, seguro.getInicioVigencia());
			stmt.setString(7, seguro.getFinalVigencia());
			stmt.setObject(8, seguro.getEmpresa());
			stmt.setObject(9, seguro.getPessoa());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e); }
	}
}
