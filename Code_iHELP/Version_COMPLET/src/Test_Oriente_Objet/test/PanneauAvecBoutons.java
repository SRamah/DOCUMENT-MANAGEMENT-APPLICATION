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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

public class PanneauAvecBoutons extends JFrame {
    
    Box panneauBouton = Box.createVerticalBox();
    public PanneauAvecBoutons() {
	
	while(i<10){
        add();
        
        }

        add(panneauBouton,BorderLayout.CENTER );


	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(200, 300);
	pack(); 
	setVisible(true); 
    }
    
    private void panneauMouseClicked(java.awt.event.MouseEvent MOUSE_PRESSED) {                                         
        
        System.out.println("le "+i+"éme panneau= ");
    }              
    
    
    int i=0;
    public void add(){
        JPanel panneau =new JPanel();
        JLabel message = new JLabel("Bonjour"+i);
        panneau.setPreferredSize(new Dimension(900,40 ));
        panneau.setMaximumSize(new Dimension(9000,40 ));
        panneau.setBackground(Color.white);
        panneau.add(message);
	panneauBouton.add(panneau, BorderLayout.CENTER);
	panneauBouton.add(Box.createVerticalStrut(5));
        panneauBouton.add(Box.createGlue());
        panneauBouton.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        i++;
        };
        
        
    }


class EssaiPanneauAvecBoutons { 
  public static void main(String[] arg) {
      new PanneauAvecBoutons();

    }
}