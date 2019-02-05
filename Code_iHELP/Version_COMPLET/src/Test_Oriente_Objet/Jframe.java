package Test_Oriente_Objet;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Jframe extends javax.swing.JFrame {

    boolean vis;
    
    public Jframe() {
        initComponents();
        nav();
        body1();
    }
    
    public void vvv(boolean b){
        vis=b;
    }
    
    public void nav(){
        
       JPanel zone_to_add_jPanel_nav = new JPanel();
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
        
        zone_to_add_jPanel_nav.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        JPanel_nav addnav = new JPanel_nav();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.JPanel_nav(zone_to_add_jPanel_nav).revalidate();
        
        //setContentPane(zone_to_add_jPanel_nav);
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add(zone_to_add_jPanel_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 100, 300));
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        setVisible(true);
    
    }
    
    public void body1(){
        
       JPanel zone_to_add_jPanel_body = new JPanel();
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
        
        zone_to_add_jPanel_body.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Jpanel_body1 addnav = new Jpanel_body1();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Jpanel_body1(zone_to_add_jPanel_body).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add(zone_to_add_jPanel_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 350, 280));
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        //setVisible(vis);
        zone_to_add_jPanel_body.setVisible(vis);
    
    }
    
    public void body2(){
        
       JPanel zone_to_add_jPanel_body = new JPanel();
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
        
        zone_to_add_jPanel_body.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Jpanel_body2 addnav = new Jpanel_body2();
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Jpanel_body2(zone_to_add_jPanel_body).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        getContentPane().add(zone_to_add_jPanel_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 350, 280));
	/////***** Refaire le dessin de la JFrame ******//////
        this.repaint();
        /////***** Afficher la JFrame ******//////
        //setVisible(!vis);
        zone_to_add_jPanel_body.setVisible(!vis);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
