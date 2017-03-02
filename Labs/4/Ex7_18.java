/**
  * Ex7_18.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 4
  * March 1, 2017
  * 1.8
  * This file contains problem 7.18 of Lab 4
*/

import java.util.Scanner;

/**
  * Ex7_18
  * Reads in 10 numbers and bubble sorts them
*/
public class Ex7_18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //scanner class for inputs
    
    double[] array = new double[10]; //declare array of 10 doubles
    
    System.out.println("Enter ten numbers: ");
    
    //for loop to assign inputs to array
    for(int i = 0; i < 10; i++) {
      array[i] = s.nextDouble();
    } 
    bubbleSort(array); //call bubbleSort method
    
    //for loop to print out numbers from 
    for(int j = 0; j < 10; j++){
      System.out.println(array[j]);
    }
  }
  /**
    * bubbleSort
    * Sorts numbers using bubble sort method
  */
  public static void bubbleSort(double[] numbers) {
    int num = numbers.length - 1; //holds length of array
    
    //while loop to check if array finished
    while( num != 0) {
      int k; //array value at index 
      
      //for loop to make pass through array
      //compares pairs, if not in order swaps them
      for(k = 0; k < num; k++) {
        
        // if loop to check if array value is greater than next 
        if(numbers[k] > numbers[k + 1]) {
          double current = numbers[k]; //temporary current number to assign to array index k
          numbers[k] = numbers[k + 1]; //assigns index k to next number of index
          numbers[k + 1] = current; //next number is current number
        }
      }
      num = k - 1; //length is subtracted by 1
    }
  }
}