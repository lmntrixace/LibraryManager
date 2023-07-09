/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ReturnBookClass {
    public static synchronized void returnBook(String studId, String bookId, JFrame j){
        try{
            Connection con = DBConnection.getConnection();
            String sqr = "select * from issueBooks where Status = ? and studentId = ? and bookId = ?;";
            PreparedStatement ps = con.prepareStatement(sqr);
            ps.setString(1, "Not returned");
            ps.setString(2, studId);
            ps.setString(3, bookId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Date td = rs.getDate("todt");
                long todt = td.getTime();
                long curr = System.currentTimeMillis();
                long diff = curr-todt;
                diff /= 1000;
                diff /= 3600;
                diff /= 24;
                String sq1 = "update issueBooks set Status = ? where studentId = ? and bookId = ?;";
                PreparedStatement pup = con.prepareStatement(sq1);
                pup.setString(1, "Returned");
                pup.setString(2, studId);
                pup.setString(3, bookId);
                int ibup = pup.executeUpdate();
                
                String sq2 = "select * from books where bookId = ?;";
                PreparedStatement gcq = con.prepareStatement(sq2);
                gcq.setString(1, bookId);
                ResultSet the_b = gcq.executeQuery();
                int curr_quan=0;
                if(the_b.next())
                    curr_quan = the_b.getInt("quantity");
                
                String sq3 = "update books set quantity = ? where bookId = ?;";
                PreparedStatement upd_books = con.prepareStatement(sq3);
                upd_books.setInt(1, curr_quan+1);
                upd_books.setString(2, bookId);
                int bkup = upd_books.executeUpdate();
                
                String sq4 = "select * from students where studentId = ?;";
                PreparedStatement gcbb = con.prepareStatement(sq4);
                gcbb.setString(1, studId);
                ResultSet the_s = gcbb.executeQuery();
                int curr_bb=0;
                if(the_s.next())
                    curr_bb = the_s.getInt("booksBorrowed");
                
                String sq5 = "update students set booksBorrowed = ? where studentId = ?;";
                PreparedStatement upd_std = con.prepareStatement(sq5);
                upd_std.setInt(1, curr_bb-1);
                upd_std.setString(2, studId);
                int stup = upd_std.executeUpdate();
                
                if(ibup>0 && bkup>0 && stup>0){
                    if(diff>0){
                        JOptionPane.showMessageDialog(j, "Return successful. You returned late."
                                + " You will be charged Rs 10/day since the deadline.");
                        String sch = "select * from students where studentId = ?;";
                        PreparedStatement gcc = con.prepareStatement(sch);
                        gcc.setString(1, studId);
                        ResultSet the_chst = gcc.executeQuery();
                        double curr_charges =0;
                        if(the_chst.next()) 
                            curr_charges = the_chst.getDouble("charges");
                        String upch = "update students set charges = ? where studentId = ?;";
                        PreparedStatement addch = con.prepareStatement(upch);
                        addch.setDouble(1, curr_charges+(diff*10));
                        addch.setString(2, studId);
                        int updatedch = addch.executeUpdate();
                        return;
                    }
                    else{
                        JOptionPane.showMessageDialog(j, "Returned successfully!");
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(j, "Book could not be returned!");
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(j, "You haven't borrowed this book!");
                return;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
