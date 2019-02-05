
package ServiceApp;

import Local.Date;
import Local.Fileapp;
import Local.Recherche;
import Package_Search.Start01GUI;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author salaheddine
 */
public class Panel_Etat extends javax.swing.JPanel {
    String str = new String();
option op = new option();
Calendar cal0;
//JScrollPane jScrollPane1 = new JScrollPane();
    // le constructeur "Panel_Etat(JPanel p)" appeler par JFrame
    public JPanel Panel_Etat(JPanel p) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        initComponents();
       //if(!("".equals(jTextField_zone_put.getText()))){addlistpan();}
      // addlistpan();
       option_recherche();
       p.add("Center", this);
       
        return p;
        // résultat de retour ça affiche au JFrame
    }
    
    public JPanel Panel_Etat(JPanel p, String s ,java.awt.event.KeyEvent evt) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        initComponents();
       str=s; 
       zone_putKeyPressed(evt);
       option_recherche();
       p.add("Center", this);
        return p;
        // résultat de retour ça affiche au JFrame
    }
    
        // la fonction addlistpan() ajoute les résultats sous forme de JPanel au jPanel_resultat
    public void addlistpan(String s) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{

               jPanel_resultat.remove(1);
               FormresultInput k = new FormresultInput(recherche(s),width(),height(),"ok");
               System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
               jPanel_resultat.add(k, BorderLayout.CENTER,1);
               jPanel_resultat.repaint();
               jPanel_resultat.setVisible(true);
               this.revalidate();
              
              
}
    
    // la fonction addlistpan() ajoute les résultats sous forme de JPanel au jPanel_resultat
    public void addlistpan() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{

        
        if("".equals(jTextField_zone_put.getText())) 
            {
                System.out.println("\n ******** Le champ est vide ******* \n");
            } 
        else { 
            if(jTextField_zone_put.getText().charAt(0)== '*'){
                String kt=new String();
                kt="";
                for(int i=1;i<jTextField_zone_put.getText().length();i++){
                kt=kt+jTextField_zone_put.getText().charAt(i);
                }
               jPanel_resultat.remove(1);
               FormresultInput k = new FormresultInput(recherche("%"+kt),width(),height(),"ok");
               System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
               jPanel_resultat.add(k, BorderLayout.CENTER,1);
               jPanel_resultat.repaint();
               jPanel_resultat.setVisible(true);
               this.revalidate();
            
            }
            else{
              jPanel_resultat.remove(1);
               FormresultInput k = new FormresultInput(recherche(jTextField_zone_put.getText()),width(),height(),"ok");
               System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
               jPanel_resultat.add(k, BorderLayout.CENTER,1);
               jPanel_resultat.repaint();
               jPanel_resultat.setVisible(true);
               this.revalidate();
            } 
                Calendar cal = Calendar.getInstance();
                System.out.printf("\n Heure et Date fin scan: %tc \n\n", cal);
                 JOptionPane.showMessageDialog(null,"Heure et Date du commencement de scan: \n"+cal0.getTime()+"\nHeure et Date fin de scan: \n"+cal.getTime(),"Scanne",JOptionPane.INFORMATION_MESSAGE);
                
            
            }
}

    public int width(){
        return jPanel_resultat.getWidth();
    }
    public int height(){
        return jPanel_resultat.getHeight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_header = new javax.swing.JPanel();
        jPanel_Recherche = new javax.swing.JPanel();
        jPanel_chercher = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_zone_put = new javax.swing.JTextField();
        jLabel_chercher = new javax.swing.JLabel();
        jPanel_chercher_option = new javax.swing.JPanel();
        jLabel_chercher_option = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Body = new javax.swing.JPanel();
        jPanel_header_body = new javax.swing.JPanel();
        jPanel_Titres = new javax.swing.JPanel();
        jLabel_Nom = new javax.swing.JLabel();
        jLabel_Taille = new javax.swing.JLabel();
        jLabel_Chemin = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_Type = new javax.swing.JLabel();
        jLabel_Selectionner = new javax.swing.JLabel();
        jPanel_resultat = new javax.swing.JPanel();
        option_panel = new javax.swing.JPanel();
        Mylist = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(844, 2147483647));
        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(844, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel_header.setLayout(new java.awt.BorderLayout());

        jPanel_Recherche.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Recherche.setLayout(new java.awt.BorderLayout());

        jPanel_chercher.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_chercher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_chercher.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 30, 30));

        jTextField_zone_put.setText("aaa*");
        jTextField_zone_put.setOpaque(true);
        jTextField_zone_put.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_zone_putKeyPressed(evt);
            }
        });
        jPanel_chercher.add(jTextField_zone_put, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 7, 230, 33));

        jLabel_chercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/recherche.png"))); // NOI18N
        jPanel_chercher.add(jLabel_chercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel_Recherche.add(jPanel_chercher, java.awt.BorderLayout.WEST);

        jPanel_chercher_option.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_chercher_option.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_chercher_option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/recherche_avancer.png"))); // NOI18N
        jLabel_chercher_option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_chercher_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_chercher_optionMouseClicked(evt);
            }
        });
        jPanel_chercher_option.add(jLabel_chercher_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel_Recherche.add(jPanel_chercher_option, java.awt.BorderLayout.LINE_END);
        jPanel_Recherche.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        jPanel_header.add(jPanel_Recherche, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel_header, java.awt.BorderLayout.PAGE_START);

        jPanel_Body.setLayout(new java.awt.BorderLayout());

        jPanel_header_body.setLayout(new java.awt.BorderLayout());

        jPanel_Titres.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Titres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Nom.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 3, 190, 25));

        jLabel_Taille.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Taille.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Taille, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 3, 50, 25));

        jLabel_Chemin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Chemin.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Chemin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3, 295, 25));

        jLabel_Date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Date.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 3, 75, 25));

        jLabel_Type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Type.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 3, 50, 25));

        jLabel_Selectionner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/Selectionner.png"))); // NOI18N
        jPanel_Titres.add(jLabel_Selectionner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 3, 60, 25));

        jPanel_header_body.add(jPanel_Titres, java.awt.BorderLayout.CENTER);

        jPanel_Body.add(jPanel_header_body, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel_Body, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel_resultat.setLayout(new java.awt.BorderLayout());

        option_panel.setBackground(new java.awt.Color(255, 255, 255));
        option_panel.setLayout(new java.awt.BorderLayout());
        jPanel_resultat.add(option_panel, java.awt.BorderLayout.EAST);
        jPanel_resultat.add(Mylist, java.awt.BorderLayout.CENTER);

        add(jPanel_resultat, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
  
    public void zone_putKeyPressed(java.awt.event.KeyEvent evt) {                                               
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {  
               System.out.println("vous avez tapé: "+str);
               
               
                try {
                        
                        addlistpan(str);
                    
                        
                    } 

                catch (IOException | ClassNotFoundException | InterruptedException ex) {
                    Logger.getLogger(Panel_Etat.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
    }
    
    private void jTextField_zone_putKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_zone_putKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {  
               System.out.println("vous avez tapé: "+jTextField_zone_put.getText());
               
               
                try {
                        cal0 = Calendar.getInstance();
                        addlistpan();
                        
                    
                        
                    } 

                catch (IOException | ClassNotFoundException | InterruptedException ex) {
                    Logger.getLogger(Panel_Etat.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
    }//GEN-LAST:event_jTextField_zone_putKeyPressed

    public void option_recherche(){
        
        op.option(option_panel);
        option_panel.setVisible(false);
        
    }
    
    int show=0;
    private void jLabel_chercher_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_chercher_optionMouseClicked
        System.out.println("\n Avant if show = "+show+"\n");
        if(show%2==0){
        op.option(option_panel);
        option_panel.setVisible(true);
        //jScrollPane1.setVisible(true);
        System.out.println("\n ///// Afficher ///// \n");
        show++;
        }
        else {option_panel.setVisible(false);
               // jScrollPane1.setVisible(false);
            System.out.println("\n ///// cacher ///// \n");
            show++;
        }
    }//GEN-LAST:event_jLabel_chercher_optionMouseClicked

    

    // la méthode de recherche() retourne le résultat sous forme LinkedList
    public LinkedList recherche(String s) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        
        Recherche rech = new Recherche(new JLabel());
        LinkedList l = new LinkedList();
          
        l=rech.searchHalfWord(s);
        /* int index=0;
        for (Object l1 : l) {
            Fileapp f = (Fileapp) l1;
            System.out.println("Nom: ******** "+f.getName()+"%%%%%%% "+index);
            System.out.println("Taille: ******** "+f.getTaille());
            System.out.println("Chemin: ******** "+f.getPath());
            System.out.println("Date: ******** "+"Date");
            System.out.println("Type: ******** "+f.getType());
            index++;
        } */   
         System.out.println("La taille de la list  ******** "+ l.size());
        return l;
    }
    
    public String information(){
        
        java.lang.String s = jTextField_zone_put.getText();
        //System.out.println("Information ===> vous cherchez "+s);
        return s;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Chemin;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Nom;
    private javax.swing.JLabel jLabel_Selectionner;
    private javax.swing.JLabel jLabel_Taille;
    private javax.swing.JLabel jLabel_Type;
    private javax.swing.JLabel jLabel_chercher;
    private javax.swing.JLabel jLabel_chercher_option;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Body;
    private javax.swing.JPanel jPanel_Recherche;
    private javax.swing.JPanel jPanel_Titres;
    private javax.swing.JPanel jPanel_chercher;
    private javax.swing.JPanel jPanel_chercher_option;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JPanel jPanel_header_body;
    private javax.swing.JPanel jPanel_resultat;
    private javax.swing.JSeparator jSeparator1;
    public volatile javax.swing.JTextField jTextField_zone_put;
    private javax.swing.JPanel option_panel;
    // End of variables declaration//GEN-END:variables
}
