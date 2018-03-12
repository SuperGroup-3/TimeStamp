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
    public Badge (String id, String d){
        this.id = id;
        this.description = d;      
    }
    
    // method(s)
    public void setID(String id){
        this.id = id;
    }
    
    public void setDescription (String d){
        this.description = d;
    }
    
    public String getID(){
        return id;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String toString(){
        return "#" + id + " (" + description + ')';
    }
}
