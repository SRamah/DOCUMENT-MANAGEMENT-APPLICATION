package Local;

import java.io.File;
import java.io.Serializable;
import java.util.LinkedList;

import javax.swing.JLabel;

public class ScanThread implements Runnable , Serializable {
    public static int count;
    static int id;
	static String Path;
	static LinkedList<Fileapp> pdf ;
	static LinkedList<Fileapp> img ;
	static LinkedList<Fileapp> web ;
	static LinkedList<Fileapp> archife ;
	static LinkedList<Fileapp> doc ;
	static LinkedList<Fileapp> programation ;
	static LinkedList<Fileapp> dossier;
	static LinkedList<Fileapp> other ;
	static LinkedList<Fileapp> all ;
	static JLabel label ;
	

	public ScanThread(String Path , LinkedList<Fileapp> pdf , LinkedList<Fileapp> img , LinkedList<Fileapp> web , LinkedList<Fileapp> archife , LinkedList<Fileapp> doc ,LinkedList<Fileapp> programation ,LinkedList<Fileapp> dossier,LinkedList<Fileapp> other,LinkedList<Fileapp> all,JLabel label) {
		id=count++;
		this.Path = Path;
		this.pdf=pdf;
		this.img=img;
		this.web=web;
		this.archife=archife;
		this.doc=doc;
		this.programation=programation;
		this.dossier=dossier;
		this.other=other;
		this.all=all;
		this.label=label;

	}

	@Override
	public void run() {

		try {
			scan();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("deprecation")
	public static int scan() throws InterruptedException{
		Path = Path.toLowerCase();
		if( Path.length() - Path.replace("/", "").length()>8 || Path.lastIndexOf("cache") > 0 ||  Path.lastIndexOf("library") > 0 || Path.lastIndexOf("contents") > 0 || Path.lastIndexOf("framework") > 0  ){
			return 0;
		}
		if(Path.toLowerCase().lastIndexOf("application") > 0 ){
			String ptm = Path.substring(0, Path.toLowerCase().lastIndexOf("application"));
			if(Path.length() - Path.replace("/", "").length() > ptm.length()-ptm.replaceAll("/", "").length()  ){
				return 0;
			}
			}
		if(Path.toLowerCase().lastIndexOf("appsdata") > 0 ){
			String ptm = Path.substring(0, Path.toLowerCase().lastIndexOf("appsdata"));
			if(Path.length() - Path.replace("/", "").length() > ptm.length()-ptm.replaceAll("/", "").length()  ){
				return 0;
			}
			}
		File file = new File(Path);
		

		if (file.getName().startsWith(".") || !file.canWrite()) {

			return 0;
		}
		
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(label!=null)label.setText(files[i].getAbsolutePath());
			System.out.println(files[i].getAbsolutePath());
			Thread N = new Thread(new ScanThread(files[i].getAbsolutePath(),pdf,img,web,archife,doc,programation,dossier,other,all,label));
			if (files[i].isDirectory()) {
                  
				int score = operation.stringToScore(files[i].getName());
				operation.addList(dossier,operation.fileToApp(files[i], score), score);
				 
				 N.start();
			}
			else {
				/*String  s= files[i].getAbsolutePath();
				s=s.substring(s.length()-40, s.length());*/
				label.setText(files[i].getAbsolutePath());
				if(!files[i].getName().startsWith(".")){
				checkFile(files[i]);}
				//nbrfile++;
			}
			N.join();
		}
		
		return 0;
	}
	
	
	
	public static int checkFile(File file) {
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

		} else if (operation.checkExt(file, "html|css|js|HTML|CSS|JS|php")) {
		

			web.add(operation.fileToApp(file, score));
			return 1;

		}
		else if (operation.checkExt(file, "c|c++|java|php|py|pl|xml|sql")) {
			

			programation.add(operation.fileToApp(file, score));
			return 1;

		}
		else {
			

			other.add(operation.fileToApp(file, score));
			return 1;
		}
		

	}
}
