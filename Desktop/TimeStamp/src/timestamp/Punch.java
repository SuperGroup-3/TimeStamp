package timestamp;

import java.util.GregorianCalendar;

/**
 * 
 * @author Michael Harvey
 */
public class Punch {
    
    //instance fields
    private Badge badge;
    private int id;
    private int terminalid;
    private String badgeid;
    private GregorianCalendar originaltimestamp;
    private int punchtypeid;
    private String eventdata;
    
    
    //constructor
    public Punch(Badge badge, int id, int terminalid, String bagdeid, GregorianCalender originaltimestanp, int eventtypeid, String eventdata) {
        this.badge = badge;
        this.id = id;
        this.terminalid = terminalid;
        this.badgeid = badgeid;
        this.originaltimestamp = originaltimestamp;
        this.eventtypeid = eventtypeid;
        this.eventdata = eventdata;
        
    }

    //methods
    public GregorianCalendar printOriginalTimestamp(){
        return originaltimestamp;
    }
}
