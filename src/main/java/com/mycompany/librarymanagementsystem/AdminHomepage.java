/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminHomepage extends javax.swing.JFrame {


    public AdminHomepage() {
        
        initComponents();
        showStudsNBooks();
    }
    private void showStudsNBooks(){
        lbl_books.setText("");
        lbl_studs.setText("");
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select count(1) as rws from books;";
            PreparedStatement cb = con.prepareStatement(sq);
            ResultSet rscb = cb.executeQuery();
            rscb.next();
            int bookRows = rscb.getInt("rws");
            lbl_books.setText(Integer.toString(bookRows));
            
            String sq2 = "select count(1) as rws from students;";
            PreparedStatement cs = con.prepareStatement(sq2);
            ResultSet rscs = cs.executeQuery();
            rscs.next();
            int studRows = rscs.getInt("rws");
            lbl_studs.setText(Integer.toString(studRows));
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        lbl_studs = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lbl_books = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_removeStudent = new javax.swing.JButton();
        btn_removeBook = new javax.swing.JButton();
        btn_addBook = new javax.swing.JButton();
        btn_addStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Students");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        lbl_studs.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_studs.setForeground(new java.awt.Color(51, 51, 51));
        lbl_studs.setText("70");
        jPanel1.add(lbl_studs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Books");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lbl_books.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_books.setForeground(new java.awt.Color(51, 51, 51));
        lbl_books.setText("2");
        jPanel1.add(lbl_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 80, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/BITS_Pilani-Logo.svg.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/29302.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 735, 131));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setBackground(new java.awt.Color(0, 102, 102));
        btn_logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        btn_removeStudent.setBackground(new java.awt.Color(0, 102, 102));
        btn_removeStudent.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_removeStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_removeStudent.setText("Remove Student");
        btn_removeStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeStudentMouseClicked(evt);
            }
        });
        btn_removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeStudentActionPerformed(evt);
            }
        });
        jPanel2.add(btn_removeStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 500, 74));

        btn_removeBook.setBackground(new java.awt.Color(0, 102, 102));
        btn_removeBook.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_removeBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_removeBook.setText("Remove Book");
        btn_removeBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeBookMouseClicked(evt);
            }
        });
        btn_removeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeBookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_removeBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 500, 74));

        btn_addBook.setBackground(new java.awt.Color(0, 102, 102));
        btn_addBook.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_addBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_addBook.setText("Add Book");
        btn_addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addBookMouseClicked(evt);
            }
        });
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 500, 74));

        btn_addStudent.setBackground(new java.awt.Color(0, 102, 102));
        btn_addStudent.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_addStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_addStudent.setText("Add Student");
        btn_addStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addStudentMouseClicked(evt);
            }
        });
        btn_addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStudentActionPerformed(evt);
            }
        });
        jPanel2.add(btn_addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 500, 74));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 735, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_removeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeStudentActionPerformed
       
    }//GEN-LAST:event_btn_removeStudentActionPerformed

    private void btn_removeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeBookActionPerformed
       
    }//GEN-LAST:event_btn_removeBookActionPerformed

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed
        
    }//GEN-LAST:event_btn_addBookActionPerformed

    private void btn_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStudentActionPerformed
        
    }//GEN-LAST:event_btn_addStudentActionPerformed

    private void btn_addBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addBookMouseClicked
        
        AddBook ab = new AddBook();
        ab.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_addBookMouseClicked

    private void btn_removeBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeBookMouseClicked
        
        RemoveBook rb = new RemoveBook();
        rb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_removeBookMouseClicked

    private void btn_addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addStudentMouseClicked
        
        AddStudent as = new AddStudent();
        as.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_addStudentMouseClicked

    private void btn_removeStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeStudentMouseClicked
        
        RemoveStudent rs = new RemoveStudent();
        rs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_removeStudentMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        
        StartPage sp = new StartPage();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addBook;
    private javax.swing.JButton btn_addStudent;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_removeBook;
    private javax.swing.JButton btn_removeStudent;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_books;
    private javax.swing.JLabel lbl_studs;
    // End of variables declaration//GEN-END:variables
}
