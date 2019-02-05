package Search_File;
import java.util.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import java.io.*;


public class Fil1  implements Serializable{
	public static int count;
	private int id;
	private String name;
	private String path;
	private String hash;
        private double size;
        private long date;
	
	
	public Fil1() {
		this.id=count++;
		
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
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
        public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	
	public Fil1(String name, String path, String hash , double size , long date) {
		super();
		this.name = name;
		this.path = path;
		this.hash = hash;
                this.size = size;
		
	}
	
	/*public static void main(String args[]){
		Fil1 livre = new Fil1("Sad.txt","/////","dojduo");
		ObjectOutputStream oos1;
		try{

			oos1 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new    File("/Users/omarsadiqi/Desktop/ts.ihelp"))));

			oos1.writeObject(livre);

			oos1.close();

		}

		catch (java.io.IOException e) {e.printStackTrace();}
		Fil1 monLivre = new Fil1();
		
		ObjectInputStream ois;

		try

		{

			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new    File("/Users/omarsadiqi/Desktop/ts.ihelp"))));	

			monLivre = (Fil1)ois.readObject();

			ois.close();

		}

		catch (IOException e) {e.printStackTrace();}

		catch (ClassNotFoundException e2) {e2.printStackTrace();}

		System.out.println(monLivre.getName());
		
		
	}*/

}
