/**

  * Ex4_15.java
  
  * Jill Oestreicher
  
  * CMPT 220
  
  * Lab 2
  
  * February 23, 2017
  
  * 1.8
  
  * This file contains problem 4.15 of Lab 2
  
*/

import java.util.Scanner;

/**

  * Ex4_15
  
  * Prompts user to enter letter and displays corresponding number
  
*/

public class Ex4_15 {
  public static void main(String[] args) {
    
    //scanner class and variables
    Scanner s = new Scanner(System.in);
    String input;
    char letter;
     
    //enter a letter, convert to upper case, char declared as string index 0
    System.out.println("Enter a letter: ");
    input = s.nextLine();
    input = input.toUpperCase();
    letter = input.charAt(0);

    //switch statement to assign letters to number and prints out number
    switch(letter) {
      case 'A':
      case 'B':
      case 'C':
        System.out.println("The corresponding number is 2");
        break;
        
      case 'D':
      case 'E':
      case 'F':
        System.out.println("The corresponding number is 3");
        break;
          
      case 'G':
      case 'H':
      case 'I':
        System.out.println("The corresponding number is 4");
        break;
        
      case 'J':
      case 'K':
      case 'L':
        System.out.println("The corresponding number is 5");
        break;
          
      case 'M':
      case 'N':
      case 'O':
        System.out.println("The corresponding number is 6");
        break;
          
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
        System.out.println("The corresponding number is 7");
        break;
          
      case 'T':
      case 'U':
      case 'V':
        System.out.println("The corresponding number is 8");
        break;
        
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
        System.out.println("The corresponding number is 9");
        break;
        
      default:
        System.out.println(input + " is an invalid input"); 
          
     }  
  }
}