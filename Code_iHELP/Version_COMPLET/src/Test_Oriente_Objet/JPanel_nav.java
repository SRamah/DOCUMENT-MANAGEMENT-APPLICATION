
package Test_Oriente_Objet;

import javax.swing.JPanel;


public class JPanel_nav extends javax.swing.JPanel {

    
   public JPanel JPanel_nav(JPanel p){
        
        initComponents();
        //p.add(this);
        p.add("Center", this);
        return p;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_body1 = new javax.swing.JButton();
        jButton_body2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton_body1.setText("body1");
        jButton_body1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_body1ActionPerformed(evt);
            }
        });

        jButton_body2.setText("body2");
        jButton_body2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_body2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Go to :");

        jLabel2.setText("Go to :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton_body1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton_body2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton_body1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton_body2)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_body1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_body1ActionPerformed
        Jframe FB= new Jframe();
        FB.vvv(true);
        FB.body1();
    }//GEN-LAST:event_jButton_body1ActionPerformed

    private void jButton_body2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_body2ActionPerformed
        Jframe FB= new Jframe();
        FB.vvv(false);
        FB.body2();
    }//GEN-LAST:event_jButton_body2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_body1;
    private javax.swing.JButton jButton_body2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
