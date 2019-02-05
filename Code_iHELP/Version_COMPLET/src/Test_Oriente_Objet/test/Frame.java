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
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame {
JPanel flipButton =new JPanel();
JPanel confidenceButtons =new JPanel();



    public Frame() throws HeadlessException {
    super();
    this.setLayout(new BorderLayout());
    JButton b1=new JButton("flip");
    b1.addActionListener(new FlipListener());
    flipButton.add(b1);

    JButton b2=new JButton("color");
    b2.addActionListener(new ColorListener());
    confidenceButtons.add(b2);
    this.getContentPane().add(flipButton,BorderLayout.SOUTH);
    this.setSize(250,250);
    this.pack();
    this.setVisible(true);

}
    private class FlipListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
          remove(flipButton); 
          add(confidenceButtons,BorderLayout.SOUTH);
          validate();
          repaint();

        }
      } 
      private class ColorListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

          remove(confidenceButtons); 
          add(flipButton,BorderLayout.SOUTH);
          validate();
          repaint();
        }
      }
    /**
     * @param args
     */
    public static void main(String[] args) {
        new Frame();

    }

}