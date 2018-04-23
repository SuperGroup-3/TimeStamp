package timestamp;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Shift {
    private int id, interval, dock, graceperiod, lunchdur, shiftdur;
    private String description;
    
    
    /* Variables for Tracking Time */
    private int startHour, startMinute;
    private int stopHour, stopMinute;
    private int lunchStartHour, lunchStartMinute;
    private int lunchStopHour, lunchStopMinute;
    
    /* Constructor */
    public Shift (){
        String description = "";
        int id = 0;
        int interval = 0;
        int dock = 0;
        int graceperiod = 0;
        int lunchdur = 0;
        int shiftdur = 0;
        int startHour, startMinute = 0;
        int stopHour, stopMinute = 0;
        int lunchStartHour, lunchStartMinute = 0;
        int lunchStopHour, lunchStopMinute = 0;
    }
    
    /* toString */
    @Override
    public String toString(){
        String result = "";
        String startTime = String.format("%02d", startHour) + ":" + String.format("%02d", startMinute);
        String stopTime = String.format("%02d", stopHour) + ":" + String.format("%02d", stopMinute);
        String lunchStartTime = String.format("%02d", lunchStartHour) + ":" + String.format("%02d", lunchStartMinute);
        String lunchStopTime = String.format("%02d", lunchStopHour) + ":" + String.format("%02d", lunchStopMinute);
        
        result += description + ": ";
        result += startTime + " - " + stopTime + " ";
        result += "(" + shiftdur + " minutes); ";
        result += "Lunch: " + lunchStartTime + " - " + lunchStopTime + " ";
        result += "(" + lunchdur + " minutes)";
        
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getDock() {
        return dock;
    }

    public void setDock(int dock) {
        this.dock = dock;
    }

    public int getGraceperiod() {
        return graceperiod;
    }

    public void setGraceperiod(int graceperiod) {
        this.graceperiod = graceperiod;
    }

    public int getLunchdur() {
        return lunchdur;
    }

    public void setLunchdur(int lunchdur) {
        this.lunchdur = lunchdur;
    }

    public int getShiftdur() {
        return shiftdur;
    }

    public void setShiftdur(int shiftdur) {
        this.shiftdur = shiftdur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getStopHour() {
        return stopHour;
    }

    public void setStopHour(int stopHour) {
        this.stopHour = stopHour;
    }

    public int getStopMinute() {
        return stopMinute;
    }

    public void setStopMinute(int stopMinute) {
        this.stopMinute = stopMinute;
    }

    public int getLunchStartHour() {
        return lunchStartHour;
    }

    public void setLunchStartHour(int lunchStartHour) {
        this.lunchStartHour = lunchStartHour;
    }

    public int getLunchStartMinute() {
        return lunchStartMinute;
    }

    public void setLunchStartMinute(int lunchStartMinute) {
        this.lunchStartMinute = lunchStartMinute;
    }

    public int getLunchStopHour() {
        return lunchStopHour;
    }

    public void setLunchStopHour(int lunchStopHour) {
        this.lunchStopHour = lunchStopHour;
    }

    public int getLunchStopMinute() {
        return lunchStopMinute;
    }

    public void setLunchStopMinute(int lunchStopMinute) {
        this.lunchStopMinute = lunchStopMinute;
    }
    
    /* java util Calendar*/
    private long getElapsedTime(Timestamp s, Timestamp e){
        Calendar startCal = GregorianCalendar.getInstance();
        Calendar endCal = GregorianCalendar.getInstance();
        
        startCal.setTimeInMillis(s.getTime());
        endCal.setTimeInMillis(e.getTime());
        
        long initial, ending;
        initial = startCal.getTimeInMillis();
        ending = endCal.getTimeInMillis();
        return (ending-initial)/60000;
    }
}
