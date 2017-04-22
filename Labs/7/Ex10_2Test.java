/**
  * Ex10_2Test.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 7
  * April 27, 2017
  * 1.8
  * This file contains problem 10.2 of Lab 7
*/

/**
  * Ex10_2Test.java
  * Added constructor to BMI class
*/
public class Ex10_2Test {
  public static void main(String[] args) {
    //Kim Yang object
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus());

    //Susan King object
    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus());
  }
}