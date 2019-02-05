
package ServiceApp;

/**
 *
 * @author salaheddine
 */
import Local.Fileapp;
import Local.Recherche;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class ListPanel extends JPanel
{
    private static final long serialVersionUID = 1L;
    private JPanel fillerPanel;
    private ArrayList<JPanel> panels;
    // un variable globale pour stocker les résultats de recherche sous forme LinkedList 
    private LinkedList Global;
    
    public ListPanel(List<JPanel> panels, int height)
    {   // la valeur '15' désigne la hauteur du JPanel qui sera ajouté
        this(panels, 15, new Insets(2, 0, 2, 0));
    }

    public ListPanel(List<JPanel> panels, int height, Insets insets)
    {   // la valeur '15' désigne la hauteur du JPanel qui sera ajouté
        this();
        for (JPanel panel : panels)
            addPanel(panel, 15, insets);
    }

    public ListPanel()
    {
        super();
        this.fillerPanel = new JPanel();
        this.Global = new LinkedList();
        this.fillerPanel.setMinimumSize(new Dimension(0, 0));
        this.panels = new ArrayList<JPanel>();
        setLayout(new GridBagLayout());
    }

    public void addPanel(JPanel p, int height)
    {   // la valeur '15' désigne la hauteur du JPanel qui sera ajouté
        addPanel(p, 15, new Insets(1, 0, 1, 0));
    }

    public void addPanel(JPanel p, int height, Insets insets)
    {
        super.remove(fillerPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = getComponentCount();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.ipady = 15;
        gbc.insets = insets;
        gbc.weightx = 1.0;
        panels.add(p);
        add(p, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = getComponentCount();
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.weighty = 1.0;
        add(fillerPanel, gbc);
        revalidate();
        invalidate();
        repaint();
    }


    public ArrayList<JPanel> getPanels()
    {
        return this.panels;
    }

    // Resultat(JPanel p) retourne un JPanel rempli par la list des JPanels
    public JPanel Resultat(JPanel p) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        JPanel Panelheade =new JPanel();
        Panelheade.setLayout(new BorderLayout());
        
        p.setLayout(new BorderLayout());
        
        final ListPanel listPanel = new ListPanel();
        for (int i = 1; i <= 12; i++)
            listPanel.addPanel(getRandomJPanel(), new Random().nextInt(25) + 20);
       
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setViewportView(listPanel);
        
        p.add(scrollPane, BorderLayout.CENTER);
        p.setVisible(true);
        
        return p;
    }
    
    /////////////////////////////////////////
    
    public void setGlobal(LinkedList ll){
        this.Global=ll;
    }
    
    public LinkedList getGlobal(){
        aff();
        return this.Global;
    }
     
    /////////////////////////////////////////
    
    // Pour insérer les images qui représente le type de fichier (exemple de fichier PDF)
    public void img(JLabel i , JLabel t){
        if(t.getText() =="pdf" || t.getText() =="PDF")
    i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/Model/pdf.png")));
    }

// la fonction aff() pour "Tester" c'est la liste des fichiers a été bien emporté par le variable Global
public void aff(){
    for (int i=0;i<Global.size();i++) {
            Fileapp f = (Fileapp) Global.get(i);
            
            System.out.println("\n ListPanel Test \n");
            System.out.println("Nom: $$$$$$$$$$$ "+f.getName());
            System.out.println("Taille: $$$$$$$$$$$ "+f.getTaille());
            System.out.println("Chemin: $$$$$$$$$$$ "+f.getPath());
            System.out.println("Date: $$$$$$$$$$$ "+"Date");
            System.out.println("Type: $$$$$$$$$$$ "+f.getType());
            
        } 
    // problème :
        //Panel_Etat pe = new Panel_Etat();
       //System.out.println("info ==> "+pe.information()); 
}


// getRandomJPanel() ==> Pour crier et remplir les Jpanels
int nb=0,y=0,x=0,z=0,k=0,l=-1;
    public JPanel getRandomJPanel() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException
    {
        JPanel panel = new JPanel();
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
          /**/
         
        // Pour tester le fonctionnement:
        
        String rt[]={"****************************************","****************************","**********************************************","**************","*************",
                     "file.txt","23Ko","//Users/salaheddine/Desktop/Doc/file.txt","12/03/2014","txt",
                     "document.pdf","23Mo","//Users/salaheddine/PDF/document.pdf","22/03/2015","pdf",
                     "babar.me","8Ko","//Users/salaheddine/System/babar.me","30/03/2015","me"
        };
        
        
        if(l<rt.length-1){y=l+1;x=y+1;z=x+1;k=z+1;l=k+1;}
        JLabel[] ourLabels = new JLabel[]{
           
           new JLabel(rt[y]),
           new JLabel(rt[x]),
           new JLabel(rt[z]),
           new JLabel(rt[k]),
           new JLabel(rt[l]),
           new JLabel(), // image label
           new JLabel() // pour sélectionner le fichier qui sera stocké a une Bibliothèque de typt LinkedList
           
           };
      
        /*
        Fileapp f = (Fileapp) Global.get(nb);
       
        JLabel[] ourLabels = new JLabel[]{
           
          0 new JLabel(f.getName()),
          1 new JLabel(f.getTaille()),
          2 new JLabel(f.getPath()),
          3 new JLabel("Date"),
          4 new JLabel(f.getType()),
          5 new JLabel(), // image label
          6 new JLabel() // pour sélectionner le fichier qui sera stocké a une Bibliothèque de typt LinkedList
           };
       */
        
        img(ourLabels[5],ourLabels[4]);
        panel.add(ourLabels[5],new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 37, 33));
        panel.add(ourLabels[0],new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 9, 190, 15));
        
        
        panel.add(ourLabels[1],new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 9, 75, 15));
        
        
        panel.add(ourLabels[2],new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 9, 270, 15));
        
        
        panel.add(ourLabels[3],new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 9, 95, 15));
        
        
        panel.add(ourLabels[4],new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 9, 60, 15));
        
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.gray);
                
            }
           public void mouseExited(MouseEvent e){
                panel.setBackground(Color.white);
                
            }
        });
        ///////// une fonction pour sélectionner le fichier  /////////
        //   .......
        ///////// une fonction pour sélectionner le fichier  /////////
        
        // parcourir la liste Global
        //if(nb<Global.size())nb++;
        
        return panel;
    }
    
    
}