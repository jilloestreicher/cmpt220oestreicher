/**
  * Ex7_9.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 4
  * March 1, 2017
  * 1.8
  * This file contains problem 7.9 of Lab 4
*/

import java.util.Scanner;

/**
  * Ex7_9
  * Prompts user to input 10 numbers and returns smallest value
*/
public class Ex7_9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //scanner class for inputs
    double[] array = new double[10]; //declare array of 10 doubles
    
    System.out.println("Enter ten numbers: ");
    
    //for loop to assign inputs to array
    for(int i = 0; i < 10; i++) {
      array[i] = s.nextDouble();
    }
    System.out.println("The minimum number is: " + min(array)); //call method to outprint
  }
  /**
    * min
    * finds smallest number in array
  */
  public static double min(double[] array){
    double small = array[0]; //variable to hold smallest number, assign to index 0 in array
    
    //for loop to go through inputs
    //each time number is smaller than current minimum, assign it to minimum
    for(int j = 0; j < 10; j++) {
      if(array[j] < small)
        small = array[j];
    }
    return small; // return smallest value
  }
}