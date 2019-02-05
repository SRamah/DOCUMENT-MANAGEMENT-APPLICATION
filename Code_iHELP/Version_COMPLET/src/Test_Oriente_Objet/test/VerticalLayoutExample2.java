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
import javax.swing.border.*;

public class VerticalLayoutExample2 {

    public static void main(String[] args) {
        new VerticalLayoutExample2();
    }

    public VerticalLayoutExample2() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                final TestPane pane = new TestPane();
                JButton add = new JButton("Add");
                add.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pane.addAnotherPane();
                    }
                });

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new JScrollPane(pane));
                frame.add(add, BorderLayout.SOUTH);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private JPanel filler;
        private int y = 0;

        public TestPane() {

            setBackground(Color.RED);
            setLayout(new GridBagLayout());
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBorder( new EmptyBorder(4, 4, 4, 4) );
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 400);
        }

        public void addAnotherPane() {
            SmallPanel panel = new SmallPanel();
            panel.setLayout( new GridBagLayout() );
            panel.add(new JLabel("Hello"));
            add(panel);
            add(Box.createVerticalStrut(4));

            revalidate();
            repaint();
        }
    }

    static class SmallPanel extends JPanel
    {
        @Override
        public Dimension getMaximumSize()
        {
            Dimension preferred = super.getPreferredSize();
            Dimension maximum = super.getMaximumSize();
            maximum.height = preferred.height;
            return maximum;
        }
    }
}
