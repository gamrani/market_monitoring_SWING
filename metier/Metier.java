package metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Metier implements Imetier{

	@Override
	public boolean login(String s,String p) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		Connection connexion = Dao.getConnection();
		
		try {
			PreparedStatement request = (PreparedStatement) connexion.prepareStatement("SELECT*FROM User WHERE login = (?) and password=(?)");
			request.setString(1,s);
			request.setString(2, p);
			ResultSet resultat = request.executeQuery();
			int i=0;
			while(resultat.next()){
				 result=true;
				//System.out.print(resultat.getString("login"));
				//System.out.print(resultat.getString("password"));
				i++;
			}
			request.close();
           
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		} 
		
		
		return result;
	}

}
