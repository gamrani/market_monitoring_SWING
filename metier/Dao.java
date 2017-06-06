package metier;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Dao {
	private static Connection connection ;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/monitoring","root","");
			//System.out.println("Création connexion");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		return connection;
	}
}
