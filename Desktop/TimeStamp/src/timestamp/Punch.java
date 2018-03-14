package timestamp;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * 
 * @author Michael Harvey
 */
public class Punch {
    
    //important vairables
    public static final String EventType_0 = "CLOCKED IN: ";
    public static final String EventType_1 = "CLOCKED OUT: ";
    public static final String EventType_2 = "TIMED OUT: ";
    
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
                return EventType_0;
            case 1:
                return EventType_1;
            case 2:
                return EventType_2;
            default:
                break;
        }
        return "null";
    }
    
    public String printOriginalTimestamp(){        
        SimpleDateFormat format = new SimpleDateFormat("E MM/dd/yyyy kk:mm:ss");
        String ots = format.format(originaltimestamp.getTime()).toUpperCase();
        return '#' + badgeid + ' ' + getEventType(punchtypeid) + ots;
    }
}
