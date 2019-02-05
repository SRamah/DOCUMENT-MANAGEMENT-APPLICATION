package Search_File;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.LinkedList;

public class scanMachine {

	static LinkedList Scan = new<listLin> LinkedList();
	static date date = new date();
	static int score1[] = { 1000000, 1000, 10, 1 };
        static String nom =new String();
        static String chemin =new String();
        static String taille =new String();
        static String ddate =new String();

       
        
	public static void firstall() {

		listLin nu = new listLin(null, 0);
		Scan.add(nu);

	}

	public static int StringToScore(String s) {
		int score = 0;
		s = s.toUpperCase();

		for (int i = 0; i < 4; i++) {

			score = score + scanMachine.charToInt(s.charAt(i)) * (score1[i]);
		}

		return score;
	}

	public static int charToInt(char p) {

		return 35 + 17 - p + 48;
	}

	public void forceScan() {
		// Cette Methode Permit De Rescan User Machine

	}

	public date getDate() {
		return date;
	}

	public void setDate(date date) {
		this.date = date;
	}

	public static int scanDir(String dir) {

		Fil1 fichier;
		File file = null;
		if (dir.startsWith(".")) {
			return 0;
		}

		try {
			file = new File(dir);

			File[] files = file.listFiles();

			for (int i = 0; i < files.length; i++) {
				String pattern = "([^\\s]+(\\.(?i)(txt|doc|pdf|exe))$)";
				Pattern r = Pattern.compile(pattern);
				if (files[i].isDirectory()) {

					scanDir(files[i].getAbsolutePath());
				} else {
					Matcher m = r.matcher(files[i].getName());
					if (m.find()) {
						// table[scanMachine.charToInt(files[i].getName())]++;
						fichier = new Fil1(files[i].getName(), files[i].getAbsolutePath(), "hashme" ,files[i].length() ,files[i].lastModified());
						int s = scanMachine.StringToScore(files[i].getName());
						// System.out.println( files[i].getName()+"-->"+s);
						listLin register = new listLin(fichier, s);
						for (int k = 0; k < Scan.size(); k++) {
							listLin tst = new listLin();
							tst = (listLin) Scan.get(k);
							if (s > tst.getScore()) {
								Scan.add(k, register);
								break;
							}

						}

					}

				}

			}
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

		return 1;

	}

	public void showlist() {

		for (int i = 0; i < Scan.size(); i++) {
			Fil1 fille = new Fil1();
			listLin fl = new listLin();
			fl = (listLin) Scan.get(i);
			fille = fl.getFile();
			if (fille != null)
				System.out.println(fille.getName()+ "=== Score ==>>" + fl.getScore());

		}

	}
        

	public void Search(String s) {
		listLin Reg = new listLin();
		int sco = StringToScore(s);
		int p = 0;
		int p1 = Scan.size();
		int m = 0;
		int cond = 0 ;
		while (p1 - p > 1 && cond==0) {
			m=(int ) (p1-p)/2+p;
			
			Reg = (listLin) Scan.get(m);
			int scorefile = Reg.getScore();
			//System.out.println(p1 + "---" + p+"-----"+m + "----"+sco + "----" + Reg.getScore());
			if (sco == scorefile) {
                 // System.out.println("File Found -->" + Reg.getFile().getPath() + Reg.getScore());
                           nom =""+ Reg.getFile().getName();
                           chemin =""+ Reg.getFile().getPath();
                           taille =""+ Reg.getFile().getSize();
                          ddate =""+ Reg.getFile().getDate();
                           
                  cond=1;
			}
			else if(sco > scorefile){
				
				p1=m;
				
				
			}
			else if (sco < scorefile) {
				
				p=m;
				
				
			}

		}
		
		   
		   m=m-5;
			for(int o =m+10 ; o>m;o--){
				Reg=(listLin) Scan.get(o);
				 System.out.println("File  Maybe Found -->" + Reg.getFile().getName() + Reg.getScore());
				
			
			
		}

	}
        
      public static String Nom() {

		return nom;
	}  
      public static String Chemin() {

		return chemin;
	} 
      public static String Taille() {

		return taille+" octets";
	}  
       public static String DDate() {

		return ddate;
	}  
     

	/*public static void main(String args[]) {
		long a = System.currentTimeMillis();
		scanMachine scan01 = new scanMachine();
		scan01.firstall();
		scan01.scanDir("/Users/salaheddine/Desktop/");
	    //afficher resultat de scan
              //  scan01.showlist();
		//temps de recherche
                System.out.println((System.currentTimeMillis() - a)/1000);
		
		a = System.currentTimeMillis();
	   //rechercher à un ficher (ex : "uml "; )
               scan01.Search("fopen");
	    System.out.println((System.currentTimeMillis() - a)/1000);
       // Fenetre fen = new Fenetre();
	}*/

}
