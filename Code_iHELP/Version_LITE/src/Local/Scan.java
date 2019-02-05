package Local;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import javax.swing.JLabel;



public class Scan implements Serializable {

	private Date scandate = new Date();
	private String path;
	private static int nbrfile = 0;
	private static int nbrdir = 0;
	

	private static LinkedList pdf = new LinkedList();
	private static LinkedList img = new LinkedList();
	private static LinkedList archife = new LinkedList();
	private static LinkedList web = new LinkedList();
	private static LinkedList doc = new LinkedList();
	private static LinkedList programation = new LinkedList();
	private static LinkedList dossier = new LinkedList();
	private static LinkedList other = new LinkedList();
	private static LinkedList <Long>all = new LinkedList();

	// =================================
    
	public Scan() {
		Fileapp test = new Fileapp("test", "est", "test", "test", "tes", 0);
		pdf.add(0, test);
		img.add(0, test);
		web.add(0, test);
		archife.add(0, test);
		doc.add(0, test);
		programation.add(0, test);
		dossier.add(0, test);
		other.add(0, test);
		
		
	}
    
    public void setPath(String path) {
		this.path = path;
	}

	public static void save() throws IOException{
		String PathSave = System.getProperty("user.home")+"/save/";
		
    	FileOutputStream fout = new FileOutputStream(PathSave+"/pdf.ihelp");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(pdf);
        
        fout = new FileOutputStream(PathSave+"/img.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(img);
        
        fout = new FileOutputStream(PathSave+"doc.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(doc);
        
        fout = new FileOutputStream(PathSave+"web.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(web);
        
        fout = new FileOutputStream(PathSave+"archife.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(archife);
        
        fout = new FileOutputStream(PathSave+"dossier.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(dossier);
        
        fout = new FileOutputStream(PathSave+"programation.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(programation);
        
        fout = new FileOutputStream(PathSave+"other.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(other);
        
        fout = new FileOutputStream(PathSave+"all.ihelp");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(all);
        
    }
	public Date getScandate() {
		return scandate;
	}

	public String getPath() {
		return path;
	}

	public static void setNbrfile(int nbrfile) {
		Scan.nbrfile = nbrfile;
	}

	public static void setNbrdir(int nbrdir) {
		Scan.nbrdir = nbrdir;
	}

	public static void setPdf(LinkedList pdf) {
		Scan.pdf = pdf;
	}

	public static void setImg(LinkedList img) {
		Scan.img = img;
	}

	public static void setArchife(LinkedList archife) {
		Scan.archife = archife;
	}

	public static void setWeb(LinkedList web) {
		Scan.web = web;
	}

	public static void setDoc(LinkedList doc) {
		Scan.doc = doc;
	}

	public static void setProgramation(LinkedList programation) {
		Scan.programation = programation;
	}

	public static void setDossier(LinkedList dossier) {
		Scan.dossier = dossier;
	}

	public static void setOther(LinkedList other) {
		Scan.other = other;
	}
	public static void setALl(LinkedList all) {
		Scan.all = all;
	}
	public static LinkedList getPdf() {
		return pdf;
	}
	public static LinkedList getAll() {
		return all;
	}

	public static LinkedList getImg() {
		return img;
	}

	public static LinkedList getArchife() {
		return archife;
	}

	public static LinkedList getWeb() {
		return web;
	}

	public static LinkedList getDoc() {
		return doc;
	}

	public static LinkedList getProgramation() {
		return programation;
	}

	public static LinkedList getDossier() {
		return dossier;
	}

	public static LinkedList getOther() {
		return other;
	}

	public static int getNbrfile() {
		return nbrfile;
	}

	public static int getNbrdir() {
		return nbrdir;
	}

	public static int checkFile(File file) {
		all.add((long) 0);
		int k = 0, p = 0;
		long b = operation.pathToScore(file.getAbsolutePath());
		while (k < all.size() && p == 0) {
			
			if ( b > (long)all.get(k)) {
				
				all.add(k, b);
				p = 1;
			}

			k++;
		}
		
		
		
		int score = operation.stringToScore(file.getName());
		//operation.addList(all, operation.fileToApp(file, score), score);
		if (operation.checkExt(file, "pdf|PDF")) {
			pdf.add(operation.fileToApp(file, score));

			return 1;

		} else if (operation.checkExt(file, "png|PNG|gif|GIF|jpg|JPG")) {
			
          
			img.add(operation.fileToApp(file, score));
			return 1;

		} else if (operation.checkExt(file, "zip|ZIP|rar|RAR|tar|TAR")) {
		
			archife.add(operation.fileToApp(file, score));
			return 1;

		} else if (operation.checkExt(file, "html|css|js|HTML|CSS|JS|php|sql")) {
		

			web.add(operation.fileToApp(file, score));
			return 1;

		}
		else if (operation.checkExt(file, "c|c++|java|py|pl|xml")) {
			

			programation.add(operation.fileToApp(file, score));
			return 1;

		}else {
			other.add(operation.fileToApp(file, score));
			
		}
		return 0;

		
	}
	public int scanDirOnly(String path){
		
		File file = new File(path);
		if(!file.exists()){
			return 0;
		}
		
		
		File[] files = file.listFiles();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getAbsolutePath());
			
			
				checkFile(files[i]);
				nbrfile++;
			
			
		}
		
		return 1;
	}
	public  int scanPath(String path , JLabel label) throws IOException, InterruptedException {
		
	
		if( path.length() - path.replace("/", "").length()>8 || path.lastIndexOf("Cache") > 0 || path.lastIndexOf("cache") > 0 ||  path.lastIndexOf("Library") > 0 ){
			return 0;
		}
		File file = new File(path);
		if (file.getName().startsWith(".") ) {

			return 0;
		}
		if(label!=null)label.setText(file.getAbsolutePath());
		File[] files = file.listFiles();

		for (int i = 0; i < files.length; i++) {

			/**/
			if(label!=null)label.setText(files[i].getAbsolutePath());
			if (files[i].isDirectory()) {
				int score = operation.stringToScore(files[i].getName());
				operation.addList(dossier,operation.fileToApp(files[i], score), score);
			    Thread N = new Thread(new scanThread(files[i].getAbsolutePath(),pdf,img,web,archife,doc,programation,dossier,other,all,label));
				nbrdir++;
				N.start();
				N.join();
				

			} else {
				label.setText(files[i].getAbsolutePath());
				if(!files[i].getName().startsWith(".")){
					checkFile(files[i]);
					nbrfile++;
					
				}
				

			}

		}
		
		scanDirOnly("/Applications");
		return 0;

	}

}
