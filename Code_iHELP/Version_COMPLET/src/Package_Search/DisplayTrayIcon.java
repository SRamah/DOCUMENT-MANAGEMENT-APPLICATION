/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package_Search;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author salaheddine
 */
public class DisplayTrayIcon {

  public static TrayIcon trayIcon;
    
    public DisplayTrayIcon() {
    
    ShowTrayIcon();
}

    public static void ShowTrayIcon(){
        if(!SystemTray.isSupported()){
            System.out.println("Error !!");
            System.exit(0);
            return;
        }
        
    final PopupMenu popup = new PopupMenu();
    trayIcon = new TrayIcon(CreateIcon("/Package_Search/Disign/IHELPICON.png","TrayIcon"));
    final SystemTray tray =SystemTray.getSystemTray();
    trayIcon.setToolTip("Version Beta 0.1 \n Ihelp");
    
   Menu DisplayMenu = new Menu("Menu");
    
//add elelements of menu
    MenuItem OpenItem = new MenuItem("Open");
    MenuItem AboutItem = new MenuItem("About");
    MenuItem ExitItem = new MenuItem("Exit");
    
    MenuItem ErrorItem = new MenuItem("Scan Error");
    MenuItem WarningItem = new MenuItem("Search Error");
    MenuItem NormalItem = new MenuItem("Search End");
    MenuItem InfoItem = new MenuItem("Search Incompler");
 
    //Populate the pop up menu
    popup.add(OpenItem);
    popup.addSeparator();
    popup.add(AboutItem);
    popup.addSeparator();
    popup.add(ExitItem);
    
    
    //Populate the Message display menu
    DisplayMenu.add(ErrorItem);
    DisplayMenu.add(WarningItem);
    DisplayMenu.add(NormalItem);
    DisplayMenu.add(InfoItem);
    
    trayIcon.setPopupMenu(popup);
    
    //Afficher les Messages 
    
    AboutItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
                JOptionPane.showMessageDialog(null, "Made by RAMAH&SADIQI");
            }
        });
    
    ExitItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
    
    OpenItem.addActionListener(new ActionListener() {

           @Override
            public void actionPerformed(ActionEvent e) {
            
               // JOptionPane.showMessageDialog(null, "How to open it !!!");
                Start01GUI strgui = null;
               try {
                   strgui = new Start01GUI();
               } catch (IOException ex) {
                   Logger.getLogger(DisplayTrayIcon.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(DisplayTrayIcon.class.getName()).log(Level.SEVERE, null, ex);
               } catch (InterruptedException ex) {
                   Logger.getLogger(DisplayTrayIcon.class.getName()).log(Level.SEVERE, null, ex);
               }
                strgui.setVisible(true);
            }
        });
    
    //
    
    
    try{
        tray.add(trayIcon);
    }
    catch(AWTException e){}

}

    
protected static Image CreateIcon(String path,String desc){
    URL ImageURL = DisplayTrayIcon.class.getResource(path);
    return(new ImageIcon(ImageURL,desc)).getImage();

}    
 


}
