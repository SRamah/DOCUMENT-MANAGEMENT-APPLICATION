package interfaceGraphique;

import java.io.Serializable;
import java.util.LinkedList;

import Local.Date;
import Local.Fileapp;

public class Library implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Fileapp> Books = new LinkedList<Fileapp>();
	private String Name ="Unammed_Library" ;
	private Date CreateDate = new Date();
	
	public Library(String Name){
		
		this.Name=Name;
		
	}
   public void add(Fileapp file){
	   Books.add(file);
   }
   public Fileapp get(int id){
	   Fileapp f = new Fileapp();
	   for(int i =0;i<Books.size();i++){
		   f=Books.get(i);
		   if(f.getId()==id){
			   return f;
		   }
	   }
	   return null;
   }
	
   public void delete(int id){
	   Fileapp f = new Fileapp();
	   for(int k=0;k<Books.size();k++){
		   f=Books.get(k);
		   if(f.getId()==id){
			   Books.remove(k);
		   }
		   
	   }
	   
   }
   public LinkedList<Fileapp> getALL(){
	   return this.Books;
	   
   }
   public void empty(){
	   Books=null;
	   Books=new LinkedList<Fileapp>();
   }
   public void rename(String s){
	   this.Name=s;
   }
   public String getName(){
	   return this.Name;
   }
   public Date getCreateDate(){
	  return this.CreateDate;
  }
   public void cloneadd(LinkedList l){
	   for(int i=0 ; i <l.size();i++){
		   Books.add((Fileapp) l.get(i));
	   }
   }
   public void Show(){
	   
	   for(int i=0 ; i <Books.size();i++){
		   System.out.println("Name :"+Books.get(i).getName());
	   }
   }
   public void main(String agrs[]){
	   
	   Library pdf = new Library("PDF");
	   Fileapp appfile = new Fileapp("pdf.exe", "pdf.exe","bb", "rar", "test", 12);
	   pdf.add(appfile);
	   appfile = new Fileapp("pdf.pdf", "pdf.exe","bb", "rar", "test", 12);
	   pdf.add(appfile);
	   appfile = new Fileapp("pdf.dco", "pdf.exe","bb", "rar", "test", 12);
	   pdf.add(appfile); 
	   // Creation d'une  Bib demo
	   
	   
   }
   
   
}
