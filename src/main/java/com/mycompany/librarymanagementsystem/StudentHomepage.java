/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class StudentHomepage extends javax.swing.JFrame {
    String studId;
    
    public StudentHomepage() {
        initComponents();
        showBooks();
        showDues();
        welcome();
    }
    public StudentHomepage(String studId){
        this.studId = studId;
        initComponents();
        showBooks();
        showDues();
        welcome();
    }
    private void welcome(){
        lbl_welcome.setText("");
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentID = ?;";
            PreparedStatement pstmt = con.prepareStatement(sq);
            pstmt.setString(1, studId);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                lbl_welcome.setText("Welcome "+rs.getString("studentName")+"!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_welcome = new javax.swing.JLabel();
        yd = new javax.swing.JButton();
        lbl_yd = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lbl_bwy = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_reqReissue = new javax.swing.JButton();
        btn_returnBook = new javax.swing.JButton();
        btn_reqIssue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_welcome.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(0, 153, 102));
        lbl_welcome.setText("Welcome Jack!");
        jPanel1.add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 320, 85));

        yd.setBackground(new java.awt.Color(0, 102, 102));
        yd.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        yd.setForeground(new java.awt.Color(255, 255, 255));
        yd.setText("Your dues:");
        yd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ydActionPerformed(evt);
            }
        });
        jPanel1.add(yd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        lbl_yd.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_yd.setForeground(new java.awt.Color(51, 51, 51));
        lbl_yd.setText("0.00");
        jPanel1.add(lbl_yd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 130, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Books with you:");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lbl_bwy.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_bwy.setForeground(new java.awt.Color(51, 51, 51));
        lbl_bwy.setText("2");
        jPanel1.add(lbl_bwy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/BITS_Pilani-Logo.svg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icns/29302.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 735, 190));

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

        btn_reqReissue.setBackground(new java.awt.Color(0, 102, 102));
        btn_reqReissue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_reqReissue.setForeground(new java.awt.Color(255, 255, 255));
        btn_reqReissue.setText("Request for reissuing a book");
        btn_reqReissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reqReissueMouseClicked(evt);
            }
        });
        btn_reqReissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqReissueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reqReissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, 500, 74));

        btn_returnBook.setBackground(new java.awt.Color(0, 102, 102));
        btn_returnBook.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_returnBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_returnBook.setText("Return a book");
        btn_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnBookMouseClicked(evt);
            }
        });
        btn_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 150, 500, 74));

        btn_reqIssue.setBackground(new java.awt.Color(0, 102, 102));
        btn_reqIssue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_reqIssue.setForeground(new java.awt.Color(255, 255, 255));
        btn_reqIssue.setText("Request for issuing a book");
        btn_reqIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reqIssueMouseClicked(evt);
            }
        });
        btn_reqIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqIssueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reqIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 70, 500, 74));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 214, 735, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showBooks(){
        lbl_bwy.setText("");
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int books = rs.getInt("booksBorrowed");
                lbl_bwy.setText(Integer.toString(books));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void showDues(){
        lbl_yd.setText("");
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                double dues = rs.getDouble("charges");
                lbl_yd.setText(Double.toString(dues));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void ydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ydActionPerformed
        
    }//GEN-LAST:event_ydActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_reqReissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqReissueActionPerformed
        
    }//GEN-LAST:event_btn_reqReissueActionPerformed

    private void btn_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookActionPerformed
        
    }//GEN-LAST:event_btn_returnBookActionPerformed

    private void btn_reqIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqIssueActionPerformed
        
    }//GEN-LAST:event_btn_reqIssueActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_reqIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reqIssueMouseClicked
        
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int books = rs.getInt("booksBorrowed");
                if(books>=3){
                    JOptionPane.showMessageDialog(this, "You already borrowed 3 books!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        RequestIssue ri = new RequestIssue(studId);
        ri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reqIssueMouseClicked

    private void btn_returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnBookMouseClicked
        
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int books = rs.getInt("booksBorrowed");
                if(books<=0){
                    JOptionPane.showMessageDialog(this, "You haven't borrowed any books!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        ReturnBook rb = new ReturnBook(studId);
        rb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_returnBookMouseClicked

    private void btn_reqReissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reqReissueMouseClicked
        
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int books = rs.getInt("booksBorrowed");
                if(books<=0){
                    JOptionPane.showMessageDialog(this, "You haven't borrowed any books!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        ReissueBook rib = new ReissueBook(studId);
        rib.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reqReissueMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        
        StartPage sp = new StartPage();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reqIssue;
    private javax.swing.JButton btn_reqReissue;
    private javax.swing.JButton btn_returnBook;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_bwy;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel lbl_yd;
    private javax.swing.JButton yd;
    // End of variables declaration//GEN-END:variables
}
