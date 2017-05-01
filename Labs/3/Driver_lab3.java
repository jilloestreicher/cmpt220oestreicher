/**
  * Driver_Lab3.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 3
  * February 23, 2017
  * 1.8
  * This file contains problem Driver_lab3 of Lab 3
*/

import java.util.Scanner;

/**
  * Driver_lab3
  * Computes the p-norm distance between pairs of points for a given value p
*/

public class Driver_lab3 {
  public static void main(String[] args) {
    
    //scanner class for inputs
    Scanner s = new Scanner(System.in);
    
    //while loop to test if instance is true
    while (true) {
	  
    //declare test variable for looping
    double x1 = s.nextDouble();
	  
    //if loop to determine if test should continue
    if (x1 == 0.0)
      break; //if this true then terminates
	 
    //variables for inputs declared
    double y1 = s.nextDouble();
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();
    double p = s.nextDouble();
	  
    //pNorm equation in output, print to 10 decimals
    System.out.printf("%.10f", Math.pow(Math.pow(Math.abs(x1 - x2) , p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
    System.out.println(); 
    }
  }
}
