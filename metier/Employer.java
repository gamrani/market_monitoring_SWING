package metier;

public class Employer extends User{
	
	private Service service;

	
	
	public Employer(String name, String email, String password, String login, String statut, Service service) {
		super(name, email, password, login, statut);
		this.service = service;
	}
	public Employer() {
		super();
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	

}
