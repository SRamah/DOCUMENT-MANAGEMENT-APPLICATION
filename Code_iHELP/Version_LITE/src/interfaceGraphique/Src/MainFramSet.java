package interfaceGraphique.Src;

import interfaceGraphique.FormresultInput;
import interfaceGraphique.SmallLock;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;















	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;

	import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;

	import java.awt.SystemColor;
import java.awt.Font;

	import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

	import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BoxLayout;

import Local.Fileapp;
import Local.recherche;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

	public class MainFramSet extends JFrame implements KeyListener{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField textField;
		private JLabel label = new JLabel("");
		
		Color back = new Color(0xf6f6f6);
		Color Jtcolor = new Color(0x353535);
		JLabel lblNothing;
		private final JLabel lblNewLabel_2 = new JLabel("");
		FormresultInput panel =null;
		JPanel panel_1 =  null;
		SmallLock panel_2 = null;
		JLabel lblNewLabelkjsf = null;
		
		public MainFramSet() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
			
			setBounds(100, 100, 450, 300);
			addKeyListener(this);
			//lblNothing.setVisible(false);
			
			contentPane = new JPanel();
			contentPane.setBackground(back);
			contentPane.setForeground(SystemColor.windowBorder);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			lblNewLabelkjsf = new JLabel("New labelkjsf");
			lblNewLabelkjsf.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblNewLabelkjsf.setBounds(50, 5, 540, 39);
			lblNewLabelkjsf.setForeground(new Color(0x636363));
			java.net.URL logoOneUrl1 =  getClass().getResource("Src/scan.png");
			ImageIcon scan = new ImageIcon(logoOneUrl1);
			lblNewLabelkjsf.setIcon(scan);
			contentPane.add(lblNewLabelkjsf);
			textField = new JTextField();
			textField.setFont(new Font("Lao UI", Font.PLAIN, 22));
			textField.setBackground(back);
			textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			textField.setForeground(Jtcolor);
			setSize(600, 50);
			
			
			 textField.getDocument().addDocumentListener(new DocumentListener() {
			    private void updateData() throws FileNotFoundException, ClassNotFoundException, IOException, InterruptedException {
			    	
			    	textField.setVisible(true);
			    	//panel.removeAll();
			        if(textField.getText().length()>0){
			        	 if(panel!=null){
							  contentPane.remove(1);
						  }
			        	recherche rech = new recherche(lblNewLabelkjsf);
					    LinkedList<Fileapp> pdf = rech.searchHalfWord(textField.getText());
					    //panel.removeAll();
					    
						panel = new FormresultInput(pdf,panel_2);
						panel.setBounds(0, 55, 250, pdf.size()*36);
						//panel.setVisible(false);
				
						contentPane.add(panel,1);
						if(pdf.size()==0){
							panel_2.setVisible(false);
						}
						else {
							panel_2.setVisible(true);
							
						}
						setSize1(600,pdf.size()*36+60);
						panel_2.setLocation(256,getHeight1()-234);
			        	
			        }
			        else if(textField.getText().length()==0){
			        	setSize1(600,50);
			        	label.setVisible(false);
			        	panel_2.setVisible(false);
			        	
			        }
			        else {
			        	label.setVisible(false);
			        	setSize1(600,50);
			        	panel_2.setVisible(false);
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
			JLabel lblSearch = new JLabel("");
			lblSearch.setIcon(imgThisImg);
			lblSearch.setBounds(10, 11, 33, 28);
			contentPane.add(lblSearch);
			logoOneUrl = getClass().getResource("Src/ligneV.png");
			ImageIcon imgThisImg5 = new ImageIcon(logoOneUrl);
			lblNewLabel_2.setIcon(imgThisImg5);
			
			logoOneUrl = getClass().getResource("Src/close.png");
			ImageIcon imgThisImg1 = new ImageIcon(logoOneUrl);
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					textField.setText("");
					System.out.println("Done");
					
				}
			});
			label.setIcon(imgThisImg1);
			label.setBounds(566, 11, 24, 28);
			label.setVisible(false);
			contentPane.add(label);
			
			JLabel lblNewLabel = new JLabel("");
			//lblNewLabel.setIcon(imgThisImg2);
			lblNewLabel.setBounds(10, 50, 590, 6);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(256, 55, 5, 245);
		    logoOneUrl=getClass().getResource("Src/ligneV.png");
			ImageIcon imgThisImg3 = new ImageIcon(logoOneUrl);
			lblNewLabel_1.setIcon(imgThisImg3);
			contentPane.add(lblNewLabel_1);
			
			lblNothing = new JLabel("");
			lblNothing.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblNothing.setForeground(Color.DARK_GRAY);
			lblNothing.setBounds(345, 11, 209, 33);
			contentPane.add(lblNothing);
			JLabel lblN = new JLabel();
			lblN.setBounds(63, 12, 268, 33);
			contentPane.add(lblN);
			lblNewLabel_2.setBounds(0, 50, 600, 6);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(250, 54, 5, 426);
			 logoOneUrl=getClass().getResource("Src/ligneH");
			ImageIcon imgThisImg6 = new ImageIcon(logoOneUrl);
			lblNewLabel_3 .setIcon(imgThisImg6);
			contentPane.add(lblNewLabel_3);
			
			Fileapp p = new Fileapp("test","tt ","bb " , "bb ", "bb",12);
			
			panel_2 = new SmallLock(p);
			
			panel_2.setBounds(256, 58, 338, 236);
			
			panel_2.setBackground(new Color(0xf6f6f6));
			
			contentPane.add(panel_2);
			
			JLabel lblTest = new JLabel("Test");
			lblTest.setBounds(10, 6, 462, 33);
			contentPane.add(lblTest);
			
			
			
			
			
			setUndecorated(true);
		//	this.setSize1(600, pdf.size()*42+40);
			
			
			
			 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			    int x = (int) ((dimension.getWidth() -getWidth()) / 2);
			    int y = (int) ((dimension.getHeight()/2 ) / 2);
			    this.setLocation(x, y);
			
			setVisible(true);
			setSize1(600,330);
			if(recherche.check()){
				System.out.println("noen");
				lblNewLabelkjsf.setVisible(true);
				recherche rech = new recherche(lblNewLabelkjsf);
				textField.setVisible(false);
			}
			
			textField.setVisible(true);
			lblNewLabelkjsf.setVisible(false);
			
			
		}

		
		public void close(){
			super.dispose();
		}
		public void ShowClose(){
			
			label.setVisible(true);
		}

		@Override
		public void keyPressed(KeyEvent e) {
		      
			   if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
				   close();
				  
			   }
			   else if(e.getKeyCode()==KeyEvent.VK_ENTER){
				   if(panel!=null)panel.removeAll();
				   
				   
				  if(textField.getText().length()>0){
					  lblNothing.setText("");
					  try {
						  if(panel!=null){
							  contentPane.remove(1);
						  }
						
						  recherche rech = new recherche(lblNewLabelkjsf);
						  LinkedList<Fileapp> pdf = rech.searchHalfWord(textField.getText());
						  rech.chercher(textField.getText(),lblNothing);  
						  lblNothing.setVisible(true);
							panel = new FormresultInput(pdf,panel_2);
							panel.setBounds(0, 55, 250, pdf.size()*36);
							contentPane.add(panel,1);
							
							setSize1(600,pdf.size()*36+60);
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
				
			MainFramSet f = new MainFramSet();
		
		
		
		}
	}
