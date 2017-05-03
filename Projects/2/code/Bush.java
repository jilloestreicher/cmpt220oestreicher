/**
  * Bush.java
  * Jill Oestreicher
  * CMPT 220
  * Project 2
  * April 27, 2017
  * 1.8
  * Creates bush objects
*/

/**
  * Bush
  * creates bushes for garden
*/
public class Bush extends Plant {
  /**
    * Bush
    * constructor sets base (location) of bush
  */
  public Bush (int x, int y) { 
    super(x,y,24,30);
    growth = height/2.0;
  }
  /**
    * grow
    * grows wider and taller over days
  */
  public void grow(int days) {
    super.grow(days);
    width += growth * days;
  }
  /**
    * toString
    * composes the string that is printed with bush information
  */
  public String toString() { 
    return "Bush X:" + xCoord + " Y:" + yCoord + " - Rate: " + growth + " Height: " + height + " Width: " + width; 
  }
}
