/**
  * Ex10_17.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 7
  * April 27, 2017
  * 1.8
  * This file contains problem 10.17 of Lab 7
*/

import java.math.BigDecimal;

/**
  * Ex10_17.java
  * Finds the first 10 square numbers that are greater than Long.MAX_VALUE (9,223,372,036,854,775,807)
*/
public class Ex10_17 {
  public static void main(String[] args) {
    //make BigDecimal value from Long.MAX_VALUE
    BigDecimal longMaxVal = new BigDecimal(Long.MAX_VALUE);
    //make long value for square root of Long.MAX_VALUE
    long first = (long)Math.sqrt(Long.MAX_VALUE);
    //first num is equal to square root of Long.MAX_VALUE
    BigDecimal num = new BigDecimal(first);
    //counter variable
    int i = 0;

    //while loop to make sure counts 10 values
    while(i < 10) {
      //squared is BigDecimal value of num multiplied by num
      BigDecimal squared = num.multiply(num);
   
      //if loop to check if squared is bigger than longMaxVal
      if(squared.compareTo(longMaxVal) > 0) {
        i++; //increment i
        System.out.println(num + " squared is " + squared); //print out values
      }
      num = num.add(BigDecimal.ONE); //increment num
    }
  }
}