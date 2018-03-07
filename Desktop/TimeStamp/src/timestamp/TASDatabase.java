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
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/root";
        Connection conn = DriverManager.getConnection(url, "tasuser", "group3");
        Statement stmt  = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT FROM badge Where id = '3282F212'");
    }
    
    public Badge getBadge(String badge){
        
    }
    
    public Punch getPunch(String punch){
        
    }
    
    public Shift getShift(String shift){
        
    }
    
    
}
