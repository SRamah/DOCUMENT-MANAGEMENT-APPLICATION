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
import java.awt.*;
import javax.swing.*;

public class CustomComponent1 extends JFrame {

    private static final long serialVersionUID = 1L;

    public CustomComponent1() {
        setTitle("Custom Component Test / GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        setLayout(new GridLayout(10, 10, 10, 10));
        for (int row = 0; row < 100; row++) {
            add(new CustomComponents1());
        }
        //pack();
        // enforces the minimum size of both frame and component
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setVisible(true);
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                CustomComponent1 main = new CustomComponent1();
                main.display();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class CustomComponents1 extends JLabel {

    private static final long serialVersionUID = 1L;

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(20, 20);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(20, 20);
    }

    @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }
}
