/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

/**
 *
 * @author salaheddine
 */
import Local.Biblioapp;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import Local.Fileapp;
import Local.operation;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class formResult extends JPanel {
	
    
    private javax.swing.JLabel Genre;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Securite;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    
	private static final long serialVersionUID = 1L;
	JLabel label_nom;
	Color backJp = new Color(0xf6f6f6);
	Color backJpOnclick = new Color(0xfda424);
	Color Zibra = new Color(0xdbdbdb);
	java.net.URL logoOneUrl;
        java.net.URL logoUrl;
	public static int count=0;
	//static int id=0;
        

	public formResult(Fileapp file,int Colorold,int width) {

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                          
                            changeColor();
                            
			}

			public void mouseExited(MouseEvent e) {
                            if(Colorold % 2== 0){
                                OldColor(0);
                            }else {
                                OldColor(1);
                            }
			}

			public void mouseClicked(MouseEvent e) {
				File f = new File(file.getPath());
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
		

		// OldColor();
		// setBackground(backJp);
		setLayout(null);
                setPreferredSize(new Dimension(844, 36));
                setMinimumSize(new Dimension(844, 36));
                setMaximumSize(new Dimension(width, 36));
                //setMaximumSize(new Dimension(400, 36));
		JLabel label_img = new JLabel();
                
		if (operation.checkExt(file.getName(), "xls")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/xls-icon.png");
		}
                else if (operation.checkExt(file.getName(), "xlsx")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/xlsx-icon.png");
		}
                else if (operation.checkExt(file.getName(), "rar|RAR")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Archives/rar-icon.png");
		}
                else if (operation.checkExt(file.getName(), "zip|ZIP")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Archives/zip-icon.png");
		}
                else if (operation.checkExt(file.getName(), "tar|TAR")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Archives/Mimetypes-Compressed-Files-icon.png");
		}
                else if (operation.checkExt(file.getName(), "pdf|PDF")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/pdf.png");
		} else if (operation.checkExt(file.getName(),"docx|DOCX")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/docx-icon.png");
		}
                else if (operation.checkExt(file.getName(),"doc|DOC")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/doc-icon.png");
		}
                else if (operation.checkExt(file.getName(),"rtf|RTF")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/rtf-icon.png");
		}
                else if (operation.checkExt(file.getName(),"pages")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/Pages-icon.png");
		}
                else if (operation.checkExt(file.getName(),"txt|TXT")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/txt-icon.png");
		}
                else if (operation.checkExt(file.getName(),"ppt|PPT")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/ppt-icon.png");
		}
                else if (operation.checkExt(file.getName(),"pptx|PPTX")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/pptx-icon.png");
		}
                else if (operation.checkExt(file.getName(),"xps|XPS")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/icon_file_xps.png");
		}
                else if (operation.checkExt(file.getName(), "avi|mp4|flv")) {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Videos/avi-icon.png");
		} else {
			logoOneUrl = getClass().getResource("/Package_Search/icon/Archives/file.png");

		}
                
               //logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/Pages-icon.png");
		ImageIcon imgThisImg = new ImageIcon(logoOneUrl);
		//label_img.setBounds(6, 0, 31, 36);
		label_img.setBounds(3, 3, 37, 33);
                label_img.setIcon(imgThisImg);
		add(label_img);
                ////add(label_img,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 37, 33));
		// =========== || LOGO | NameFile -FolderName || //
		label_nom = new JLabel();
		label_nom.setText(file.getName());
		label_nom.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		//label_nom.setBounds(49, 5, 143, 24);
                label_nom.setBounds(45, 9, 205, 15);
		add(label_nom);
                //=========================///
                JLabel label_taille = new JLabel(file.getTaille());
		label_taille.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
                label_taille.setBounds(265, 9, 50, 15);
		label_taille.setForeground(new Color(0x595858));
		add(label_taille);
                //=========================///
                
                JLabel label_chemin= new JLabel(file.getPath());
		label_chemin.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
                label_chemin.setBounds(330, 9, 295, 15);
		label_chemin.setForeground(new Color(0x595858));
		add(label_chemin);
                //=========================///
                File f = new File(file.getPath());
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
 
                JLabel label_date = new JLabel(sdf.format(f.lastModified()));
		label_date.setFont(new Font("Century Gothic", Font.PLAIN, 12));
                label_date.setBounds(640, 9, 75, 15);
		label_date.setForeground(new Color(0x595858));
		add(label_date);
                //=====================///
		JLabel label_type = new JLabel(file.getType());
		label_type.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
                label_type.setBounds(735, 9, 50, 15);
		label_type.setForeground(new Color(0x595858));
		add(label_type);
                //=========================///
                JLabel label_add = new JLabel();
		label_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/p.png")));
                label_add.setBounds(785, 9, 30, 25);
		label_add.setForeground(new Color(0x595858));
		add(label_add);
                
                label_add.addMouseListener(new MouseAdapter() {
			
                        @Override
			public void mouseClicked(MouseEvent e) {
				File f = new File(file.getPath());
				if (f.exists()){
                                    
                                 label_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/v.png")));
                                 System.out.println("Le fichier : "+file.getName()+" est ajouté à la bibliothéque |^_^|");
                                }	
			}
		});
                
                //=========================///
                JLabel label_delet = new JLabel();
		label_delet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/x.png")));
                label_delet.setBounds(810, 9, 30, 25);
		label_delet.setForeground(new Color(0x595858));
		add(label_delet);
                
                label_delet.addMouseListener(new MouseAdapter() {
			
                        @Override
			public void mouseClicked(MouseEvent e) {
				File f = new File(file.getPath());
				if (f.exists()){
					
                                 label_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/p.png")));
						
                                }	
			}
		});
                
                //=========================///
                
		//this.setSize(250, 36);
		this.repaint();
		this.revalidate();
	}
        
        public formResult(Biblioapp file,int Colorold) {

            addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                          
                            changeColor();
                            
			}

			public void mouseExited(MouseEvent e) {
                            if(Colorold % 2== 0){
                                OldColor(0);
                            }else {
                                OldColor(1);
                            }
			}

			public void mouseClicked(MouseEvent e) {
				File f = new File(file.getPath());
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
		

		
		setLayout(new BorderLayout());
                setPreferredSize(new Dimension(844, 55));
                setMinimumSize(new Dimension(844, 55));
                setMaximumSize(new Dimension(32767, 55));
                
                
		if ("PRIVATE".equals(file.getSecurite())) {
			logoUrl = getClass().getResource("/Package_Search/icon/Biblio/lock-server-icon.png");
		}
                else {
			logoUrl = getClass().getResource("/Package_Search/icon/Biblio/unlock-server-icon.png");

		}
               /*
                JPanel pan = new JPanel();
                pan.setLayout(new BorderLayout());
                
                JLabel label_img = new JLabel();
               //logoOneUrl = getClass().getResource("/Package_Search/icon/Documents/Pages-icon.png");
		ImageIcon imgThisImg = new ImageIcon(logoUrl);
		//label_img.setBounds(6, 0, 31, 36);
		label_img.setBounds(3, 3, 37, 33);
                label_img.setIcon(imgThisImg);
		pan.add("West",label_img);
                ////add(label_img,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 37, 33));
		// =========== || LOGO | NameFile -FolderName || //
		label_nom = new JLabel();
		label_nom.setText(file.getName());
		label_nom.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		//label_nom.setBounds(49, 5, 143, 24);
                //label_nom.setBounds(45, 9, 205, 15);
		pan.add("Center",label_nom);
                add("West",pan);
                 
                //=====================///
		JLabel label_genre = new JLabel(file.getGenre());
		label_genre.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
                //label_genre.setBounds(735, 9, 50, 15);
		label_genre.setForeground(new Color(0x595858));
		add("Center",label_genre);
                //=========================///
                JLabel label_securite = new JLabel(file.getSecurite());
		label_securite.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
                //label_securite.setBounds(785, 9, 30, 25);
		label_securite.setForeground(new Color(0x595858));
		add("East",label_securite);
                
                //=========================///
                
                */
                
		initComponents(file.getName() ,file.getGenre(), file.getSecurite());
                
		this.repaint();
		this.revalidate();
	}

        
        private void initComponents(String nom ,String genre, String securite) {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Nom = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Genre = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Securite = new javax.swing.JLabel();
       


        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 55));
        jPanel6.setMinimumSize(new java.awt.Dimension(844, 55));
        jPanel6.setPreferredSize(new java.awt.Dimension(844, 55));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel5.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(250, 250, 252));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 54));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 54));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 54));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(410, 50));

        jCheckBox1.setBackground(new java.awt.Color(250, 250, 252));

        Nom.setFont(new java.awt.Font("Gill Sans", 0, 13)); // NOI18N
        Nom.setText(nom);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nom)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(74, 50));

        Genre.setText(genre);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Genre)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Genre)
                .addGap(12, 12, 12))
        );

        jPanel4.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(250, 50));
        
        ImageIcon imgThisImg = new ImageIcon(logoUrl);
        Securite.setIcon(imgThisImg);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Securite)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(Securite)
                .addGap(18, 18, 18))
        );

        jPanel4.add(jPanel12, java.awt.BorderLayout.EAST);

        jPanel6.add(jPanel4, java.awt.BorderLayout.NORTH);

        add(jPanel6 ,java.awt.BorderLayout.NORTH);
        
        
    }
        
	public void changeColor() {

		this.setBackground(backJpOnclick);

	}
        
	public void OldColor(int id) {

		if (id %2== 0) {
			this.setBackground(backJp);
                        
		} else {
			this.setBackground(Zibra);
                        
		}
	}
}
