/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import Local.Fileapp;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class Clerrc extends javax.swing.JPanel {

    /**
     * Creates new form Clerrc
     */
    public Clerrc() throws InterruptedException {
        initComponents();
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

 public static void main(String[] args) throws InterruptedException
     {
         
        LinkedList n =new LinkedList();
        Fileapp p = new Fileapp("test","test","test","tp","pl",500);
        n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);n.add(p);
        n.add(p);
        n.add(p);
        
         JFrame jf = new JFrame("TestZebra");
         
         jf.setSize(500, 500);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         FormresultInput k = new FormresultInput(n,jf.getWidth(),jf.getHeight(),"ok");
          jf.getContentPane().add(k);
          jf.setVisible(true);
     }


}
