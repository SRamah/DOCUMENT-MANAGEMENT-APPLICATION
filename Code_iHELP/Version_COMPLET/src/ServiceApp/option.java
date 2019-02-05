/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceApp;

import javax.swing.JPanel;


public class option extends javax.swing.JPanel {

    
    public JPanel option(JPanel p) {
        initComponents();
        p.add("Center", this);
        p.setVisible(true);
        return p;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_type = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel_doc1 = new javax.swing.JPanel();
        jToggleButton_pages = new javax.swing.JToggleButton();
        jToggleButton_rtf = new javax.swing.JToggleButton();
        jToggleButton_txt = new javax.swing.JToggleButton();
        jToggleButton_xls = new javax.swing.JToggleButton();
        jToggleButton_pptx = new javax.swing.JToggleButton();
        jToggleButton_pdf = new javax.swing.JToggleButton();
        jToggleButton_xps = new javax.swing.JToggleButton();
        jToggleButton_xlsx = new javax.swing.JToggleButton();
        jToggleButton_doc = new javax.swing.JToggleButton();
        jToggleButton_docx = new javax.swing.JToggleButton();
        jToggleButton_ppt = new javax.swing.JToggleButton();
        jPanel_dev1 = new javax.swing.JPanel();
        jToggleButton56 = new javax.swing.JToggleButton();
        jToggleButton57 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton59 = new javax.swing.JToggleButton();
        jToggleButton60 = new javax.swing.JToggleButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton62 = new javax.swing.JToggleButton();
        jToggleButton63 = new javax.swing.JToggleButton();
        jToggleButton64 = new javax.swing.JToggleButton();
        jToggleButton65 = new javax.swing.JToggleButton();
        jToggleButton66 = new javax.swing.JToggleButton();
        jPanel_multi1 = new javax.swing.JPanel();
        jToggleButton67 = new javax.swing.JToggleButton();
        jToggleButton68 = new javax.swing.JToggleButton();
        jToggleButton69 = new javax.swing.JToggleButton();
        jToggleButton70 = new javax.swing.JToggleButton();
        jToggleButton71 = new javax.swing.JToggleButton();
        jToggleButton72 = new javax.swing.JToggleButton();
        jToggleButton73 = new javax.swing.JToggleButton();
        jToggleButton74 = new javax.swing.JToggleButton();
        jToggleButton75 = new javax.swing.JToggleButton();
        jToggleButton76 = new javax.swing.JToggleButton();
        jToggleButton77 = new javax.swing.JToggleButton();
        jToggleButton78 = new javax.swing.JToggleButton();
        jPanel_archive1 = new javax.swing.JPanel();
        jToggleButton79 = new javax.swing.JToggleButton();
        jToggleButton80 = new javax.swing.JToggleButton();
        jToggleButton81 = new javax.swing.JToggleButton();
        jPanel_autre1 = new javax.swing.JPanel();
        jToggleButton82 = new javax.swing.JToggleButton();
        jToggleButton83 = new javax.swing.JToggleButton();
        jToggleButton84 = new javax.swing.JToggleButton();
        jToggleButton85 = new javax.swing.JToggleButton();
        jToggleButton86 = new javax.swing.JToggleButton();
        jToggleButton87 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jSlider_taille = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jTextField_taille = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(950, 310));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(950, 310));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 1402));

        jPanel_doc1.setBackground(new java.awt.Color(246, 247, 247));
        jPanel_doc1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Type de document", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(32, 36, 39))); // NOI18N
        jPanel_doc1.setOpaque(false);

        buttonGroup_type.add(jToggleButton_pages);
        jToggleButton_pages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/Pages-icon.png"))); // NOI18N
        jToggleButton_pages.setName("pages"); // NOI18N
        jToggleButton_pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_pagesActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_rtf);
        jToggleButton_rtf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/rtf-icon.png"))); // NOI18N
        jToggleButton_rtf.setName("rtf"); // NOI18N
        jToggleButton_rtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_rtfActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_txt);
        jToggleButton_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/txt-icon.png"))); // NOI18N
        jToggleButton_txt.setName("txt"); // NOI18N
        jToggleButton_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_txtActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_xls);
        jToggleButton_xls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/xls-icon.png"))); // NOI18N
        jToggleButton_xls.setName("xls"); // NOI18N
        jToggleButton_xls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_xlsActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_pptx);
        jToggleButton_pptx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/pptx-icon.png"))); // NOI18N
        jToggleButton_pptx.setName("pptx"); // NOI18N
        jToggleButton_pptx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_pptxActionPerformed(evt);
            }
        });

        jToggleButton_pdf.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup_type.add(jToggleButton_pdf);
        jToggleButton_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/pdf-icon.png"))); // NOI18N
        jToggleButton_pdf.setName("pdf"); // NOI18N
        jToggleButton_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_pdfActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_xps);
        jToggleButton_xps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/icon_file_xps.png"))); // NOI18N
        jToggleButton_xps.setName("xps"); // NOI18N
        jToggleButton_xps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_xpsActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_xlsx);
        jToggleButton_xlsx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/xlsx-icon.png"))); // NOI18N
        jToggleButton_xlsx.setName("xlsx"); // NOI18N
        jToggleButton_xlsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_xlsxActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_doc);
        jToggleButton_doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/doc-icon.png"))); // NOI18N
        jToggleButton_doc.setName("doc"); // NOI18N
        jToggleButton_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_docActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_docx);
        jToggleButton_docx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/docx-icon.png"))); // NOI18N
        jToggleButton_docx.setName("docx"); // NOI18N
        jToggleButton_docx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_docxActionPerformed(evt);
            }
        });

        buttonGroup_type.add(jToggleButton_ppt);
        jToggleButton_ppt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Documents/ppt-icon.png"))); // NOI18N
        jToggleButton_ppt.setName("ppt"); // NOI18N
        jToggleButton_ppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_pptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_doc1Layout = new javax.swing.GroupLayout(jPanel_doc1);
        jPanel_doc1.setLayout(jPanel_doc1Layout);
        jPanel_doc1Layout.setHorizontalGroup(
            jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_doc1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_doc1Layout.createSequentialGroup()
                        .addComponent(jToggleButton_docx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_pptx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_xlsx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_pages, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel_doc1Layout.createSequentialGroup()
                        .addComponent(jToggleButton_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_ppt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_xls, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_xps, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel_doc1Layout.setVerticalGroup(
            jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_doc1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_doc1Layout.createSequentialGroup()
                        .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton_xls, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_xps, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton_xlsx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_pages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_doc1Layout.createSequentialGroup()
                        .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_ppt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_doc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton_docx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_pptx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel_dev1.setBackground(new java.awt.Color(246, 247, 247));
        jPanel_dev1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Type de développement"));
        jPanel_dev1.setForeground(new java.awt.Color(32, 36, 39));
        jPanel_dev1.setOpaque(false);
        jPanel_dev1.setPreferredSize(new java.awt.Dimension(258, 119));

        buttonGroup_type.add(jToggleButton56);
        jToggleButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/text-x-javascript-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton57);
        jToggleButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/html-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton58);
        jToggleButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/dll-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton59);
        jToggleButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/Java-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton60);
        jToggleButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/bin-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton61);
        jToggleButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/app-x-php-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton62);
        jToggleButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/css-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton63);
        jToggleButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/text-x-c-plus-plus-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton64);
        jToggleButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/bat-icon.png"))); // NOI18N

        jToggleButton65.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup_type.add(jToggleButton65);
        jToggleButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/text-x-c-plus-plus-hdr-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton66);
        jToggleButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/text-x-c-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_dev1Layout = new javax.swing.GroupLayout(jPanel_dev1);
        jPanel_dev1.setLayout(jPanel_dev1Layout);
        jPanel_dev1Layout.setHorizontalGroup(
            jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dev1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dev1Layout.createSequentialGroup()
                        .addComponent(jToggleButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_dev1Layout.createSequentialGroup()
                        .addComponent(jToggleButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel_dev1Layout.setVerticalGroup(
            jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dev1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_dev1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_multi1.setBackground(new java.awt.Color(246, 247, 247));
        jPanel_multi1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Type de multimédia"));
        jPanel_multi1.setForeground(new java.awt.Color(32, 36, 39));
        jPanel_multi1.setOpaque(false);

        buttonGroup_type.add(jToggleButton67);
        jToggleButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Images/png-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton68);
        jToggleButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Videos/mov-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton69);
        jToggleButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Videos/mpeg-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton70);
        jToggleButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Videos/avi-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton71);
        jToggleButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Song/mp3-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton72);
        jToggleButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Images/bmp-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton73);
        jToggleButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Videos/mp4-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton74);
        jToggleButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Images/jpeg-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton75);
        jToggleButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Images/gif-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton76);
        jToggleButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Images/jpg-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton77);
        jToggleButton77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/psd-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton78);
        jToggleButton78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Videos/mkv-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_multi1Layout = new javax.swing.GroupLayout(jPanel_multi1);
        jPanel_multi1.setLayout(jPanel_multi1Layout);
        jPanel_multi1Layout.setHorizontalGroup(
            jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_multi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_multi1Layout.createSequentialGroup()
                        .addComponent(jToggleButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_multi1Layout.createSequentialGroup()
                        .addComponent(jToggleButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_multi1Layout.setVerticalGroup(
            jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_multi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_multi1Layout.createSequentialGroup()
                        .addGroup(jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_multi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToggleButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_archive1.setBackground(new java.awt.Color(246, 247, 247));
        jPanel_archive1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Type d'archive"));
        jPanel_archive1.setForeground(new java.awt.Color(32, 36, 39));
        jPanel_archive1.setOpaque(false);

        buttonGroup_type.add(jToggleButton79);
        jToggleButton79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Archives/Compressed-File-SIT-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton80);
        jToggleButton80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Archives/Compressed-File-Zip-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton81);
        jToggleButton81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Archives/Compressed-File-RAR-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_archive1Layout = new javax.swing.GroupLayout(jPanel_archive1);
        jPanel_archive1.setLayout(jPanel_archive1Layout);
        jPanel_archive1Layout.setHorizontalGroup(
            jPanel_archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_archive1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_archive1Layout.setVerticalGroup(
            jPanel_archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_archive1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_archive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_autre1.setBackground(new java.awt.Color(246, 247, 247));
        jPanel_autre1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Autre type"));
        jPanel_autre1.setForeground(new java.awt.Color(32, 36, 39));
        jPanel_autre1.setOpaque(false);

        buttonGroup_type.add(jToggleButton82);
        jToggleButton82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/eps-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton83);
        jToggleButton83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/fla-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton84);
        jToggleButton84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/ind-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton85);
        jToggleButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Developpement/accdb-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton86);
        jToggleButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/proj-icon.png"))); // NOI18N

        buttonGroup_type.add(jToggleButton87);
        jToggleButton87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/icon/Others/jsf-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_autre1Layout = new javax.swing.GroupLayout(jPanel_autre1);
        jPanel_autre1.setLayout(jPanel_autre1Layout);
        jPanel_autre1Layout.setHorizontalGroup(
            jPanel_autre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_autre1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_autre1Layout.setVerticalGroup(
            jPanel_autre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_autre1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_autre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_autre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jToggleButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package_Search/newcadre/option.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Date spécifique"));

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1431081061114L), null, null, java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Plage de dates"));

        jSpinner3.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1431081508314L), null, null, java.util.Calendar.DAY_OF_MONTH));

        jLabel3.setText("Date de fin");

        jLabel2.setText("Date de début");

        jSpinner2.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "A partir de la date "));

        jSpinner4.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1431085020000L), null, null, java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Jusqu'au la date "));

        jSpinner5.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1431085260000L), null, null, java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jCheckBox1.setText("Activé le filtrage de type");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Activé le filtrage de date");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Par la taille "));

        jSlider_taille.setMaximum(100000);
        jSlider_taille.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jSlider_tailleComponentMoved(evt);
            }
        });

        jLabel5.setText("De taille maximal =");

        jTextField_taille.setEditable(false);

        jLabel4.setText("Ko");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider_taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_taille, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider_taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_taille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jCheckBox3.setText("Activé le filtrage de taille");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_autre1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel_archive1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel_multi1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel_dev1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                        .addComponent(jPanel_doc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox2)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 659, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_doc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_dev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel_multi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_archive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_autre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_pdfActionPerformed
        jToggleButton_pdf.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_pdfActionPerformed

    private void jToggleButton_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_docActionPerformed
        jToggleButton_doc.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_docActionPerformed

    private void jToggleButton_pptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_pptActionPerformed
        jToggleButton_ppt.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_pptActionPerformed

    private void jToggleButton_xlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_xlsActionPerformed
        jToggleButton_xls.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_xlsActionPerformed

    private void jToggleButton_rtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_rtfActionPerformed
        jToggleButton_rtf.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_rtfActionPerformed

    private void jToggleButton_xpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_xpsActionPerformed
        jToggleButton_xps.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_xpsActionPerformed

    private void jToggleButton_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_txtActionPerformed
       jToggleButton_txt.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_txtActionPerformed

    private void jToggleButton_docxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_docxActionPerformed
        jToggleButton_docx.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_docxActionPerformed

    private void jToggleButton_pptxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_pptxActionPerformed
        jToggleButton_pptx.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_pptxActionPerformed

    private void jToggleButton_xlsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_xlsxActionPerformed
        jToggleButton_xlsx.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_xlsxActionPerformed

    private void jToggleButton_pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_pagesActionPerformed
        jToggleButton_pages.setSelected(true);
        returntype();
    }//GEN-LAST:event_jToggleButton_pagesActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jSlider_tailleComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jSlider_tailleComponentMoved
        jTextField_taille.setText(""+jSlider_taille.getValue());
    }//GEN-LAST:event_jSlider_tailleComponentMoved
