/**
  * Ex9_1Test.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 6
  * April 20, 2017
  * 1.8
  * This file contains problem 9.1 of Lab 6
*/

/**
  * Ex9_1Test.java
  * Test program that creates two rectangles using Rectangle class
*/
public class Ex9_1Test {
  public static void main(String[] args) {
    
    Rectangle rectangle1 = new Rectangle(4, 40); //first rectangle with width 4 and height 40
    Rectangle rectangle2 = new Rectangle(3.5, 35.9); //second rectangle with width 3.5 and height 35.9

    System.out.println("The width of rectangle 1 is: " + rectangle1.width);
    System.out.println("The height of rectangle 1 is: " + rectangle1.height);
    System.out.println("The area of rectangle 1 is: " + rectangle1.getArea());
    System.out.println("The perimeter of rectangle 1 is: " + rectangle1.getPerimeter());

    System.out.println("The width of rectangle 2 is: " + rectangle2.width);
    System.out.println("The height of rectangle 2 is: " + rectangle2.height);
    System.out.println("The area of rectangle 2 is: " + rectangle2.getArea());
    System.out.println("The perimeter of rectangle 2 is: " + rectangle2.getPerimeter());

  }
}
    