/**

  * Ex2_6.java

  * Jill Oestreicher

  * CMPT 220 
  
  * Lab 1
  
  * January 26, 2017
  
  * 1.8 
  
  * This file contains problem 2.6 of Lab 1
  
*/

import java.util.Scanner;

/**

  * Ex2_6

  * This class reads an integer between o and 1000 and adds all the digits in the integer
  
*/

public class Ex2_6 {
  public static void main(String[] args) {
    
    //variables declared, s holds inputs from user
    Scanner s = new Scanner(System.in);
    int integer, sum;
    
    System.out.println("Enter your integer between 0 and 1000: ");
    integer = s.nextInt();
    
    /**
    
      * set sum to 0
      
      * add remainder of integer divided by 10 to sum
      
      * set integer to integer divided by 10 to subtract digit
      
      * add remainder of integer divided by 10 to sum again
      
      * set integer to integer divided by 10 to subtract digit again
      
      * add remainder of integer divided by 10 to sum on more time
    
    */
    sum = 0;
    sum = sum + integer % 10;
    integer = integer/10;
    sum = sum + integer % 10;
    integer = integer/10;
    sum = sum + integer % 10;
        
    System.out.println("The sum of the digits is " + sum);
  }
} 