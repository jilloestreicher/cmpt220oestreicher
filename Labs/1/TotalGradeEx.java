/**

  * TotalGradeEx.java

  * Jill Oestreicher

  * CMPT 220 
  
  * Lab 1
  
  * January 26, 2017
  
  * 1.8 
  
  * This file contains programming problem 2 of Lab 1
  
*/

import java.util.Scanner;

/**

  * TotalGradeEx

  * This class calculates the percentage total grade of a student in our class
  
*/
public class TotalGradeEx {
  public static void main(String[] args) {
    
    //variables declared, s holds inputs from user
    Scanner s = new Scanner(System.in);
    double midExam, finExam, projects, hwLabs, finGrade;
    
    System.out.println("Enter midterm exam grade as a percentage: ");
    midExam = s.nextDouble();

    System.out.println("Enter final exam grade as a percentage: ");
    finExam = s.nextDouble();
    
    System.out.println("Enter projects grade as a percentage: ");
    projects = s.nextDouble();
    
    System.out.println("Enter homework and labs grade as a percentage: ");
    hwLabs = s.nextDouble();
    
    //to calculate final grade average add four grade components multiplied by their weight percentage
    finGrade = ((midExam*.2) + (finExam*.2) + (projects*.2) + (hwLabs*.4));    
    
        
    System.out.println("Your final grade is: " + finGrade + "%");
  }
} 