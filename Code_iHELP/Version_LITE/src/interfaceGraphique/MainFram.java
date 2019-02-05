package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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


public class MainFram extends JFrame implements KeyListener{

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label = new JLabel("");
	Color back = new Color(0xf6f6f6);
	Color Jtcolor = new Color(0x353535);
	
	public MainFram() {
		
		setBounds(100, 100, 450, 300);
		addKeyListener(this);
		
		contentPane = new JPanel();
		contentPane.setBackground(back);
		contentPane.setForeground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lao UI", Font.PLAIN, 22));
		textField.setBackground(back);
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField.setForeground(Jtcolor);
		setSize(600, 300);
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
		    private void updateData() {
		        if(textField.getText().length()>0){
		        	label.setVisible(true);
		        	setSize1(600,200);
		        	repaint();
		        	System.out.println(getSize1().height);
		        }
		        else if(textField.getText().length()==0){
		        	setSize1(600,50);
		        	label.setVisible(false);
		        	
		        }
		        else {
		        	label.setVisible(false);
		        }
		       
		    }
		 
		    public void changedUpdate(DocumentEvent e) {
		    	updateData();
		    }
		 
		 
		    public void insertUpdate(DocumentEvent e) {
		        // mise a jour quand du texte est insÈrÈ dans le champs
		        updateData();
		    }
		 
		    public void removeUpdate(DocumentEvent e)  {
		        
		        updateData();
		    }
		 
		});
		textField.setBounds(53, 11, 280, 28);
		textField.addKeyListener(this);
		contentPane.add(textField);
		textField.setColumns(10);
		java.net.URL logoOneUrl;
		logoOneUrl = getClass().getResource("Src/search.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		JLabel lblSearch = new JLabel("");
		lblSearch.setIcon(imgThisImg);
		lblSearch.setBounds(10, 11, 33, 28);
		contentPane.add(lblSearch);
		logoOneUrl = getClass().getResource("Src/close.png");
		ImageIcon imgThisImg1 = new ImageIcon(logoOneUrl);
		label.setIcon(imgThisImg1);
		label.setBounds(566, 11, 24, 28);
		label.setVisible(false);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(imgThisImg2);
		lblNewLabel.setBounds(10, 50, 590, 6);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(back);
		panel.setBounds(10, 67, 244, 222);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(back);
		panel_1.setBounds(279, 67, 311, 222);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(256, 55, 5, 245);
	//	logoOneUrl=getClass().getResource("Src/ligneH.png");
		//ImageIcon imgThisImg3 = new ImageIcon(logoOneUrl);
		//lblNewLabel_1.setIcon( imgThisImg3);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
		
		
		
		 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() -getWidth()) / 2);
		    int y = (int) ((dimension.getHeight()/2 ) / 2);
		    this.setLocation(x, y);
		
		setVisible(true);
		setSize1(600,50);
	}

	
	public void close(){
		super.dispose();
	}
	public void ShowClose(){
		
		label.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
	       System.out.println("Ec");
		   if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			   close(); 
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
	
	
	public static void main(String args[]){
			
		MainFram f = new MainFram();
	
	
	
	}
}
