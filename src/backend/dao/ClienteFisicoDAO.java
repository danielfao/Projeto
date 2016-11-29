package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import backend.models.ClienteFisico;

public class ClienteFisicoDAO {
	private Connection connection;
	
	public ClienteFisicoDAO(){
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (ClienteFisico cliente) {
		String sql = "INSERT INTO Pessoa(id, cpf, nome, dataNascimento, telefone, rua, "
				+ "numero, bairro, complemento, cep, cidade, estado) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getDataNascimento());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getRua());
			stmt.setInt(7, cliente.getNumero());
			stmt.setString(8, cliente.getBairro());
			stmt.setString(9, cliente.getComplemento());
			stmt.setString(10, cliente.getCep());
			stmt.setString(11, cliente.getCidade());
			stmt.setString(12, cliente.getEstado());		

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		String sql1 = "INSERT INTO ClienteFisico (idPessoa, profissao, estadoCivil) " + "VALUE (?, ?, ?);";
		try{
			PreparedStatement stmt1 = connection.prepareStatement(sql1);
			stmt1.setInt(1, cliente.getId());
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
}
