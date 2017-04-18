/**
  * Location.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 6
  * April 20, 2017
  * 1.8
  * This file contains problem 9.13 of Lab 6
*/

/**
  * Location
  * Locates a maximal value and its location in a two-dimensional array
*/
public class Location {

  int row; //data field for row
  int column; //data field for column
  double maxValue; //data field for the maximum value


  //constructor for Location
  Location(double[][] a) {
    row = 0; //initialize row to 0
    column = 0; //initialize column to 0
    maxValue = a[0][0]; //initialize maxValue location to 0

    //nested for loops to run through array
    for(int i = 0; i < a.length; i++) {
      for(int k = 0; k < a[i].length; k++) {
        if(a[i][k] > maxValue) { //if loop to check if a at location i,k is bigger than current maxValue
          maxValue = a[i][k]; //set maxValue to new location
          row = i; //row equal to location i
          column = k; //column equal to location k
        }
      }
    } 
  } 
}