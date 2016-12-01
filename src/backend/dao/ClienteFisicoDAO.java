package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backend.models.ClienteFisico;

public class ClienteFisicoDAO {
	private Connection connection;
	
	public ClienteFisicoDAO(){
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (ClienteFisico cliente) {
		String sql = "INSERT INTO Pessoa(cpf, nome, dataNascimento, telefone, rua, "
				+ "numero, bairro, complemento, cep, cidade, estado) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getDataNascimento());
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getRua());
			stmt.setInt(6, cliente.getNumero());
			stmt.setString(7, cliente.getBairro());
			stmt.setString(8, cliente.getComplemento());
			stmt.setString(9, cliente.getCep());
			stmt.setString(10, cliente.getCidade());
			stmt.setString(11, cliente.getEstado());		

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		try{
			String sql2 = "SELECT id FROM Pessoa WHERE cpf = ?";
			PreparedStatement stmt1 = connection.prepareStatement(sql2);
			stmt1.setString(1, cliente.getCpf());
			ResultSet rs = stmt1.executeQuery();
			int id = rs.getInt("id");
			
			String sql1 = "INSERT INTO ClienteFisico (idPessoa, profissao, estadoCivil) " + "VALUES (?, ?, ?);";
			stmt1 = connection.prepareStatement(sql1);
			stmt1.setInt(1, id);
			stmt1.setString(2, cliente.getProfissao());
			stmt1.setString(3, cliente.getEstadoCivil());
			
			stmt1.execute();
			stmt1.close();
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<ClienteFisico> pesquisar() throws SQLException {
		String sql = "SELECT * FROM Pessoa";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<ClienteFisico> clientes = new ArrayList<>();

		while (rs.next()) {
			ClienteFisico cliente = new ClienteFisico();
			cliente.setCpf(String.valueOf(rs.getInt("cpf")));
			cliente.setNome(rs.getString("nome"));
			//cliente.setDataNascimento(String.valueOf(rs.getDate("dataNascimento")));
			cliente.setTelefone(rs.getString("telefone"));
			cliente.setRua(rs.getString("rua"));
			cliente.setBairro(rs.getString("bairro"));
			cliente.setComplemento(rs.getString("complemento"));
			cliente.setCep(String.valueOf(rs.getInt("cep")));
			cliente.setCidade(rs.getString("cidade"));
			cliente.setEstado(rs.getString("estado"));
			String sql1 = "SELECT * FROM ClienteFisico";
			PreparedStatement stmt1 = this.connection.prepareStatement(sql1); 
			ResultSet rs1 = stmt1.executeQuery();
			cliente.setProfissao(rs1.getString("profissao"));
			cliente.setEstadoCivil(rs1.getString("estadoCivil"));

			clientes.add(cliente);
		}

		rs.close();
		stmt.close();
		return clientes;
	}
}
