/*package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import backend.models.Pessoa;

public class PessoaDAO {

	public void create(Pessoa p){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try{
			stmt = con.prepareStatement("INSERT INTO Pessoa (nome, cpf, dataNascimento, telefone, rua, "
					+ "numero, bairro, complemento, cep, cidade, estado) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
			stmt.setString(1,p.getNome());
			stmt.setString(2,p.getCpf());
			stmt.setString(3,p.getDataNascimento());
			stmt.setString(4,p.getTelefone());
			stmt.setString(5,p.getRua());
			stmt.setInt(6,p.getNumero());
			stmt.setString(7,p.getBairro());
			stmt.setString(8,p.getComplemento());
			stmt.setString(9,p.getCep());
			stmt.setString(10,p.getCidade());
			stmt.setString(11,p.getEstado());

			stmt.executeUpdate();

			//JOptionPane.showMessageDialog(null, " Salvo com sucesso");
		} catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, " Erro ao salvar"+ ex);
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			ConnectionFactory.closeConnection(con , stmt);
		}
	}

	public List<Pessoa> read(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Pessoa> pessoas = new ArrayList<>();

		try{
			stmt = con.prepareStatement ("SELECT * from Pessoa");
			rs = stmt.executeQuery();

			while(rs.next()) {
				Pessoa pessoa = new Pessoa();

				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setDataNascimento(rs.getString("dataNascimento"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setRua(rs.getString("rua"));
				pessoa.setNumero(rs.getInt("numero"));
				pessoa.setBairro(rs.getString("bairro"));
				pessoa.setComplemento(rs.getString("complemento"));
				pessoa.setCep(rs.getString("cep"));
				pessoa.setCidade(rs.getString("cidade"));
				pessoa.setEstado(rs.getString("estado"));
				pessoas.add(pessoa);
			}
		} catch (SQLException ex){
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			ConnectionFactory.closeConnection(con , stmt,rs);
		}

		return pessoas;
	}	


	public void update(Pessoa p) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try{
			stmt = con.prepareStatement("UPDATE Pessoa SET nome = ?, cpf = ?, dataNascimento = ?, telefone = ?, rua = ?, "
					+ "numero = ?,bairro = ?, complemento = ?, cep = ?,cidade = ?,estado = ? WHERE id = ?");
			stmt.setString(1,p.getNome());
			stmt.setString(2,p.getCpf());
			stmt.setString(3,p.getDataNascimento());
			stmt.setString(4,p.getTelefone());
			stmt.setString(5,p.getRua());
			stmt.setInt(6,p.getNumero());
			stmt.setString(7,p.getBairro());
			stmt.setString(8,p.getComplemento());
			stmt.setString(9,p.getCep());
			stmt.setString(10,p.getCidade());
			stmt.setString(11,p.getEstado());
			stmt.setString(12, p.getId());

			stmt.executeUpdate();


			//JOptionPane.showMessageDialog(null, " Atualizado com sucesso");
		} catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, " Erro ao atualizar"+ ex);
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			ConnectionFactory.closeConnection(con , stmt);
		}
	}*/

	/*Não deletaremos nenhuma informação
	public void delete(Pessoa p){

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		try{
			stmt = con.prepareStatement("DELETE FROM Pessoa WHERE id = ?");
			stmt.setString(1, p.getId());

			stmt.executeUpdate();


			//JOptionPane.showMessageDialog(null, " Removido com sucesso");
		} catch (SQLException ex){
			//JOptionPane.showMessageDialog(null, " Erro ao remover"+ ex);
			Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			ConnectionFactory.closeConnection(con , stmt);
		}
	}*/
//}