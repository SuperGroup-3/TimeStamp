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
    
    
    //constructor(s)
    public Punch(Badge badge, int terminalid, int punchtypeid){
        this.badge = badge;
        this.terminalid = terminalid;
        this.punchtypeid = punchtypeid;       
    }

    //methods
    public GregorianCalendar printOriginalTimestamp(){
        return originaltimestamp;
    }
}
