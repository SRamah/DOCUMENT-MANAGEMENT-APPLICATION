package Local;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;

import Local.Scan;

public class Recherche {
	private static Scan scan01 = new Scan();
	String path = "";

	public Scan getScan01() {
		return scan01;
	}

	public void setScan01(Scan scan01) {
		this.scan01 = scan01;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		path = path;
	}

	public Recherche(String Path) {
		path = Path;
	}

	public Recherche(JLabel label) throws FileNotFoundException, IOException,
			ClassNotFoundException, InterruptedException {
		String PathSave = System.getProperty("user.home") + "/save";

		File file = new File(PathSave);

		path = PathSave;
		if (file.exists()) {

			String pdfpath = PathSave + "/pdf.ihelp";

			file = new File(pdfpath);
			System.out.println(pdfpath);
			if (file.exists()) {
				ObjectInputStream objectIn = new ObjectInputStream(
						new BufferedInputStream(new FileInputStream(path
								+ "/pdf.ihelp")));
				LinkedList file1 = (LinkedList) objectIn.readObject();
				scan01.setPdf(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/web.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setWeb(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/doc.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setDoc(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/archife.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setArchife(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/img.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setImg(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/dossier.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setDossier(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/programation.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setProgramation(file1);

				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/other.ihelp")));
				file1 = (LinkedList) objectIn.readObject();
				scan01.setOther(file1);
				objectIn = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(path + "/all.ihelp")));
				scan01.setALl(file1);

				int nbrfile = scan01.getArchife().size()
						+ scan01.getDoc().size() + scan01.getImg().size()
						+ scan01.getOther().size() + scan01.getPdf().size()
						+ scan01.getProgramation().size();
				scan01.setNbrfile(nbrfile);
				scan01.setNbrdir(scan01.getDossier().size());

			} else {

				scan01.scanPath(System.getProperty("user.home"), label);

				scan01.save();

			}

		} else {
			file.mkdir();

			scan01.scanPath(System.getProperty("user.home"), label);

			scan01.save();

		}

	}

	public static int chercher(String word, JLabel label) {
		LinkedList list = null;
		if (word.lastIndexOf(".") == -1) {
			list = scan01.getOther();
			word = word.toLowerCase();
			word = word.replaceAll("\\*", "%");
			word = word.replaceAll("%", "[^%]*");
			Pattern pattern = Pattern.compile(word);
			Matcher matcher;
			Fileapp f = new Fileapp();
			String S;
			for (int i = 0; i < list.size(); i++) {
				f = (Fileapp) list.get(i);
				S = f.getName().toLowerCase();
				S = S.replaceAll(" ", "");
				matcher = pattern.matcher(S);
				if (matcher.find() && operation.checkExt(S, "jar|exe|app|")) {
					operation op = new operation();
					op.builtFastSearch(label, f);
					return 0;
				}

			}

		}

		return 0;

	}

	public static LinkedList<Fileapp> searchHalfWord(String Word) {
		String Word1 = Word;
		Word = Word.toLowerCase();
		LinkedList l = new LinkedList<Fileapp>();
		LinkedList<Fileapp> l1 = new LinkedList<Fileapp>();
		if (Word.lastIndexOf(".") == -1) {
			l = Scan.getDossier();
		}
		if (operation.checkExt(Word, "pdf")) {
			l = Scan.getPdf();
		} else if (operation.checkExt(Word, "png|PNG|gif|GIF|jpg|JPG")) {
			l = Scan.getImg();
		} else if (operation.checkExt(Word, "zip|ZIP|rar|RAR|tar|TAR")) {
			l = Scan.getArchife();
		} else if (operation.checkExt(Word, "html|php|css|js|HTML|CSS|JS|sql")) {
			l = Scan.getWeb();
		} else if (operation.checkExt(Word, "c|c++|java|php|py|pl|xml")) {
			l = Scan.getProgramation();
		} 

		else {
			l = Scan.getOther();
			operation.mirge(l, Scan.getDossier());

		}
		l1 = operation.searchHalfWord(Word, l);

		return l1;

	}
	public static void buildDate(){
		String PathSave = System.getProperty("user.home") + "/save/pdf.ihelp";
		File file = new File(PathSave);
		
		
	}
	public static boolean  usUpDate(){
		return true;
	}
	public static boolean check() {
		String PathSave = System.getProperty("user.home") + "/save";
		File file = new File(PathSave);
		if (!file.exists()) {
			return false;
		} else {
			file = new File(PathSave + "/pdf.ihelp");
			if (!file.exists()) {
				return false;
			}
			else {
				file = new File(PathSave + "/other.ihelp");
				if(!file.exists()){
					return false;
				}
				else {
					file = new File(PathSave + "/img.ihelp");
					if(!file.exists()){
						return false;
					}
					
					
				}
				
			}
		}

		return true;
	}
}
