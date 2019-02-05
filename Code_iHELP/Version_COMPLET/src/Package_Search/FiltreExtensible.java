/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_Search;

import java.io.File; 
import java.util.*; 
import javax.swing.*;
import javax.swing.filechooser.*;

public class FiltreExtensible extends FileFilter{
	//Description et extensions acceptées par le filtre
	private String description;
	private List<String> extensions;
	//Constructeur à partir de la description
	public FiltreExtensible(String description){
		if(description == null){
			throw new NullPointerException("La description ne peut être null.");	
		}
		this.description = description;
		this.extensions = new ArrayList<String>();
	}
	//Implémentation de FileFilter
	public boolean accept(File file){
		if(file.isDirectory() || extensions.size()==0) { 
			return true; 
		} 
		String nomFichier = file.getName().toLowerCase(); 
		for(String extension : extensions){
			if(nomFichier.endsWith(extension)){
				return true;
			}	
		}
		return false;
	}
	public String getDescription(){
		StringBuffer buffer = new StringBuffer(description);
		buffer.append(" (");
		for(String extension : extensions){
			buffer.append(extension).append(" ");	
		}	
		return buffer.append(")").toString();
	}	
	//Quelques méthodes utilitaires
	public void setDescription(String description){
		if(description == null){
			throw new NullPointerException("La description ne peut être null.");	
		}
		this.description = description;
	}
	public void addExtension(String extension){
		if(extension == null){
			throw new NullPointerException("Une extension ne peut être null.");	
		}	
		extensions.add(extension);
	}
	public void removeExtension(String extension){
		extensions.remove(extension);	
	}
	public void clearExtensions(){
		extensions.clear();
	}
	public List<String> getExtensions(){
		return extensions;	
	}
        
       
	//Test
	public static void main(String[] args){
		
		FiltreExtensible filtre = new FiltreExtensible("Fichiers Java");
		filtre.addExtension(".java");
		
		JFileChooser chooser = new JFileChooser(".");
		chooser.addChoosableFileFilter(filtre);
		chooser.showOpenDialog(null);
		
		filtre.addExtension(".class");
		chooser.showOpenDialog(null);
		
		filtre.setDescription("Fichiers class");
		filtre.removeExtension(".java");
		chooser.showOpenDialog(null);
		
		filtre.setDescription("Tous les fichiers");
		filtre.clearExtensions();	
		chooser.showOpenDialog(null);
                
                
	}
}