/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.librarymanagementsystem;


public interface StudentRegistration {
    boolean validateSignup(Student s);
    void insertSignupDetails(Student s);
    void  validateAndInsert(Student s);
}
