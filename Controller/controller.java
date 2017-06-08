package Controller;

import View.acceuil;
import View.admin;
import View.chef;
import View.employer;

public class controller {
	
	
	public controller(String s)
	{
		System.out.println("Con");
		if(s.equals("acceuil")) { 
			acceuil a = new acceuil();
			}
		else if (s.equals("administrateur")){
			System.out.println("admin");
			admin ad = new admin();
			}
		else if (s.equals("employer")){
			employer e = new employer();
			}
		else if (s.equals("chef de service")){
			chef c  = new chef();
			}
	}
	
	

}
