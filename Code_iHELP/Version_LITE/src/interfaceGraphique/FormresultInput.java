package interfaceGraphique;

import java.awt.Color;
import java.util.LinkedList;

import Local.Fileapp;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class FormresultInput extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FormresultInput(LinkedList<Fileapp> p , SmallLock panel1) throws InterruptedException {
		// n == Number of Results
		int n =p.size()*36;
		setLayout(null);
		Color backJp = new Color(0xf6f6f6);
		this.setBackground(backJp);
		JLabel label = new JLabel();
		label.setBounds(256, 6, 4, 288);
		add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 250, 288);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(262, 6, 332, 288);
		add(panel_1,"Center");
		this.setSize(600, n);
		for(int i = 0 ; i<p.size();i++){
			Fileapp file = p.get(i);
			formResult pane = new formResult(file,panel1);
			pane.OldColor();
			panel.add(pane);
			//
			panel.setSize(600, n);
		}

	}
	public FormresultInput(LinkedList<Fileapp> p ) throws InterruptedException {
		// n == Number of Results
		int n =p.size()*36;
		setLayout(null);
		Color backJp = new Color(0xf6f6f6);
		this.setBackground(backJp);
		JLabel label = new JLabel();
		label.setBounds(256, 6, 4, 288);
		add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 250, 288);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(262, 6, 332, 288);
		add(panel_1,"Center");
		this.setSize(600, n);
		for(int i = 0 ; i<p.size();i++){
			Fileapp file = p.get(i);
			formResult pane = new formResult(file);
			pane.OldColor();
			panel.add(pane);
			//
			panel.setSize(600, n);
		}

	}
	 protected void paintComponent1() {
	       this.removeAll();
	       this.revalidate();
	       //this.repaint();
	       
	    }
}
