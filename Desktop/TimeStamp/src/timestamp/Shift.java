package timestamp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Shift {
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime, dock, graceperiod, lunchdeduct;
    private String description;
    private TimeStamp start, stop, lunchStart, lunchStop;
    
    /* Constructor */
    public Shift (int id, int interval, int earlyArrival, int lateArrival, int lunchBreak, int overTime, String description, Timestamp start, Timestamp stop, Timestamp lunchStart, Timestamp lunchStop){
        
    }
    
    
    /* ID */
    private void setId(int id){
        this.id = id;
    }
    
    private int getId(){
        return id;
    }
    
    /* Description */
    private void setDescription(String description){
        this.description = description;
    }

    private String getDescription(){
        return description;
    }
    
    /* Interval */
    private void setInterval(int interval){
        this.interval = interval;
    }
    
    private int getInterval(){
        return interval;
    }
    
    /* earlyArrival */
    private void setEarlyArrival(int earlyArrival){
        this.earlyArrival = earlyArrival;
    }
    
    private int getearlyArrival(){
        return earlyArrival;
    }
    
    /* latArrival */
    private void setLateArrival(int lateArrival){
        this.lateArrival = lateArrival;
    }
    
    private int getLateArrival(){
        return lateArrival;
    }
    
    /* lunchBreak */
    private void setLunchBreak(int lunchBreak){
        this.lunchBreak = lunchBreak;
    }
    
    private int getLunchBreak(){
        return lunchBreak;
    }
    
    /* overTime */
    private void setOverTime(int overTime){
        this.overTime = overTime;
    }
    
    private int getOverTime(){
        return overTime;
    }
    
    /* dock */
    private void setDock(int dock){
        this.dock = dock;
    }
    
    private int getDock(){
        return dock;
    }
    
    /* graceperiod */
    private void setGracePeriod(int graceperiod){
        this.graceperiod = graceperiod;
    }
    
    private int getGracePeriod(){
        return graceperiod;
    }
    
    /* lunchdeduct */
    private void setLunchDeduct(int lunchdeduct){
        this.lunchdeduct = lunchdeduct;
    }
    
    private int lunchdeduct(){
        return lunchdeduct;
    }
    
    /* start */
    private void setStart(TimeStamp start){
        this.start = start;
    }

    private TimeStamp getStart(){
        return start;
    }
    
    /* stop */
    private void setStop(TimeStamp stop){
        this.stop = stop;
    }

    private TimeStamp getStop(){
        return stop;
    }
    
    /* lunchStart */
    private void setLunchStart(TimeStamp lunchStart){
        this.lunchStart = lunchStart;
    }
    
    private TimeStamp getLunchStart(){
        return lunchStart;
    }
    
    /* lunchStop */
    private void setLunchStop(TimeStamp lunchStop){
        this.lunchStop = lunchStop;
    }
    
    private TimeStamp getLunchStop(){
        return lunchStop;
    }
    
    
}


