/**

  * Ex2_5.java

  * Jill Oestreicher

  * CMPT 220 
  
  * Lab 1
  
  * January 26, 2017
  
  * 1.8 
  
  * This file contains problem 2.5 of Lab 1
  
*/

import java.util.Scanner;

/**

  * Ex2_5

  * This class reads in subtotal and gratuity rate then computes the gratuity and total
  
*/
public class Ex2_5 {
  public static void main(String[] args) {
    
    //variables declared, s holds inputs from user
    Scanner s = new Scanner(System.in);
    double subtotal, gratuityRate, gratuity, total;
    
    System.out.println("Enter your subtotal: ");
    subtotal = s.nextDouble();
    
    System.out.print("Enter your gratuity rate: ");
    gratuityRate = s.nextDouble();
    
    /**
    
      * gratuity is calculated by multiplying given subtotal and gratuity rate then dividing answer by 100
    
      * total is calculated by adding subtotal and newly calculated gratuity
       
    */
    gratuity = (subtotal * gratuityRate) / 100;
    total = subtotal + gratuity;
    
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
} 