public String returntype(){
        if(jToggleButton_pdf.isSelected()){
            System.out.println("return ===>"+jToggleButton_pdf.getName());
            return jToggleButton_pdf.getName();
        }
        if(jToggleButton_doc.isSelected()){
            System.out.println("return ===>"+jToggleButton_doc.getName());
            return jToggleButton_doc.getName();
        }
        if(jToggleButton_ppt.isSelected()){
            System.out.println("return ===>"+jToggleButton_ppt.getName());
            return jToggleButton_ppt.getName();
        }
        if(jToggleButton_xls.isSelected()){
            System.out.println("return ===>"+jToggleButton_xls.getName());
            return jToggleButton_xls.getName();
        }
        if(jToggleButton_rtf.isSelected()){
            System.out.println("return ===>"+jToggleButton_rtf.getName());
            return jToggleButton_rtf.getName();
        }
        if(jToggleButton_xps.isSelected()){
            System.out.println("return ===>"+jToggleButton_xps.getName());
            return jToggleButton_xps.getName();
        }
        if(jToggleButton_txt.isSelected()){
            System.out.println("return ===>"+jToggleButton_txt.getName());
            return jToggleButton_txt.getName();
        }
        if(jToggleButton_docx.isSelected()){
            System.out.println("return ===>"+jToggleButton_docx.getName());
            return jToggleButton_docx.getName();
        }
        if(jToggleButton_pptx.isSelected()){
            System.out.println("return ===>"+jToggleButton_pptx.getName());
            return jToggleButton_pptx.getName();
        }
        if(jToggleButton_xlsx.isSelected()){
            System.out.println("return ===>"+jToggleButton_xlsx.getName());
            return jToggleButton_xlsx.getName();
        }
        if(jToggleButton_pages.isSelected()){
            System.out.println("return ===>"+jToggleButton_pages.getName());
            return jToggleButton_pages.getName();
        }
        else return "Impossible";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_type;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_archive1;
    private javax.swing.JPanel jPanel_autre1;
    private javax.swing.JPanel jPanel_dev1;
    private javax.swing.JPanel jPanel_doc1;
    private javax.swing.JPanel jPanel_multi1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider_taille;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextField jTextField_taille;
    private javax.swing.JToggleButton jToggleButton56;
    private javax.swing.JToggleButton jToggleButton57;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton59;
    private javax.swing.JToggleButton jToggleButton60;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton62;
    private javax.swing.JToggleButton jToggleButton63;
    private javax.swing.JToggleButton jToggleButton64;
    private javax.swing.JToggleButton jToggleButton65;
    private javax.swing.JToggleButton jToggleButton66;
    private javax.swing.JToggleButton jToggleButton67;
    private javax.swing.JToggleButton jToggleButton68;
    private javax.swing.JToggleButton jToggleButton69;
    private javax.swing.JToggleButton jToggleButton70;
    private javax.swing.JToggleButton jToggleButton71;
    private javax.swing.JToggleButton jToggleButton72;
    private javax.swing.JToggleButton jToggleButton73;
    private javax.swing.JToggleButton jToggleButton74;
    private javax.swing.JToggleButton jToggleButton75;
    private javax.swing.JToggleButton jToggleButton76;
    private javax.swing.JToggleButton jToggleButton77;
    private javax.swing.JToggleButton jToggleButton78;
    private javax.swing.JToggleButton jToggleButton79;
    private javax.swing.JToggleButton jToggleButton80;
    private javax.swing.JToggleButton jToggleButton81;
    private javax.swing.JToggleButton jToggleButton82;
    private javax.swing.JToggleButton jToggleButton83;
    private javax.swing.JToggleButton jToggleButton84;
    private javax.swing.JToggleButton jToggleButton85;
    private javax.swing.JToggleButton jToggleButton86;
    private javax.swing.JToggleButton jToggleButton87;
    private javax.swing.JToggleButton jToggleButton_doc;
    private javax.swing.JToggleButton jToggleButton_docx;
    private javax.swing.JToggleButton jToggleButton_pages;
    private javax.swing.JToggleButton jToggleButton_pdf;
    private javax.swing.JToggleButton jToggleButton_ppt;
    private javax.swing.JToggleButton jToggleButton_pptx;
    private javax.swing.JToggleButton jToggleButton_rtf;
    private javax.swing.JToggleButton jToggleButton_txt;
    private javax.swing.JToggleButton jToggleButton_xls;
    private javax.swing.JToggleButton jToggleButton_xlsx;
    private javax.swing.JToggleButton jToggleButton_xps;
    // End of variables declaration//GEN-END:variables
}
