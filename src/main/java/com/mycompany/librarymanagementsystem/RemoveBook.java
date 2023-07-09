/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class RemoveBook extends javax.swing.JFrame {


    public RemoveBook() {
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
        btn_removeAll = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
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

        btn_removeAll.setBackground(new java.awt.Color(0, 102, 102));
        btn_removeAll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_removeAll.setForeground(new java.awt.Color(255, 255, 255));
        btn_removeAll.setText("Remove All Copies");
        btn_removeAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeAllMouseClicked(evt);
            }
        });
        btn_removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeAllActionPerformed(evt);
            }
        });
        jPanel1.add(btn_removeAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Enter quantity: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        txt_quantity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 387, -1));

        btn_remove.setBackground(new java.awt.Color(0, 102, 102));
        btn_remove.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("Remove");
        btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeMouseClicked(evt);
            }
        });
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 160, 740, 300));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Remove a book:");
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

    private void btn_removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeAllActionPerformed
        
    }//GEN-LAST:event_btn_removeAllActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        AdminHomepage ah = new AdminHomepage();
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_removeAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeAllMouseClicked
        
        removeAllBooks();
    }//GEN-LAST:event_btn_removeAllMouseClicked
    private void removeAllBooks(){
        String bookId = txt_bookId.getText();
        String bookName = txt_bookName.getText();
        if(bookId.equals("") && bookName.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter book id or name!");
            return;
        }
        Connection con = DBConnection.getConnection();
        if(!bookId.equals("")){
            try{
                String sq = "delete from books where bookId = ?;";
                PreparedStatement rmb = con.prepareStatement(sq);
                rmb.setString(1, bookId);
                int del = rmb.executeUpdate();
                if(del>0){
                    JOptionPane.showMessageDialog(this, "The book has been removed!");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "The book could not be removed or "
                            + "it doesn't exist!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
                return;
            }       
        }
        if(!bookName.equals("")){
            try{
                String sq = "delete from books where bookName = ?;";
                PreparedStatement rmb = con.prepareStatement(sq);
                rmb.setString(1, bookName);
                int del = rmb.executeUpdate();
                if(del>0){
                    JOptionPane.showMessageDialog(this, "The book has been removed!");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "The book could not be removed or "
                            + "it doesn't exist!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
                return;
            }
        }
    }
    
    private void btn_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMouseClicked
        
        removeBook();
    }//GEN-LAST:event_btn_removeMouseClicked
    private void removeBook(){
        String bookId = txt_bookId.getText();
        String bookName = txt_bookName.getText();
        if(bookId.equals("") && bookName.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter book id or name!");
            return;
        }
        if(txt_quantity.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter quantity to remove!");
            return;
        }
        int quantity = Integer.parseInt(txt_quantity.getText());
        Connection con = DBConnection.getConnection();
        if(!bookId.equals("")){
            try{
                String sqgtb = "select * from books where bookId = ?;";
                PreparedStatement gtb = con.prepareStatement(sqgtb); 
                gtb.setString(1, bookId);
                ResultSet theB = gtb.executeQuery();
                if(theB.next()){
                    int curr_quan = theB.getInt("quantity");
                    int remaining = curr_quan - quantity;
                    if(remaining<0){
                        JOptionPane.showMessageDialog(this, "There are only "+curr_quan+" copies of this book!");
                        return;
                    }
                    else{
                        String squq = "update books set quantity = ? where bookId = ?;";
                        PreparedStatement uq = con.prepareStatement(squq);
                        uq.setInt(1, remaining);
                        uq.setString(2, bookId);
                        int udqd = uq.executeUpdate();
                        if(udqd>0){
                            JOptionPane.showMessageDialog(this, "Removed "+quantity
                                    +" copies of this book successfully!");
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "The book could not be removed!");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "This book doesn't exist!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        if(!bookName.equals("")){
            try{
                String sqgtb = "select * from books where bookName = ?;";
                PreparedStatement gtb = con.prepareStatement(sqgtb); 
                gtb.setString(1, bookName);
                ResultSet theB = gtb.executeQuery();
                if(theB.next()){
                    int curr_quan = theB.getInt("quantity");
                    int remaining = curr_quan - quantity;
                    if(remaining<0){
                        JOptionPane.showMessageDialog(this, "There are only "+curr_quan+" copies of this book!");
                        return;
                    }
                    else{
                        String squq = "update books set quantity = ? where bookName = ?;";
                        PreparedStatement uq = con.prepareStatement(squq);
                        uq.setInt(1, remaining);
                        uq.setString(2, bookName);
                        int udqd = uq.executeUpdate();
                        if(udqd>0){
                            JOptionPane.showMessageDialog(this, "Removed "+quantity
                                    +" copies of this book successfully!");
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "The book could not be removed!");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "This book doesn't exist!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_removeAll;
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
