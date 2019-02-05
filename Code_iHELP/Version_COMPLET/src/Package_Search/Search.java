/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_Search;

import java.io.File;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author salaheddine
 */
public class Search extends javax.swing.JFrame {
   
	
	public static Vector search_by_name(String file , String chemin){
		//String filtre ="(?i)11.*";
                String filtre =file;
		//String path = "///Users/salaheddine/Documents/www";
                String path = chemin;
		Pattern p = Pattern.compile(filtre);
		String [] s = new File(path).list();
		Vector<String> list = new Vector<String>();
		for(int i =0 ; i < s.length ;i ++){
			
			Matcher m = p.matcher(s[i]);
			if (m.matches()){
				list.add(s[i]);
				//System.out.println(" Fichier Trouve "+ s[i]);
                                //JOptionPane.showMessageDialog(null," Fichier Trouve "+ s[i]);
                                
				
				
			}
			else {
				
				//System.out.println(" Fichier non specifier "+ s[i]);
                            //JOptionPane.showMessageDialog(null," Fichier Non Trouve "+ s[i]);
                				
			}
                        
			
			
			
		}
               return list;
		
               /*for(int i =0 ; i < list.size() ;i ++){
			
		JOptionPane.showMessageDialog(null," Fichier Trouve "+ list.elementAt(i));
                }*/
	}
    public static void main(String[] args) {
       // search_by_name("11.txt","///Users/salaheddine/Documents/www" );
        Vector V;
        V = Search.search_by_name(StartGUI.GetText_search(), "///Users/salaheddine/Documents/www");
        String S;
        
        for(int i =0 ; i < V.size() ;i ++){
		S = ""+ V.elementAt(i);	
		JOptionPane.showMessageDialog(null," Fichier Trouve "+ S);
                }
    }

    
    
}
