package timestamp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Tyler Greenwood & Andrew Cornelius
 */
public class Shift {
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime;
    private String description;
    private Timestamp start, stop, lunchStart, lunchStop;
    
    public Shift (int id, int interval, int earlyArrival, int lateArrival, int lunchBreak, int overTime,
                    String description, Timestamp start, Timestamp stop, Timestamp lunchStart, Timestamp lunchStop) {
    
    }
}