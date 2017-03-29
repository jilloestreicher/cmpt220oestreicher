/**
  * Ex7_32.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 5
  * March 30, 2017
  * 1.8
  * This file contains problem 7.32 of Lab 5
*/

import java.util.Scanner;

/**
  * Ex7_32
  * Prompts user to enter list and displays it after partition
*/

public class Ex7_32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //scanner class for inputs
    
    System.out.println("Enter size of array: ");
    int size = s.nextInt(); //declare variable for size of array
    System.out.print("Enter contents, first number is pivot: ");
    int[] list = new int[size]; //declare variable for array of size size
    
    //fill contents of array
    for(int i = 0; i < size; i++) {
      list[i] = s.nextInt();
    }
    partition(list); //invoke method on array
    
    System.out.print("After the partition, the list is ");
    //for loop to print out numbers from array 
    for(int j = 0; j < list.length; j++){
      System.out.print(list[j] + " ");
    }
   
  }
  /**
    * partition
    * partitions list
  */
  public static int partition(int[] list) {
    int first = 0; //first value set to zero
    int below = first + 1; //value below pivot set to first + 1
    int above = list.length - 1; //value above pivot set to length - 1
    int pivot = list[first]; //pivot set to list at first index
    
    //while loop to function while above place is greater than below
    while (above > below) {
      //while loop to function while list at index below is less than or equal to pivot 
        //and below is less than or equal to above
      while (list[below] <= pivot && below <= above) {
        below++; //increment below
      }
      //while loop to function while list at index above is greater than pivot 
        //and below is less than or equal to above
      while (list[above] > pivot && below <= above) {
        above--; //decrement above
      }
      //if loop to determine if above is greater than below
      if (above > below) {
        int temp = list[above]; //declare temporary variable as list at index above
        list[above] = list[below]; //set list index above to list index below 
        list[below] = temp; //list at index below is now temp
      }
    }
    //while loop to function while list at index above is greater than or equal to pivot 
        //and above is greater than or equal to below
    while (list[above] >= pivot && above >= below ) {
      above--; //decrement above
    }
    //if loop to determine if above is greater than first
    if (above > first) {
      int temp2 = list[above]; //another temporary variable to be set to list at index above
      list[above] = list[first]; ////set list index above to list index first
      list[first] = temp2;//list at index first is now temp
      return above; //return above place
    } 
    else {
      return first; //return below place
    }
  }
}