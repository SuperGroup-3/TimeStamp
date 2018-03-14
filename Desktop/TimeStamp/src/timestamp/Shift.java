package timestamp;

public class Shift {
    /* Instance Fields*/
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime, dock, graceperiod, lunchdeduct, start, stop, lunchstart, lunchstop;
    private String description;
    
    /* variables for toString */
    private String shiftStartTime, shiftStopTime;
    private String lunchStartTime, lunchStopTime;
    private int shiftNum;
    
    /* Constructor */
    public Shift (int id, String description, int start, int stop, int interval, int graceperiod, int dock, int lunchstart, int lunchstop, int lunchdeduct){
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
    private void setStart(int start){
        this.start = start;
    }

    private int getStart(){
        return start;
    }
    
    /* stop */
    private void setStop(int stop){
        this.stop = stop;
    }

    private int getStop(){
        return stop;
    }
    
    /* lunchstart */
    private void setLunchStart(int lunchstart){
        this.lunchstart = lunchstart;
    }
    
    private int getLunchStart(){
        return lunchstart;
    }
    
    /* lunchstop */
    private void setLunchstop(int lunchstop){
        this.lunchstop = lunchstop;
    }
    
    private int getLunchStop(){
        return lunchstop;
    }
}
