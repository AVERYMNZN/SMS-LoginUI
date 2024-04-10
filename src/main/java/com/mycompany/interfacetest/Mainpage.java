/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetest;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

/**
 *
 * @author avery
 */
public class Mainpage extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage
     */
    public Mainpage() {
        initComponents();
        try {
            File importTitleFont = new File("src/main/resources/Fonts/Anton-Regular.ttf");
            File importBodyFont = new File("src/main/resources/Fonts/MajorMonoDisplay-Regular.ttf");
            File importAccentFont = new File("src/main/resources/Fonts/OpenSans-Regular.ttf");
            
            // Assign fonts to variables, set font size
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, importTitleFont);
            Font bodyFont = Font.createFont(Font.TRUETYPE_FONT, importBodyFont);
            Font accentFont = Font.createFont(Font.TRUETYPE_FONT, importAccentFont);
            
            // Set font for UI **BELOW**
            // - Font for side panel
            homeSidePanelText.setFont(accentFont.deriveFont(16f));
            examQuizSidePanelLabel.setFont(accentFont.deriveFont(Font.BOLD, 18f));
            homeworksSidePanelButton.setFont(accentFont.deriveFont(Font.BOLD, 18f));
            sectionsSidePanelButton.setFont(accentFont.deriveFont(Font.BOLD, 18f));
            attendanceSidePanelButton.setFont(accentFont.deriveFont(Font.BOLD, 18f));
            
            
            // - Fonts for navbar
            navbarEdusyncTitle.setFont(titleFont.deriveFont(48f));
            navbarUsername.setFont(accentFont.deriveFont(18f));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPageSidePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        examSidePanelButton = new javax.swing.JPanel();
        examQuizSidePanelLabel = new javax.swing.JLabel();
        examSidePanelIcon = new javax.swing.JLabel();
        homeworksSidePanelButton = new javax.swing.JPanel();
        homeworksSidePanelLabel = new javax.swing.JLabel();
        homeworkSidePanelIcon = new javax.swing.JLabel();
        sectionsSidePanelButton = new javax.swing.JPanel();
        sectionsSidePanelLabel = new javax.swing.JLabel();
        sectionsSidePanelIcon = new javax.swing.JLabel();
        attendanceSidePanelButton = new javax.swing.JPanel();
        attendanceSidePanelLabel = new javax.swing.JLabel();
        attendanceSidePanelIcon = new javax.swing.JLabel();
        homeSidePanelButton = new javax.swing.JPanel();
        mainpageHomeIcon = new javax.swing.JLabel();
        homeSidePanelText = new javax.swing.JLabel();
        mainPageNavbar = new javax.swing.JPanel();
        userProfileIcon = new javax.swing.JLabel();
        navbarUsername = new javax.swing.JLabel();
        navbarEdusyncTitle = new javax.swing.JLabel();
        mainPageAttendance = new javax.swing.JTabbedPane();
        tabbedPaneHomeIndex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainPageCCSTLogo = new javax.swing.JLabel();
        tabbedPaneExamIndex = new javax.swing.JPanel();
        tabbedPaneClasslistIndex = new javax.swing.JPanel();
        tabbedPaneSectionsIndex = new javax.swing.JPanel();
        tabbedPaneAttendanceIndex = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync");

        backgroundPanel.setBackground(new java.awt.Color(80, 80, 80));
        backgroundPanel.setForeground(new java.awt.Color(51, 51, 51));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPageSidePanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPageSidePanel.setForeground(new java.awt.Color(51, 51, 51));
        mainPageSidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        mainPageSidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 20));

        examSidePanelButton.setBackground(new java.awt.Color(51, 51, 51));
        examSidePanelButton.setForeground(new java.awt.Color(60, 63, 65));
        examSidePanelButton.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                examSidePanelButtonAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        examSidePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                examSidePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                examSidePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                examSidePanelButtonMousePressed(evt);
            }
        });
        examSidePanelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        examQuizSidePanelLabel.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        examQuizSidePanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        examQuizSidePanelLabel.setText("Dashboard");
        examSidePanelButton.add(examQuizSidePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 70));

        examSidePanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/examSidePanelIcon.png"))); // NOI18N
        examSidePanelButton.add(examSidePanelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        mainPageSidePanel.add(examSidePanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 70));

        homeworksSidePanelButton.setBackground(new java.awt.Color(51, 51, 51));
        homeworksSidePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeworksSidePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeworksSidePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeworksSidePanelButtonMousePressed(evt);
            }
        });
        homeworksSidePanelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeworksSidePanelLabel.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        homeworksSidePanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeworksSidePanelLabel.setText("Students");
        homeworksSidePanelButton.add(homeworksSidePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 60));

        homeworkSidePanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/Students.png"))); // NOI18N
        homeworksSidePanelButton.add(homeworkSidePanelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        mainPageSidePanel.add(homeworksSidePanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 70));

        sectionsSidePanelButton.setBackground(new java.awt.Color(51, 51, 51));
        sectionsSidePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sectionsSidePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sectionsSidePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sectionsSidePanelButtonMousePressed(evt);
            }
        });
        sectionsSidePanelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sectionsSidePanelLabel.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        sectionsSidePanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionsSidePanelLabel.setText("Sections");
        sectionsSidePanelButton.add(sectionsSidePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 70));

        sectionsSidePanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/sectionsSidePanelIcon.png"))); // NOI18N
        sectionsSidePanelButton.add(sectionsSidePanelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        mainPageSidePanel.add(sectionsSidePanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 70));

        attendanceSidePanelButton.setBackground(new java.awt.Color(51, 51, 51));
        attendanceSidePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendanceSidePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendanceSidePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attendanceSidePanelButtonMousePressed(evt);
            }
        });
        attendanceSidePanelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendanceSidePanelLabel.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        attendanceSidePanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        attendanceSidePanelLabel.setText("Attendance");
        attendanceSidePanelButton.add(attendanceSidePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 70));

        attendanceSidePanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/attendanceSidePanelIcon.png"))); // NOI18N
        attendanceSidePanelButton.add(attendanceSidePanelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        mainPageSidePanel.add(attendanceSidePanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 70));

        homeSidePanelButton.setBackground(new java.awt.Color(51, 51, 51));
        homeSidePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeSidePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeSidePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeSidePanelButtonMousePressed(evt);
            }
        });
        homeSidePanelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpageHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/HomeMiniIcon.png"))); // NOI18N
        homeSidePanelButton.add(mainpageHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        homeSidePanelText.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        homeSidePanelText.setForeground(new java.awt.Color(255, 255, 255));
        homeSidePanelText.setText("Home");
        homeSidePanelButton.add(homeSidePanelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 50));

        mainPageSidePanel.add(homeSidePanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        backgroundPanel.add(mainPageSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 600));

        mainPageNavbar.setBackground(new java.awt.Color(0, 0, 102));
        mainPageNavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/userProfile.png"))); // NOI18N
        mainPageNavbar.add(userProfileIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 70, 80));

        navbarUsername.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        navbarUsername.setForeground(new java.awt.Color(255, 255, 255));
        navbarUsername.setText("[Username]");
        mainPageNavbar.add(navbarUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, 60));

        navbarEdusyncTitle.setFont(new java.awt.Font("Anton", 0, 48)); // NOI18N
        navbarEdusyncTitle.setForeground(new java.awt.Color(255, 255, 255));
        navbarEdusyncTitle.setText("EduSync");
        mainPageNavbar.add(navbarEdusyncTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, -1, 100));

        backgroundPanel.add(mainPageNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        tabbedPaneHomeIndex.setBackground(new java.awt.Color(80, 80, 80));
        tabbedPaneHomeIndex.setForeground(new java.awt.Color(80, 80, 80));
        tabbedPaneHomeIndex.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to our Student Management System!");
        tabbedPaneHomeIndex.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        mainPageCCSTLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CCSTLOGOFINAL.png"))); // NOI18N
        tabbedPaneHomeIndex.add(mainPageCCSTLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 220, -1));

        mainPageAttendance.addTab("Home", tabbedPaneHomeIndex);

        javax.swing.GroupLayout tabbedPaneExamIndexLayout = new javax.swing.GroupLayout(tabbedPaneExamIndex);
        tabbedPaneExamIndex.setLayout(tabbedPaneExamIndexLayout);
        tabbedPaneExamIndexLayout.setHorizontalGroup(
            tabbedPaneExamIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        tabbedPaneExamIndexLayout.setVerticalGroup(
            tabbedPaneExamIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        mainPageAttendance.addTab("Dashboard", tabbedPaneExamIndex);

        javax.swing.GroupLayout tabbedPaneClasslistIndexLayout = new javax.swing.GroupLayout(tabbedPaneClasslistIndex);
        tabbedPaneClasslistIndex.setLayout(tabbedPaneClasslistIndexLayout);
        tabbedPaneClasslistIndexLayout.setHorizontalGroup(
            tabbedPaneClasslistIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        tabbedPaneClasslistIndexLayout.setVerticalGroup(
            tabbedPaneClasslistIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        mainPageAttendance.addTab("Class List", tabbedPaneClasslistIndex);

        javax.swing.GroupLayout tabbedPaneSectionsIndexLayout = new javax.swing.GroupLayout(tabbedPaneSectionsIndex);
        tabbedPaneSectionsIndex.setLayout(tabbedPaneSectionsIndexLayout);
        tabbedPaneSectionsIndexLayout.setHorizontalGroup(
            tabbedPaneSectionsIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        tabbedPaneSectionsIndexLayout.setVerticalGroup(
            tabbedPaneSectionsIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        mainPageAttendance.addTab("Sections", tabbedPaneSectionsIndex);

        javax.swing.GroupLayout tabbedPaneAttendanceIndexLayout = new javax.swing.GroupLayout(tabbedPaneAttendanceIndex);
        tabbedPaneAttendanceIndex.setLayout(tabbedPaneAttendanceIndexLayout);
        tabbedPaneAttendanceIndexLayout.setHorizontalGroup(
            tabbedPaneAttendanceIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        tabbedPaneAttendanceIndexLayout.setVerticalGroup(
            tabbedPaneAttendanceIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        mainPageAttendance.addTab("Attendance", tabbedPaneAttendanceIndex);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        mainPageAttendance.addTab("tab6", jScrollPane1);

        backgroundPanel.add(mainPageAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 910, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void examSidePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examSidePanelButtonMouseExited
        // TODO add your handling code here:
        examSidePanelButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_examSidePanelButtonMouseExited

    private void examSidePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examSidePanelButtonMouseEntered
        // TODO add your handling code here:
        examSidePanelButton.setBackground(new Color(80,80,80));
   
    }//GEN-LAST:event_examSidePanelButtonMouseEntered

    private void examSidePanelButtonAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_examSidePanelButtonAncestorMoved

    }//GEN-LAST:event_examSidePanelButtonAncestorMoved

    private void homeworksSidePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksSidePanelButtonMouseEntered
        // TODO add your handling code here:
        homeworksSidePanelButton.setBackground(new Color(80,80,80));
    }//GEN-LAST:event_homeworksSidePanelButtonMouseEntered

    private void homeworksSidePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksSidePanelButtonMouseExited
        // TODO add your handling code here:
        homeworksSidePanelButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_homeworksSidePanelButtonMouseExited

    private void sectionsSidePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionsSidePanelButtonMouseEntered
        // TODO add your handling code here:
        sectionsSidePanelButton.setBackground(new Color(80,80,80));
    }//GEN-LAST:event_sectionsSidePanelButtonMouseEntered

    private void sectionsSidePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionsSidePanelButtonMouseExited
        // TODO add your handling code here:
        sectionsSidePanelButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_sectionsSidePanelButtonMouseExited

    private void attendanceSidePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceSidePanelButtonMouseEntered
        // TODO add your handling code here:
        attendanceSidePanelButton.setBackground(new Color(80,80,80));
    }//GEN-LAST:event_attendanceSidePanelButtonMouseEntered

    private void attendanceSidePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceSidePanelButtonMouseExited
        // TODO add your handling code here:
        attendanceSidePanelButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_attendanceSidePanelButtonMouseExited

    private void examSidePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examSidePanelButtonMousePressed
        // TODO add your handling code here:
        mainPageAttendance.setSelectedIndex(1);
    }//GEN-LAST:event_examSidePanelButtonMousePressed

    private void homeSidePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeSidePanelButtonMousePressed
        // TODO add your handling code here:
        mainPageAttendance.setSelectedIndex(0);
    }//GEN-LAST:event_homeSidePanelButtonMousePressed

    private void homeSidePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeSidePanelButtonMouseEntered
        // TODO add your handling code here:
        homeSidePanelButton.setBackground(new Color(80,80,80));
    }//GEN-LAST:event_homeSidePanelButtonMouseEntered

    private void homeSidePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeSidePanelButtonMouseExited
        // TODO add your handling code here:
        homeSidePanelButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_homeSidePanelButtonMouseExited

    private void homeworksSidePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeworksSidePanelButtonMousePressed
        // TODO add your handling code here:
        mainPageAttendance.setSelectedIndex(2);
    }//GEN-LAST:event_homeworksSidePanelButtonMousePressed

    private void sectionsSidePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionsSidePanelButtonMousePressed
        // TODO add your handling code here:
        mainPageAttendance.setSelectedIndex(4);
    }//GEN-LAST:event_sectionsSidePanelButtonMousePressed

    private void attendanceSidePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceSidePanelButtonMousePressed
        // TODO add your handling code here:
        mainPageAttendance.setSelectedIndex(5);
    }//GEN-LAST:event_attendanceSidePanelButtonMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attendanceSidePanelButton;
    private javax.swing.JLabel attendanceSidePanelIcon;
    private javax.swing.JLabel attendanceSidePanelLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel examQuizSidePanelLabel;
    private javax.swing.JPanel examSidePanelButton;
    private javax.swing.JLabel examSidePanelIcon;
    private javax.swing.JPanel homeSidePanelButton;
    private javax.swing.JLabel homeSidePanelText;
    private javax.swing.JLabel homeworkSidePanelIcon;
    private javax.swing.JPanel homeworksSidePanelButton;
    private javax.swing.JLabel homeworksSidePanelLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane mainPageAttendance;
    private javax.swing.JLabel mainPageCCSTLogo;
    private javax.swing.JPanel mainPageNavbar;
    private javax.swing.JPanel mainPageSidePanel;
    private javax.swing.JLabel mainpageHomeIcon;
    private javax.swing.JLabel navbarEdusyncTitle;
    private javax.swing.JLabel navbarUsername;
    private javax.swing.JPanel sectionsSidePanelButton;
    private javax.swing.JLabel sectionsSidePanelIcon;
    private javax.swing.JLabel sectionsSidePanelLabel;
    private javax.swing.JPanel tabbedPaneAttendanceIndex;
    private javax.swing.JPanel tabbedPaneClasslistIndex;
    private javax.swing.JPanel tabbedPaneExamIndex;
    private javax.swing.JPanel tabbedPaneHomeIndex;
    private javax.swing.JPanel tabbedPaneSectionsIndex;
    private javax.swing.JLabel userProfileIcon;
    // End of variables declaration//GEN-END:variables
}
