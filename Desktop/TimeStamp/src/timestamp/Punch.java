package timestamp;

import java.util.GregorianCalendar;

/**
 * 
 * @author Michael Harvey
 */
public class Punch {
    
    //instance fields
    private int terminalid;
    private int eventtypeid;
    private int punchid;
    private GregorianCalendar originaltimestamp;
    
    //constructor
    public Punch(int terminalid, int eventtypeid, int punchid) {
        this.terminalid = terminalid;
        this.eventtypeid = eventtypeid;
        this.punchid = punchid;
    }

    //methods
    public GregorianCalendar printOriginalTimestamp(){
        return originaltimestamp;
    }
}
