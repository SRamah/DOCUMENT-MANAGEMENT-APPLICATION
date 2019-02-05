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
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProgressBarTest {

    public static void main(String[] args) {
        new ProgressBarTest();
    }

    public ProgressBarTest() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {            
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridBagLayout());
                JProgressBar pb = new JProgressBar();
                pb.setSize(90, 15);
                pb.setValue(0);
                pb.setStringPainted(true);
                pb.setString("Look ma, no hands");
                frame.add(pb);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                SwingWorker worker = new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        for (int index = 0; index < 1000; index++) {
                            int progress = (int)Math.round((index / 1000f) * 100);
                            setProgress(progress);
                            Thread.sleep(10);
                        }
                        return null;
                    }
                };

                worker.addPropertyChangeListener(new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {
                        if ("progress".equals(evt.getPropertyName())) {
                            int value = (int) evt.getNewValue();
                            System.out.println(value);
                            pb.setValue(value);
                        }
                    }
                });

                worker.execute();

            }
        });
    }

}