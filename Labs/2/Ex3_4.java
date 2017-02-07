/**
  
  * Ex3_4.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 9, 2017
  
  * 1.8
  
  * This file contains problem 3.4 of Lab 2
  
*/

/**

  * Ex3_4
  
  * This class assigns a randomly generated integer to a month

*/

public class Ex3_4 {
  public static void main(String[] args) {
    
    int num;
    
    //generates random number between 1 and 12 inclusive
    num = (int)(Math.random() * 12) + 1;
    
    //multiway if/else statements to correctly assign integer with month and print it out
    if (num == 1) {
      System.out.println("January");
    }
    else if (num == 2) {
      System.out.println("February");
    }
    else if (num == 3) {
      System.out.println("March");
    }
    else if (num == 4) {
      System.out.println("April");
    }
    else if (num == 5) {
      System.out.println("May");
    }
    else if (num == 6) {
      System.out.println("June");
    }
    else if (num == 7) {
      System.out.println("July");
    }
    else if (num == 8) {
      System.out.println("August");
    }
    else if (num == 9) {
      System.out.println("September");
    }
    else if (num == 10) {
      System.out.println("October");
    }
    else if (num == 11) {
      System.out.println("November");
    }
    else if (num == 12) {
      System.out.println("December");
    }
  }
}