package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.URL;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static javax.swing.ScrollPaneConstants.*;
import javafx.scene.control.Cell;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.adarshr.raroscope.RAREntry;
import com.adarshr.raroscope.RARFile;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import com.itextpdf.text.pdf.hyphenation.TernaryTree.Iterator;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

import Local.Fileapp;
import Local.operation;

public class BuilSmallLock implements Runnable {
	private Fileapp p = new Fileapp();
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane = null;
	public void buildProbleme(){
		JLabel label1 = new JLabel("",JLabel.CENTER);
		URL logoOneUrl = getClass().getResource("Src/helpme.png");
		ImageIcon image = new ImageIcon(logoOneUrl);
		label1.setIcon(image);
		panel.setLayout(new BorderLayout());
		panel.add(label1);
		panel.revalidate();
		panel.repaint();
		
	}
	
	public void buildError(){
		JLabel label1 = new JLabel("",JLabel.CENTER);
		URL logoOneUrl = getClass().getResource("Src/error.png");
		ImageIcon image = new ImageIcon(logoOneUrl);
		label1.setIcon(image);
		panel.setLayout(new BorderLayout());
		panel.add(label1);
		panel.revalidate();
		panel.repaint();
		
	}
	public BuilSmallLock(Fileapp file, JPanel jp) {
		System.out.println(file.getPath());
		this.p = file;
		this.panel = jp;
	}

	@Override
	public void run() {
		try {
			built();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			buildError();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			buildError();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			buildError();
		}

	}
	public static String getPageContent(String pdfPath, int pageNumber) throws IOException
	{
	    PdfReader reader = new PdfReader(pdfPath); 

	    StringWriter output = new StringWriter();  

	        try {
	            output.append(PdfTextExtractor.getTextFromPage(reader, pageNumber, new SimpleTextExtractionStrategy()));

	        } catch (OutOfMemoryError e) {

	            // TODO Auto-generated catch block
	        	
	        }

	    return output.toString();
	}
	public void built() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		
		if (panel != null) {
			panel.removeAll();
		}
		if (scrollPane != null) {
			scrollPane.removeAll();
		}
		panel.setBackground(new Color(0xf6f6f6));
		if (scrollPane != null) {
			
		scrollPane.setBackground(new Color(0xf6f6f6));
		}
		File f = new File(p.getPath());
		long fileSizeInBytes = f.length();
		long fileSizeInKB = fileSizeInBytes / 1024;
		
		long fileSizeInMB = fileSizeInKB / 1024;
		
