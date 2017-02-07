/**
  
  * Ex3_11.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 9, 2017
  
  * 1.8
  
  * This file contains problem 3.11 of Lab 2
  
*/

import java.util.Scanner;

/**

  * Ex3_11
  
  * This class finds the number of days in a month using a switch statement

*/

public class Ex3_11 {
  public static void main(String args[]) {
    
    //scanner class for inputs, variables declared
    Scanner s = new Scanner(System.in);
    int month, year, days; 
    
    System.out.println("Enter the month as an integer: ");
    month = s.nextInt();
    System.out.println("Enter the year: ");
    year = s.nextInt();
    
    //switch statements to assign month to days by case system
    //February checks for leap year with if/else statement
    switch(month) {
      case 1:
        System.out.println("January " + year + " had 31 days.");
        break;
      case 2:
        if(year % 4 == 0) {
           System.out.println("February " + year + " had 29 days.");
        }
        else {
          System.out.println("February " + year + " had 28 days.");
        }
        break;
      case 3:
        System.out.println("March " + year + " had 31 days.");
        break;
      case 4:
        System.out.println("April " + year + " had 30 days.");
        break;
      case 5:
        System.out.println("May " + year + " had 31 days.");
        break;
      case 6:
        System.out.println("June " + year + " had 30 days.");
        break;
      case 7:
        System.out.println("July " + year + " had 31 days.");
        break;
      case 8:
        System.out.println("August " + year + " had 31 days.");
        break;
      case 9:
        System.out.println("September " + year + " had 30 days.");
        break;
      case 10:
        System.out.println("October " + year + " had 31 days.");
        break;
      case 11:
        System.out.println("November " + year + " had 30 days.");
        break;
      case 12:
         System.out.println("December " + year + " had 31 days.");
         break;
      default:
        System.out.println("Error: invalid input");
        break;
    } 
  }
}
