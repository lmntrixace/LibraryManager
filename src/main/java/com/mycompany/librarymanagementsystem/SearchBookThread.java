/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import javax.swing.JFrame;


public class SearchBookThread implements Runnable {
    Thread t;
    JFrame j;
    String bId, bName;
    MDate fd, td;
    String sId;
    public SearchBookThread(String studId, String bId, String bName, MDate fDate, MDate tDate, JFrame j){
        t = new Thread(this, "SearchBookThread");
        this.j=j;
        this.bId=bId;
        this.bName=bName;
        fd = fDate;
        td = tDate;
        sId = studId;
    }
    public void run(){
        SearchBookClass.searchBook(sId, bId, bName, fd, td, j);
    }
}
