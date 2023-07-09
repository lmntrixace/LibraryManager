/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AddBook extends javax.swing.JFrame {

    public AddBook() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_bookId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_bookName = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Book Id: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        txt_bookId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 387, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Enter Book Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        txt_bookName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 387, -1));

        btn_add.setBackground(new java.awt.Color(0, 102, 102));
        btn_add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Enter quantity: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        txt_quantity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 387, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 160, 740, 280));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Add a book:");
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 740, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        AdminHomepage ah = new AdminHomepage();
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        
        String bookId = txt_bookId.getText();
        String bookName = txt_bookName.getText();
        if(bookId.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter book id!");
            return;
        }
        if(bookName.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter book name!");
            return;
        }
        if(txt_quantity.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter quantity of books to add!");
        }
        int quantity = Integer.parseInt(txt_quantity.getText());
        addBookH(bookId, bookName, quantity, this);
    }//GEN-LAST:event_btn_addMouseClicked

    public static void addBookH(String bookId, String bookName, int quantity, JFrame j){
        try{
            Connection con = DBConnection.getConnection();
            String sqgb = "select * from books where bookId = ?;";
            PreparedStatement gtb = con.prepareStatement(sqgb);
            gtb.setString(1, bookId);
            ResultSet theB = gtb.executeQuery();
            if(theB.next()){
                int curr_quan = theB.getInt("quantity");
                String sqatob = "update books set quantity = ? where bookId = ?;";
                PreparedStatement atob = con.prepareStatement(sqatob);
                atob.setInt(1, curr_quan+quantity);
                atob.setString(2, bookId);
                int addedobook = atob.executeUpdate();
                if(addedobook>0){
                    JOptionPane.showMessageDialog(j, "Book has been added successfully!");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(j, "Book could not be added!");
                    return;
                }
            }
            else{
                String sqatnb = "insert into books (bookId, bookName, quantity) "
                        + "values (?,?,?);";
                PreparedStatement atnb = con.prepareStatement(sqatnb);
                atnb.setString(1, bookId);
                atnb.setString(2, bookName);
                atnb.setInt(3, quantity);
                int addednbook = atnb.executeUpdate();
                if(addednbook>0){
                    JOptionPane.showMessageDialog(j, "Book has been added successfully!");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(j, "Book could not be added!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void addBook(String bookId, String bookName, int quantity){
        try{
            Connection con = DBConnection.getConnection();
            String sqgb = "select * from books where bookId = ?;";
            PreparedStatement gtb = con.prepareStatement(sqgb);
            gtb.setString(1, bookId);
            ResultSet theB = gtb.executeQuery();
            if(theB.next()){
                int curr_quan = theB.getInt("quantity");
                String sqatob = "update books set quantity = ? where bookId = ?;";
                PreparedStatement atob = con.prepareStatement(sqatob);
                atob.setInt(1, curr_quan+quantity);
                atob.setString(2, bookId);
                int addedobook = atob.executeUpdate();
                if(addedobook>0){
                    System.out.println("Book has been added successfully!");
                    return;
                }
                else{
                    System.out.println("Book could not be added!");
                    return;
                }
            }
            else{
                String sqatnb = "insert into books (bookId, bookName, quantity) "
                        + "values (?,?,?);";
                PreparedStatement atnb = con.prepareStatement(sqatnb);
                atnb.setString(1, bookId);
                atnb.setString(2, bookName);
                atnb.setInt(3, quantity);
                int addednbook = atnb.executeUpdate();
                if(addednbook>0){
                    System.out.println("Book has been added successfully!");
                    return;
                }
                else{
                    System.out.println("Book could not be added!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_bookId;
    private javax.swing.JTextField txt_bookName;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
