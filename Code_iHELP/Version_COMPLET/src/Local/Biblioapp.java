
package Local;

import java.io.Serializable;

/**
 *
 * @author salaheddine
 */
public class Biblioapp implements Serializable{
 


 
	public static int count;
	private int id;
	private String name;
        private String genre;
	private String securite ;
	private String path;
	private String taille;
	
	
	
	

	public Biblioapp() {
		id=count++;
	}

	public Biblioapp(String name, String genre, String securite, String path, String taille) {
		super();
		this.name = name;
		this.genre = genre;
		this.securite = securite;
		this.path = path;
		this.taille = taille;
	}
		
        
        public Biblioapp(String name, String genre, String securite) {
		super();
		this.name = name;
		this.genre = genre;
		this.securite = securite;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSecurite() {
		return securite;
	}

	public void setSecurite(String securite) {
		this.securite = securite;
	}

}
