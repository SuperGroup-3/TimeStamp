/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestamp;
import java.sql.*;
import java.util.GregorianCalendar;

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
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM badge WHERE id = ?");
        stmt.setString(1,id);
        ResultSet result = stmt.executeQuery();
        if(result != null){
            result.next();
            iD = result.getString("id");
            desc = result.getString("description");
        }
        Badge b = new Badge(iD, desc);
        return b;
    }
    
    public Punch getPunch(int id) throws SQLException{
        int terminalid = 0;
        int punchtypeid = 0;
        long ts = 0;
        String badgeid = "";
        
        PreparedStatement stmt = conn.prepareStatement("SELECT *, UNIX_TIMESTAMP(originaltimestamp) * 1000 AS ts FROM event WHERE id=?");
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        if(result != null){
            result.next();
            punchtypeid = result.getInt("eventtypeid");
            terminalid = result.getInt("terminalid");
            badgeid = result.getString("badgeid");
            ts = result.getLong("ts");
        }
        Badge b = getBadge(badgeid);
        Punch p = new Punch(b, terminalid, punchtypeid);
        
        GregorianCalendar originaltimestamp = new GregorianCalendar();
        originaltimestamp.setTimeInMillis(ts);
        
        p.setOriginaltimestamp(originaltimestamp);
        p.setId(id);
        
        return p;
        
    }
    
    public Shift getShift(int id) throws SQLException{
        int shiftID = 0;
        int interval = 0;
        int dock = 0;
        int gracePeriod = 0;
        int lunchDeduct = 0;
        String description = "";
        PreparedStatement stmt = conn.prepareStatement("SELECT * , HOUR(`start`)AS shiftstarthour, MINUTE(`start`)AS shiftstartminute, HOUR(`lunchstart`)AS lunchstarthour, MINUTE(`lunchstart`)AS lunchstartminute, HOUR(`stop`)AS shiftstophour, MINUTE(`stop`)AS shiftstopminute, HOUR(`lunchstop`)AS lunchstophour, MINUTE(`lunchstop`)AS lunchstopminute, TIMESTAMPDIFF(MINUTE, `lunchstart`, `lunchstop`)AS lunchdur,TIMESTAMPDIFF(MINUTE, `lunchstart`, `lunchstop`)AS lunchdur FROM shift WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
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
        ResultSet result = stmt.executeQuery("SELECT * FROM employee WHERE badgeid = " + b.getId());
        if(result != null){
            sID = result.getInt("shiftid");
        }
        Shift ss = getShift(sID);
        return ss;
    }
    
    
    
}
