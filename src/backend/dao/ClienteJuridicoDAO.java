package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backend.models.ClienteJuridico;

public class ClienteJuridicoDAO {
	private Connection connection;

	public ClienteJuridicoDAO(){
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (ClienteJuridico cliente) {
		String sql = "INSERT INTO ClienteJuridico (cnpj, razaoSocial, telefone, rua, "
				+ "numero, bairro, complemento, cep, cidade, estado) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, cliente.getCnpj());
			stmt.setString(2, cliente.getRazaoSocial());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getRua());
			stmt.setInt(5, cliente.getNumero());
			stmt.setString(6, cliente.getBairro());
			stmt.setString(7, cliente.getComplemento());
			stmt.setString(8, cliente.getCep());
			stmt.setString(9, cliente.getCidade());
			stmt.setString(10, cliente.getEstado());		

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<ClienteJuridico> pesquisar() throws SQLException {
		String sql = "SELECT * FROM ClienteJuridico";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<ClienteJuridico> clientes = new ArrayList<>();

		while (rs.next()) {
			ClienteJuridico cliente = new ClienteJuridico();
			cliente.setCnpj(String.valueOf(rs.getInt("cnpj")));
			cliente.setRazaoSocial(rs.getString("razaoSocial"));
			cliente.setTelefone(rs.getString("telefone"));
			cliente.setRua(rs.getString("rua"));
			cliente.setBairro(rs.getString("bairro"));
			cliente.setComplemento(rs.getString("complemento"));
			cliente.setCep(String.valueOf(rs.getInt("cep")));
			cliente.setCidade(rs.getString("cidade"));
			cliente.setEstado(rs.getString("estado"));

			clientes.add(cliente);
		}

		rs.close();
		stmt.close();
		return clientes;
	}

}
