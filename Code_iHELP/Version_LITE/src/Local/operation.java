package Local;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
/*
 * Cette Classe Engendre Toute les operations externes 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;

public class operation {
	public static int scoretable[] = { 1,15,21,25,60,109, 110,130,164,189,209, 220,222,229,220,4590 , 330, 440, 550, 660, 770,
			880, 990, 1110, 2220, 3330, 4440, 5550, 6660, 7770 };

	public static int charToInt(char p) {

		return 35 + 17 - p + 48;
	}

	public static String extension(String s) {
		int l = s.lastIndexOf(".");
		if (l != -1) {
			return s.substring(l + 1, s.length());
		}
		return "Folder";

	}

	public static int stringToScore(String s) {

		int score = 0;
		s = s.toUpperCase();
		int lst = s.lastIndexOf(".");
		String s2;
		if (lst != -1) {
			s2 = s.substring(0, s.lastIndexOf("."));
		} else {
			s2 = s;
		}

		if (s2.length() < 17) {

			for (int i = 0; i < s2.length(); i++) {

				score = score
						+ (int) (charToInt(s2.charAt(s2.length() - i - 1)) * scoretable[i])
						/ (i + 1);

			}
		} else {
			for (int i = 0; i < 17; i++) {

				score = score
						+ (int) (charToInt(s2.charAt(16 - i)) * scoretable[i])
						/ (i + 1);

			}

		}
		return score;

	}

	public static void addList(LinkedList<Fileapp> e, Fileapp file, int score) {
		// e.add(file);
		int i = 0, p = 0;
		Fileapp l;

		while (i < e.size() && p == 0) {

			l = (Fileapp) e.get(i);

			if (l.getScore() < score) {

				e.add(i, file);
				p = 1;
			}

			i++;
		}

	}
	
	public static Fileapp fileToApp(File file, int score) {
		Fileapp file1 = new Fileapp(file.getName(), file.getAbsolutePath(), ""
				+ file.length(), operation.extension(file.getName()), "Aucun",
				score);
		return file1;
	}

	public static boolean checkExt(File file, String string) {
		String pattern3 = "([^\\s]+(\\.(?i)(" + string + ")))";
		Pattern r3 = Pattern.compile(pattern3);
		Matcher m3 = r3.matcher(file.getName());
		if (m3.find()) {
			return true;
		}

		return false;
	}

	public static String stringToWord(String Word) {
		String s;
		if (Word.lastIndexOf(".") != -1) {
			s = Word.substring(0, Word.lastIndexOf("."));
		} else {
			s = Word;
		}

		return s;
	}
   public static String tailleTostring(double p){
	   float n = (float)p;
	   String s ="";
	   if(n<1024){
		   return ""+p+" Bytes";
	   }
	   else if(n < (1042*1024) ){
			float kilobytes = (n / (1024));
			
			return ""+String.format("%.2f",kilobytes)+" KB ";
	   }
	   
	   else{
		   float megabytes = (n / (1024*1024));
		   return ""+String.format("%.2f",megabytes)+" MB";
	   }
	   
   }
	public static boolean checkExt(String file, String string) {
		String pattern3 = "([^\\s]+(\\.(?i)(" + string + ")))";
		Pattern r3 = Pattern.compile(pattern3);
		Matcher m3 = r3.matcher(file);
		if (m3.find()) {
			return true;
		}

		return false;
	}
	public static boolean checkWord(String file, String string) {
		string = string.replaceAll("*","");
		String pattern3 = "([^\\s]+(\\.(?i)(pdf|org|)))";
		Pattern r3 = Pattern.compile(pattern3);
		Matcher m3 = r3.matcher(file);
		if (m3.find()) {
			return true;
		}

		return false;
	}
	public static boolean testPath(String Path){
		if(Path.length() - Path.replace("/", "").length()>8 || Path.lastIndexOf("Cache") > 0 || Path.lastIndexOf("cache") > 0 ){
		return false;}
		return true;
		
	}

	public static LinkedList<Fileapp> searchHalfWord(String Word , LinkedList<Fileapp> list){
		LinkedList<Fileapp> l1 = new LinkedList<Fileapp>();
		Word = Word.toLowerCase();
		Word = Word.replaceAll("\\*", "%");
		Word = Word.replaceAll("%%", "%");
		Word=Word.replaceAll("%", "[^%]*");
		Pattern pattern = Pattern.compile(Word);
		Matcher matcher;
		Fileapp f = new Fileapp();
		String S;
		
		for(int i=0 ; i<list.size();i++){
			f=(Fileapp) list.get(i);
			S=f.getName().toLowerCase();
			S=S.replaceAll(" ", "");
			 
			 matcher = pattern.matcher(S);
			 if(matcher.find()) {
		            l1.add(f);
		            
		           System.out.println(S);
		        }
			 if(l1.size()>20){
				 return l1;
			 }
		}
        
        return l1;
		
	}
	public  void builtFastSearch(JLabel p , Fileapp file){
		File fk = new File(file.getPath());

        Icon ico = FileSystemView.getFileSystemView().getSystemIcon(fk);
        
		
		p.setText(file.getName());
		p.setHorizontalAlignment(JLabel.CENTER);
		p.setVerticalAlignment(JLabel.CENTER);
		p.setIcon(ico);
		p.setVisible(true);

		
	}
	public static void mirge(LinkedList l1 , LinkedList l2){
		for(int i =0;i<l2.size();i++){
			l1.add(l2.get(i));
		}
		
	}
	
	public static  long pathToScore(String Path){
		
		long b = 0;
		
		for(int i =0 ; i<Path.length();i++){
			int p = Path.charAt(Path.length()-1-i);
			b=b+p*(i*7);
			
		}
		return b;
	}
	

}
