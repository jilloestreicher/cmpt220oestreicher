/**

  * Ex5_12.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 3
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 5.12 of Lab 3
  
*/

/**

  * Ex5_12
  
  * Finds the smallest integer n such that n^2 is greater than 12,000
  
*/

public class Ex5_12 {
  public static void main(String[] args) {
    
    //declare integer variable
    int n = 0;
    
    //while loop to find smallest n^2 larger than 12,000
    //increment n each loop
    while((Math.pow(n,2)) <= 12000) {
      
      n++;
      
    }
    
    System.out.println("The smallest integer n such that n^2 is greater than 12,000 is: " + n);
    
  }
}