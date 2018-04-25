package timestamp;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Calendar;

/**
 * 
 * @author Michael Harvey and Cody Stancil-Johnson
 */
public class Punch {
    
    //important vairables
    public static final String EventType0 = "CLOCKED OUT: ";
    public static final String EventType1 = "CLOCKED IN: ";
    public static final String EventType2 = "TIMED OUT: ";
    
    //instance fields
    private int id;
    private int terminalid;
    private String badgeid;
    private GregorianCalendar originaltimestamp;
    private GregorianCalendar adjustedtimestamp;
    private int punchtypeid;
    private String eventdata;
    
    
    //constructor(s)
    public Punch(Badge badge, int terminalid, int punchtypeid){
        this.badgeid = badge.getId();
        this.terminalid = terminalid;
        this.punchtypeid = punchtypeid;
        this.originaltimestamp = new GregorianCalendar();
        this.adjustedtimestamp = new GregorianCalendar();
    }
    
    public Punch(String badgeId, int terminalid, int punchtypeid){
        this.badgeid = badgeId;
        this.terminalid = terminalid;
        this.punchtypeid = punchtypeid;
        this.originaltimestamp = new GregorianCalendar();
        this.adjustedtimestamp = new GregorianCalendar();
    }

    //methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(int terminalid) {
        this.terminalid = terminalid;
    }

    public String getBadgeid() {
        return badgeid;
    }

    public void setBadgeid(String badgeid) {
        this.badgeid = badgeid;
    }

    public GregorianCalendar getOriginaltimestamp() {
        return originaltimestamp;
    }

    public void setOriginaltimestamp(GregorianCalendar originaltimestamp) {
        this.originaltimestamp = originaltimestamp;
    }

    public GregorianCalendar getAdjustedtimestamp() {
        return adjustedtimestamp;
    }

    public void setAdjustedtimestamp(GregorianCalendar adjustedtimestamp) {
        this.adjustedtimestamp = adjustedtimestamp;
    }

    public int getPunchtypeid() {
        return punchtypeid;
    }

    public void setPunchtypeid(int punchtypeid) {
        this.punchtypeid = punchtypeid;
    }

    public String getEventdata() {
        return eventdata;
    }

    public void setEventdata(String eventdata) {
        this.eventdata = eventdata;
    }
    public String getEventType(int punchtypeid){
        switch (punchtypeid) {
            case 0:
                return EventType0;
            case 1:
                return EventType1;
            case 2:
                return EventType2;
            default:
                break;
        }
        return "null";
    }
    
    public void adjust(Shift s){
        GregorianCalendar ots = originaltimestamp;
        long otsMillis = ots.getTimeInMillis();
        
        //Shift Start
        GregorianCalendar shiftStart = new GregorianCalendar();
        shiftStart.setTimeInMillis(otsMillis);
        shiftStart.set(Calendar.HOUR, s.getStartHour());
        shiftStart.set(Calendar.MINUTE, s.getStartMinute());
        shiftStart.set(Calendar.SECOND, 0);
        
        //Shift Stop
        GregorianCalendar shiftStop = new GregorianCalendar();
        shiftStop.setTimeInMillis(otsMillis);
        shiftStop.set(Calendar.HOUR, s.getStopHour());
        shiftStop.set(Calendar.MINUTE, s.getStopMinute());
        shiftStop.set(Calendar.SECOND, 0);
        
        // Shift Start Interval, Dock, & Grace Period
        long shiftStartMillis = shiftStart.getTimeInMillis();
        
        GregorianCalendar shiftStartInterval = new GregorianCalendar();
        shiftStartInterval.setTimeInMillis(shiftStartMillis);
        shiftStartInterval.add(Calendar.MINUTE, -(s.getInterval()));
        
        GregorianCalendar shiftStartDock = new GregorianCalendar();
        shiftStartDock.setTimeInMillis(shiftStartMillis);
        shiftStartDock.add(Calendar.MINUTE, s.getDock());
        
        GregorianCalendar shiftStartGrace = new GregorianCalendar();
        shiftStartGrace.setTimeInMillis(shiftStartMillis);
        shiftStartGrace.add(Calendar.MINUTE, s.getGraceperiod());
        
        //Lunch Start & Stop
        GregorianCalendar lunchStart = new GregorianCalendar();
        lunchStart.setTimeInMillis(otsMillis);
        lunchStart.set(Calendar.HOUR, s.getLunchStartHour());
        lunchStart.set(Calendar.MINUTE, s.getLunchStartMinute());
        lunchStart.set(Calendar.SECOND, 0);
        long lunchStartMillis = lunchStart.getTimeInMillis();
        
        GregorianCalendar lunchStop = new GregorianCalendar();
        lunchStop.setTimeInMillis(otsMillis);
        lunchStop.set(Calendar.HOUR, s.getLunchStopHour());
        lunchStop.set(Calendar.MINUTE, s.getLunchStopMinute());
        lunchStop.set(Calendar.SECOND, 0);
        long lunchStopMillis = lunchStop.getTimeInMillis();
        
        //Shift Stop Interval, Dock, and Grace Period
        long shiftStopMillis = shiftStop.getTimeInMillis();
        
        GregorianCalendar shiftStopInterval = new GregorianCalendar();
        shiftStopInterval.setTimeInMillis(shiftStopMillis);
        shiftStopInterval.add(Calendar.MINUTE, s.getInterval());
        
        GregorianCalendar shiftStopDock = new GregorianCalendar();
        shiftStopDock.setTimeInMillis(shiftStopMillis);
        shiftStopDock.add(Calendar.MINUTE, -(s.getDock()));
        
        GregorianCalendar shiftStopGrace = new GregorianCalendar();
        shiftStopGrace.setTimeInMillis(shiftStopMillis);
        shiftStopGrace.add(Calendar.MINUTE, -(s.getGraceperiod()));
        
        //Before Start of Shift
        if(otsMillis < shiftStart.getTimeInMillis() && otsMillis > shiftStartInterval.getTimeInMillis())
        {
            adjustedtimestamp.setTimeInMillis(shiftStartMillis);
            adjustedtimestamp.set(Calendar.HOUR, s.getStartHour());
            adjustedtimestamp.set(Calendar.MINUTE, s.getStartMinute());
            adjustedtimestamp.set(Calendar.SECOND, 0);

            eventdata = "Shift Start";
        }
        
        //After Start of Shift
        else if(otsMillis > shiftStartGrace.getTimeInMillis() && otsMillis < shiftStartDock.getTimeInMillis())
        {   
            adjustedtimestamp.setTimeInMillis(shiftStartMillis);
            adjustedtimestamp.add(Calendar.MINUTE, s.getDock());
            
            eventdata = "Shift Start";
        }
        
        //Within Grace Period
        else if(otsMillis > shiftStart.getTimeInMillis() && otsMillis < shiftStartGrace.getTimeInMillis())
            {
                adjustedtimestamp.setTimeInMillis(shiftStartMillis);
                adjustedtimestamp.set(Calendar.HOUR, s.getStartHour());
                adjustedtimestamp.set(Calendar.MINUTE, s.getStartMinute());
                adjustedtimestamp.set(Calendar.SECOND, 0);

                eventdata = "Shift Start";
            }
        
        //Lunch Break
        else if(otsMillis > lunchStart.getTimeInMillis() && otsMillis < lunchStop.getTimeInMillis()){
            if (getPunchtypeid() == 0){
                //clock out at beginning of lunch break
                adjustedtimestamp.setTimeInMillis(lunchStartMillis);
                adjustedtimestamp.set(Calendar.HOUR, s.getLunchStartHour());
                adjustedtimestamp.set(Calendar.MINUTE, s.getLunchStartMinute());
                adjustedtimestamp.set(Calendar.SECOND, 0);
                
                eventdata = "Lunch Start";
            }
            else if (getPunchtypeid() == 1){
                //clock in at end of lunch break
                adjustedtimestamp.setTimeInMillis(lunchStopMillis);
                adjustedtimestamp.set(Calendar.HOUR, s.getLunchStopHour());
                adjustedtimestamp.set(Calendar.MINUTE, s.getLunchStopMinute());
                adjustedtimestamp.set(Calendar.SECOND, 0);
                
                eventdata = "Lunch Stop";
            }
        }
        
        //Before End of Shift
        else if(otsMillis < shiftStopGrace.getTimeInMillis() && otsMillis > shiftStopDock.getTimeInMillis())
        {
          
        }
        
        //Within Grace Period
        else if(otsMillis < shiftStop.getTimeInMillis() && otsMillis > shiftStopGrace.getTimeInMillis())
            {
                
            }
        
        //After End of Shift
        else if(otsMillis > shiftStop.getTimeInMillis() && otsMillis < shiftStopInterval.getTimeInMillis())
        {
            
        }
    }
    
    public String printOriginalTimestamp(){        
        SimpleDateFormat format = new SimpleDateFormat("E MM/dd/yyyy HH:mm:ss");
        String ots = format.format(originaltimestamp.getTime()).toUpperCase();
        return '#' + badgeid + ' ' + getEventType(punchtypeid) + ots;
    }
    
    public String printAdjustedTimestamp(){        
        return null;
    }
}
