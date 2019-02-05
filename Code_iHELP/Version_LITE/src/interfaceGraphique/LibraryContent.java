package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Local.Fileapp;

import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class LibraryContent extends JPanel {
	static int count;
	private static final long serialVersionUID = 1L;
	java.net.URL logoOneUrl;
	JLabel label = new JLabel("");
	JLabel label_1 = new JLabel("");
	JPanel jp;
	int id;
	Library  l ;
	Library  select;
	private final JLabel label_3 = new JLabel("",JLabel.LEFT);
	public void select(){
		LibraryDisplay.setLibr(l);
	} 
	public LibraryContent(Library l ,JPanel jp , Library selectLibrary) throws InterruptedException {
		
		this.l=l;
		select=selectLibrary;
		this.setBackground(new Color(0x272821));
		id=count++;
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					select();
					
					LibraryContentbuilt();
					System.out.println("==>"+select.getName());
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				switchColor();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setColor();
			}
		});
		setSize(143, 33);
		setLayout(null);
		
		setMaximumSize(new Dimension(143, 40));
		setMinimumSize(new Dimension(143, 40));
		label.setBounds(6, 6, 24, 28);
		add(label);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		label_1.setBounds(32, 6, 63, 28);
		label_1.setText(l.getName());
		add(label_1);
		logoOneUrl = getClass().getResource("Src/lib.png");
		ImageIcon icon =new  ImageIcon(logoOneUrl);
		label.setIcon(icon);
		this.l=l;
		this.jp=jp;
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		label_3.setBounds(107, 6, 30, 28);
		
		add(label_3);
		label_3.setText("("+l.getALL().size()+")");
}
public  void LibraryContentbuilt() throws InterruptedException {
		
		jp.removeAll();
		FormresultInput content= new FormresultInput(l.getALL());
		content.setPreferredSize(new Dimension(250,l.getALL().size()*36));
		content.setMinimumSize(new Dimension(250,l.getALL().size()*36));
		JScrollPane scrool = new JScrollPane(content);
		scrool.setBorder(null);
		scrool.setSize(250, 310);
		System.out.println(select.getName());
		jp.add(scrool);
		jp.revalidate();
		jp.repaint();
}
public void setColor(){
	
	logoOneUrl = getClass().getResource("Src/lib.png");
	ImageIcon icon =new  ImageIcon(logoOneUrl);
	label.setIcon(icon);
	label_1.setForeground(Color.WHITE);
	label_3.setForeground(Color.WHITE);
	if(id%2==0){
		setBackground(new Color(0x272821));
	}
	if(id%2==1){
		setBackground(new Color(0x272821));
	}
	
}
public void switchColor(){
	setBackground(new Color(0x31322b));
	logoOneUrl = getClass().getResource("Src/lib1.png");
	ImageIcon icon =new  ImageIcon(logoOneUrl);
	label.setIcon(icon);
	label_3.setForeground(new Color(0xe59203));
	label_1.setForeground(new Color(0xe59203));
	
	
}

}
