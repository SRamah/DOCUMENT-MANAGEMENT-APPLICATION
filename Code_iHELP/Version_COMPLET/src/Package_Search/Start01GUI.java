package Package_Search;

import Search_File.scanMachine;
import ServiceApp.Etat;
import ServiceApp.Panel0;
import ServiceApp.Panel1;
import ServiceApp.Panel2;
import ServiceApp.Panel_Biblio;
import ServiceApp.Panel_Etat;
import ServiceApp.Panel_Scanne;
import ServiceApp.Panel_compte;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
/**
 *
 * @author salaheddine
 */
public class Start01GUI extends javax.swing.JFrame {

   
    int countsearch;
    boolean visible = true;
    DisplayTrayIcon DTI =new DisplayTrayIcon();
    
    JPanel zone_to_add_jPanel_user = new JPanel();
    JPanel zone_to_add_jPanel_bibl = new JPanel();
    JPanel zone_to_add_jPanel_etat = new JPanel();
    JPanel zone_to_add_jPanel_result = new JPanel();
    JPanel zone_to_add_jPanel_scanne = new JPanel();
    JPanel zone_to_add_jPanel_biblio = new JPanel();
    scanMachine fsearch =new scanMachine();
    byte cont;
    
    
    public int getW(){
        return this.getWidth();
    }
    
    
    public Start01GUI() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        
        getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
                System.out.println("this is the width "+getW());
                repaint();
                
            }
        });
        
        
        // utilisation d'un toolkit pour l'affichage 
        // d'une icone associée à la fenêtre 
        Toolkit tk = Toolkit.getDefaultToolkit(); 
        Image JFrameIcon = tk.getImage("/Package_Search/Disign/iconofihelp.png");
        
        setIconImage(JFrameIcon);
        setMinimumSize(new java.awt.Dimension(1029, 600));
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Package_Search/Disign/iconofihelp.png")).getImage());
        
        System.out.println("restart"+cont);
        cont++;
        
        
        //chercher();
        //Result();
        etat();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel_header = new javax.swing.JPanel();
        jLabel_Logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Text_search = new javax.swing.JTextField();
        rechercher = new javax.swing.JLabel();
        search_bar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu_header = new javax.swing.JPanel();
        jLabel1_Scanne = new javax.swing.JLabel();
        jLabel_Rapport = new javax.swing.JLabel();
        jLabel_Bibliotheque = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Etat = new javax.swing.JLabel();
        jLabel_Menu_Etat = new javax.swing.JLabel();
        jPanel_Menu_footer = new javax.swing.JPanel();
        jLabel_Preferences = new javax.swing.JLabel();
        jLabel_Menu_Preferences = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iHelp");

        jPanel_header.setBackground(new java.awt.Color(32, 36, 39));
        jPanel_header.setMaximumSize(new java.awt.Dimension(2147483647, 88));
        jPanel_header.setMinimumSize(new java.awt.Dimension(1024, 88));
        jPanel_header.setPreferredSize(new java.awt.Dimension(1024, 88));
        jPanel_header.setLayout(new java.awt.BorderLayout());

        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/logo.png"))); // NOI18N
        jPanel_header.add(jLabel_Logo, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(32, 36, 39));
        jPanel2.setMaximumSize(new java.awt.Dimension(240, 88));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 88));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 88));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_search.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        Text_search.setBorder(null);
        Text_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Text_searchFocusLost(evt);
            }
        });
        Text_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text_searchMouseClicked(evt);
            }
        });
        Text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Text_searchKeyPressed(evt);
            }
        });
        jPanel2.add(Text_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 28, 144, -1));

        rechercher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercherMouseClicked(evt);
            }
        });
        jPanel2.add(rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 10));

        search_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Disign/SearchBN0.png"))); // NOI18N
        jPanel2.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 50));

        jPanel_header.add(jPanel2, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel_header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(41, 45, 48));
        jPanel1.setMaximumSize(new java.awt.Dimension(180, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(180, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 500));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel_Menu_header.setMaximumSize(new java.awt.Dimension(180, 386));
        jPanel_Menu_header.setMinimumSize(new java.awt.Dimension(180, 386));
        jPanel_Menu_header.setPreferredSize(new java.awt.Dimension(180, 386));
        jPanel_Menu_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_Scanne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_Scanne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_ScanneMouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel1_Scanne, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 65, 170, 59));

        jLabel_Rapport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Rapport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_RapportMouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel_Rapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 170, 59));

        jLabel_Bibliotheque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Bibliotheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BibliothequeMouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel_Bibliotheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 197, 170, 59));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 260, 170, 59));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 323, 170, 59));

        jLabel_Etat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Etat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EtatMouseClicked(evt);
            }
        });
        jPanel_Menu_header.add(jLabel_Etat, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 170, 58));

        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m0.png"))); // NOI18N
        jPanel_Menu_header.add(jLabel_Menu_Etat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel_Menu_header, java.awt.BorderLayout.PAGE_START);

        jPanel_Menu_footer.setMaximumSize(new java.awt.Dimension(180, 65));
        jPanel_Menu_footer.setMinimumSize(new java.awt.Dimension(180, 65));
        jPanel_Menu_footer.setPreferredSize(new java.awt.Dimension(180, 65));
        jPanel_Menu_footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Preferences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Preferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PreferencesMouseClicked(evt);
            }
        });
        jPanel_Menu_footer.add(jLabel_Preferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 2, 170, 59));

        jLabel_Menu_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png"))); // NOI18N
        jLabel_Menu_Preferences.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Menu_footer.add(jLabel_Menu_Preferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel_Menu_footer, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public void Biblio() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        
       
                                                                    
        zone_to_add_jPanel_biblio.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Panel_Biblio addpan = new Panel_Biblio();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addpan.Panel_Biblio(zone_to_add_jPanel_biblio).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_biblio);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
       
        //zone_to_add_jPanel_user.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(false);
        //zone_to_add_jPanel_biblio.setVisible(true);
    
    }
    
    public void Scanne() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        
       
                                                                    
        zone_to_add_jPanel_scanne.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Panel_Scanne addnav = new Panel_Scanne();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Panel_Scanne(zone_to_add_jPanel_scanne).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_scanne);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
       
        //zone_to_add_jPanel_biblio.setVisible(false);
        //zone_to_add_jPanel_user.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(true);
    
    }
    
    public void Result() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        
       //JPanel zone_to_add_jPanel_user = new JPanel();
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
                                                                    
        zone_to_add_jPanel_result.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Panel_Etat addnav = new Panel_Etat();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Panel_Etat(zone_to_add_jPanel_result).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_result);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        
        //zone_to_add_jPanel_biblio.setVisible(false);
        //zone_to_add_jPanel_user.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(true);
    
    }
    
    public void etat(){
        
       //JPanel zone_to_add_jPanel_user = new JPanel();
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
                                                                    
        zone_to_add_jPanel_etat.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Etat addnav = new Etat();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Etat(zone_to_add_jPanel_etat).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_etat);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        
        //zone_to_add_jPanel_biblio.setVisible(false);
        //zone_to_add_jPanel_user.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(true);
    
    }
    
    public void Compte_user() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
                                                                    
        zone_to_add_jPanel_user.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Panel_compte addnav = new Panel_compte();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Panel_compte(zone_to_add_jPanel_user).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_user);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        
        //zone_to_add_jPanel_biblio.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(false);
        //zone_to_add_jPanel_user.setVisible(true);
    
    }
    
    public void Bibliotheque(){
        
        zone_to_add_jPanel_bibl.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Panel1 addnav = new Panel1();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Panel1(zone_to_add_jPanel_bibl).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_bibl);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
       
        //zone_to_add_jPanel_user.setVisible(false);
        //zone_to_add_jPanel_rech.setVisible(false);
        //zone_to_add_jPanel_result.setVisible(false);
        //zone_to_add_jPanel_scanne.setVisible(false);
        //zone_to_add_jPanel_biblio.setVisible(true);
    
    }
    
    private void jLabel1_ScanneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_ScanneMouseClicked
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m2.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
        
       
            zone_to_add_jPanel_biblio.setVisible(false);
            zone_to_add_jPanel_user.setVisible(false);
            zone_to_add_jPanel_etat.setVisible(false);
            zone_to_add_jPanel_result.setVisible(false);

            
            //chercher();
            
        try {   
            Scanne();
            zone_to_add_jPanel_scanne.setVisible(true);
            
            this.repaint();
        } 
        catch (IOException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            zone_to_add_jPanel_scanne.revalidate();
            
        
    }//GEN-LAST:event_jLabel1_ScanneMouseClicked

    private void Text_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_searchMouseClicked
        
        if(countsearch == 0)
        {
            Text_search.setEnabled(true);
            Text_search.setEditable(true);
            Text_search.setText("");
            ImageIcon II = new ImageIcon(getClass().getResource("/Package_Search/Disign/SearchBN1.png"));
            search_bar.setIcon(II);
            //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChercherUnFichier/bg/search1.png")));
            countsearch = 1;
        }
    }//GEN-LAST:event_Text_searchMouseClicked

    private void jLabel_RapportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RapportMouseClicked
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m3.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
        
         zone_to_add_jPanel_biblio.setVisible(false);
        zone_to_add_jPanel_user.setVisible(false);
        zone_to_add_jPanel_etat.setVisible(false);
        zone_to_add_jPanel_scanne.setVisible(false);
        
        
        try {
            Result();
            zone_to_add_jPanel_result.setVisible(true);
        }
        catch (IOException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        zone_to_add_jPanel_result.revalidate();
        
    }//GEN-LAST:event_jLabel_RapportMouseClicked

    
    private void jLabel_BibliothequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BibliothequeMouseClicked
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m4.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
        
        zone_to_add_jPanel_user.setVisible(false);
        zone_to_add_jPanel_etat.setVisible(false);
        zone_to_add_jPanel_result.setVisible(false);
        zone_to_add_jPanel_scanne.setVisible(false);
        
        
        try {
            Biblio();
            zone_to_add_jPanel_biblio.setVisible(true);
        } catch (IOException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        zone_to_add_jPanel_biblio.revalidate();
        
        this.repaint();
    }//GEN-LAST:event_jLabel_BibliothequeMouseClicked

   public void getresult(String s , java.awt.event.KeyEvent evt) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
       Panel_Etat pe = new Panel_Etat();
      
       if(!"".equals(s))
       {
       
       zone_to_add_jPanel_result.setLayout(new BorderLayout());
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        pe.Panel_Etat(zone_to_add_jPanel_result,s, evt).revalidate();
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add("Center",zone_to_add_jPanel_result);
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
       }
   } 
     
    private void Text_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_searchKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {  Panel_Etat pe = new Panel_Etat();
               System.out.println(Text_search.getText());
                zone_to_add_jPanel_biblio.setVisible(false);
                zone_to_add_jPanel_user.setVisible(false);
                zone_to_add_jPanel_etat.setVisible(false);
                zone_to_add_jPanel_scanne.setVisible(false);
               
                try {
                    
                    getresult(Text_search.getText() ,evt);
                    zone_to_add_jPanel_result.setVisible(true);
                }
                catch (IOException | ClassNotFoundException | InterruptedException ex) {
                    Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                zone_to_add_jPanel_result.revalidate();
                
            }
    }//GEN-LAST:event_Text_searchKeyPressed

    private void rechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherMouseClicked
        fsearch.firstall();
                //scanner
                fsearch.scanDir("/Users/salaheddine/Desktop/");
                //rechercher à un fichier
                fsearch.Search(Text_search.getText());
    }//GEN-LAST:event_rechercherMouseClicked

    private void Text_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Text_searchFocusLost
        if(countsearch == 1)
        {
            Text_search.setEnabled(true);
            Text_search.setEditable(true);
            Text_search.setText("");
            ImageIcon II = new ImageIcon(getClass().getResource("/Package_Search/Disign/SearchBN0.png"));
            search_bar.setIcon(II);
            //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChercherUnFichier/bg/search1.png")));
            countsearch = 0;
        }
    }//GEN-LAST:event_Text_searchFocusLost

    private void jLabel_EtatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EtatMouseClicked
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m0.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
       
            zone_to_add_jPanel_biblio.setVisible(false);
            zone_to_add_jPanel_user.setVisible(false);
            zone_to_add_jPanel_scanne.setVisible(false);
            zone_to_add_jPanel_result.setVisible(false);

            
            etat();
            
        
           
            zone_to_add_jPanel_etat.setVisible(true);
            
     
            zone_to_add_jPanel_etat.revalidate();
    }//GEN-LAST:event_jLabel_EtatMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
            
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m5.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
        
        
       
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/m6.png")));
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences0.png")));
        
        
        zone_to_add_jPanel_biblio.setVisible(false);
        zone_to_add_jPanel_etat.setVisible(false);
        zone_to_add_jPanel_result.setVisible(false);
        zone_to_add_jPanel_scanne.setVisible(false);
        
        try {
            Compte_user();
        } catch (IOException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        zone_to_add_jPanel_user.setVisible(true);
        
        this.repaint();
        
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel_PreferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PreferencesMouseClicked
         jLabel_Menu_Etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/mr.png")));
        
        jLabel_Preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Préférences1.png")));
        
    }//GEN-LAST:event_jLabel_PreferencesMouseClicked
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start01GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start01GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start01GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start01GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Start01GUI().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Start01GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1_Scanne;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Bibliotheque;
    private javax.swing.JLabel jLabel_Etat;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Menu_Etat;
    private javax.swing.JLabel jLabel_Menu_Preferences;
    private javax.swing.JLabel jLabel_Preferences;
    private javax.swing.JLabel jLabel_Rapport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Menu_footer;
    private javax.swing.JPanel jPanel_Menu_header;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JLabel rechercher;
    private javax.swing.JLabel search_bar;
    // End of variables declaration//GEN-END:variables
}
