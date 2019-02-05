/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Oriente_Objet;

import java.awt.Color;
import java.awt.FlowLayout;
import static java.time.Clock.system;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class p2 extends javax.swing.JPanel {
 
    public JPanel p2(JPanel p){
        JButton b1 = new JButton("Valider");
        JButton b2 = new JButton("Annuler");
        //JPanel p3 = new JPanel();
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(b1);
                this.add(b2);
                p.add("South", this);
                this.setBackground(Color.blue);
                System.out.println("classe p2");
                return p;
    
    }
    
}
