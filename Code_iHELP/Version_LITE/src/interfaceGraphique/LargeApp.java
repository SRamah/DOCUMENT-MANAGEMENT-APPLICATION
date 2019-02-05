package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LargeApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LargeApp frame = new LargeApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LargeApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(600,600);
		setSize1(600,600);
		this.setUndecorated(true);
		setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 5, 5));
	}
	
	public void setSize1(int x , int y){
		super.setSize(x, y);
		setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 5, 5));
		repaint();
		revalidate();
		
		
	}

}
