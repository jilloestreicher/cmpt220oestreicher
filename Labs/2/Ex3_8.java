/**
  
  * Ex3_8.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 9, 2017
  
  * 1.8
  
  * This file contains problem 3.8 of Lab 2
  
*/

import java.util.Scanner;

/**

  * Ex3_8
  
  * This class sorts three integers in non-decreasing order

*/

public class Ex3_8 {
  public static void main(String[] args) {
  
    //variables declared, s holds input from user
    Scanner s = new Scanner(System.in);
    int num1, num2, num3;
    
    System.out.println("Enter your first integer: ");
    num1 = s.nextInt();
    System.out.println("Enter your second integer: ");
    num2 = s.nextInt();
    System.out.println("Enter your third and final integer: ");
    num3 = s.nextInt();
    
    //if statements check if number is less than or equal to other two numbers
    //and nested if checks if other number is less than or equal to third number
    //else statement prints out if other number is not less than or equal to third number
    if ((num1 <= num2) && (num1 <= num3)) {
      if (num2 <= num3) {
        System.out.println(num1 + " " + num2 + " " + num3);
      }
      else {
        System.out.println(num1 + " " + num3 + " " + num2);
      }
    }
    else if ((num2 <= num1) && (num2 <= num3)) {
      if (num1 <= num3) {
        System.out.println(num2 + " " + num1 + " " + num3);
      }
      else {
        System.out.println(num2 + " " + num3 + " " + num1);
      }   
    }
    else if ((num3 <= num2) && (num3 <= num1)) {
      if(num2 <= num1) {
        System.out.println(num3 + " " + num2 + " " + num1);
      }
      else {
        System.out.println(num3 + " " + num1+ " " + num2);
      }
    } 
  }
}
    
