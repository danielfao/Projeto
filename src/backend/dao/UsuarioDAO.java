package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backend.models.Usuario;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir (Usuario funcionario) {
		String sql = "INSERT INTO Pessoa(cpf, nome, dataNascimento, telefone, rua, "
				+ "numero, bairro, complemento, cep, cidade, estado) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, funcionario.getCpf());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getDataNascimento());
			stmt.setString(4, funcionario.getTelefone());
			stmt.setString(5, funcionario.getRua());
			stmt.setInt(6, funcionario.getNumero());
			stmt.setString(7, funcionario.getBairro());
			stmt.setString(8, funcionario.getComplemento());
			stmt.setString(9, funcionario.getCep());
			stmt.setString(10, funcionario.getCidade());
			stmt.setString(11, funcionario.getEstado());		

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		try{
			String sql2 = "SELECT id FROM Pessoa WHERE cpf = ?";
			PreparedStatement stmt1 = connection.prepareStatement(sql2);
			stmt1.setString(1, funcionario.getCpf());
			ResultSet rs = stmt1.executeQuery();
			int id = rs.getInt("id");

			String sql1 = "INSERT INTO Usuario (idPessoa, login, senha) " + "VALUES (?, ?, ?);";
			stmt1 = connection.prepareStatement(sql1);
			stmt1.setInt(1, id);
			stmt1.setString(2, funcionario.getLogin());
			stmt1.setString(3, funcionario.getSenha());

			stmt1.execute();
			stmt1.close();
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Usuario> pesquisar() throws SQLException {
		String sql = "SELECT * FROM Pessoa";
		PreparedStatement stmt = this.connection.prepareStatement(sql); 
		ResultSet rs = stmt.executeQuery();

		List<Usuario> funcionarios = new ArrayList<>();

		while (rs.next()) {
			Usuario funcionario = new Usuario();
			funcionario.setCpf(String.valueOf(rs.getInt("cpf")));
			funcionario.setNome(rs.getString("nome"));
			//funcionario.setDataNascimento(String.valueOf(rs.getDate("dataNascimento")));
			funcionario.setTelefone(rs.getString("telefone"));
			funcionario.setRua(rs.getString("rua"));
			funcionario.setBairro(rs.getString("bairro"));
			funcionario.setComplemento(rs.getString("complemento"));
			funcionario.setCep(String.valueOf(rs.getInt("cep")));
			funcionario.setCidade(rs.getString("cidade"));
			funcionario.setEstado(rs.getString("estado"));
			String sql1 = "SELECT * FROM Usuario";
			PreparedStatement stmt1 = this.connection.prepareStatement(sql1); 
			ResultSet rs1 = stmt1.executeQuery();
			funcionario.setLogin(rs1.getString("login"));
			funcionario.setSenha(rs1.getString("senha"));

			funcionarios.add(funcionario);
		}

		rs.close();
		stmt.close();
		return funcionarios;
	}
}