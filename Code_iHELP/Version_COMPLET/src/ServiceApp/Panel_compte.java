
package ServiceApp;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class Panel_compte extends javax.swing.JPanel {

    
    public JPanel Panel_compte(JPanel p) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        initComponents();
        AdreesEmail.setVisible(false);
        Password.setVisible(false);                            
         jPanel_indicator.setVisible(false);
         
        p.add("Center", this);
        
        return p;
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AdreesEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel_seconnecter = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel_password_oublié = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_indicator = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(844, 32767));
        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(844, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(844, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(844, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/compte.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel2.setMinimumSize(new java.awt.Dimension(844, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel6.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel8.setBackground(new java.awt.Color(240, 240, 240));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 1));
        jPanel9.setMinimumSize(new java.awt.Dimension(844, 1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel11.setBackground(new java.awt.Color(240, 240, 240));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(240, 240, 240));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/ceer.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 6, -1, 21));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Nauveau dans le compte iHelp ?");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 6, -1, -1));

        jPanel11.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel8.add(jPanel11, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(240, 240, 240));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/titre.png"))); // NOI18N
        jPanel4.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(240, 240, 240));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/email.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 35, 476, 44));

        AdreesEmail.setOpaque(true);
        AdreesEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdreesEmailFocusLost(evt);
            }
        });
        jPanel7.add(AdreesEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 39, 455, 35));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/password.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 107, 472, 43));

        Password.setOpaque(true);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        jPanel7.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 110, 455, 35));

        jLabel_seconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/seconnect.png"))); // NOI18N
        jLabel_seconnecter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_seconnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_seconnecterMouseClicked(evt);
            }
        });
        jPanel7.add(jLabel_seconnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 188, -1, -1));
        jPanel7.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 187, 30, 20));

        jLabel_password_oublié.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel_password_oublié, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 215, 120, 10));

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 207, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/ption.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 162, 163, 84));

        jPanel_indicator.setBackground(new java.awt.Color(240, 240, 240));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/indicator.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel_indicatorLayout = new javax.swing.GroupLayout(jPanel_indicator);
        jPanel_indicator.setLayout(jPanel_indicatorLayout);
        jPanel_indicatorLayout.setHorizontalGroup(
            jPanel_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_indicatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_indicatorLayout.setVerticalGroup(
            jPanel_indicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_indicatorLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanel_indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 40, 30));

        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
      
    private void jLabel_seconnecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_seconnecterMouseClicked
        jPanel_indicator.setVisible(true);
        jPanel_indicator.repaint();
        jPanel_indicator.revalidate();
    }//GEN-LAST:event_jLabel_seconnecterMouseClicked

    private void AdreesEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdreesEmailFocusLost
        if("".equals(AdreesEmail.getText())){
            jLabel3.setVisible(true);
        }
    }//GEN-LAST:event_AdreesEmailFocusLost

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Password.setVisible(true);
          jLabel4.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       AdreesEmail.setVisible(true);
         jLabel3.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        if("".equals(Password.getText())){
            jLabel4.setVisible(true);
        }
    }//GEN-LAST:event_PasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdreesEmail;
    private javax.swing.JTextField Password;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_password_oublié;
    private javax.swing.JLabel jLabel_seconnecter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_indicator;
    // End of variables declaration//GEN-END:variables
}
