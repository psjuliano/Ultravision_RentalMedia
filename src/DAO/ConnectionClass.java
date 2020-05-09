
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Priscila
 */
public class ConnectionClass {
    // *** This class is going to connect to msql database. *** 
     static Connection c;
    
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
            
    public static Connection getConnectionClass(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connected!");
            
        // *** Here is goin got catch any possible error. ***   
        } catch (Exception ex) {
            System.out.println("Error!");
            
         // *** StackTrace is pop up where is the possible error to be fixed. ***   
            ex.printStackTrace();
        }
            return c;
    }
    
}  

    

