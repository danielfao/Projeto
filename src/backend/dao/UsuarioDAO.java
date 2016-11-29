package backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import backend.models.Usuario;

public class UsuarioDAO {

	public boolean checkLogin(String login, String senha){
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	boolean check = false;

	/*try{
		stmt = con.prepareStatement ("SELECT * from Usuario WHERE login = ? and senha = ?");
		stmt.setString(1, login);
		stmt.setString(2, senha);

		rs = stmt.executeQuery();

		if(rs.next()) {
			Usuario Usuario = new Usuario();

			Usuario.setId(rs.getInt("idPessoa"));
			Usuario.setLogin(rs.getString("login"));
			Usuario.setSenha(rs.getString("senha"));
		}

	} catch (SQLException ex){
		Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
	}finally{
		ConnectionFactory.closeConnection(con , stmt,rs);
	}*/

	return check;

	}

}