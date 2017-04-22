/**
  * Ex10_10Test.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 7
  * April 27, 2017
  * 1.8
  * This file contains problem 10.10 of Lab 7
*/

/**
  * Ex10_10Test.java
  * Test Class for Queue
*/
public class Ex10_10Test {
  public static void main(String[] args) {
    //create new object from queue
    Queue q = new Queue();
    
    //for loop to put numbers into queue
    for(int i = 0; i < 20; i++) {
      q.enqueue(i);
    }

    //while loop to check queue is not empty
    while (!q.empty()) {
      //print queue
		  System.out.print(q.dequeue() + " ");
		}
		System.out.println();
  }
}