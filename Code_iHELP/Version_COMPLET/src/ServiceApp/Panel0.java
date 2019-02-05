
package ServiceApp;

import Package_Search.DisplayTrayIcon;
import Search_File.scanMachine;
import java.awt.TrayIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Panel0 extends javax.swing.JPanel {

    scanMachine fsearch =new scanMachine();
    public JPanel Panel0(JPanel p) {
      
        initComponents();
        //WindowOpened();
        p.add("Center", this);
        
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_type = new javax.swing.ButtonGroup();
        buttonGroup_scan_manuel = new javax.swing.ButtonGroup();
        buttonGroup_scan_auto = new javax.swing.ButtonGroup();
        BodyPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        MenuPanal2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboType_File = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel_file_type = new javax.swing.JPanel();
        jLabel_type_file = new javax.swing.JLabel();
        jTextField_type_file = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Scane_text = new javax.swing.JLabel();
        Scan_path = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        scan_label = new javax.swing.JLabel();
        scan_label1 = new javax.swing.JLabel();
        jToggleButton_on = new javax.swing.JToggleButton();
        jToggleButton_off = new javax.swing.JToggleButton();
        Scan_automatique_Panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Scan_au_démarrage_CheckBox = new javax.swing.JCheckBox();
        Time_Type_ComboBox = new javax.swing.JComboBox();
        Time_jSpinner = new javax.swing.JSpinner();
        PrPanel = new javax.swing.JPanel();
        Nom = new javax.swing.JTextField();
        Chemin = new javax.swing.JTextField();
        Taille = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        ComboType = new javax.swing.JComboBox();
        cmdAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(844, 500));
        setPreferredSize(new java.awt.Dimension(844, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel1.setText("Type :");

        jLabel6.setText("Date :");

        jLabel7.setText("Taille :");

        jLabel8.setText("Lange :");

        jLabel9.setText("Genre :");

        jLabel10.setText("Auteur :");

        ComboType_File.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "PDF", "xlsx", "docx", "txt", "java", "c", "c++", "Autre" }));
        ComboType_File.setToolTipText("");
        ComboType_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboType_FileActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "1 jour", "2 jours", "5 jours", "1 semaine", "1 mois", "other" }));

        buttonGroup_type.add(jRadioButton1);
        jRadioButton1.setText("0 Kb --> 10 Kb");

        buttonGroup_type.add(jRadioButton2);
        jRadioButton2.setText("10 Kb --> 1 Mb");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jRadioButton3);
        jRadioButton3.setText("1 Mb --> 10 Mb");

        buttonGroup_type.add(jRadioButton4);
        jRadioButton4.setText("10 Mb --> ...");

        buttonGroup_type.add(jRadioButton5);
        jRadioButton5.setText("Unknown");

        jPanel_file_type.setOpaque(false);
        jPanel_file_type.setVisible(false);

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

        javax.swing.GroupLayout MenuPanal2Layout = new javax.swing.GroupLayout(MenuPanal2);
        MenuPanal2.setLayout(MenuPanal2Layout);
        MenuPanal2Layout.setHorizontalGroup(
            MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuPanal2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanal2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel_file_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuPanal2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuPanal2Layout.createSequentialGroup()
                        .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanal2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(ComboType_File, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuPanal2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        MenuPanal2Layout.setVerticalGroup(
            MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanal2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboType_File, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_file_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MenuPanal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanal2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanal2Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Recherche Avancer", MenuPanal2);

        jPanel1.setEnabled(false);

        jButton1.setText("Scan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Scane_text.setText("Lancer la rechercher à partir de :");

        Scan_path.setText("/Users/salaheddine/Desktop/");

        buttonGroup_scan_manuel.add(jRadioButton6);
        jRadioButton6.setText("Racine");

        buttonGroup_scan_manuel.add(jRadioButton7);
        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Autre chemin [...]");

        scan_label.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        scan_label.setForeground(new java.awt.Color(0, 144, 82));
        scan_label.setText("Scan manuel :");

        scan_label1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        scan_label1.setForeground(new java.awt.Color(0, 144, 82));
        scan_label1.setText("Scan automatique :");

        buttonGroup_scan_auto.add(jToggleButton_on);
        jToggleButton_on.setSelected(true);
        jToggleButton_on.setText("ON");
        jToggleButton_on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_onActionPerformed(evt);
            }
        });

        buttonGroup_scan_auto.add(jToggleButton_off);
        jToggleButton_off.setText("OFF");
        jToggleButton_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_offActionPerformed(evt);
            }
        });

        Scan_automatique_Panel.setOpaque(false);

        jLabel11.setText("Lancer le scan chaque :");

        Scan_au_démarrage_CheckBox.setSelected(true);
        Scan_au_démarrage_CheckBox.setText("Scan au démarrage");

        Time_Type_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secondes", "minutes", "Heures", "Jours", "Mois" }));

        Time_jSpinner.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)60), Byte.valueOf((byte)1), Byte.valueOf((byte)60), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout Scan_automatique_PanelLayout = new javax.swing.GroupLayout(Scan_automatique_Panel);
        Scan_automatique_Panel.setLayout(Scan_automatique_PanelLayout);
        Scan_automatique_PanelLayout.setHorizontalGroup(
            Scan_automatique_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scan_automatique_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Scan_automatique_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scan_automatique_PanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Scan_au_démarrage_CheckBox))
                    .addComponent(jLabel11)
                    .addGroup(Scan_automatique_PanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Time_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Time_Type_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Scan_automatique_PanelLayout.setVerticalGroup(
            Scan_automatique_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scan_automatique_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scan_au_démarrage_CheckBox)
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addGroup(Scan_automatique_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Scan_automatique_PanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Time_Type_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scan_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Scane_text))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jToggleButton_on, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scan_label1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jToggleButton_off, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Scan_automatique_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Scan_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(scan_label)
                .addGap(23, 23, 23)
                .addComponent(Scane_text)
                .addGap(12, 12, 12)
                .addComponent(jRadioButton6)
                .addGap(6, 6, 6)
                .addComponent(jRadioButton7)
                .addGap(6, 6, 6)
                .addComponent(Scan_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton_on)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(scan_label1))
                    .addComponent(jToggleButton_off))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Scan_automatique_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Scane", jPanel1);

        PrPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DateKeyTyped(evt);
            }
        });

        ComboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PDF", "xlsx", "docx", "txt", "java", "c", "c++", "other" }));
        ComboType.setToolTipText("");

        cmdAdd.setText("Add");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setDoubleBuffered(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout PrPanelLayout = new javax.swing.GroupLayout(PrPanel);
        PrPanel.setLayout(PrPanelLayout);
        PrPanelLayout.setHorizontalGroup(
            PrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Chemin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Taille)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdAdd)
                .addGap(94, 94, 94))
            .addGroup(PrPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PrPanelLayout.setVerticalGroup(
            PrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrPanelLayout.createSequentialGroup()
                .addGroup(PrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 536));
    }// </editor-fold>//GEN-END:initComponents

    private void ComboType_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboType_FileActionPerformed
        File_type();
    }//GEN-LAST:event_ComboType_FileActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DisplayTrayIcon.trayIcon.displayMessage("Scan erroné", "Le Scan n'est pas déclencher", TrayIcon.MessageType.WARNING);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton_onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_onActionPerformed
        scan_automatique_show();
    }//GEN-LAST:event_jToggleButton_onActionPerformed

    private void jToggleButton_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_offActionPerformed
        scan_automatique_show();
    }//GEN-LAST:event_jToggleButton_offActionPerformed
    public void scan_automatique_show(){
        if(jToggleButton_off.isSelected()){
            Scan_automatique_Panel.setVisible(false);
            //il faut stocker le resultat de test pour le prochaine démarage dans une B.D
        }
        else if(jToggleButton_on.isSelected()){
            Scan_automatique_Panel.setVisible(true);
        }
    }
    
    public void File_type(){
        
        if(ComboType_File.getSelectedIndex()!=8){
            jPanel_file_type.setVisible(false);
        }
        else{
            jPanel_file_type.setVisible(true);
        }
    }
    private void DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateKeyTyped
        /* if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            return;
        }*/
    }//GEN-LAST:event_DateKeyTyped
    DefaultTableModel modTable;
    
    
    
    public String addin(){
        String v=new String();
        v=Nom.getText();
        return v;
    }
    
    byte x=0;
    
    public void WindowOpened() {                                  
        modTable=new DefaultTableModel(); 
       table.setModel(modTable);
       modTable.addColumn("Nom");
       modTable.addColumn("Chemin");
       modTable.addColumn("Taille");
       modTable.addColumn("Date");
       modTable.addColumn("Type");
       
       //table.setSelectionBackground( Color.yellow );
       //table.setSelectionForeground( Color.black );
       String chaine[] ={"1","2","3","4","5","6"};
       int i=0;
       while(chaine[i]!=null){
       
           String st[]=new String[modTable.getColumnCount()];
            st[0]=addin().trim();
            st[1]=Chemin.getText().trim();
            st[2]=Taille.getText().trim();
            st[3]=Date.getText().trim();
            st[4]=(String)ComboType.getSelectedItem();
            st[4]=st[4].trim();
            x++;
            modTable.addRow(st);
            i++;
       }
      /* */
       
       //table.moveColumn(0, 0);
       //table.getColumnName(0);
       
       
    }                                 

    /*public void optiontoAdd(){
        String st[]=new String[modTable.getColumnCount()];
        st[0]=fsearch.Nom().trim();
        st[1]=fsearch.Chemin().trim();
        st[2]=fsearch.Taille().trim();
        st[3]=fsearch.DDate().trim();
        st[4]=(String)ComboType_File.getSelectedItem();
        st[4]=st[4].trim();
        x++;
        modTable.addRow(st);
    
    }  */                            

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
       String st[]=new String[modTable.getColumnCount()];
        st[0]=fsearch.Nom().trim();
        st[1]=fsearch.Chemin().trim();
        st[2]=fsearch.Taille().trim();
        st[3]=fsearch.DDate().trim();
        st[4]=(String)ComboType_File.getSelectedItem();
        st[4]=st[4].trim();
        x++;
        modTable.addRow(st);

        
        //// electionner une cellule à la fois
        /*table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);*/

    }//GEN-LAST:event_cmdAddActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(evt.getClickCount()==1){
            //modTable.setCellEditable(false);
            if(table.getRowSelectionAllowed() && 0==table.getSelectedColumn()){

                int row=table.getSelectedRow();

                //JOptionPane.showMessageDialog(null,row);
                System.out.println("la ligne: "+row);
                System.out.println("Le Chemin: "+table.getValueAt(row, 1));

            }

        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JTextField Chemin;
    private javax.swing.JComboBox ComboType;
    private javax.swing.JComboBox ComboType_File;
    private javax.swing.JTextField Date;
    private javax.swing.JPanel MenuPanal2;
    private javax.swing.JTextField Nom;
    private javax.swing.JPanel PrPanel;
    private javax.swing.JCheckBox Scan_au_démarrage_CheckBox;
    public javax.swing.JPanel Scan_automatique_Panel;
    private javax.swing.JTextField Scan_path;
    private javax.swing.JLabel Scane_text;
    private javax.swing.JTextField Taille;
    private javax.swing.JComboBox Time_Type_ComboBox;
    private javax.swing.JSpinner Time_jSpinner;
    private javax.swing.ButtonGroup buttonGroup_scan_auto;
    private javax.swing.ButtonGroup buttonGroup_scan_manuel;
    private javax.swing.ButtonGroup buttonGroup_type;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_type_file;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_file_type;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_type_file;
    private javax.swing.JToggleButton jToggleButton_off;
    private javax.swing.JToggleButton jToggleButton_on;
    private javax.swing.JLabel scan_label;
    private javax.swing.JLabel scan_label1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
