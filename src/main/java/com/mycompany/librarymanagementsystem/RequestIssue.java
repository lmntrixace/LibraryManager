/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;


public class RequestIssue extends javax.swing.JFrame {
    String studId;

    public RequestIssue() {
        initComponents();
    }
    public RequestIssue(String studId){
        this.studId = studId;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_bId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_bName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fd = new javax.swing.JTextField();
        txt_fm = new javax.swing.JTextField();
        txt_fy = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_td = new javax.swing.JTextField();
        txt_tm = new javax.swing.JTextField();
        txt_ty = new javax.swing.JTextField();
        btn_request = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Book Id: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        txt_bId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_bId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 387, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Enter Book Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        txt_bName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_bName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 387, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("OR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("I need the book from: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        txt_fd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_fd.setText("DD");
        txt_fd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, -1));

        txt_fm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_fm.setText("MM");
        txt_fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fmActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 60, -1));

        txt_fy.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_fy.setText("YYYY");
        txt_fy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fyActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fy, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 110, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("I need the book till:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        txt_td.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_td.setText("DD");
        txt_td.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_td, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 60, -1));

        txt_tm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_tm.setText("MM");
        txt_tm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tmActionPerformed(evt);
            }
        });
        jPanel1.add(txt_tm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 60, -1));

        txt_ty.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_ty.setText("YYYY");
        txt_ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tyActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, -1));

        btn_request.setBackground(new java.awt.Color(0, 102, 102));
        btn_request.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_request.setForeground(new java.awt.Color(255, 255, 255));
        btn_request.setText("Request");
        btn_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_requestMouseClicked(evt);
            }
        });
        btn_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_requestActionPerformed(evt);
            }
        });
        jPanel1.add(btn_request, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, 735, 470));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Request a book:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 320, 85));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/BITS_Pilani-Logo.svg.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/29302.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("<<Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel3.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 735, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_requestActionPerformed
        
    }//GEN-LAST:event_btn_requestActionPerformed

    private void btn_requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_requestMouseClicked
        
        String bookId = txt_bId.getText();
        String bookName = txt_bName.getText();
        MDate fromDate = new MDate(txt_fd.getText(), txt_fm.getText(), txt_fy.getText());
        MDate toDate = new MDate(txt_td.getText(), txt_tm.getText(), txt_ty.getText());
        SearchBookThread sbt = new SearchBookThread(studId, bookId, bookName, fromDate, toDate, this);
        sbt.t.start();      
    }//GEN-LAST:event_btn_requestMouseClicked

    private void txt_tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tyActionPerformed
        
    }//GEN-LAST:event_txt_tyActionPerformed

    private void txt_tmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tmActionPerformed
        
    }//GEN-LAST:event_txt_tmActionPerformed

    private void txt_tdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tdActionPerformed
       
    }//GEN-LAST:event_txt_tdActionPerformed

    private void txt_fyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fyActionPerformed
        
    }//GEN-LAST:event_txt_fyActionPerformed

    private void txt_fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fmActionPerformed
        
    }//GEN-LAST:event_txt_fmActionPerformed

    private void txt_fdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fdActionPerformed
        
    }//GEN-LAST:event_txt_fdActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        StudentHomepage sh = new StudentHomepage(studId);
        sh.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_request;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_bId;
    private javax.swing.JTextField txt_bName;
    private javax.swing.JTextField txt_fd;
    private javax.swing.JTextField txt_fm;
    private javax.swing.JTextField txt_fy;
    private javax.swing.JTextField txt_td;
    private javax.swing.JTextField txt_tm;
    private javax.swing.JTextField txt_ty;
    // End of variables declaration//GEN-END:variables
}
