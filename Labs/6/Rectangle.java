/**
  * Rectangle.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 6
  * April 20, 2017
  * 1.8
  * This file contains problem 9.1 of Lab 6
*/

/**
  * Rectangle
  * Creates a rectangle object
*/
public class Rectangle {
 
    double width; //represents width
    double height; //represents height
  
    //no-arg constructor that creates default rectangle with height and width of 1
    Rectangle() {
      width = 1.0;
      height = 1.0;
    }
    
    //constructor that creates rectangle with specified width and height
    Rectangle(double specificWidth, double specificHeight) {
      width = specificWidth;
      height = specificHeight;
    }
  
    //method getArea returns area of rectangle
    double getArea() {
      return width * height;
    }
  
    //method getPerimeter returns perimeter of rectangle
    double getPerimeter() {
      return 2 * (width + height);
    }
}
