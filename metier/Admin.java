package metier;

import java.util.ArrayList;

public class Admin extends User {
   private ArrayList<Service> services ;

public Admin(String name, String email, String password, String login, String statut, ArrayList<Service> services) {
	super(name, email, password, login, statut);
	this.services = services;
}

public ArrayList<Service> getServices() {
	return services;
}

public void setServices(ArrayList<Service> services) {
	this.services = services;
}
   
   
}
