/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Oriente_Objet;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author salaheddine
 */
public class Code extends javax.swing.JFrame{
    
    
    
    void exp04() {
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("Nom : ");
		JTextField t1 = new JTextField(20);
		
		//JButton b1 = new JButton("Valider");
		//JButton b2 = new JButton("Annuler");
		
		p.setLayout(new BorderLayout());

		p.add(l1);
		p.add("North", t1);
		
		p2 d = new p2();
                d.p2(p).revalidate();
		
		
		setContentPane(p);
		this.repaint();
		setBounds(0, 0, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
    public static void main(String arg[]){
    
        Code Frame = new Code();
        Frame.exp04();
    
    }
    
}