		if(f.exists() && f.canRead()  && fileSizeInMB < 20 ){
			
		String txt = null;
		if (operation.checkExt(p.getName(), "pdf")) {
			PdfReader reader = new PdfReader(p.getPath());
            System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
            String page = PdfTextExtractor.getTextFromPage(reader, 1);
            page =page+ PdfTextExtractor.getTextFromPage(reader, 2);
            page =page+ PdfTextExtractor.getTextFromPage(reader, 3);
            txt=page;
			JEditorPane jEditorPane = new JEditorPane();

			// make it read-only
			jEditorPane.setEditable(false);

			// add a HTMLEditorKit to the editor pane
			HTMLEditorKit kit = new HTMLEditorKit();
			jEditorPane.setEditorKit(kit);

			// now add it to a scroll pane
			JScrollPane scrollPane = new JScrollPane(jEditorPane);

			StyleSheet styleSheet = kit.getStyleSheet();
			styleSheet.addRule("body {color:#000; font: tahoma; margin: 10px;padding: 10px; }");
			Document doc = kit.createDefaultDocument();
			jEditorPane.setDocument(doc);
			jEditorPane.setText(txt);
			jEditorPane.setBackground(new Color(0xfafafa));
			jEditorPane.setBounds(6, 6, 314, 259);
			scrollPane.setBounds(6, 6, 314, 259);
			// scrollPane.setBackground(new Color(0xfafafa));
			panel.add(scrollPane);
			

		}
		else if (operation.checkExt(p.getName(), "doc|DOC")){
			File file = null;
			String txt1="";
	        WordExtractor extractor = null;
	        
	        try
	        {

	            file = new File(p.getPath());
	            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
	            HWPFDocument document = new HWPFDocument(fis);
	            extractor = new WordExtractor(document);
	            String[] fileData = extractor.getParagraphText();
	            for (int i = 0; i < fileData.length; i++)
	            {
	                if (fileData[i] != null)
	                    txt1=txt1+fileData[i];
	            }
	            JEditorPane jEditorPane = new JEditorPane();

				// make it read-only
				jEditorPane.setEditable(false);

				// add a HTMLEditorKit to the editor pane
				HTMLEditorKit kit = new HTMLEditorKit();
				jEditorPane.setEditorKit(kit);

				// now add it to a scroll pane
				JScrollPane scrollPane = new JScrollPane(jEditorPane);

				StyleSheet styleSheet = kit.getStyleSheet();
				styleSheet.addRule("body {color:#000; font: tahoma; margin: 10px;padding: 10px; }");
				Document doc = kit.createDefaultDocument();
				jEditorPane.setDocument(doc);
				jEditorPane.setText(txt1);
				jEditorPane.setBackground(new Color(0xfafafa));
				jEditorPane.setBounds(6, 6, 314, 259);
				scrollPane.setBounds(6, 6, 314, 259);
				// scrollPane.setBackground(new Color(0xfafafa));
				panel.add(scrollPane);
	            
	            
	        }
	        catch (Exception exep)
	        {
	           txt1="IMPOSSIBLE TO READ FILE";
	        }
			
		}
		else if (operation.checkExt(p.getName(), "rar|RAR")){
			LinkedList<Fileapp> l1 = new LinkedList<Fileapp>();
			RARFile file = new RARFile(p.getPath());
			Enumeration<RAREntry> entries = file.entries();

			// Iterate and print
			while (entries.hasMoreElements()) {
			    RAREntry entry = entries.nextElement();
			    Fileapp appfile = new Fileapp(entry.getName(), p.getPath(),
						"bb", operation.extension(entry.getName()), "test", 12);
				l1.add(appfile);
			   
			}
			

			Fileapp appfile = new Fileapp("sad", p.getPath(), "bb", "bb",
					"test", 12);
			FormresultInput jp = new FormresultInput(l1);
			// if(panel!=null)panel.remove(2);
			// jp.setSize(314, l1.size()*40);
			JScrollPane scrollPane = new JScrollPane(jp);
			jp.setPreferredSize(new Dimension(314, l1.size() * 32));
			System.out.println(jp.getHeight());
			scrollPane.setBorder(null);
			scrollPane.setBounds(0, 0, 314, 259);

			panel.add(scrollPane);
			scrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBackground(new Color(0xf6f6f6));
			
			
		}
		else if (operation.checkExt(p.getName(), "zip|tar.gz")) {

			LinkedList<Fileapp> l1 = new LinkedList<Fileapp>();
			FileInputStream fis = null;
			ZipInputStream zipIs = null;
			ZipEntry zEntry = null;
			fis = new FileInputStream(p.getPath());
			zipIs = new ZipInputStream(new BufferedInputStream(fis));
			while ((zEntry = zipIs.getNextEntry()) != null) {
				Fileapp appfile = new Fileapp(zEntry.getName(), p.getPath(),
						"bb", operation.extension(zEntry.getName()), "test", 12);
				l1.add(appfile);
			}
			zipIs.close();

			
			Fileapp appfile = new Fileapp("sad", p.getPath(), "bb", "bb",
					"test", 12);
			FormresultInput jp = new FormresultInput(l1);
			// if(panel!=null)panel.remove(2);
			// jp.setSize(314, l1.size()*40);
			JScrollPane scrollPane = new JScrollPane(jp);
			jp.setPreferredSize(new Dimension(314, l1.size() * 32));
			System.out.println(jp.getHeight());
			scrollPane.setBorder(null);
			scrollPane.setBounds(0, 0, 314, 259);

			panel.add(scrollPane);
			scrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBackground(new Color(0xf6f6f6));
		}

		else if (operation.checkExt(p.getName(), "txt|html|php|css")) {
			

			String Content = "";
			BufferedReader br = null;
			try {

				String sCurrentLine;

				br = new BufferedReader(new FileReader(p.getPath()));

				while ((sCurrentLine = br.readLine()) != null) {

					Content = Content + sCurrentLine;
				}

			} catch (IOException e) {
				Content = " Sorry Impossible to Read file ";
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException ex) {
					Content = " Sorry Impossible to Read file ";
				}
			}

			// create a JEditorPane
			JEditorPane jEditorPane = new JEditorPane();

			// make it read-only
			jEditorPane.setEditable(false);

			// add a HTMLEditorKit to the editor pane
			HTMLEditorKit kit = new HTMLEditorKit();
			jEditorPane.setEditorKit(kit);

			// now add it to a scroll pane
			JScrollPane scrollPane = new JScrollPane(jEditorPane);

			StyleSheet styleSheet = kit.getStyleSheet();
			styleSheet.addRule("body {color:#000; tahoma; margin: 4px; }");
			styleSheet.addRule("h1 {color: blue;}");
			styleSheet.addRule("h2 {color: #ff0000;}");
			styleSheet
					.addRule("pre {font : 8px monaco; color : black; background-color : #fafafa; }");
			Document doc = kit.createDefaultDocument();
			jEditorPane.setDocument(doc);
			jEditorPane.setText(Content);
			jEditorPane.setBackground(new Color(0xfafafa));
			jEditorPane.setBounds(6, 6, 314, 259);
			scrollPane.setBounds(6, 6, 314, 259);
			// scrollPane.setBackground(new Color(0xfafafa));
			panel.add(scrollPane);
			scrollPane.setBackground(new Color(0xf6f6f6));

		}
		
