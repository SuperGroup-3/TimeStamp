package timestamp;

public class Shift {
    String id;
    String description;
    
    Integer start;
    Integer stop;
    
    Integer lunchstart;
    Integer lunchstop;
    Integer lunchdeduct;
    
    Integer interval;
    Integer graceperiod;
    Integer dock;
    
    
    /* ID Setter */
    private void setId(String id){
        this.id = id;
    }
    /* ID Getter */
    public String getId(){
        return id;
    }
    
    /* Description Setter */
    private void setDescription(String description){
        this.description = description;
    }
    
    /* Description Getter */
    public String getDescription(){
        return description;
    }
}
