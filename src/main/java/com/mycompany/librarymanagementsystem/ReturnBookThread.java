/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import javax.swing.JFrame;


public class ReturnBookThread implements Runnable {
    Thread t;
    String studId, bId;
    JFrame j;
    public ReturnBookThread(String studId, String bId, JFrame j){
        t = new Thread(this, "ReturnBookThread");
        this.studId = studId;
        this.bId = bId;
        this.j = j;
    }
    public void run(){
        ReturnBookClass.returnBook(studId, bId, j);
    }
}
