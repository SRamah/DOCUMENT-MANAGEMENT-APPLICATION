/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author salaheddine
 */
public class Jpanel_File_Types extends JPanel {
    
    private JPanel jPanel_file_type;
    private JLabel jLabel_type_file;
    private JTextField jTextField_type_file;
 

    public Jpanel_File_Types() {
        
        
        jPanel_file_type.setOpaque(false);
        
        jLabel_type_file.setText("Votre Type :");
        
        javax.swing.GroupLayout jPanel_file_typeLayout = new javax.swing.GroupLayout(jPanel_file_type);
        jPanel_file_type.setLayout(jPanel_file_typeLayout);
        jPanel_file_typeLayout.setHorizontalGroup(
            jPanel_file_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_file_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_type_file)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_type_file, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_file_typeLayout.setVerticalGroup(
            jPanel_file_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_file_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_file_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_type_file)
                    .addComponent(jTextField_type_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        
    }
    
    

}
