package backend.dao;

<<<<<<< HEAD
public class VendaDAO {

=======
import java.sql.Connection;

import backend.models.Venda;

public class VendaDAO {
	private Connection connection;
	
	public VendaDAO(){
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir (Venda venda){
		
		
		return true;
	}
>>>>>>> develop
}
