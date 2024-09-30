/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Usernameandpasswordvalidation {
    
    
 //Declaration of variables 
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    //Public access modifier to declare boolean
    public boolean correct = true;
    public boolean verify = false;
    public boolean check = false;
    
    //Getters and setters to return the declared variables 
    public String getsUsername() {
        return username;
    }

    public void setsUsername(String Username) {
        this.username = Username;
    }

    public String getsPassword() {
        return password;
    }

    public void setsPassword(String Password) {
        this.password = Password;
    }
    
    //Method used to capture the user details when after being entered 
    public void Capture(){
        // Make use of a scanner to allow user input
        Scanner cons = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        //Make use of a constructor and make refernce of the variables declared by making use of the private access
        this.firstname=cons.nextLine();
        
        System.out.println("Please enter your lastname");
        //Make use of a constructor and make refernce of the variables declared by making use of the private access
        this.lastname=cons.nextLine();
        
        //Make use of a do while loop to ensure that the user enters the correct information required should the information fail to meet the requirements 
        do{
            System.out.println("Enter your lastname(Username must have at least 5 characters and must contain an underscore)");
        this.username=cons.nextLine();
        }while(!CHECKusername(this.username));
        //Make use of a do while loop to ensure that the user enters the correct information required should the information fail to meet the requirements 
        do{
            System.out.println("Enter password(Must contain at least 8 characters, a special character must be present, a number and a capital letter)");
        this.password=cons.nextLine();
        }while(checkpassword(this.password));
        
    }
   
    public boolean checkusername(String username){
        
        //Check if username is more than 5 characters long and contains an undersore
        return username.length() >=5 && username.contains("_");
    }
    
    public boolean checkpasswordcomplexity(String userpassword){
    
        //Check if password is at least 8 characters long 
        boolean lengthcheck = userpassword.length() >=8;
        
        //Check if password contains a capital letter, a number, and a special character 
        
        boolean capitalcheck = false;
        boolean numbercheck = false;
        boolean specialcheck = false;
        
        //Initialize a loop 
        for(char c: userpassword.toCharArray()){
            if(Character.isUpperCase(c)){
                capitalcheck = true;
            }else if(Character.isDigit(c)){
                numbercheck = true;
            }else if(Character.isLetterOrDigit(c)){
                specialcheck = true;
            }
        } 
        if(containSpecial && containLetters&& containNumber){
            check = true;
        }else{
            System.out.println("Password is not successfully captured please ensure that the password entered meets all the requirements");
            check = false;
        }
        return check;
    }      
   
    //Return true only if all checks are passed return length && capitalcheck && numbercheck && specialcheck
    
   public String registeruser(){
    
        //Check username validity
        boolean isusernamevalid = checkusername(username);
        
        //Check password complexity
        boolean ispasswordcomplex = checkpasswordcomplexity(password);
        
        //Display registration message
        if(isusernamevalid && ispasswordcomplex){
            System.out.println("Username and Password meet the criteria. User registered successfully");
        }else{
            System.out.println("Username or Password does not meet the criteria. User registration failed!");
        }
        
        return "";
    }
    
    public boolean loginUser(){
        
        Scanner firstnameSc = new Scanner(System.in);
        System.out.println("Welcome user please enter your access details");
        
        //Make use of a do while loop
        System.out.println("Enter your username");
        String Username = firstnameSc.nextLine();
        
        System.out.println("Please enter your password");
        String password = firstnameSc.nextLine();
        
        //Make use of an if statement 
        if(Username.equals(this.username) && password.equals(this.password)){
            correct = true;
        }else{
            System.out.println("USERNAME OR PASSWORD INCORRECT, PLEASE TRY AGAIN!");
            correct = false;
                    
        }while(!correct);
        
        return correct;
    }
    
    public String returnLoginStatus(){
        
        if(correct){
            System.out.println("Welcome To PLANETKRYPTON!" +" " + getLastname());
        }else{
            
            System.out.println("USERNAME OR PASSWORD INCORRECT, PLEASE TRY AGAIN");
        }
     return "";   
    }
    
    }
   
}
