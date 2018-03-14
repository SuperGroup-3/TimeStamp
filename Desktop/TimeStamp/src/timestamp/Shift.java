package timestamp;

public class Shift {
    /* Instance Fields*/
    private int id, interval, earlyArrival, lateArrival, lunchBreak, overTime, dock, graceperiod, lunchdeduct, startH, startM, stopH, stopM, lunchstartH, lunchstartM, lunchstopH, lunchstopM;
    private String description;
    
    /* variables for toString */
    private String shiftStartTime, shiftStopTime;
    private String lunchStartTime, lunchStopTime;
    private int shiftNum;
    
    /* Constructor */
    public Shift (int id, String description, int startH, int startM, int stopH, int stopM, int interval, int graceperiod, int dock, int lunchstartH, int lunchstartM, int lunchstopH, int lunchstopM, int lunchdeduct){
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
    private void setStart(int startH, int startM){
        this.startH = startH;
        this.startM = startM;
    }

    private int getStartH(){
        return startH;
    }
    
    private int getStartM(){
        return startM;
    }
    
    /* stop */
    private void setStop(int stopH, int stopM){
        this.stopH = stopH;
        this.stopM = stopM;
    }

    private int getStopH(){
        return stopH;
    }
    
    private int getStopM(){
        return stopM;
    }
    
    /* lunchstart */
    private void setLunchStart(int lunchstartH, int lunchstartM){
        this.lunchstartH = lunchstartH;
        this.lunchstartM = lunchstartM;
    }
    
    private int getLunchStartH(){
        return lunchstartH;
    }
    
    private int getLunchStartM(){
        return lunchstartM;
    }
    
    /* lunchstop */
    private void setLunchstop(int lunchstopH, int lunchstopM){
        this.lunchstopH = lunchstopH;
        this.lunchstopM = lunchstopM;
    }
    
    private int getLunchStop(){
        return lunchstopH;


    }

    private int getLunchstopM() {
        return lunchstopM;
    }
    
}
