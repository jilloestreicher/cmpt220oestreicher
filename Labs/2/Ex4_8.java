/**
  
  * Ex4_8.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 4.8 of Lab 2
  
*/

import java.util.Scanner;

/**

  * Ex4_8
  
  * Receives an ASCII code and displays its character
  
*/

public class Ex4_8 {
  public static void main(String[] args) {
    
    //declare scanner class and variables 
    Scanner s = new Scanner(System.in);
    int code;
    char character;
    
    System.out.println("Enter an ASCII code: ");
    code = s.nextInt();
    
    //cast code to a char and store it as character
    character = (char)code;
    
    System.out.println("The character for ASCII code " + code + " is " + character);
     
  }
}





