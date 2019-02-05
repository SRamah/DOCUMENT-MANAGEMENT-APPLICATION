package Local;

import java.io.Serializable;

public class Fileapp  implements Serializable{
	public static int count;
	private int id;
	private String name;
	private String path;
	private String taille;
	private String type;
	private String tags ;
	private int score;
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Fileapp() {
		id=count++;
	}

	public Fileapp(String name, String path, String taille, String type,
			String tags,int score) {
		super();
		this.name = name;
		this.path = path;
		this.taille = taille;
		this.type = type;
		this.tags = tags;
		this.score=score;
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
   public int getId(){
	   return this.id;
   }
	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
