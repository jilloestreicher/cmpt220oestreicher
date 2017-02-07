/**
  
  * Ex4_5.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 9, 2017
  
  * 1.8
  
  * This file contains problem 4.5 of Lab 2
  
*/

import java.util.Scanner;

/**

  * Ex4_5
  
  * Computes the area of the polygon

*/

public class Ex4_5 {
  public static void main(String[] args) {
    
    //scanner class for input, variables declared
    Scanner s = new Scanner(System.in);
    int sides;
    double length, area;
    
    System.out.println("Enter the number of sides: ");
    sides = s.nextInt();
    System.out.println("Enter the length: ");
    length = s.nextDouble();
    
    //compute area using math functions and side and length inputs
    area = ((sides * Math.pow(length,2)) / (4 * Math.tan(Math.PI / sides)));
    
    System.out.println("The area of the polygon is " + area);
    
    
  }
}


