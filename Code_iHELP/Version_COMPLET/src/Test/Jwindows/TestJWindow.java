/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Jwindows;

/**
 *
 * @author salaheddine
 */
import Test_Oriente_Objet.Jpanel_body1;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class TestJWindow extends javax.swing.JFrame{
    
    	public void body1(){
            
            JWindow window = new JWindow();
				window.setSize(742, 102);
                                window.setLocationRelativeTo(this);
                                window.setBackground(Color.yellow);
                                
                                
       JPanel zone = new JPanel();
       zone.setOpaque(false);
        //zone_to_add_jPanel_nav.setBackground(new java.awt.Color(153, 153, 153));
        
        zone.setLayout(new BorderLayout());
        
        /////***** Creation d'un Objet addnav du classe JPanel_nav ******//////
        Wintest addnav = new Wintest();
        addnav.setOpaque(false);
        /////***** Appel au Constricteur Surcharger de la classe JPanal_nav et le REVALIDER *****//////
        addnav.Wintest(zone).revalidate();
        
        /////***** Fixé la taille du Zone où le nouveau JPanel (zone_to_add_jPanel_nav) dans JFrame *****//////
        window.setContentPane(zone);
	/////***** Refaire le dessin de la JFrame ******//////
        window.repaint();
        /////***** Afficher la JFrame ******//////
        window.setVisible(true);
        //zone_to_add_jPanel_body.setVisible(vis);
    
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JWindow
				//On lui donne une taille pour qu'on puisse la voir

                                TestJWindow win = new TestJWindow();
                                win.body1();
                                
                                //On la rend visible
			}
		});
 
		try { 
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
 
		System.exit(0);
	}
}