		else if (operation.checkExt(p.getName(), "png|PNG|jpg|JPG|GIF|gif|tif")) {
			
			JLabel label1 = new JLabel("",JLabel.CENTER);
			
			ImageIcon image = new ImageIcon(p.getPath());
			label1.setIcon(image);
			panel.setLayout(new BorderLayout());
			panel.add(label1);
			panel.revalidate();
			panel.repaint();

		} else if (operation.checkExt(p.getName(), "exe|jar|dmg|app|EXE")) {
			
			AppPanel pane = new AppPanel(p);
			// pane.setPreferredSize(new Dimension(200,200));
			panel.setLayout(new BorderLayout());
			panel.add(pane, BorderLayout.CENTER);

			
		} else if (f.isFile() && f.exists() && f.canRead() && f.canWrite()) {

		buildProbleme();
		}

		File fichier = new File(p.getPath());

		if (fichier.isDirectory() && fichier.canRead()) {

			File[] files = fichier.listFiles();

			LinkedList<Fileapp> l1 = new LinkedList<Fileapp>();

			for (int i = 0; i < files.length; i++) {

				l1.add(operation.fileToApp(files[i], 0));

			}

			

			FormresultInput jp = new FormresultInput(l1);
			// if(panel!=null)panel.remove(2);
			// jp.setSize(314, l1.size()*40);
			scrollPane = new JScrollPane(jp);
			jp.setPreferredSize(new Dimension(314, l1.size() * 32));
			System.out.println(jp.getHeight());
			scrollPane.setBorder(null);
			scrollPane.setBounds(0, 0, 314, 259);

			panel.add(scrollPane);
			scrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

		}

	}
		else {
			buildError();;
		}	
	}

}
