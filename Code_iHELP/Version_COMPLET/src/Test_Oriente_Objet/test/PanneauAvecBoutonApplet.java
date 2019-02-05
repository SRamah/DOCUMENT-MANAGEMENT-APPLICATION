/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Oriente_Objet.test;

/**
 *
 * @author salaheddine
 */
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

class PanneauAvecBouton extends JFrame {
    PanneauAvecBouton() {
	JButton bouton1 = new JButton("bouton1");
	JButton bouton2 = new JButton("bouton2");
	JLabel message = new JLabel("Bonjour");
	JPanel panneau = new JPanel();
	Box panneauBouton = Box.createVerticalBox();

	panneau.setPreferredSize(new Dimension(100, 0));
	panneau.setBackground(Color.BLUE);
	add(panneau, BorderLayout.CENTER);
	
	panneauBouton.add(bouton1);
	panneauBouton.add(Box.createVerticalStrut(20));
	panneauBouton.add(bouton2);
	panneauBouton.add(Box.createGlue());
	panneauBouton.add(message);
	panneauBouton.setBorder(BorderFactory.createLineBorder(Color.RED));
	add(panneauBouton,BorderLayout.EAST );

	setLocation(400, 400);
	pack(); 
	setVisible(true); 
    } 
}

public class PanneauAvecBoutonApplet extends JApplet { 
    public void init() {
	new PanneauAvecBouton();
    }
}
