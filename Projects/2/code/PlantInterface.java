/**
  * PlantInterface.java
  * Jill Oestreicher
  * CMPT 220
  * Project 2
  * April 27, 2017
  * 1.8
  * Interface for items to be planted in garden
*/

/**
  * PlantInterface
  * Interface for garden
*/
public interface PlantInterface {
  // modify the size of the plant to reflect growing "days" days
  void grow (int days);
  
  //modify the rate of growth of the plant
  void rain (int days);
  
  //modify the size of the plant to reflect the effects of a frost
  void frost();
  
  //display the plant with its current location and size
  void draw();
}
