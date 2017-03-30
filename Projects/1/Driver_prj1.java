/**
  * Driver_prj1.java
  * Jill Oestreicher
  * CMPT 220
  * Project 1
  * March 30, 2017
  * 1.8
  * This file contains the driver class for project 1
*/

import java.util.Scanner;
import java.util.Arrays;

/** 
  * Driver_prj1
  * Receives data for two vectors, implements the convolution operation, outputs result
*/
public class Driver_prj1 {
  public static void main (String[] args) {
    //Scanner class for inputs
    Scanner input = new Scanner(System.in);

    System.out.println("Enter size of first vector: ");
    int vFirstlength = input.nextInt();
    System.out.println("Enter the size of the second vector: ");
    int vSecondlength = input.nextInt();
    
    double[] vFirst = new double[vFirstlength]; //declare first array variable
    double[] vSecond = new double[vSecondlength]; //declare second array variable

   
    System.out.println("Enter elements of first vector: ");
    //for loop to assign inputs to array
    for(int i = 0; i < vFirstlength; i++) {
      vFirst[i] = input.nextDouble();
    }
    System.out.println("Enter elements of second vector: ");
    //for loop to assign inputs to array
    for(int i = 0; i < vSecondlength; i++) {
      vSecond[i] = input.nextDouble();
    }

    System.out.print(Arrays.toString(convolveVectors(vFirst, vSecond))); //call method to print result, use array class to call as string
  }
  /**
    * convolveVectors
    * convolves vectors
  */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    //declare result variable as first and second length minus 1
    double[] vResult = new double[ (vFirst.length + vSecond.length ) - 1];
    
    int indx = 0; //index variable
    int shift = 0; //shift variable
    
    //while loop to check if current index is less than result length  (very important, will try not to forget in future)
    while(indx < vResult.length) {
      shift = 0; //set shift to 0 again
      while(shift < vSecond.length) { //while loop to make sure shift is less than second array
        if((indx - shift) < 0 || (indx - shift) >= vFirst.length || shift >= vSecond.length) { //if out of bounds do not perform convolutio
        }
        else {
          vResult[indx] += (vFirst[indx - shift] * vSecond[shift]); //perform convolution
        }
        shift = shift + 1; //add to shift
      }
      indx = indx + 1; //add to index
    }
    return vResult; //return result
  }
}

 