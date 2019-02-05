/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import Local.Scan;
import Package_Search.DisplayTrayIcon;
import java.awt.TrayIcon;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author salaheddine
 */
public class ScanPersonnel extends javax.swing.JFrame {

   
    
    public ScanPersonnel() {
        initComponents();
        //setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 5, 5));
        this.revalidate();
        this.repaint();
    }

    public String getpath(){
        String str = this.scanPersonelPath.getText();
        return str;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ok = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        scanPersonelPath = new javax.swing.JTextField();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 142, 30, 30));

        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 141, 30, 30));

        scanPersonelPath.setBorder(null);
        scanPersonelPath.setOpaque(true);
        scanPersonelPath.setSelectionColor(new java.awt.Color(255, 255, 255));
        scanPersonelPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanPersonelPathActionPerformed(evt);
            }
        });
        jPanel1.add(scanPersonelPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 93, 260, 20));

        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/logo.png"))); // NOI18N
        jPanel1.add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 100, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/hhh.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scanPersonelPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanPersonelPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scanPersonelPathActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        
       System.out.println(getpath());
           Scan scanne = new Scan();
        try {
            DisplayTrayIcon.trayIcon.displayMessage("Démarrage de scanne", "Le Scanne est déclenché", TrayIcon.MessageType.INFO);
            scanne.scanPath(getpath(), new JLabel());
            scanne.save();
            DisplayTrayIcon.trayIcon.displayMessage("Fin de scanne", "Le Scanne est terminé", TrayIcon.MessageType.INFO);
            
            dispose();
        } catch (IOException | InterruptedException ex) {
            DisplayTrayIcon.trayIcon.displayMessage("Erreur de scanne", "Vérifier le chemin de Scanne!!", TrayIcon.MessageType.WARNING);
            Logger.getLogger(ScanPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(ScanPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScanPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScanPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScanPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScanPersonnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ok;
    private javax.swing.JTextField scanPersonelPath;
    // End of variables declaration//GEN-END:variables
}
