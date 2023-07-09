/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class AddStudent extends javax.swing.JFrame implements StudentRegistration{

    public AddStudent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_sName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_sId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_sEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_sPassword = new javax.swing.JPasswordField();
        btn_addStudent = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Student's Name: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        txt_sName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 387, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Enter Student's BITS ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txt_sId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_sId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 387, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Enter Student's BITS email: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        txt_sEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_sEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 387, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Enter Student's password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txt_sPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_sPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 387, -1));

        btn_addStudent.setBackground(new java.awt.Color(0, 102, 102));
        btn_addStudent.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
        jPanel1.add(btn_addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 160, 740, 430));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Add a student:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 320, 85));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 740, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStudentActionPerformed
        
    }//GEN-LAST:event_btn_addStudentActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        AdminHomepage ah = new AdminHomepage();
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked
    public boolean validateSignup(Student s){
        String name = s.getName();
        String id = s.getId();
        String email = s.getEmail();
        String password = s.getPassword();
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter student's name!");
            return false;
        }
        if(id.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter student's ID!");
            return false;
        }
        
        try{
            Connection con = DBConnection.getConnection();
            String x ="select * from students where studentId = ?;";
            PreparedStatement pst = con.prepareStatement(x);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "This student is already registered!");
                return false;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        if(email.equals("") || !email.matches("^.+@.+\\..+$")){
            JOptionPane.showMessageDialog(this, "Please enter student's valid email!");
            return false;
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a password!");
            return false;
        }
        return true;
    }
    public void insertSignupDetails(Student s){
        String name = s.getName();
        String id = s.getId();
        String email = s.getEmail();
        String password = s.getPassword();
        try{
            Connection con = DBConnection.getConnection();
            String x ="insert into students (studentId, studentName, email, password)"
                    + " values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(x);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, email);
            pst.setString(4, password);
            int rws = pst.executeUpdate();
            if(rws>0){
                JOptionPane.showMessageDialog(this, "The student has been added successfully!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Registration failed!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    public synchronized void  validateAndInsert(Student s){
        if(validateSignup(s)){
            insertSignupDetails(s);
        }
    }
    private void btn_addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addStudentMouseClicked
        
        String name = txt_sName.getText();
        String id = txt_sId.getText();
        String email = txt_sEmail.getText();
        String password = txt_sPassword.getText();
        Student s = new Student(id, name, email, password);
        validateAndInsert(s);
    }//GEN-LAST:event_btn_addStudentMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addStudent;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_sEmail;
    private javax.swing.JTextField txt_sId;
    private javax.swing.JTextField txt_sName;
    private javax.swing.JPasswordField txt_sPassword;
    // End of variables declaration//GEN-END:variables
}
