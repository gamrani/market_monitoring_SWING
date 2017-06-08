package metier;

public interface Imetier {
	public boolean login(String s,String p);
	public String statut (String s,String p);
	
	public void ajouterProjet();
	public void modifierProjet();
	public void supprimerProjet();

	public void ajouterService();
	public void modifierService();
	public void arreterService();
	
	public void ajouterEmployer();
	public void modifierEmployer();
	public void supprimerEmployer();
	
}
