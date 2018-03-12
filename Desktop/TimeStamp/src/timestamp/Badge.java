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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        return "#" + id + " (" + description + ')';
    }
}
