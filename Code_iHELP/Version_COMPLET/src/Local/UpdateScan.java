package Local;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
public class UpdateScan implements Serializable {

	private static final long serialVersionUID = 1L;
	Date date = new Date();
	String path;
	private static CheckedInputStream cis;
	private LinkedList<Long> ListFile = new LinkedList<Long>();
	private ObjectInputStream objectIn;
	public UpdateScan() throws ClassNotFoundException, IOException{
		path = System.getProperty("user.home");
		long c = 0;
		ListFile.add(c);
		load();
		scan(System.getProperty("user.home")+"/Desktop/");		
		
	}
	
	
	public boolean checkExict(long b){
		long sco = b;
		int p = 0;
		int p1 = ListFile.size();
		int m = 0;
		int cond = 0;
		if(b==ListFile.get(p) || b==ListFile.get(p1-1) ){return true;}
		while (p1 - p > 1 && cond == 0) {
			m = (int) (p1 - p) / 2 + p;

			
			long scorefile = ListFile.get(m);
			
			if (sco == scorefile) {
				cond = 1;
				return true;
			} else if (sco > scorefile) {

				p1 = m;

			} else if (sco < scorefile) {

				p = m;

			}

		}
		return false;
	}
	public  void load() throws ClassNotFoundException, IOException{
		String PathSave = System.getProperty("user.home")+"/save/update.ihelp";
		File file = new File(PathSave);
		if(file.exists()){
			objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(PathSave)));
			ListFile = (LinkedList<Long>) objectIn.readObject();
		}
		else {
			reScan(System.getProperty("user.home")+"/Desktop/");
		}
		
	}
	
	public void save() throws IOException{
		String PathSave = System.getProperty("user.home")+"/save/update.ihelp";
		File file = new File(PathSave);
		if(file.exists()){
			file.delete();
			
			
		}
		FileOutputStream fout = new FileOutputStream(PathSave);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(ListFile);
		
	}
	public long calculChecksum(String adresse_fichier) {
	    try {
	    	
	        FileInputStream fis = new FileInputStream(adresse_fichier);
	        cis = new CheckedInputStream(fis, new Adler32());
	        byte[] tempBuf = new byte[128];
	        while (cis.read(tempBuf) >= 0) {}
	        long checksum = cis.getChecksum().getValue();
	 	return checksum;	       
	    } catch (IOException e) {
	    	
	     return 0;
	    }
	}	
public int reScan(String path){		
		if( path.length() - path.replace("/", "").length()>8 || path.lastIndexOf("Cache") > 0 || path.lastIndexOf("cache") > 0 ||  path.lastIndexOf("Library") > 0 ){
			return 0;
		}
		File file = new File(path);
		if (file.getName().startsWith(".") ) {

			return 0;
		}
		
		File[] files = file.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				reScan(files[i].getAbsolutePath());
			} else {
				long fileSizeInBytes = files[i].length();
				long fileSizeInKB = fileSizeInBytes / 1024;
				
				long fileSizeInMB = fileSizeInKB / 1024;
				
				if(fileSizeInMB < 10 && !files[i].getName().startsWith(".")){
					//System.out.println(files[i].getAbsolutePath());
				int k = 0, p = 0;
				long b =calculChecksum(files[i].getAbsolutePath());
				System.out.println(b+"pk");
				while (k < ListFile.size() && p == 0) {
					
					if ( b > (long)ListFile.get(k)) {
						
						ListFile.add(k, b);;
						p = 1;
					}

					k++;
				}
				
				
				
				}
				}

		}
       
		
		return 1;

	}
public int scan(String path){
	
	if( path.length() - path.replace("/", "").length()>8 || path.lastIndexOf("Cache") > 0 || path.lastIndexOf("cache") > 0 ||  path.lastIndexOf("Library") > 0 ){
		return 0;
	}
	File file = new File(path);
	if (file.getName().startsWith(".") ) {

		return 0;
	}
	File[] files = file.listFiles();

	for (int i = 0; i < files.length; i++) {
		if (files[i].isDirectory()) {
			scan(files[i].getAbsolutePath());
			

		} else {
			long fileSizeInBytes = files[i].length();
			long fileSizeInKB = fileSizeInBytes / 1024;
			long fileSizeInMB = fileSizeInKB / 1024;
			
			if(fileSizeInMB < 10 && !files[i].getName().startsWith(".")){

			
			long e =calculChecksum(files[i].getAbsolutePath());
			if(checkExict(e)){
				
				
				
				
				
			}
			else {
				System.out.println("NEW File "+e+files[i].getAbsolutePath());
			}
			
			}
			
			}

	}
   
	
	return 1;
	
	
}
public static void main(String args[]) throws IOException, ClassNotFoundException{
	long tempsDebut = System.currentTimeMillis();
	UpdateScan  update = new UpdateScan();
	//update.save();
	long tempsFin = System.currentTimeMillis();
	float seconds = (tempsFin - tempsDebut) / 1000F;
	System.out.println("temps ecoue " + seconds);
	
	
}	

}
