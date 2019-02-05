
package ServiceApp;

import Local.Biblioapp;
import Local.Fileapp;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class Panel_Biblio extends javax.swing.JPanel {

    
    public JPanel Panel_Biblio(JPanel p) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        initComponents();
        addlistpan();
        p.add("Center", this);
        
        return p;
    }
    
    LinkedList n =new LinkedList();
    public void addlistpan() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        JPanel pan = new JPanel();
        
        Biblioapp info = new Biblioapp("Programation","Informatiques","PRIVATE","path","size");
        n.add(info);
        Biblioapp math = new Biblioapp("Cours","Mathématiques","PUBLIC","path","size");
        n.add(math);
        Biblioapp phy = new Biblioapp("Travaux Pratique","Physiques","PUBLIC","path","size");
        n.add(phy);
        
        
        if(false) 
            {
                System.out.println("\n ******** Le champ est vide ******* \n");
            } 
        else { 
              //list_biblio.remove(1);
               FormresultInput k = new FormresultInput(n,width(),heigth());
               System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
               list_biblio.add(k, BorderLayout.CENTER);
               list_biblio.repaint();
               list_biblio.setVisible(true);
               this.revalidate();
               
               
            
            }
}
public int width(){
    System.out.println("width  "+list_biblio.getWidth());
        return list_biblio.getWidth();
    }
public int heigth(){
    System.out.println("heigth  "+list_biblio.getHeight());
        return list_biblio.getHeight();
    }

 public String getNom(){
        String str = this.nom_biblio.getText();
        return str;
    }
    public String getGenre(){
        String str = this.genre_biblio.getText();
        return str;
    }
    public String getSecurite(){
        String str = (String) this.securite_biblio.getSelectedItem();
        return str;
    }
    

 private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {                                               
     
     try {
            FormresultInput k = new FormresultInput(n,width(),heigth());
            System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
            list_biblio.removeAll();
            list_biblio.add(k, BorderLayout.CENTER);
            list_biblio.repaint();
            list_biblio.setVisible(true);
            this.revalidate();   
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel_Biblio.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel111.setVisible(false);
     
    }                                              

    private void Ajouter_biblioMouseClicked(java.awt.event.MouseEvent evt) {                                            
      if(!"".equals(getNom()) && !"".equals(getGenre()))  {
      Biblioapp phy = new Biblioapp(getNom(),getGenre(),getSecurite());
        n.add(phy);
        
        try {
            FormresultInput k = new FormresultInput(n,width(),heigth());
            System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
            list_biblio.removeAll();
            list_biblio.add(k, BorderLayout.CENTER);
            list_biblio.repaint();
            list_biblio.setVisible(true);
            this.revalidate();   
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel_Biblio.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel111.setVisible(false);
        jPanel111.removeAll();
        }
    }         

public void ajouter(boolean bbb){

jPanel111 = new javax.swing.JPanel();
jPanel111.removeAll();
        jLabel111 = new javax.swing.JLabel();
        nom_biblio = new javax.swing.JTextField();
        Ajouter_biblio = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        genre_biblio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        securite_biblio = new javax.swing.JComboBox();

       
        jPanel111.setBackground(new java.awt.Color(240, 240, 240));
        jPanel111.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setText("Nom de la bibliothèque :");
        jPanel111.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        nom_biblio.setOpaque(true);
        
        jPanel111.add(nom_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 289, -1));

        Ajouter_biblio.setText("Ajouter");
        Ajouter_biblio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajouter_biblioMouseClicked(evt);
            }
        });
        
        jPanel111.add(Ajouter_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        jPanel111.add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel2.setText("Genre de la bibliothèque :");
        jPanel111.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        genre_biblio.setOpaque(true);
        
        jPanel111.add(genre_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 289, -1));

        jLabel3.setText("Securité de la bibliothèque :");
        jPanel111.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        securite_biblio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIVATE", "PUBLIC" }));
        jPanel111.add(securite_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));
 
      jPanel111.setVisible(bbb);
      add(jPanel111);
      this.revalidate();
     

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        list_biblio = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel_supprimer = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel_Creer = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(844, 32767));
        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(844, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(844, 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(844, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel1.setBackground(new java.awt.Color(244, 245, 247));
        jPanel1.setMaximumSize(new java.awt.Dimension(844, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setMaximumSize(new java.awt.Dimension(32767, 8));
        jSeparator1.setMinimumSize(new java.awt.Dimension(844, 8));
        jSeparator1.setPreferredSize(new java.awt.Dimension(844, 8));
        jPanel1.add(jSeparator1, java.awt.BorderLayout.SOUTH);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Biblio.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(844, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(844, 30));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel5.setMinimumSize(new java.awt.Dimension(844, 1));
        jPanel5.setPreferredSize(new java.awt.Dimension(844, 1));

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
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 40));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 40));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(250, 250, 252));
        jPanel10.setPreferredSize(new java.awt.Dimension(410, 30));

        jCheckBox1.setBackground(new java.awt.Color(250, 250, 252));

        jLabel5.setFont(new java.awt.Font("Gill Sans", 0, 13)); // NOI18N
        jLabel5.setText("NOM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel11.setBackground(new java.awt.Color(250, 250, 252));
        jPanel11.setPreferredSize(new java.awt.Dimension(74, 30));

        jLabel6.setText("GENRE");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(250, 250, 252));
        jPanel12.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel7.setText("SECURITE");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel12, java.awt.BorderLayout.EAST);

        jPanel6.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel3.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(844, 100));
        jPanel7.setLayout(new java.awt.BorderLayout());

        list_biblio.setBackground(new java.awt.Color(255, 255, 255));
        list_biblio.setMaximumSize(new java.awt.Dimension(32767, 327));
        list_biblio.setMinimumSize(new java.awt.Dimension(844, 327));
        list_biblio.setLayout(new java.awt.BorderLayout());
        jPanel7.add(list_biblio, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel8.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel13.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13, java.awt.BorderLayout.NORTH);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel14.setMaximumSize(new java.awt.Dimension(32767, 70));
        jPanel14.setMinimumSize(new java.awt.Dimension(844, 70));
        jPanel14.setPreferredSize(new java.awt.Dimension(844, 70));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(244, 245, 247));
        jPanel15.setMaximumSize(new java.awt.Dimension(32767, 70));
        jPanel15.setMinimumSize(new java.awt.Dimension(844, 70));
        jPanel15.setPreferredSize(new java.awt.Dimension(844, 70));

        jPanel16.setBackground(new java.awt.Color(244, 245, 247));

        jLabel_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Biblio_remove0.png"))); // NOI18N
        jLabel_supprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(jLabel_supprimer)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_supprimer)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(244, 245, 247));

        jLabel_Creer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Biblio_ceer0.png"))); // NOI18N
        jLabel_Creer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Creer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CreerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Creer)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Creer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel17.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel17, java.awt.BorderLayout.NORTH);

        jPanel3.add(jPanel14, java.awt.BorderLayout.SOUTH);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CreerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CreerMouseClicked
        list_biblio.removeAll();
        ajouter(true);
        
       
    }//GEN-LAST:event_jLabel_CreerMouseClicked

private javax.swing.JButton Ajouter_biblio;
    private javax.swing.JTextField genre_biblio;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JTextField nom_biblio;
    private javax.swing.JComboBox securite_biblio;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Creer;
    private javax.swing.JLabel jLabel_supprimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    javax.swing.JPanel list_biblio;
    // End of variables declaration//GEN-END:variables
}
