package timestamp;

/**
 * 
 * @author Cody Stancil-Johnson
 */
public class Badge {
    // instance fields
    private String id;
    private String description;
    
    // constructor(s)
    public Badge (String SEB, String d){
        this.id = SEB;
        this.description = d;      
    }
    
    // method(s)
    public void setID(String ID){
        this.id = ID;
    }
    
    public void setDescription (String D){
        this.description = D;
    }
    
    public String getID(){
        return id;
    }
    
    public String getDescription(){
        return description;
    }
}
