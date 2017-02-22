/**

  * Ex5_13.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 3
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 5.13 of Lab 3
  
*/

/**

  * Ex5_13
  
  * Finds the largest n such that n^3 < 12,000
*/

public class Ex5_13 {
  public static void main(String[] args) {
    
    //declare integer variable
    int n = 0;
    
    //while loop to search through integers until find largest cubed less than 12,000
    //accumulate n by 1 each loop
    while((Math.pow(n,3)) < 12000) {
      
      n++;
       
    } 
    
    //subtract one from integer when printing because had found first one larger than 12,000
    System.out.println("The largest integer n such that n^3 is less than 12,000 is: " + (n-1));
    
  }
}