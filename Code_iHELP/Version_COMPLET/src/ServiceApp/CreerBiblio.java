/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import Local.Biblioapp;
import Local.Scan;
import Package_Search.DisplayTrayIcon;
import java.awt.BorderLayout;
import java.awt.TrayIcon;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class CreerBiblio extends javax.swing.JFrame {

   
    
    public CreerBiblio() {
        initComponents();
        //setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 5, 5));
        this.revalidate();
        this.repaint();
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
    
    public JPanel ajouter(JPanel panel){
        System.out.println("créer  "+getNom()+" | "+getGenre()+" | "+getSecurite());
    Panel_Biblio pb = new Panel_Biblio();
        Biblioapp biblio = new Biblioapp(getNom(),getGenre(),getSecurite());
        pb.n.add(biblio);
        FormresultInput k = null;
        try {
            //pb.list_biblio.removeAll();
            k = new FormresultInput(pb.n,849,327);
            System.out.println("\n ******** Le resultat doit s'afficher ******* \n");
            panel.add(k,BorderLayout.CENTER);
            panel.repaint();
            panel.setVisible(true);
            pb.revalidate();
               return panel;
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel_Biblio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return panel;
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom_biblio = new javax.swing.JTextField();
        Ajouter_biblio = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        genre_biblio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        securite_biblio = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom de la bibliothèque :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        nom_biblio.setOpaque(true);
        nom_biblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_biblioActionPerformed(evt);
            }
        });
        jPanel1.add(nom_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 289, -1));

        Ajouter_biblio.setText("Ajouter");
        Ajouter_biblio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ajouter_biblioMouseClicked(evt);
            }
        });
        Ajouter_biblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_biblioActionPerformed(evt);
            }
        });
        jPanel1.add(Ajouter_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel2.setText("Genre de la bibliothèque :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        genre_biblio.setOpaque(true);
        genre_biblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre_biblioActionPerformed(evt);
            }
        });
        jPanel1.add(genre_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 289, -1));

        jLabel3.setText("Securité de la bibliothèque :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        securite_biblio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRIVATE", "PUBLIC" }));
        jPanel1.add(securite_biblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_biblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_biblioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_biblioActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
     
        this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void Ajouter_biblioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ajouter_biblioMouseClicked
      
      // ajouter();
    }//GEN-LAST:event_Ajouter_biblioMouseClicked

    private void genre_biblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre_biblioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre_biblioActionPerformed

    private void Ajouter_biblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_biblioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ajouter_biblioActionPerformed

    
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreerBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerBiblio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter_biblio;
    private javax.swing.JTextField genre_biblio;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_biblio;
    private javax.swing.JComboBox securite_biblio;
    // End of variables declaration//GEN-END:variables
}
