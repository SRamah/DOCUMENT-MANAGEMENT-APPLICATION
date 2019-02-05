
package Local;

import java.io.Serializable;

/**
 *
 * @author salaheddine
 */
public class CompteApp implements Serializable{
 


 
	public static int count;
	private int id;
	private String nom;
        private String prenom;
	private String email ;
	private String password;
	private Date date;
	
	
	
	

	public CompteApp() {
		id=count++;
	}

	public CompteApp(String nom, String prenom, String email, String password, Date date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.date = date;
	}
		
        
        public CompteApp(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
