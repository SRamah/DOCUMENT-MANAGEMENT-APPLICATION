package ServiceApp;

import javax.swing.JPanel;


public class Panel1 extends javax.swing.JPanel {

   
    public JPanel Panel1(JPanel p) {
        
        initComponents();
        p.add("Center", this);
        
        return p;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_UserCount = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(844, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_UserCount.setBackground(new java.awt.Color(255, 102, 102));
        Jpanel_UserCount.setPreferredSize(new java.awt.Dimension(901, 536));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Information sur les Bibliothèques :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Compte");

        javax.swing.GroupLayout Jpanel_UserCountLayout = new javax.swing.GroupLayout(Jpanel_UserCount);
        Jpanel_UserCount.setLayout(Jpanel_UserCountLayout);
        Jpanel_UserCountLayout.setHorizontalGroup(
            Jpanel_UserCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_UserCountLayout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addGroup(Jpanel_UserCountLayout.createSequentialGroup()
                .addGroup(Jpanel_UserCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel_UserCountLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jButton1))
                    .addGroup(Jpanel_UserCountLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jpanel_UserCountLayout.setVerticalGroup(
            Jpanel_UserCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_UserCountLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        add(Jpanel_UserCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 536));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel_UserCount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
