/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import Local.Biblioapp;
import java.awt.Color;
import java.util.LinkedList;

import Local.Fileapp;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class FormresultInput extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FormresultInput(LinkedList<Fileapp> p , int width , int height ,String note) throws InterruptedException {
		// n == Number of Results
		int n =p.size()*36;
		setLayout(null);
		Color backJp = new Color(0xf6f6f6);
		this.setBackground(backJp);
                
		JPanel panel = new JPanel();
		//panel.setBounds(6, 6, 250, 288);
		//add(panel);
                
                JScrollPane scrollPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                
                //scrollPane.getViewport().setMinimumSize(new Dimension(160, 200));
                //scrollPane.getViewport().setPreferredSize(new Dimension(160, 200));
                scrollPane.setBorder(null);
                scrollPane.setBounds(0, 0, width,height);
                System.out.println("width x height     =   "+width+"  x  "+height);
                
                
                //scrollPane.setMinimumSize(new java.awt.Dimension(0, width));
                //scrollPane.setPreferredSize(new java.awt.Dimension(width, 400));
                
                add(scrollPane);
                
                
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		for(int i = 0 ; i<p.size();i++){
			Fileapp file = p.get(i);
			formResult pane = new formResult(file,i,width);
			pane.OldColor(i);
			
			panel.add(pane);
			//
			
		}
                
                //panel.setSize(width, n);

	}
        public void setW(int w){
            this.setW(w);
        }

        
        
        
        public FormresultInput(LinkedList<Biblioapp> p , int w ,int h) throws InterruptedException {
		// n == Number of Results
		int n =p.size()*40;
		setLayout(new BorderLayout());
		Color backJp = new Color(0xf6f6f6);
		this.setBackground(Color.white);
                
		JPanel panel = new JPanel();
                panel.setBackground(Color.white);
                panel.setMinimumSize(new java.awt.Dimension(w, n));
		//panel.setBounds(6, 6, 250, 288);
		//add(panel);
                
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBorder(null);
                
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setViewportView(panel);
                //scrollPane.setBounds(0, 0, width,n);
                
                scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                //scrollPane.setMinimumSize(new java.awt.Dimension(840, 320));
                //scrollPane.setMaximumSize(new java.awt.Dimension(840, 320));
                scrollPane.setPreferredSize(new java.awt.Dimension(w,h));//[844, 327]
                
                add("Center",scrollPane);
                
                
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		for(int i = 0 ; i<p.size();i++){
			Biblioapp file = p.get(i);
			formResult pane = new formResult(file,i);
			pane.OldColor(i);
			
			panel.add(pane);
			//
			
		}
                //panel.setSize(width, n-10);
                panel.setSize(w, n);

	}
   
}
