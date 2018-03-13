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
    Connection conn;
    public TASDatabase() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/tas";
        conn = DriverManager.getConnection(url, "tasuser", "group3");
    }
    
    public Badge getBadge(String id) throws SQLException{
        String iD = "";
        String desc = "";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM badge WHERE id = 'id'");
        if(result != null){
            result.next();
            iD = result.getString("id");
            desc = result.getString("description");
        }
        Badge b = new Badge(iD, desc);
        return b;
    }
    
    public Punch getPunch(int id)throws SQLException{
        int terminalid = 0;
        int punchtypeid = 0;
        String badgeid = "";
        
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM event WHERE id = ?");
        stmt.setInt(id, id);
        ResultSet result = stmt.executeQuery();
        if(result != null){
            result.next();
            punchtypeid = result.getInt("eventtypeid");
            terminalid = result.getInt("terminalid");
            badgeid = result.getString("badgeid");
        }
        Badge b = getBadge(badgeid);
        Punch p = new Punch(b, terminalid, punchtypeid);
        
        return p;
    }
    
    public Shift getShift(int id) throws SQLException{
        int shiftID = 0;
        int interval = 0;
        int dock = 0;
        int gracePeriod = 0;
        int lunchDeduct = 0;
        String description = "";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM shift WHERE id = 'id'");
        if(result != null){
            result.next();
            shiftID = result.getInt("id");
            description = result.getString("description");
            interval = result.getInt("interval");
            gracePeriod = result.getInt("graceperiod");
            dock = result.getInt("dock");
            lunchDeduct = result.getInt("lunchdeduct");
        }
        Shift s = new Shift();
        return s;
        
    }
    
    
    public Shift getShift(Badge b) throws SQLException{
        int sID = 0;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM employee WHERE badgeid = " + b.getID());
        if(result != null){
            sID = result.getInt("shiftid");
        }
        Shift ss = getShift(sID);
        return ss;
    }
    
    
    
}
