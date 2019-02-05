package interfaceGraphique;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;

import Local.Fileapp;
import Local.operation;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class formResult extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblNewLabel;
	static String Path;
	Color backJp = new Color(0xf6f6f6);
	Color backJpOnclick = new Color(0xfda424);
	Color Zibra = new Color(0xdbdbdb);
	java.net.URL logoOneUrl;
	static JPanel p1 = null;
	static int count;
	private int id;
	Fileapp f1;

	/**
	 * @wbp.parser.constructor
	 */
	public formResult(Fileapp file) {
		f1 = file;
		
		int drap =0;
		this.setSize(250, 36);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor();

			}

			public void mouseExited(MouseEvent e) {
				OldColor();
			}

			public void mouseClicked(MouseEvent e) {
				File f = new File(f1.getPath());
				System.out.println("ok");
				Desktop desktop = Desktop.getDesktop();
				if (f.exists())
					try {
						desktop.open(f);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		id = count++;
		setLayout(null);
		Path = file.getPath();
		JLabel lblNewLabel_1 = new JLabel();
		if (operation.checkExt(file.getName(), "pdf|PDF")) {
			logoOneUrl = getClass().getResource("Src/pdf.png");
		} else if (operation
				.checkExt(file.getName(), "rar|RAR|zip|ZIP|tar|TAR")) {
			logoOneUrl = getClass().getResource("Src/rar.png");
		}

		else if (operation
				.checkExt(file.getName(), "docx|doc|DOCX|DOC|rtf|RTF")) {
			logoOneUrl = getClass().getResource("Src/doc.png");
		} else if (operation.checkExt(file.getName(), "avi|mp4|flv")) {
			logoOneUrl = getClass().getResource("Src/avi.png");
		} else if (operation.checkExt(file.getName(), "none")) {
			logoOneUrl = getClass().getResource("Src/folder.png");
		} else if (operation.checkExt(file.getName(), "xls|xlsx")) {
			logoOneUrl = getClass().getResource("Src/excel.png");
		} else if (operation.checkExt(file.getName(), "html")) {
			logoOneUrl = getClass().getResource("Src/html.png");
		} else if (operation.checkExt(file.getName(), "css")) {
			logoOneUrl = getClass().getResource("Src/css.png");
		} else if (operation.checkExt(file.getName(), "php")) {
			logoOneUrl = getClass().getResource("Src/php.png");
		} else if (operation.checkExt(file.getName(), "txt")) {
			logoOneUrl = getClass().getResource("Src/txt.png");
		}

		else if (operation.checkExt(file.getName(), "mp3")) {
			logoOneUrl = getClass().getResource("Src/mp3.png");
		} else if (operation.checkExt(file.getName(), "none")) {
			logoOneUrl = getClass().getResource("Src/folder.png");
		}
		

		
	else {
			logoOneUrl = getClass().getResource("Src/unknown.png");
            drap=1;
		}
		
        if(operation.checkExt(file.getName(), "app|dmg|exe|jar") || drap==1){
        	
  
        	File fk = new File(file.getPath());

            Icon ico = FileSystemView.getFileSystemView().getSystemIcon(fk);
            lblNewLabel_1.setIcon(ico);
        }
        else {
        ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
        lblNewLabel_1.setIcon(imgThisImg);}
		lblNewLabel_1.setBounds(6, 0, 31, 36);
		
		add(lblNewLabel_1);
		// =========== || LOGO | NameFile -FolderName || //
		lblNewLabel = new JLabel();
		lblNewLabel.setText(file.getName());
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(49, 5, 143, 24);
		add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel(file.getType().toUpperCase());
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(194, 9, 50, 24);
		lblNewLabel_2.setForeground(new Color(0x595858));
		add(lblNewLabel_2);
		this.setSize(250, 36);
		this.repaint();
		this.revalidate();
		}
	
	
	
	
	
	public formResult(Fileapp file, SmallLock p) {
		f1 = file;
		p1 = p;
		int drap =0;
		this.setSize(250, 36);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor();
				try {
					p.change(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			public void mouseExited(MouseEvent e) {
				OldColor();
			}

			public void mouseClicked(MouseEvent e) {
				File f = new File(f1.getPath());
				System.out.println("ok");
				Desktop desktop = Desktop.getDesktop();
				if (f.exists())
					try {
						desktop.open(f);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		id = count++;
		setLayout(null);
		Path = file.getPath();
		JLabel lblNewLabel_1 = new JLabel();
		if (operation.checkExt(file.getName(), "pdf|PDF")) {
			logoOneUrl = getClass().getResource("Src/pdf.png");
		} else if (operation
				.checkExt(file.getName(), "rar|RAR|zip|ZIP|tar|TAR")) {
			logoOneUrl = getClass().getResource("Src/rar.png");
		}

		else if (operation
				.checkExt(file.getName(), "docx|doc|DOCX|DOC|rtf|RTF")) {
			logoOneUrl = getClass().getResource("Src/doc.png");
		} else if (operation.checkExt(file.getName(), "avi|aaf|mng|m1v|m2vflr|svi|swf|asf|wmv|mov|flv")) {
			logoOneUrl = getClass().getResource("Src/vedio.png");
		} else if (operation.checkExt(file.getName(), "none")) {
			logoOneUrl = getClass().getResource("Src/folder.png");
		} else if (operation.checkExt(file.getName(), "xls|xlsx")) {
			logoOneUrl = getClass().getResource("Src/excel.png");
		} else if (operation.checkExt(file.getName(), "html")) {
			logoOneUrl = getClass().getResource("Src/html.png");
		} else if (operation.checkExt(file.getName(), "css")) {
			logoOneUrl = getClass().getResource("Src/css.png");
		} else if (operation.checkExt(file.getName(), "php")) {
			logoOneUrl = getClass().getResource("Src/php.png");
		} else if (operation.checkExt(file.getName(), "txt")) {
			logoOneUrl = getClass().getResource("Src/txt.png");
		}

		else if (operation.checkExt(file.getName().toLowerCase(), "mp3|mp2|amr|mpc|smp")) {
			logoOneUrl = getClass().getResource("Src/mp3.png");
		} else if (operation.checkExt(file.getName(), "none")) {
			logoOneUrl = getClass().getResource("Src/folder.png");
		}
	 else if (operation.checkExt(file.getName().toLowerCase(), "png|gif|jpg|ttf")) {
		logoOneUrl = getClass().getResource("Src/picture.png");
	}
		

		
	else {
			logoOneUrl = getClass().getResource("Src/unknown.png");
            drap=1;
		}
		
        if(operation.checkExt(file.getName(), "app|dmg|exe|jar") || drap==1){
        	
        	/*Icon icon= FileSystemView.getFileSystemView().getSystemIcon(new File(file.getPath()));
        	lblNewLabel_1.setIcon(icon);*/
        	
        	File fk = new File(file.getPath());

            Icon ico = FileSystemView.getFileSystemView().getSystemIcon(fk);
            lblNewLabel_1.setIcon(ico);
        }
        else {
        ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
        lblNewLabel_1.setIcon(imgThisImg);}
		lblNewLabel_1.setBounds(6, 0, 31, 36);
		
		add(lblNewLabel_1);
		// =========== || LOGO | NameFile -FolderName || //
		lblNewLabel = new JLabel();
		lblNewLabel.setText(file.getName());
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(49, 5, 143, 24);
		add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel(file.getType().toUpperCase());
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(194, 9, 50, 24);
		lblNewLabel_2.setForeground(new Color(0x595858));
		add(lblNewLabel_2);
		this.setSize(250, 36);
		this.repaint();
		this.revalidate();
	}

	public void changeColor() {

		this.setBackground(backJpOnclick);

	}

	public void OldColor() {

		if (id % 2 == 0) {
			this.setBackground(backJp);
		} else {
			this.setBackground(Zibra);
		}
	}
}
