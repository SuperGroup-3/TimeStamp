package timestamp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Shift {
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime, dock, graceperiod, lunchdeduct;
    private String description;
    private int startH, stopH, startM, stopM, lunchstartH, lunchstopH, lunchstartM, lunchstopM;
    
    
    /* Variables for Tracking Time */
    private int startHour, startMinute;
    private int stopHour, stopMinute;
    private int lunchStartHour, lunchStartMinute;
    private int lunchStopHour, lunchStopMinute;
    
    /* Constructor */
    public Shift (int id, String description, int startH, int stopH, int startM, int stopM, int interval, int graceperiod, int dock, int lunchstartH, int lunchstopH, int lunchstartM, int lunchstopM, int lunchdeduct){
        this.id = id;
        this.description = description;
        this.startH = startH;
        this.startM = startM;
        this.stopH = stopH;
        this.stopM = stopM;
        this.interval = interval;
        this.graceperiod = graceperiod;
        this.dock = dock;
        this.lunchstartH = lunchstartH;
        this.lunchstartM = lunchstartM;
        this.lunchstopH = lunchstopH;
        this.lunchstopM = lunchstopM;
        this.lunchdeduct = lunchdeduct;
        
    }
    
    
    /* ID */
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    /* Description */
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    /* Interval */
    public void setInterval(int interval){
        this.interval = interval;
    }
    
    public int getInterval(){
        return interval;
    }
    
    /* earlyArrival */
    public void setEarlyArrival(int earlyArrival){
        this.earlyArrival = earlyArrival;
    }
    
    public int getearlyArrival(){
        return earlyArrival;
    }
    
    /* latArrival */
    public void setLateArrival(int lateArrival){
        this.lateArrival = lateArrival;
    }
    
    public int getLateArrival(){
        return lateArrival;
    }
    
    /* lunchBreak */
    public void setLunchBreak(int lunchBreak){
        this.lunchBreak = lunchBreak;
    }
    
    public int getLunchBreak(){
        return lunchBreak;
    }
    
    /* overTime */
    public void setOverTime(int overTime){
        this.overTime = overTime;
    }
    
    public int getOverTime(){
        return overTime;
    }
    
    /* dock */
    public void setDock(int dock){
        this.dock = dock;
    }
    
    public int getDock(){
        return dock;
    }
    
    /* graceperiod */
    public void setGracePeriod(int graceperiod){
        this.graceperiod = graceperiod;
    }
    
    public int getGracePeriod(){
        return graceperiod;
    }
    
    /* lunchdeduct */
    public void setLunchDeduct(int lunchdeduct){
        this.lunchdeduct = lunchdeduct;
    }
    
    public int lunchdeduct(){
        return lunchdeduct;
    }
    
    /* start */
    public void setStart(int startH, int startM){
        this.startH = startH;
        this.startM = startM;
    }

    public int getStartH(){
        return startH;
    }
   
    public int getStartM(){
        return startM;
    }
    
    /* stop */
    public void setStop(int stopH, int stopM){
        this.stopH = stopH;
        this.stopM = stopM;
    }

    public int getStopH(){
        return stopH;
    }
    
    public int getStopM(){
        return stopM;
    }
    
    /* lunchstart */
    public void setLunchStart(int lunchstartH, int lunchstartM){
        this.lunchstartH = lunchstartH;
        this.lunchstartM = lunchstartM;
    }
    
    public int getLunchStartH(){
        return lunchstartH;
    }
    
    public int getLunchStartM(){
        return lunchstartM;
    }
    
    /* lunchstop */
    public void setLunchstop(int lunchstopH, int lunchstopM){
        this.lunchstopH = lunchstopH;
        this.lunchstopM = lunchstopM;
    }
    
    public int getLunchStopH(){
        return lunchstopH;
    }
    
    public int getLunchStopM(){
        return lunchstopM;
    }
}