package interfaceGraphique;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;

	import java.awt.SystemColor;
import java.awt.Font;

import Local.Fileapp;
import Local.recherche;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


	public class MainFramSet extends JFrame implements KeyListener{

		private static final long serialVersionUID = 15L;
		private JPanel contentPane;
		private JPanel contentPane1;
		private JTextField textField;
		static long i =0,p=0 ;
		Color back = new Color(0xf6f6f6);
		Color Jtcolor = new Color(0x353535);
		JLabel lblNothing;
		private final JLabel lblNewLabel_2 = new JLabel("");
		FormresultInput panel =null;
		JPanel panel_1 =  null;
		SmallLock panel_2 = null;
		JLabel  scanLabel  = null;
		JLabel lblSearch = null;
		JLabel lblNewLabel_3=null;
		int status =2;
		JLabel label = null;
		LibraryDisplay panel1 = null;
		
		public MainFramSet() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
			contentPane = new JPanel();
			contentPane.setBackground(back);
			contentPane.setForeground(SystemColor.windowBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			setUndecorated(true);
			buildMain();
			
			
			
		}
		public void deleteMe() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
			System.out.println("id=="+status);
			if(status ==0 ){
				
				
				this.removeAll();
				this.revalidate();
				this.repaint();
				contentPane = new JPanel();
				contentPane.setBackground(back);
				contentPane.setForeground(SystemColor.windowBorder);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				contentPane.add(textField);
				contentPane.add(lblSearch);
				contentPane.add(lblNewLabel_2);
				contentPane.add(label);
				
				
			}
			
		}
		public void  buildMain() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
			if(status==2 || status==0){
			setI(System.currentTimeMillis());
			setBounds(100, 100, 450, 300);
			addKeyListener(this);			
			status =1;
			contentPane.setLayout(null);
			java.net.URL logoOneUrl1 =  getClass().getResource("Src/scan.gif");
			ImageIcon scan = new ImageIcon(logoOneUrl1);
			textField = new JTextField();
			textField.setFont(new Font("Lao UI", Font.PLAIN, 22));
			textField.setBackground(back);
			textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			textField.setForeground(Jtcolor);
			setSize(600, 500);
			deleteMe();
			 textField.getDocument().addDocumentListener(new DocumentListener() {
			    private void updateData() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
			    	
			        if(textField.getText().length()>0){
			        	
						  setP(System.currentTimeMillis());
			        	if(getP()-getI()>1000){
			        		deleteMe();
			        		setI(System.currentTimeMillis());
			        		built();
			        		
			        		
			        	} 
			        	else {
			        		
			        		
			        	}
					   
			        	
					
					
					
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
			textField.setBounds(55, 11, 280, 28);
			textField.addKeyListener(this);
			textField.setVisible(false);
			contentPane.add(textField);
			textField.setColumns(10);
			java.net.URL logoOneUrl;
			logoOneUrl = getClass().getResource("Src/search.png");
			ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
			lblSearch = new JLabel("");
			lblSearch.setIcon(imgThisImg);
			lblSearch.setBounds(10, 11, 33, 28);
			contentPane.add(lblSearch);
			logoOneUrl = getClass().getResource("Src/ligneV.png");
			ImageIcon imgThisImg5 = new ImageIcon(logoOneUrl);
			lblNewLabel_2.setIcon(imgThisImg5);
			
			logoOneUrl = getClass().getResource("Src/close.png");
			ImageIcon imgThisImg1 = new ImageIcon(logoOneUrl);
			
			JLabel lblNewLabel = new JLabel("");
			//lblNewLabel.setIcon(imgThisImg2);
			lblNewLabel.setBounds(10, 50, 590, 6);
			contentPane.add(lblNewLabel,2);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(256, 55, 5, 245);
		    logoOneUrl=getClass().getResource("Src/ligneV.png");
			ImageIcon imgThisImg3 = new ImageIcon(logoOneUrl);
			lblNewLabel_1.setIcon(imgThisImg3);
			contentPane.add(lblNewLabel_1);
			
			lblNothing = new JLabel("",JLabel.RIGHT);
			lblNothing.setFont(new Font("Calibri", Font.PLAIN, 13));
			lblNothing.setForeground(Color.DARK_GRAY);
			lblNothing.setBounds(345, 11, 209, 33);
			buildDate(lblNothing);
			contentPane.add(lblNothing);
			
			JLabel lblN = new JLabel();
			lblN.setBounds(63, 12, 268, 33);
			contentPane.add(lblN);
			lblNewLabel_2.setBounds(0, 50, 600, 6);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(250, 54, 5, 426);
			 logoOneUrl=getClass().getResource("Src/ligneH");
			ImageIcon imgThisImg6 = new ImageIcon(logoOneUrl);
			lblNewLabel_3 .setIcon(imgThisImg6);
			contentPane.add(lblNewLabel_3,1);
		
			Fileapp p = new Fileapp("test","tt ","bb " , "bb ", "bb",12);
			
			panel_2 = new SmallLock(p);
			
			panel_2.setBounds(256, 58, 338, 356);
			
			panel_2.setBackground(new Color(0xf6f6f6));
			
			contentPane.add(panel_2,1);
			
			scanLabel = new JLabel("Test");
			scanLabel.setVisible(false);
			scanLabel.setBounds(45, 10, 484, 33);
			scanLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
			scanLabel.setForeground(new Color(0x636363));
			contentPane.add(scanLabel);
			
			label = new JLabel("");
			logoOneUrl=getClass().getResource("Src/menu.png");
			ImageIcon icon = new ImageIcon(logoOneUrl);
			label.setIcon(icon);
			label.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseEntered(MouseEvent e) {
					java.net.URL logoOneUrl=getClass().getResource("Src/menu1.png");
					ImageIcon icon = new ImageIcon(logoOneUrl);
					label.setIcon(icon);
					System.out.println("mous entr");
					label.repaint();
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					java.net.URL logoOneUrl=getClass().getResource("Src/menu.png");
					ImageIcon icon = new ImageIcon(logoOneUrl);
					label.setIcon(icon);
					label.repaint();
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					java.net.URL logoOneUrl=getClass().getResource("Src/menu.png");
					ImageIcon icon = new ImageIcon(logoOneUrl);
					label.setIcon(icon);
					label.repaint();
					try {
						builtLib();
					} catch (ClassNotFoundException | IOException
							| InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			label.setBackground(back);
			label.setBounds(560, 11, 34, 28);
			
			
			contentPane.add(label);
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			    int x = (int) ((dimension.getWidth() -getWidth()) / 2);
			    int y = (int) ((dimension.getHeight()/2 ) / 2);
			    this.setLocation(x, y);
			
			setVisible(true);
			setSize(600,50);
			setSize1(600,50);
			buildScanLabel();
			status =1;
			
			
		}
		}

		
		public void close(){
			this.setDefaultCloseOperation(1);
			dispose();
		}
		public void ShowClose(){
			
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
		      
			   if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
				   close();
				  
			   }
			   else if(e.getKeyCode()==KeyEvent.VK_ENTER){
				  built();
			   }
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		public void setSize1(int x , int y){
			super.setSize(x, y);
			setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 5, 5));
			repaint();
			revalidate();
			
			
		}
		public Dimension getSize1(){
			Dimension n = new Dimension(this.getWidth(),this.getHeight());
			return n;
		}
		public  int getHeight1(){
			return this.getHeight();
		}
		
		public static void main(String args[]) throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
			//
		
		MainFramSet set = new MainFramSet();
		
	}


		public long getI() {
			return i;
		}


		public void setI(long i) {
			this.i = i;
		}


		public long getP() {
			return p;
		}


		public void setP(long p) {
			this.p = p;
		}
		public void built(){
			
			 if(panel!=null)panel.removeAll();
			   
			   
			  if(textField.getText().length()>0){
				  lblNothing.setText("");
				  try {
					  if(panel!=null){
						  contentPane.remove(1);
					  }
					
					  recherche rech = new recherche(scanLabel);
					  LinkedList<Fileapp> pdf = rech.searchHalfWord(textField.getText());
					  rech.chercher(textField.getText(),lblNothing);  
					  lblNothing.setVisible(true);
						panel = new FormresultInput(pdf,panel_2);
						panel.setBounds(0, 55, 250, pdf.size()*36);
						contentPane.add(panel,1);
						
						//setSize1(600,pdf.size()*36+60);
						setSize1(600,420);
						if(pdf.size()==0)setSize1(600, 50);
						this.revalidate();
						this.repaint();
						
						
						
						
					
				} catch (ClassNotFoundException | IOException
						| InterruptedException e1) {
					e1.printStackTrace();
				}
			  }
			  else {
				  lblNothing.setText("");
			  
			  }
			
		}
		public void buildScanLabel() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
			if(!recherche.check()){
				
				
				scanLabel .setVisible(true);
				recherche rech = new recherche( scanLabel );
				textField.setVisible(false);
				lblSearch.setVisible(false);
			}
			buildDate(lblNothing);
			lblSearch.setVisible(true);
			textField.setVisible(true);
			scanLabel.setVisible(false);
			
		}
		public  void builtLib() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException{
			if(status==1){
				status =0;
			contentPane.setVisible(false);
			contentPane1 = new JPanel();
			contentPane1.setBackground(back);
			contentPane1.setForeground(SystemColor.windowBorder);
			contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane1);
			contentPane1.setLayout(null);
			panel1 = new LibraryDisplay();
			panel1.setBounds(0, 60, 600,300);
			contentPane1.add(panel1);
			contentPane1.add(textField);
			contentPane1.add(lblSearch);
			contentPane1.add(lblNewLabel_2);
			contentPane1.add(label);
			setSize1(600, 360);
			contentPane1.repaint();
			}
			
		}
		public void buildDate(JLabel b){
			String PathSave = System.getProperty("user.home")+"/save/pdf.ihelp";
			File fichier = new File(PathSave);
			if(fichier.exists()){
				Date lastModified = new Date(fichier.lastModified()); 
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");  
				String formattedDateString = formatter.format(lastModified);
				b.setText(formattedDateString);
				
			}
			else {
				b.setText("No record Founded");
				
			}
			
			
		}
		
	}
