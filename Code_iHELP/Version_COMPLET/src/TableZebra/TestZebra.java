/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableZebra;
  
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TestZebra extends JPanel
{
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        ImageIcon px =new ImageIcon("Package_Search/Disign/Biblio.png");
        px.paintIcon(this, g, 20, 500);
    
    } 
    
    public void temp(){
        
        String ttab[][] = { {"Marouane","18","Male"},{"Hamza","21","Male"},{"Samia","20","Female"},{"Souso","12","Female"} };
        for(int  i = 0;  i < 4;  i++)
            {
                
                   
                        addname(ttab[i][0]);
                        addage(ttab[i][1]);
                        addgender(ttab[i][2]);
                    
                   


            }
    }
    
    
    
    JTable jt;
    public String addname(String s){
        String nom ="salah eddinne";
        return nom;
    
    }
    public String addage(String s){
        String age ="21";
        return age;
    
    }
    public String addgender(String s){
        String genre ="Male";
        return genre;
    
    }
 
     public TestZebra()
     {
         String[] columns = {"Name", "Age", "Gender"};
  
         String ttab[][] = { {"Marouane","18","Male"},{"Hamza","21","Male"},{"Samia","20","Female"},{"Souso","12","Female"} };
        for(int  i = 0;  i < 4;  i++)
            {
         
         
          String[][] data = {
                  {ttab[i][0], ttab[i][1], ttab[i][2]},
                  {"Daisy", "19", "Female"},
                  {"Dave", "23", "Male"},
                  {"Jake", "30", "Male"}
          };
            
          jt = new JTable(data, columns)
          {
               public boolean isCellEditable(int data, int columns)
               {
                   return false;
               }
   
               public Component prepareRenderer(TableCellRenderer r, int data, int columns)
               {
                   Component c = super.prepareRenderer(r, data, columns);
    
                   if (data % 2 == 0)
                       c.setBackground(Color.WHITE);
    
                   else
                       c.setBackground(Color.LIGHT_GRAY);
    
                   return c;
               }
         };
  
  }
         jt.setPreferredScrollableViewportSize(new Dimension(450, 63));
         jt.setFillsViewportHeight(true);
  
         JScrollPane jps = new JScrollPane(jt);
         add(jps);
  
     }
 
     public static void main(String[] args)
     {
         JFrame jf = new JFrame("TestZebra");
         TestZebra t = new TestZebra();
         jf.setSize(500, 500);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.add(t);
         jf.setVisible(true);
     }
}
