/**
  * Ex6_2.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 3
  * February 23, 2017
  * 1.8
  * This file contains problem 6.2 of Lab 3
*/

import java.util.Scanner;

/**
  * Ex6_2
  * Prompts user to enter integer and then sums the digits
*/

public class Ex6_2 {
  public static void main(String[] args) {
    
    //scanner class for input and variable declared
    Scanner s = new Scanner(System.in);
    long n;
    
    System.out.println("Enter an integer: ");
    n = s.nextLong();
    
    //print out answer by calling method in printline
    System.out.println("The sum of the integer is: " + sumDigits(n));
  }
    
    /**
      * sumDigits
      * computes sum of the digits in an integer
    */
    public static int sumDigits(long n) {
      
      int sum = 0;
      
      //do while loop so sum can be totaled while integer is separated until no digits are left
      do {
        sum += (n % 10); //extracts digits
      } while((n = n / 10) != 0); //removes extracted digit and checks if digits left
      
      //return integer answer
      return sum;
    }
}
