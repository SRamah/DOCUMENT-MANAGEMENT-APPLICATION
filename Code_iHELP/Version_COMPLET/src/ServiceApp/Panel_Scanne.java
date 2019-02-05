
package ServiceApp;

import Local.Scan;
import Package_Search.DisplayTrayIcon;
import java.awt.TrayIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class Panel_Scanne extends javax.swing.JPanel {

    
    public JPanel Panel_Scanne(JPanel p) {
        initComponents();
        p.add("Center", this);
        
        return p;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        north = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        north.setBackground(new java.awt.Color(255, 255, 255));
        north.setLayout(new java.awt.BorderLayout());

        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(844, 100));
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(844, 100));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_1.png"))); // NOI18N
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 365, 87));

        jPanel4.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 19, 92, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_demarrer.png"))); // NOI18N
        jPanel16.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 12, 110, 38));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_parametres.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel4.add(jPanel16, java.awt.BorderLayout.EAST);

        jPanel6.add(jPanel4, java.awt.BorderLayout.CENTER);

        north.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(844, 100));
        jPanel7.setLayout(new java.awt.BorderLayout());

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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel9.setMinimumSize(new java.awt.Dimension(844, 100));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 19, 92, 25));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_demarrer.png"))); // NOI18N
        jPanel17.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 12, 110, 38));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_parametres.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel7.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanel14, java.awt.BorderLayout.WEST);

        north.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel11.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel11.setPreferredSize(new java.awt.Dimension(844, 100));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel12.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.SOUTH);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel13.setMinimumSize(new java.awt.Dimension(844, 100));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel15, java.awt.BorderLayout.WEST);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 19, 92, 25));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_demarrer.png"))); // NOI18N
        jPanel18.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 12, 110, 38));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/Scanne_parametres.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel11.add(jPanel18, java.awt.BorderLayout.EAST);

        north.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(north, java.awt.BorderLayout.NORTH);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Scan scanne = new Scan();
        try {
            DisplayTrayIcon.trayIcon.displayMessage("Démarrage de scan", "Le Scan est déclenché", TrayIcon.MessageType.INFO);
            scanne.scanPath(System.getProperty("user.home"), new JLabel());
            scanne.save();
            DisplayTrayIcon.trayIcon.displayMessage("Fin de scanne", "Le Scanne est terminé", TrayIcon.MessageType.INFO);
        } catch (IOException | InterruptedException ex) {
             DisplayTrayIcon.trayIcon.displayMessage("Scanne erroné", "Le Scanne n'est pas déclencher", TrayIcon.MessageType.WARNING);
            Logger.getLogger(Panel_Scanne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Scan scanne = new Scan();
        try {
            DisplayTrayIcon.trayIcon.displayMessage("Démarrage de scanne", "Le Scanne est déclenché", TrayIcon.MessageType.INFO);
            scanne.scanPath("/Volumes/", new JLabel());
            scanne.save();
            DisplayTrayIcon.trayIcon.displayMessage("Fin de scanne", "Le Scanne est terminé", TrayIcon.MessageType.INFO);
            
        } catch (IOException | InterruptedException ex) {
             DisplayTrayIcon.trayIcon.displayMessage("Scanne erroné", "Le Scanne n'est pas déclencher", TrayIcon.MessageType.WARNING);
            Logger.getLogger(Panel_Scanne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        ScanPersonnel scanpers = new ScanPersonnel();
        scanpers.setVisible(true);
       
    }//GEN-LAST:event_jLabel13MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel north;
    // End of variables declaration//GEN-END:variables
}
