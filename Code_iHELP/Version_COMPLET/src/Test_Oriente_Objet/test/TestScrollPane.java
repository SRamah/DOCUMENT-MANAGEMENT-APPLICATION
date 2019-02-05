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
import java.awt.event.*;
import javax.swing.*;

public class TestScrollPane extends JFrame {

    JScrollPane scrollPane;
    Box box;
    private static int panelCount = 0;

    public TestScrollPane() {
        setPreferredSize(new Dimension(200, 400));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(15);
        box = Box.createVerticalBox();
        scrollPane.getViewport().add(box);

        this.add(scrollPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Timer t = new Timer(500, new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                box.add(new TestPanel(), 0);
                scrollPane.validate();
            }
                        /*public void actionPerformed(ActionEvent ae) {
                           Point view = scrollPane.getViewport().getViewPosition();
                           TestPanel panel = new TestPanel();
                           box.add(panel, 0);
                           scrollPane.validate();
                           if (view.y != 0) {
                               view.y += panel.getHeight();
                               scrollPane.getViewport().setViewPosition(view);
                           }
                       }*/
        });
        t.setRepeats(true);
        t.start();
    }

    public class TestPanel extends JPanel {

        int myId = panelCount++;

        public TestPanel() {
            this.setLayout(new GridBagLayout());
            this.setBorder(BorderFactory.createBevelBorder(1));
            JLabel label = new JLabel("" + myId);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);

            this.setMaximumSize(new Dimension(730, 30));
            this.setPreferredSize(new Dimension(130, 30));

            this.add(label);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                TestScrollPane testScrollPane = new TestScrollPane();
            }
        });
    }
}
