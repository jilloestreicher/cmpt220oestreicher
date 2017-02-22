/**

  * Ex5_1.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 3
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 5.1 of Lab 3
  
*/

import java.util.Scanner;

/**

  * Ex5_1
  
  * Reads an unspecified amount of integers, determines amount of positives and negative,
    computes the total and average

*/

public class Ex5_1 {
  public static void main(String[] args) {
    
    //scanner class for inputs and variables declared
    Scanner s = new Scanner(System.in);
    int num, negatives = 0, positives = 0, count = 0;
    float avg, sum = 0;
    
    System.out.println("Enter an integer, the input ends if it is 0: ");
    num = s.nextInt();
    
    //do while loop, continues until number = 0
    //increases count each time to calculate average
    //collects sum
    //if loop to determine if negative or positive and accumulates for either
    do {
    
      sum = sum + num;  
      
      count++;
      
      if(num > 0) 
        positives++;
        
      if(num < 0)
        negatives++;
      
    }
    while((num = s.nextInt()) != 0);
    
    //average takes total and divides by count
    avg = sum / count;
    
    System.out.println("The number of positives is " + positives);
    System.out.println("The number of negatives is " + negatives);
    System.out.println("The total is " + sum);
    System.out.println("The average is " + avg);
    
  }
}