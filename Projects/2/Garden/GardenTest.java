/**
  * Jill Oestreicher
  * GardenTest.java
  * Project 2
*/

/**
  * GardenTest
  * Test class for FlowerBushGarden
*/
public class GardenTest {
	public static void main(String[] args) {
    //creates a garden backyard
		FlowerBushGarden backyard = new FlowerBushGarden(0, 0, 400, 600, 6);
		backyard.draw();System.out.println("growing");
    
    //grows garden
		backyard.grow(1);
		backyard.draw();
		backyard.rain(5);
		System.out.println("growing");
		backyard.grow(1);
		backyard.draw();
    
    //kills garden
		System.out.println("Frost happens");
		backyard.frost();
		backyard.draw();
    
    //adds plants
		System.out.println("Adding new flowers to backyard");
		backyard.plantNewPlants(12);
		backyard.draw();

	}
}

//options for what to create
	//menu for what type they want
