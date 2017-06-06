package metier;

public class User {
    protected String name ,email,password,login,statut ;

	public User(String name, String email, String password, String login, String statut) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.login = login;
		this.statut = statut;
	}
	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
    
    
}
