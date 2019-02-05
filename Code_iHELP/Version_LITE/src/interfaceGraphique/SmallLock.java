package interfaceGraphique;

import java.io.IOException;


import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;




import Local.Fileapp;
import Local.operation;
import java.awt.Color;

import java.awt.Font;

import java.io.File;
import java.lang.reflect.InvocationTargetException;


public class SmallLock extends JPanel {;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblLine;
	JLabel lblFileName;
	JLabel lblFilePath;
	JLabel lblFileSize ;
	JPanel panel=null ;
	JScrollPane scrollPane=null;
	JLabel label1 ;
	int id=0;

	java.net.URL logoOneUrl;
	private JLabel label;
	public SmallLock(Fileapp file) {
		setLayout(null);
		logoOneUrl = getClass().getResource("Src/ligneV.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		 lblLine = new JLabel("");
		lblLine.setBounds(6, 277, 314, 1);
		lblLine.setIcon(imgThisImg);
		add(lblLine);
		
		lblFileName = new JLabel(""+file.getName(),SwingConstants.LEFT);
		lblFileName.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFileName.setBounds(145, 290, 178, 16);
		lblFileName.setForeground(new Color(0x3b3b3b));
		add(lblFileName);
		//============================
		JLabel lblFileName1 = new JLabel("File name :",SwingConstants.RIGHT);
		lblFileName1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFileName1.setBounds(59, 290, 76, 16);
		lblFileName1.setForeground(new Color(0x5b5b5b));
		add(lblFileName1);
		
		///======================
		
		lblFilePath = new JLabel(""+file.getPath(),SwingConstants.LEFT);
		lblFilePath.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFilePath.setBounds(145, 305, 168, 16);
		lblFilePath.setForeground(new Color(0x3b3b3b));
		add(lblFilePath);
		///=================
		JLabel FilePath1 = new JLabel("File path :",SwingConstants.RIGHT);
		FilePath1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		FilePath1.setBounds(59, 305, 76, 16);
		FilePath1.setForeground(new Color(0x5b5b5b));
		add(FilePath1);
		
		///=========
		
		lblFileSize = new JLabel(""+file.getTaille(),SwingConstants.LEFT);
		lblFileSize.setBounds(145, 320, 178, 16);
		lblFileSize.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFileSize.setForeground(new Color(0x3b3b3b));
		add(lblFileSize);
		
		////===============
		JLabel FileSize = new JLabel("File size :",SwingConstants.RIGHT);
		FileSize.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		FileSize.setBounds(59, 320, 76, 16);
		FileSize.setForeground(new Color(0x5b5b5b));
		add(FileSize);
		
		
		
		////==========
		
		panel = new JPanel();
		panel.setBounds(6, 6, 314, 259);
		add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0xf6f6f6));
		
		label = new JLabel("");
		label.setBounds(6, 348, 314, 16);
		add(label);
		
		label1 = new JLabel("",JLabel.CENTER);

		
		
		

	}
	public void change(Fileapp p) throws IOException, InvocationTargetException, InterruptedException{
	    id=1;
		//lblNewLabel.setVisible(true);
		lblFileName.setText(""+p.getName());
		lblFilePath.setText(""+p.getPath());
		File f = new File(p.getPath());
		lblFileSize.setText(""+operation.tailleTostring(f.length()));
		Thread N = new Thread(new BuilSmallLock(p, panel));
		N.start();
		panel.repaint();
	//	this.revalidate();
	}
}
