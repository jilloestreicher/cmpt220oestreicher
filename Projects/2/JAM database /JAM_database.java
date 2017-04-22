/**
  * Jill Oestreicher
*/

import java.util.Scanner;
import java.sql.*;

/**
  * JAM_database
  * Class for Project 2 database
*/
public class JAM_database {
  public static void main(String[] args) 
    throws SQLException, ClassNotFoundException {
    //load driver
    Class.forName("jam.mysql.JAM_database.Driver");
    System.out.println("Driver loaded");
    
    //connect to database
    Connection connection  = DriverManager.getConnection
      ("JAM_database:mysql://localhost/javabook", "jill", "jam");
    System.out.println("Database connected");
    
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the product you are searching for: ");
    String product = s.next();
   
    //Create a statment
    Statement statement = connection.createStatement();
  
    ResultSet product = statement.executeQuery
      ("SELECT item, quantity, price, total, location from JAM_hardware_table WHERE = '" + product + "';");    
    
  }
}




//driver
  

//at least 4:
  //adding
  //deleting
  //changing
  //searching