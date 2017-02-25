/**
  * Ex4_26.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 2
  * February 23, 2017
  * 1.8
  * This file contains problem 4.26 of Lab 2 
*/

import java.util.Scanner;

/**
  * Ex4_26
  * Prompts user to enter an amount of money and outputs amount in maximum change
*/

public class Ex4_26 {
  public static void main(String[] args) {
    
    //scanner class for input
    Scanner s = new Scanner(System.in);
    
    //calls for input, takes it as string
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = s.next();
    
    //parse ints to get dollar amount before decimal point and cents after decimal point
    //use substring to separate and indexOf to get index of character for substring
    int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
    int numOfCents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
    
    //get quarter amount and leave remainder in cents
    int numberOfQuarters = numOfCents / 25;
    numOfCents = numOfCents % 25;
    
    //get dime amount and leave remainder in cents
    int numberOfDimes = numOfCents / 10;
    numOfCents = numOfCents % 10;
    
    //get nickel amount and leave remainder in cents
    int numberOfNickels = numOfCents / 5;
    numOfCents = numOfCents % 5;
    
    //pennies is cents left from remainders
    int numberOfPennies = numOfCents;
    
    System.out.println("Your amount " + amount + " consists of ");
    System.out.println(" " + numberOfOneDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickels + " nickels");
    System.out.println(" " + numberOfPennies + " pennies");    
 
  }
}
