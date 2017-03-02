/**
  * Ex6_20.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 4
  * March 1, 2017
  * 1.8
  * This file contains problem 6.20 of Lab 4
*/

import java.util.Scanner;

/**
  * Ex6_20
  * Counts the number of letters in a string from user input
*/
public class Ex6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //scanner class for inputs
    String s; //string variable from user
    
    System.out.println("Enter a String: "); 
    s = input.nextLine();
    
    System.out.println("The number of letters in your String is: " + countLetters(s)); //call method to print number
  }
  /**
    * isLetter
    * checks to make sure if character is letter
  */
  public static boolean isLetter(char character) {
    return ((character <= 'z' && character >= 'a') || (character <= 'Z' && character >= 'A')); //returns true if character 
  }
    /**
      * countLetters
      * Counts letters in a string
    */
    public static int countLetters(String s) {
      int letters = 0; //variable to store letter amount
      
      //for loop to count letters in string while incrementing until string length 
      for(int i = 0; i < s.length(); i++) { 
        //if loop to check if letter
        //calls isLetter method
        if(isLetter(s.charAt(i))) {
          letters++; //increment if letter
        }
      }
      return letters; //return amount of letters
    }
}