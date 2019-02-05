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
import javax.swing.border.LineBorder;

public class TwoLabels extends JFrame{

    public TwoLabels(){
        Box box = Box.createVerticalBox();

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.setBorder(new LineBorder(Color.black));

        JLabel label1 = new JLabel("Hello");
        JLabel label2 = new JLabel("World");
        label1.setHorizontalAlignment(JLabel.LEADING);
        label2.setHorizontalAlignment(JLabel.TRAILING);
        panel.add(label1);
        panel.add(label2);

        box.add(new JPanel(){
            public Dimension getPreferredSize(){
                return new Dimension(300, 300);
            }
        });
        box.add(panel);

        add(box);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TwoLabels();

    }
}
