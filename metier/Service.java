package metier;

import java.util.ArrayList;

public class Service {
	private String departement,name;
	private Chef_service chef ;
	private ArrayList<Employer> employers ;
	
	
	
	public Service(String departement, String name, Chef_service chef, ArrayList<Employer> employers) {
		
		this.departement = departement;
		this.name = name;
		this.chef = chef;
		this.employers = employers;
	}
	public Service() {
		
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Chef_service getChef() {
		return chef;
	}
	public void setChef(Chef_service chef) {
		this.chef = chef;
	}
	public ArrayList<Employer> getEmployers() {
		return employers;
	}
	public void setEmployers(ArrayList<Employer> employers) {
		this.employers = employers;
	}
	
	

}
