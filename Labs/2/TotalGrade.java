/**
  
  * TotalGrade.java
  
  * Jill Oestreicher 
  
  * CMPT 220
  
  * Lab 2
  
  * February 9, 2017
  
  * 1.8
  
  * This file contains the Total Grade problem of Lab 2
  
*/

import java.util.Scanner;

/**

  * TotalGrade
  
  * Computes student's letter grade in this class 

*/

public class TotalGrade {
  public static void main(String[] args) {
  
    //scanner class for inputs, variables declared 
    Scanner s = new Scanner(System.in);
    double midTerm, finalExam, projects, hwLabs, finalGrade;
    
    System.out.println("Please enter your midterm exam grade: ");
    midTerm = s.nextDouble();
    System.out.println("Please enter your final exam grade: ");
    finalExam = s.nextDouble();
    System.out.println("Please enter your projects grade: ");
    projects = s.nextDouble();
    System.out.println("Please enter your homework and labs: ");
    hwLabs = s.nextDouble();
     
    //to calculate final grade average add four grade components multiplied by their weight percentage
    finalGrade = ((midTerm*.2) + (finalExam*.2) + (projects*.2) + (hwLabs*.4)); 
    
    //if/else statements to determine letter grade
    if(finalGrade >= 95) {
      System.out.println("Your final grade is an A");
    }
    else if(finalGrade >= 90) {
      System.out.println("Your final grade is a A-");
    }
    else if(finalGrade >= 87) {
      System.out.println("Your final grade is a B+");
    }
    else if(finalGrade >= 83) {
      System.out.println("Your final grade is a B");
    }
    else if(finalGrade >= 80) {
      System.out.println("Your final grade is a B-");
    }
    else if(finalGrade >= 77) {
      System.out.println("Your final grade is a C+");
    }
    else if(finalGrade >= 73) {
      System.out.println("Your final grade is a C");
    }
    else if(finalGrade >= 70) {
      System.out.println("Your final grade is a C-");
    }
    else if(finalGrade >= 65) {
      System.out.println("Your final grade is a D+");
    }
    else if(finalGrade >= 60) {
      System.out.println("Your final grade is a D");
    }
    else {
      System.out.println("Your final grade is an F");
    }         
  }
}