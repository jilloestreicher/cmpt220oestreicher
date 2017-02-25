/**
  * Ex3_15.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 2
  * February 9, 2017
  * 1.8
  * This file contains problem 3.15 of Lab 2
*/

import java.util.Scanner;

/**
  * Ex3_15
  * This program prompts user to enter three digit number and alerts them if they win 
*/

public class Ex3_15 {
  public static void main(String[] args) {
    
    //scanner class for inputs, variables declared 
    Scanner s  = new Scanner(System.in);
    int num;
    int lottoNum = (int)(Math.random() * 1000);
    int cases=0; //initialize case as 0
    
    System.out.println("Enter a three digit number: ");
    num = s.nextInt();
    
    //use division and modulus to split numbers into three digits 
    int numDigitOne = num / 100;
    int numDigitTwo = (num % 100) / 10;
    int numDigitThree = num % 10; 
    
    int lottoDigitOne = lottoNum / 100;
    int lottoDigitTwo = (lottoNum % 100) / 10;
    int lottoDigitThree = lottoNum % 10;
    
    //if and else if statements to determine if user won or not
    //use comparative operators to compare digits and determine their prize (or lack of) assigns it to case
    if ((numDigitOne == lottoDigitOne) && (numDigitTwo == lottoDigitTwo) && (numDigitThree == lottoDigitThree)) {
      cases = 1;
    }
    else if ((numDigitOne == lottoDigitOne) || (numDigitOne == lottoDigitTwo) || (numDigitOne == lottoDigitThree) &&
    (numDigitTwo == lottoDigitOne) || (numDigitTwo == lottoDigitTwo) || (numDigitThree == lottoDigitThree) &&
    (numDigitThree == lottoDigitOne) || (numDigitThree == lottoDigitTwo) || (numDigitThree == lottoDigitThree)) {
      cases = 2;
    }    
    else if ((numDigitOne == lottoDigitOne) || (numDigitOne == lottoDigitTwo) || (numDigitOne == lottoDigitThree) ||
    (numDigitTwo == lottoDigitOne) || (numDigitTwo == lottoDigitTwo) || (numDigitThree == lottoDigitThree) ||
    (numDigitThree == lottoDigitOne) || (numDigitThree == lottoDigitTwo) || (numDigitThree == lottoDigitThree)) {
      cases = 3;
    }
    else {
      System.out.println("Sorry, you didn't win anything!");
    }
    
    //use switch statement to print result
    switch(cases) {
      case 1:
        System.out.println("Congrats, you got it exactly and win $10,000!");
        break;
      case 2:
        System.out.println("Congrats, you got all the digits and win $3,000!");
        break;
      case 3:
        System.out.println("Congrats, you got one of the digits and win $1,000!");
        break;
    }         
  }
}

