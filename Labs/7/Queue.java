/**
  * Queue.java
  * Jill Oestreicher
  * CMPT 220
  * Lab 7
  * April 27, 2017
  * 1.8
  * This file contains problem 10.10 of Lab 7
*/

/**
  * Queue.java
  * Class for storing integers in which they arrived
*/
public class Queue {
  //data fields
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  /**
    * Queue
    * Construct a queue with the default capacity of 8
  */
  public Queue() {
    this (DEFAULT_CAPACITY);
  }
  /**
    * Queue
    * Construct a queue with the specified maximum capacity
  */
  public Queue(int capacity) {
    elements = new int[capacity];
  }
  /**
    * enqueue
    * adds v into the queue
  */ 
  public void enqueue(int v) {
    //if loop to check if size of numbers in queue is same/greater than elements amount
    if(size >= elements.length) {
      //tempt variable double length of size
      int[] temp = new int[size * 2];
      //copies array from elements at 0 to temp at 0 of length size
      System.arraycopy(elements, 0, temp, 0, size);
      //sets elements to temp
      elements = temp;
    }
    //increment size of elements to v
    elements[size++] = v;
  }
  /**
    * dequeue
    * removes and returns the element from the queue
  */
  public int dequeue() {
    //set v variable to be elements at place 0
    int v = elements[0];
    //decrement size
    size--;
    //for loop to go through size and set elements at i to be increased
    for(int i = 0; i < size; i++) {
      elements[i] = elements[i + 1];
    }
    return v;
  }
  /**
    * empty
    * returns true if queue is empty
  */
  public boolean empty() {
    return size == 0;
  }
  /**
    * getSize
    * returns size of queue
  */
  public int getSize() {
    return size;
  }
}