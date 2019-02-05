/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Oriente_Objet.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

/**
 *
 * @author salaheddine
 */
public class SO {

    public static void main(String[] args) {        
    //Components
          JFrame frame = new JFrame();
          JPanel panel = new JPanel();
          panel.setSize(frame.getSize());
          JTextArea text = new JTextArea();         
    //Add components
          panel.add(text);
          frame.add(panel);         
    //Layout add & setup  
          SpringLayout layout = new SpringLayout();
          panel.setLayout(layout);        
          layout.putConstraint(SpringLayout.WEST, text, 10, SpringLayout.WEST, panel);
          layout.putConstraint(SpringLayout.NORTH, text, 10, SpringLayout.NORTH, panel);
          layout.putConstraint(SpringLayout.EAST, text, -10, SpringLayout.EAST, panel);        
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLocationRelativeTo(null);
          frame.pack();
          frame.setVisible(true);        
    }
}
