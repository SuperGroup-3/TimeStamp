package timestamp;

/**
 * 
 * @author Michael Harvey
 */
public class Punch {
    
    //instance fields
    private int terminalid;
    private int punchtypeid;
    private int punchid;
    private Badge badge;
    
    //constructor
    public Punch(int terminalid, int punchtypeid, int punchid, Badge badge) {
        this.terminalid = terminalid;
        this.punchtypeid = punchtypeid;
        this.punchid = punchid;
        this.badge = badge;
    }
    
    //methods
    public Punch getPunch(punchid){
        //TODO
    }
}
