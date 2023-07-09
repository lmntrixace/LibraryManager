/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;


public class SearchBookClass {
    public static synchronized void searchBook(String studId, String bookId, String bookName, MDate fromDate, MDate toDate, JFrame j){
        if(bookId.equals("") && bookName.equals("")){
            JOptionPane.showMessageDialog(j, "Please enter book id or book name!");
            return;
        }
        if(fromDate.getD().equals("") || fromDate.getM().equals("") || fromDate.getY().equals("")
            || toDate.getD().equals("") || toDate.getM().equals("") || toDate.getY().equals("")
            || fromDate.getD().equals("DD") || fromDate.getM().equals("MM") || fromDate.getY().equals("YYYY")
            || toDate.getD().equals("DD") || toDate.getM().equals("MM") || toDate.getY().equals("YYYY") ){
            JOptionPane.showMessageDialog(j, "Please enter dates!");
            return;
        }
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d1 = sdformat.parse(fromDate.getY()+"-"+fromDate.getM()+"-"+fromDate.getD());
            Date d2 = sdformat.parse(toDate.getY()+"-"+toDate.getM()+"-"+toDate.getD());
            long diff = d2.getTime()-d1.getTime();
            diff /= 1000;
            diff /= 3600;
            diff /= 24;
            if(diff>15){
                JOptionPane.showMessageDialog(j, "You cannot borrow for more than 15 days!");
                return;
            }
        }catch(ParseException e){
            System.out.println("Couldn't parse Date");
        }
        if(!bookId.equals("")){
            try{
            Connection con = DBConnection.getConnection();
                String sq1 = "select * from books where bookId = ?;";
                PreparedStatement pst = con.prepareStatement(sq1);
                pst.setString(1, bookId);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    int quantity = rs.getInt("quantity");
                    if(quantity<=0){
                        JOptionPane.showMessageDialog(j, 
                                "This book is currently unavailable. Check back soon!");
                        return;
                        
                    }
                    else{
                        String sq2 = "update books set quantity = ? where bookId = ?;";
                        PreparedStatement upd = con.prepareStatement(sq2);
                        upd.setInt(1, quantity-1);
                        upd.setString(2, bookId);
                        int updated = upd.executeUpdate();
                        String sqqq = "select * from students where studentId = ?;";
                        PreparedStatement gs = con.prepareStatement(sqqq);
                        gs.setString(1, studId);
                        ResultSet gr = gs.executeQuery();
                        int updbrr=0;
                        if(gr.next()){
                            int borrowed = gr.getInt("booksBorrowed");
                            String sqty = "update students set booksBorrowed = ? where studentId = ?;";
                            PreparedStatement ubb = con.prepareStatement(sqty);
                            ubb.setInt(1, borrowed+1);
                            ubb.setString(2, studId);
                            updbrr = ubb.executeUpdate();
                        }
                        if(updated>0 && updbrr>0){
                            String sq3 = "insert into issueBooks (studentId, bookId, fromdt, todt, Status)"
                                    + " values (?,?,?,?,?);";
                            PreparedStatement ins = con.prepareStatement(sq3);
                            ins.setString(1, studId);
                            ins.setString(2, bookId);
                            ins.setString(5, "Not returned");
                            Date d1 = sdformat.parse(fromDate.getY()+"-"+fromDate.getM()+"-"+fromDate.getD());
                            Date d2 = sdformat.parse(toDate.getY()+"-"+toDate.getM()+"-"+toDate.getD());
                            java.sql.Date sd1 = new java.sql.Date(d1.getTime());
                            java.sql.Date sd2 = new java.sql.Date(d2.getTime());
                            ins.setDate(3, sd1);
                            ins.setDate(4, sd2);
                            int updIss = ins.executeUpdate();
                            
                            if(updIss>0){
                                JOptionPane.showMessageDialog(j, "The book has been issued to you from "
                                +d1+" to "+d2);
                                return;
                            }
                            else{
                                JOptionPane.showMessageDialog(j, "Book could not be issued!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(j, "Book could not be issued!");
                            return;
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(j, "This book is unavailable!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(!bookName.equals("")){
            try{
            Connection con = DBConnection.getConnection();
                String sq1 = "select * from books where bookName = ?;";
                PreparedStatement pst = con.prepareStatement(sq1);
                pst.setString(1, bookName);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    int quantity = rs.getInt("quantity");
                    if(quantity<=0){
                        JOptionPane.showMessageDialog(j, 
                                "This book is currently unavailable. Check back soon!");
                        return;
                        
                    }
                    else{
                        String sq2 = "update books set quantity = ? where bookName = ?;";
                        PreparedStatement upd = con.prepareStatement(sq2);
                        upd.setInt(1, quantity-1);
                        upd.setString(2, bookName);
                        int updated = upd.executeUpdate();
                        String sqqq = "select * from students where studentId = ?;";
                        PreparedStatement gs = con.prepareStatement(sqqq);
                        gs.setString(1, studId);
                        ResultSet gr = gs.executeQuery();
                        int updbrr=0;
                        if(gr.next()){
                            int borrowed = gr.getInt("booksBorrowed");
                            String sqty = "update students set booksBorrowed = ? where studentId = ?;";
                            PreparedStatement ubb = con.prepareStatement(sqty);
                            ubb.setInt(1, borrowed+1);
                            ubb.setString(2, studId);
                            updbrr = ubb.executeUpdate();
                        }
                        if(updated>0 && updbrr>0){
                            String sqbtb = "select * from books where bookName = ?;";
                            PreparedStatement cnv = con.prepareStatement(sqbtb);
                            cnv.setString(1, bookName);
                            ResultSet rbtb = cnv.executeQuery();
                            String gbtb="";
                            if(rbtb.next()){
                                gbtb = rbtb.getString("bookId");
                            }
                            String sq3 = "insert into issueBooks (studentId, bookId, fromdt, todt, Status)"
                                    + " values (?,?,?,?,?);";
                            PreparedStatement ins = con.prepareStatement(sq3);
                            ins.setString(1, studId);
                            ins.setString(2, gbtb);
                            ins.setString(5, "Not returned");
                            Date d1 = sdformat.parse(fromDate.getY()+"-"+fromDate.getM()+"-"+fromDate.getD());
                            Date d2 = sdformat.parse(toDate.getY()+"-"+toDate.getM()+"-"+toDate.getD());
                            java.sql.Date sd1 = new java.sql.Date(d1.getTime());
                            java.sql.Date sd2 = new java.sql.Date(d2.getTime());
                            ins.setDate(3, sd1);
                            ins.setDate(4, sd2);
                            int updIss = ins.executeUpdate();
                            
                            if(updIss>0){
                                JOptionPane.showMessageDialog(j, "The book has been issued to you from "
                                +d1+" to "+d2);
                                return;
                            }
                            else{
                                JOptionPane.showMessageDialog(j, "Book could not be issued!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(j, "Book could not be issued!");
                            return;
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(j, "This book is unavailable!");
                    return;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
