/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnection {
    public static void createDatabase(){
        try {
            boolean exists=false;
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String databaseName = "lms";
            String username = "root";
            String password = "rootpass";

            String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url,username, password);
            ResultSet rs = conn.getMetaData().getCatalogs();
            while (rs.next()){
              String exdb = rs.getString(1);
                if(exdb.equals(databaseName)){
                    exists=true;
                    break;
                }
            }
            rs.close();

            if(!exists){
                String sql = "CREATE DATABASE " + databaseName;
                Statement statement = conn.createStatement();
                statement.executeUpdate(sql);
                statement.close();
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/lms";
        String username = "root";
        String password = "rootpass";
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static void createStudentsTable(){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String p = "SELECT * FROM information_schema.tables WHERE table_schema = ? AND table_name = ? LIMIT 1;";
            PreparedStatement qw = con.prepareStatement(p);
            qw.setString(1, "lms");
            qw.setString(2, "students");
            ResultSet r = qw.executeQuery();
            if(!r.next()){
               String sq = "create table students (studentId varchar(20) not null primary key, "
                    + "studentName varchar(50) not null, "
                    + "email varchar(50) not null, "
                    + "password varchar(50) not null, "
                    + "booksBorrowed int default 0, "
                    + "charges double precision(8,3) default 0);";
                PreparedStatement pst = con.prepareStatement(sq);
                pst.executeUpdate(); 
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void createBooksTable(){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String p = "SELECT * FROM information_schema.tables WHERE table_schema = ? AND table_name = ? LIMIT 1;";
            PreparedStatement qw = con.prepareStatement(p);
            qw.setString(1, "lms");
            qw.setString(2, "books");
            ResultSet r = qw.executeQuery();
            if(!r.next()){
                String sq = "create table books (bookId varchar(10) not null primary key, "
                    + "bookName varchar(50) not null, "
                    + "quantity int);";
                PreparedStatement pst = con.prepareStatement(sq);
                pst.executeUpdate();
            }  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void createIssueBooksTable(){
        try{
            Connection con;
            con = DBConnection.getConnection();
            String p = "SELECT * FROM information_schema.tables WHERE table_schema = ? AND table_name = ? LIMIT 1;";
            PreparedStatement qw = con.prepareStatement(p);
            qw.setString(1, "lms");
            qw.setString(2, "issueBooks");
            ResultSet r = qw.executeQuery();
            if(!r.next()){
                String sq = "create table issueBooks (issueId int not null auto_increment primary key, "
                    + "studentId varchar(10) not null, "
                    + "bookId varchar(10) not null, "
                    + "fromdt DATE, "
                    + "todt DATE, Status varchar(20));";
                PreparedStatement pst = con.prepareStatement(sq);
                pst.executeUpdate();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
