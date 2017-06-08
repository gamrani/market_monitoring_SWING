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
			User u = null ; //= new User(resultat.getString("name"),resultat.getString("email"), resultat.getString("password"), resultat.getString("login"), resultat.getString("statut"));
			while(resultat.next()){
				// u = new User(resultat.getString("name"),resultat.getString("email"), resultat.getString("password"), resultat.getString("login"), resultat.getString("statut"));
				 result=true;
				//System.out.print(resultat.getString("login"));
				//System.out.print(resultat.getString("password"));
				i++;
			}
			//String name, String email, String password, String login, String statut
			
			request.close();
           
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		} 
		
		
		return result;
	}

	public String statut(String s,String p) {
		// TODO Auto-generated method stub
		String r=null ;
Connection connexion = Dao.getConnection();
		
		try {
			PreparedStatement request = (PreparedStatement) connexion.prepareStatement("SELECT*FROM User WHERE login = (?) and password=(?)");
			request.setString(1,s);
			request.setString(2, p);
			ResultSet resultat = request.executeQuery();
			int i=0;
			User u = null ; //= new User(resultat.getString("name"),resultat.getString("email"), resultat.getString("password"), resultat.getString("login"), resultat.getString("statut"));
			while(resultat.next()){
				 u = new User(resultat.getString("name"),resultat.getString("email"), resultat.getString("password"), resultat.getString("login"), resultat.getString("statut"));
				
				//System.out.print(resultat.getString("login"));
				//System.out.print(resultat.getString("password"));
				i++;
			}
			//String name, String email, String password, String login, String statut
			
			request.close();
			r= u.getStatut();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
	
			e.printStackTrace();
			
		} 
		
		return r ;
		
	}

	@Override
	public void ajouterProjet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProjet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerProjet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arreterService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterEmployer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierEmployer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerEmployer() {
		// TODO Auto-generated method stub
		
	}

}
