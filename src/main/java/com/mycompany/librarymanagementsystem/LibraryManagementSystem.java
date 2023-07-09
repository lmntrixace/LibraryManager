/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LibraryManagementSystem {
    
    public static void main(String[] args) {
        
        DBConnection.createDatabase();
        DBConnection.createStudentsTable();
        DBConnection.createBooksTable();
        DBConnection.createIssueBooksTable();
        addSomeBooks();
        
        
        StartPage sp = new StartPage();
        sp.setVisible(true);
    }
    public static void addSomeBooks(){
        AddBook.addBook("1","Atomic Habits" , 10);
        AddBook.addBook("2", "Digital Design", 10);
        AddBook.addBook("3","Differential Equations" , 10);
        AddBook.addBook("4", "Thermodynamics", 10);
        AddBook.addBook("5","General Biology" , 10);
        AddBook.addBook("6", "Discrete Structures", 10);
        AddBook.addBook("7","Java Reference" , 10);
        AddBook.addBook("8", "Philosophy", 10);
        AddBook.addBook("9","Psychology" , 10);
        AddBook.addBook("10", "Microprocessors", 10);
    }
}
