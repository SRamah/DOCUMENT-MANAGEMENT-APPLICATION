package interfaceGraphique;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;

import Local.Fileapp;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class AppPanel extends JPanel {

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public AppPanel(Fileapp file) throws IOException {
		this.setBackground(new Color(0xf6f6f6));
		this.setBounds(0, 0, 300, 250);
		File fichier = new File(file.getPath());
		setLayout(null);
		Color font = new Color(0x787878);
		JLabel lblName = new JLabel(file.getName().toLowerCase(),JLabel.CENTER);
		lblName.setFont(new Font("Mishafi Gold", Font.PLAIN, 15));
		lblName.setBounds(10, 192, 284, 22);
		add(lblName);
		

		JLabel label1 = new JLabel("",JLabel.CENTER);
		URL logoOneUrl = getClass().getResource("Src/22.png");
		ImageIcon image = new ImageIcon(logoOneUrl);
        
		JLabel label = new JLabel("",JLabel.CENTER);
		
		label.setIcon(image);
		label.setBounds(10, 6, 284, 174);
		label.setForeground(font);
		add(label);
		Date lastModified = new Date(fichier.lastModified()); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");  
		String formattedDateString = formatter.format(lastModified);
		Path file_dir = Paths.get(fichier.getParent());
        Path file2 = file_dir.resolve(file.getName());
        BasicFileAttributes attrs = Files.readAttributes(file2, BasicFileAttributes.class);       
        System.out.println("Last accessed at:" + attrs.lastAccessTime());
		JLabel lblLastAccess = new JLabel("Last access :"+formattedDateString,JLabel.CENTER);
		lblLastAccess.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastAccess.setBounds(0, 210, 294, 16);
		lblLastAccess.setForeground(font);
		add(lblLastAccess);
		
		JLabel lblLastMod = new JLabel("Creation date :"+attrs.creationTime().toString().replaceAll("T", " "),JLabel.CENTER);
		lblLastMod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastMod.setForeground(font);
		lblLastMod.setBounds(0, 228, 294, 16);
		
		add(lblLastMod);
			
	}

}
