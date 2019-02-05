/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import Local.Fileapp;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author salaheddine
 */
public class Panels extends JPanel{
    Box panneaux = Box.createVerticalBox();
    // un variable globale pour stocker les résultats de recherche sous forme LinkedList 
    private LinkedList Global;
    
    public JPanel Panels(JPanel p){
        while(i<10){
            add();
        }
        add(CENTER,panneaux);
        p.add(CENTER,this);
        return p;
    }
    
    /////////////////////////////////////////
    
    public void setGlobal(LinkedList ll){
        this.Global=ll;
    }
    
    public LinkedList getGlobal(){
        return this.Global;
    }
     
    /////////////////////////////////////////
    
    // Pour insérer les images qui représente le type de fichier (exemple de fichier PDF)
    public void img(JLabel i , JLabel t){
        if("pdf".equals(t.getText()) || "PDF".equals(t.getText()))
    i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/pdf.png")));
    }
    
    ////////////////////++++++++++++++++++++++++///////////////////////
    
    int i=0;
    public void add(){
        
        JPanel panel = new JPanel();
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        panel.setPreferredSize(new Dimension(900,40 ));
        panel.setMaximumSize(new Dimension(9000,40 ));
        
        
        
        
        Fileapp f = (Fileapp) Global.get(i);
       
        JLabel[] ourLabels = new JLabel[]{
           
           new JLabel(f.getName()),
           new JLabel(f.getTaille()),
           new JLabel(f.getPath()),
           new JLabel("Date"),
           new JLabel(f.getType()),
           new JLabel(), // image label
           new JLabel() // pour sélectionner le fichier qui sera stocké a une Bibliothèque de typt LinkedList
           };
        
        
        img(ourLabels[5],ourLabels[4]);
        panel.add(ourLabels[5],new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 37, 33));
        panel.add(ourLabels[0],new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 9, 190, 15));
        
        
        panel.add(ourLabels[1],new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 9, 75, 15));
        
        
        panel.add(ourLabels[2],new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 9, 270, 15));
        
        
        panel.add(ourLabels[3],new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 9, 95, 15));
        
        
        panel.add(ourLabels[4],new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 9, 60, 15));
        
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.gray);
                
            }
            @Override
           public void mouseExited(MouseEvent e){
                panel.setBackground(Color.white);
                
            }
        });
        ///////// une fonction pour sélectionner le fichier  /////////
        //   .......
        ///////// une fonction pour sélectionner le fichier  /////////
        
        
        
        
	panneaux.add(panel, BorderLayout.CENTER);
	panneaux.add(Box.createVerticalStrut(5));
        panneaux.add(Box.createGlue());
        panneaux.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        // parcourir la liste Global
        if(i<Global.size())i++;
        }
    
    
}
