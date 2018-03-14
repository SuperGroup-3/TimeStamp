package timestamp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Shift {
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime, dock, graceperiod, lunchdeduct;
    private String description;
    private Time start, stop, lunchstart, lunchstop;
    
    /* Variables for Tracking Time */
    private int startHour, startMinute;
    private int stopHour, stopMinute;
    private int lunchStartHour, lunchStartMinute;
    private int lunchStopHour, lunchStopMinute;
    private int totalHours, totalMinutes;
    
    /* variables for toString */
    private String shiftStartTime, shiftStopTime;
    private String lunchStartTime, lunchStopTime;
    private int shiftNum;
    
    /* Constructor */
    public Shift (int id, String description, Time start, Time stop, int interval, int graceperiod, int dock, Time lunchstart, Time lunchstop, int lunchdeduct){
        this.id = id;
        this.description = description;
        this.start = start;
        this.stop = stop;
        this.interval = interval;
        this.graceperiod = graceperiod;
        this.dock = dock;
        this.lunchstart = lunchstart;
        this.lunchstop = lunchstop;
        this.lunchdeduct = lunchdeduct;
        
    }

    /* toString*/
    @Override
    public String toString(){
        return "Shift " + shiftNum + ": " + shiftStartTime + " - " + shiftStopTime + "(" + totalMinutes + " minutes);" + "Lunch: " + lunchStartTime + " - " + lunchStopTime + "(" + lunchBreak + " minutes)";
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
    private void setStart(Time start){
        this.start = start;
    }

    private Time getStart(){
        return start;
    }
    
    /* stop */
    private void setStop(Time stop){
        this.stop = stop;
    }

    private Time getStop(){
        return stop;
    }
    
    /* lunchstart */
    private void setLunchStart(Time lunchstart){
        this.lunchstart = lunchstart;
    }
    
    private Time getLunchStart(){
        return lunchstart;
    }
    
    /* lunchstop */
    private void setLunchstop(Time lunchstop){
        this.lunchstop = lunchstop;
    }
    
    private Time getLunchStop(){
        return lunchstop;
    }
}