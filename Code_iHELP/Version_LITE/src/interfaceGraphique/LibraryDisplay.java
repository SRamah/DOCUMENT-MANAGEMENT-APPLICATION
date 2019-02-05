package interfaceGraphique;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Local.Fileapp;
import Local.recherche;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LibraryDisplay extends JPanel {
	LinkedList <Library> l2 = new LinkedList<Library>();
	public static Library selectLibrary  = new Library("Default");
	Library  l =null;
	JPanel panel = new JPanel();
	JPanel search = new JPanel();
	JPanel content= new JPanel();
	private static final long serialVersionUID = 1L;
	private final JPanel barRecherche = new JPanel();
	private final JLabel label = new JLabel("",JLabel.LEFT);
	java.net.URL logoOneUrl;
	private JTextField textField;
	private  JLabel lblNewLabel = new JLabel("Save");

	public LibraryDisplay() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
		recherche rech = new recherche(new JLabel());
		setLayout(null);
		l= new Library("Cours UML ");
		l.cloneadd(rech.searchHalfWord("uml%2%p.pdf"));
		l2.add(l);
		
		panel.setBackground(new Color(0x343434));
    	
        this.setBackground(new Color(0xf6f6f6));
		////=====================================\\\\
		panel.setBounds(0, 0, 134, 310);
		panel.setBackground(new Color(0x272821));
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
	////=====================================\\\\
		content.setBounds(134, 0, 250, 310);
		content.setBackground(new Color(0xc6c6c4));
		add(content);
		
	////=====================================\\\\
		
		search.setBackground(new Color(0xf6f6f6));
		search.setLayout(new BoxLayout(search, BoxLayout.Y_AXIS));
		barRecherche.setBounds(392, 0, 174, 20);
		barRecherche.setBackground(new Color(0xdfdfdf));
		add(barRecherche);
		barRecherche.setLayout(null);
		label.setBounds(0, 0, 20, 20);
		logoOneUrl = getClass().getResource("Src/rech1.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		label.setIcon(imgThisImg);
		barRecherche.add(label);
		textField = new JTextField();
		textField.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		textField.setBounds(20, 0, 140, 20);
		textField.setBackground(new Color(0xf6f6f6));
		textField.setForeground(new Color(0x959595));
		textField.setBorder(null);
		barRecherche.add(textField);
		textField.setColumns(10);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(59, 140, 61, 16);
		
		add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					save();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("===save");
				}
			}
		});
		logoOneUrl = getClass().getResource("Src/save.png");
		ImageIcon icon = new ImageIcon(logoOneUrl);
		label_1.setIcon(icon);
		label_1.setBounds(571, 0, 23, 20);
		add(label_1);
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
		    private void updateData() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
		    	recherche rech = new recherche(new JLabel());
		    	JScrollPane scrollPane = null;
	        	search.removeAll();
	        	
		        if(textField.getText().length()>0){
		        	
		        	
		    		
		    		revalidate();
		    		repaint();
		        	LinkedList<Fileapp> l1 = rech.searchHalfWord(textField.getText());
		        	for(int i=0;i<l1.size();i++){
		        		addToSearch(l1.get(i));
		        		
		        	}
		        	
		        	search.setSize(174, l1.size()*20);
		        	
		        	search.setPreferredSize(new Dimension(search.getWidth(),l1.size()*30));
		        	search.setMinimumSize(new Dimension(search.getWidth(),l1.size()*30));
		        	
		        	scrollPane = new JScrollPane(search);
		        	scrollPane.setBackground(new Color(0xf6f6f6));
		        	scrollPane.setBounds(392, 30, 174,280);
		        	scrollPane.setPreferredSize(new Dimension(174,280));
		        	scrollPane.setBorder(null);
		        	add(scrollPane,1);
		        	scrollPane.revalidate();
	        		scrollPane.repaint();
		        	
		        }
		       

		    }
		 
		    public void changedUpdate(DocumentEvent e) {
		    	try {
					updateData();
				} catch (ClassNotFoundException | IOException
						| InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		 
		 
		    public void insertUpdate(DocumentEvent e) {
		        // mise a jour quand du texte est insÈrÈ dans le champs
		        try {
					updateData();
				} catch (ClassNotFoundException | IOException
						| InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		 
		    public void removeUpdate(DocumentEvent e)  {
		        
		        try {
					updateData();
				} catch (ClassNotFoundException | IOException
						| InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		 
		});
		builtListLibrary();
		builtmenuLib();
		
		
		
	}
	public void builtListLibrary() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
		String path = System.getProperty("user.home")+"/save/library.ihelp";
		File ff = new File(path);
		if(ff.exists()){
		ObjectInputStream objectIn = new ObjectInputStream(	new BufferedInputStream(new FileInputStream(path)));
		l2 = (LinkedList) objectIn.readObject();
		}
		else {

		recherche rech = new recherche(new JLabel());
		
		
		l = new Library("DOC's");
		l2.add(l);
		l.cloneadd(rech.searchHalfWord("%.doc"));
		
		l = new Library("EXE's");
		l.cloneadd(rech.searchHalfWord("salah%.txt"));
		l2.add(l);
		
		
		}
		
	}
	public void save() throws IOException{
		String PathSave = System.getProperty("user.home")+"/save";
		FileOutputStream fout = new FileOutputStream(PathSave+"/library.ihelp");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(l2);
	}
	public void builtmenuLib() throws InterruptedException, IOException{
		
		for(int i=0;i<l2.size();i++){
			LibraryContent jp1= new LibraryContent((Library)l2.get(i),content,new Library(""));
			panel.add(jp1);
			
		}
		
	}
	
	public void addToSearch(Fileapp file){
		//selectLibrary=l2.get(0);
		ResultLib p = new ResultLib(file,selectLibrary,content);
		search.add(p);
		
	}
	public static Library getLibr(){
		return selectLibrary;
	}
	public static void setLibr(Library lib){
		selectLibrary=lib;
	}
}
