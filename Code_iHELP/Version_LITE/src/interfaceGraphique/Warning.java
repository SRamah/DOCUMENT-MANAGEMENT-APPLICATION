package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Warning extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	java.net.URL logoOneUrl;
	
	JLabel label = new JLabel("", JLabel.RIGHT);
	JLabel label_1 = new JLabel("",JLabel.LEFT);

	public Warning(String Message) {
		
		super();
		setBackground(new Color(0xf6f6f6));
		setSize(100,40);
		setLayout(null);
		logoOneUrl=getClass().getResource("Src/warning.png");
		ImageIcon icon = new ImageIcon(logoOneUrl);
		setLayout(null);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setMessage();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hideMessage();
			}
		});
		label.setBounds(0, 0, 100, 40);
		label.setIcon(icon);
		label_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		add(label);
		label_1.setBounds(0, 0, 100, 40);
		label_1.setText(Message);
		add(label_1);
		label_1.setVisible(false);
		label_1.setForeground(new Color(0xb50505));

	}
	public void setMessage(){
		
		label_1.setVisible(true);
	}
	public void hideMessage(){
		label_1.setVisible(false);
	}

}
