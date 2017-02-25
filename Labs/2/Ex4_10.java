/**
  * Ex4_10.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 2
  * February 23, 2017
  * 1.8
  * This file contains problem 4.10 of Lab 2
*/

import java.util.Scanner;

/**
  * Ex4_10
  * Prompts user for Y or N in regards to if birthday is in set and guesses day
*/

public class Ex4_10 {
  public static void main(String[] args) {
    
    //String sets of birthday dates
    String set1 = 
      " 1   3  5  7\n" +
      " 9  11 13 15\n" +
      " 17 19 21 23\n" +
      " 25 27 29 31";

    String set2 = 
      " 2   3  6  7\n" +
      " 10 11 14 15\n" +
      " 18 19 22 23\n" +
      " 26 27 30 31";
      
    String set3 = 
      " 4   5  6  7\n" +
      " 12 13 14 15\n" +
      " 20 21 22 23\n" +
      " 28 29 30 31";
      
    String set4 = 
      " 8   9 10 11\n" +
      " 12 13 14 15\n" +
      " 24 25 26 27\n" +
      " 28 29 30 31";
    
    String set5 = 
      " 16 17 18 19\n" +
      " 20 21 22 23\n" +
      " 24 25 26 27\n" +
      " 28 29 30 31";
    
    //create scanner class and declare variables
    Scanner s = new Scanner(System.in);
    int day = 0;
    String answer;
    char letter;
    
    //for following sets, get input and if answer is yes increment day by allotted amount
    //set char equal to string's first index
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = s.nextLine();
    letter = answer.charAt(0);
    
    if(letter == 'Y') //increment day by 1 if Y
      day += 1;
      
    System.out.print("Is your birthday in Set2?\n");
    System.out.print(set2);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = s.nextLine();
    letter = answer.charAt(0);
    
    if(letter == 'Y') //increment day by 2 if Y
      day += 2;
      
    System.out.print("Is your birthday in Set3?\n");
    System.out.print(set3);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = s.nextLine();
    letter = answer.charAt(0);
    
    if(letter == 'Y') //increment day by 4 if Y
      day += 4;
      
    System.out.print("Is your birthday in Set4?\n");
    System.out.print(set4);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = s.nextLine();
    letter = answer.charAt(0);
    
    if(letter == 'Y') //increment day by 8 if Y
      day += 8;
      
    System.out.print("Is your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    answer = s.nextLine();
    letter = answer.charAt(0);
    
    if(letter == 'Y') //increment day by 16 if Y
      day += 16;
    
    System.out.println("\nYour birthday is " + day + "!");
       
  }
}

 
