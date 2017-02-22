/**

  * Ex6_3.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 3
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 6.3 of Lab 3
  
*/

import java.util.Scanner;

/**

  * Ex6_3
  
  * Prompts user to enter integer and reports whether it is a palindrome
  
*/

public class Ex6_3 {
  public static void main(String[] args) {
    
    //scanner class for inputs, declare variable
    Scanner s = new Scanner(System.in);
    int number;
    
    System.out.println("Enter an integer: ");
    number = s.nextInt();
    
    //if statement to determine output regarding outcome of isPalindrome method
    if(isPalindrome(number))
      System.out.println(number + " is a palindrome.");
    else
      System.out.println(number + " is not a palindrome.");
    
  }
    /**
    
      * reverse
      
      * reverses integer entered using do while loop
      
    */
    
    public static int reverse(int number) {
      
      //reverse variable 
      int reverseNum = 0;
      
      //do while loop separates integer and reverses it 
      do {
        
        int remainder;
        
        remainder = number % 10; //extracts digits
        
        reverseNum = reverseNum * 10 + remainder; //refigures integer
        
        number = number / 10; //removes digits
    
      } while(number != 0); //loop continues until integer is 0
      
      //returns reversed number
      return reverseNum;
      
    }
    /**
    
      * isPalindrome
      
      * determines if it is a palindrome using if loop
      
    */
    
    public static boolean isPalindrome(int number) {
      
      //if loop calls reverse method and if yes returns true
      //if no returns false
      if(number == reverse(number))
        return true;
      else 
        return false;
        
    }
}