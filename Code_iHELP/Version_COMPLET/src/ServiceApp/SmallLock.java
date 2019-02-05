/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Local.Fileapp;

import java.awt.Color;
import java.awt.Font;

public class SmallLock extends JPanel {;
	JLabel lblLine;
	JLabel lblFileName;
	JLabel lblFilePath;
	JLabel lblFileSize ;

	java.net.URL logoOneUrl;
	public SmallLock(Fileapp file) {
		setLayout(null);
		System.out.println("Created");
		JLabel lblNewLabel = new JLabel("picture");
		lblNewLabel.setBounds(91, 35, 88, 57);
		add(lblNewLabel);
		logoOneUrl = getClass().getResource("Src/ligneV.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		 lblLine = new JLabel("");
		lblLine.setBounds(0, 147, 338, 1);
		lblLine.setIcon(imgThisImg);
		add(lblLine);
		
		lblFileName = new JLabel("File Name :  "+file.getName(),SwingConstants.CENTER);
		lblFileName.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFileName.setBounds(6, 160, 332, 16);
		lblFileName.setForeground(new Color(0x5b5b5b));
		add(lblFileName);
		
		lblFilePath = new JLabel("File Path : "+file.getPath(),SwingConstants.CENTER);
		lblFilePath.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFilePath.setBounds(6, 180, 332, 16);
		lblFilePath.setForeground(new Color(0x5b5b5b));
		add(lblFilePath);
		
		lblFileSize = new JLabel("File size : "+file.getTaille(),SwingConstants.CENTER);
		lblFileSize.setBounds(6, 198, 332, 16);
		lblFileSize.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		lblFileSize.setForeground(new Color(0x5b5b5b));
		add(lblFileSize);
		
		

	}

    SmallLock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public void change(Fileapp p){
		lblFileName.setText("File Name : "+p.getName());
		lblFilePath.setText("File Path : "+p.getPath());
		lblFileSize.setText("File Size : "+p.getTaille());
	}
}

