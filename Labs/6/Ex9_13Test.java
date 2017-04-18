/**
  * Ex9_13Test.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 6
  * April 20, 2017
  * 1.8
  * This file contains problem 9.13 of Lab 6
*/

import java.util.Scanner;

/**
  * Ex9_13Test.java
  * Test program that prompts the user to enter two-dimensional array and displays the location of the largest element
*/
public class Ex9_13Test {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declare scanner s of system class

    System.out.print("Enter the number of rows and columns in the array: ");
    int rowNum = s.nextInt(); //declare row number variable to hold input
    int colNum = s.nextInt(); //declare column number variable to hold input

    double[][] array = new double[rowNum][colNum]; //declare array variable of row number and column number

    System.out.println("Enter the array: ");

    //nested for loop to load array
    for(int i = 0; i < array.length; i++) { 
      for(int k = 0; k < array[i].length; k++) {
        array[i][k] = s.nextDouble(); 
      }
    }

    Location maximum = locateLargest(array); //location maximum variable calls locateLargest method of location class

    //print out location of max value
    System.out.print("The location of the largest element is " + maximum.maxValue + " at (" + maximum.row + ", " + maximum.column + ")");
  }
  //method to return new location
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
}
    