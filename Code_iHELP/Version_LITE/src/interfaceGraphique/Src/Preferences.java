package interfaceGraphique.Src;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Preferences extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	java.net.URL logoOneUrl;
	JLabel lblNewLabel;
	Color old = new Color(0xe3e3e3);
	Color hover = new Color(0xff9c00);
	 public static int Height = 30;
	 public static int width = 150;
	/**
	 * Create the panel.
	 */
	public Preferences(String Name) {
		this.setSize(150, 40);
		setLayout(null);
		
		lblNewLabel = new JLabel(Name,SwingConstants.LEFT);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menuColorChange();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				menuColorold();
			}
		});
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		lblNewLabel.setBounds(6, 4, 144, 28);
		lblNewLabel.setForeground(new Color(0xe3e3e3));
		
		setBackground(new Color(0x3c3c3c));
		logoOneUrl = getClass().getResource("pref.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		lblNewLabel.setIcon(imgThisImg);
		add(lblNewLabel);
   
	}
	public void menuColorChange(){
		lblNewLabel.setForeground(hover);
	}
	public void menuColorold(){
		lblNewLabel.setForeground(old);
	}
	public static  int getH(){
		return Height;
	}
	public static int getW(){
		return width;
	}

}
