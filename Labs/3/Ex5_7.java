/**
  * Ex5_7.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 3
  * February 23, 2017
  * 1.8
  * This file contains problem 5.7 of Lab 3 
*/

/**
  * Ex5_7
  * Calculates tuition after 10 years and total cost of four years
*/

public class Ex5_7 {
  public static void main(String[] args) {
    
    //variables for tuition and four year cost declared and initialized
    double tuition = 10000.0, fourYearCost = 0.0;
    
    //for loop to accumulate tuition between 0 and 9 years inclusive (10 years)
    for(int i = 0; i < 10; i++) {
      tuition = (tuition * .05) + tuition;
    }  
    
    //for loop to accumulat four year cost by adding tuition four times
    for(int j = 0; j < 4; j++) {
      fourYearCost = fourYearCost + tuition;
    }
    System.out.println("The tuition of this school in 10 years will be " + tuition);
    System.out.println("The total cost of four years' worth of tuition after ten years is " + fourYearCost);
  }
}
