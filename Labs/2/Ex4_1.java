/**
  * Ex4_1.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 2
  * February 9, 2017
  * 1.8
  * This file contains problem 4.1 of Lab 2
*/

import java.util.Scanner;

/**
  * Ex4_1
  * This program computes the area of a pentagon
*/

public class Ex4_1 {
  public static void main(String[] args) {
    
    //scanner class for input, declare variable
    Scanner s = new Scanner(System.in);
    double length, side, area;
    
    System.out.println("Enter the length from the center of the pentagon to the vertex: ");
    length = s.nextDouble();
    
    //calculate length of side using length and math functions
    //calculate area with side and math functions
    side = 2 * length * Math.sin(Math.PI / 5);
    area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    
    //round up two digits after decimal point
    area = Math.round(area * 100.0)/100.0;

    System.out.println("The area of the pentagon is " + area);   
  }
}
