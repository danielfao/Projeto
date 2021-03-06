package backend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
	public static Connection getConnection(){
		try{
			return
					DriverManager.getConnection("jdbc:sqlite:bd/SIGCor.db");

		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	public static void closeConnection(Connection con){

		try{

			if(con != null){
				con.close();
			}
		}catch (SQLException ex){
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
