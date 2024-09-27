/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
//Import scanner
import java.util.Scanner;

public class UsernameandPasswordvalidation {
    
 //Declaration of variables 
    private String username;
    private String password;
    
    //Getters and setters 
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
    }       
        

    
    //Return true only if all checks are passed return length && capitalcheck && numbercheck && specialcheck
    
    String registeruser(){
        
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
    }
    
    public boolean loginUser(String username, String userpassword){
        //Check if the provided username and password match the stored ones
        
        return username.equals(username) && userpassword.equals(username);
    }
    
    public void returnLoginStatus(boolean loginstatus){
        //Display login status
        
        if(loginstatus){
            System.out.println("\n Login Successful!");
        }
    }
}
