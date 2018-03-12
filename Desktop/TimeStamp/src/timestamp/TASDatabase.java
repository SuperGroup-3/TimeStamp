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
        String eventdata = "";
        
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM event WHERE eventtypeid = 'punchtypeid', terminalid = 'terminalid', badgeid = 'badgeid', eventdata = 'eventdata'");
        if(result != null){
            result.next();
            punchtypeid = result.getInt("eventtypeid");
            terminalid = result.getInt("terminalid");
            badgeid = result.getString("badgeid");
            eventdata = result.getString("eventdata");
        }
        Badge b = new Badge(badgeid, eventdata);
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
    
    
    
}
