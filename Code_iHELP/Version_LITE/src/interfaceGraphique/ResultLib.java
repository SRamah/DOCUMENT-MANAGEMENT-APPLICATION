package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileSystemView;

import Local.Fileapp;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultLib extends JPanel {

	private static final long serialVersionUID = 1L;
	static int count=0;
	int id ;
	Color bk = new Color(0xe0e0e0);
	Color bk_zibra = new Color(0xefefef);
	Color switch_color = new Color(0xe5f5fc);
	Color jp_color ;
	JLabel label_1  = null;
	java.net.URL logoOneUrl;
	JPanel jp;
	Library select=null;
	Fileapp file=null;
	private final JLabel label = new JLabel("");
	
	public ResultLib(Fileapp file , Library select , JPanel content) {
		jp=content;
		this.file=file;
		this.select=select;
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				switchColor();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				oldColor();
			}
		});
		
		id=count++;
		setSize(174, 30);
		setLayout(null);
		setMaximumSize(new Dimension(174,30));
		setMinimumSize(new Dimension(174,30));
		setIcon1(file);
		label.setBounds(6, 6, 23, 18);
		
		JLabel filename = new JLabel("");
		filename.setFont(new Font("Adobe Heiti Std", Font.PLAIN, 11));
		filename.setForeground(new Color(0x3b3b39));
		filename.setBounds(39, 6, 67, 20);
		filename.setText(file.getName());
		add(filename);
		logoOneUrl =  getClass().getResource("Src/add.png");
		label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				logoOneUrl =  getClass().getResource("Src/add1.png");
				ImageIcon icon =new  ImageIcon(logoOneUrl);
				label_1.setIcon(icon);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				logoOneUrl =  getClass().getResource("Src/add.png");
				ImageIcon icon =new  ImageIcon(logoOneUrl);
				label_1.setIcon(icon);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				logoOneUrl =  getClass().getResource("Src/added.png");
				ImageIcon icon =new  ImageIcon(logoOneUrl);
				label_1.setIcon(icon);
				
					try {
						buildLib();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			
		});
		label_1.setBounds(140, 6, 23, 18);
		ImageIcon icon =new  ImageIcon(logoOneUrl);
		label_1.setIcon(icon);
		add(label_1);
		}
	
	public void setColor(){
		
		if(id%2==0){
			setBackground(bk);
			jp_color=bk;
		}
		else {
			setBackground(bk_zibra);
			jp_color=bk_zibra;
		}
	}
	public void switchColor(){
		setBackground(switch_color);
	}
	public void oldColor(){
		setBackground(jp_color);
	}
	public void setIcon1(Fileapp file){
		File fk = new File(file.getPath());
		Icon ico = FileSystemView.getFileSystemView().getSystemIcon(fk);
	    label.setIcon(ico);
		add(label);
		setColor();
		
	}
	public void buildLib() throws InterruptedException{
		Library l = LibraryDisplay.getLibr();
		l.add(file);
		LibraryDisplay.setLibr(l);;
		select = LibraryDisplay.selectLibrary;
		if(jp!=null)
		jp.removeAll();
		FormresultInput content= new FormresultInput(select.getALL());
		content.setPreferredSize(new Dimension(250,select.getALL().size()*36));
		content.setMinimumSize(new Dimension(250,select.getALL().size()*36));
		JScrollPane scrool = new JScrollPane(content);
		scrool.setBorder(null);
		scrool.setSize(250, 310);
		System.out.println(select.getName());
		jp.add(scrool);
		jp.revalidate();
		jp.repaint();
		
		
	}

}
