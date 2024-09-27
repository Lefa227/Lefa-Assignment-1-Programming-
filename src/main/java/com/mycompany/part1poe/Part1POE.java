/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1poe;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Part1POE {

    public static void main(String[] args) {
        //Import scanner
       Scanner scanner = new Scanner(System.in);
       //Declaration of variables 
       
       String Username;
       String Password;
       String Firstname;
       String Lastname;
       
       //Prompt the user to enter their validation details 
       
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        
        System.out.println("Please enter your firstname");
        String firstname = scanner.nextLine();
        
        System.out.println("Please enter your lastname");
        String lastname = scanner.nextLine();
        
        
    }
}
