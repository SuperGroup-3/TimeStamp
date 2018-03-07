/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestamp;
import java.sql.*;

/**
 *
 * @author trace
 */
public class TASDatabase {
    public TASDatabase() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        /**
         * Constructor for the TASDatabase class
         * Automatically connects to database when initialized
         */
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/root";
        Connection conn = DriverManager.getConnection(url, "tasuser", "group3");
        Statement stmt  = conn.createStatement();
    }
    
    
}
