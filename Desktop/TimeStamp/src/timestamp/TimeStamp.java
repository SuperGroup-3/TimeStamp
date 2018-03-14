package timestamp;

public class TimeStamp {

    public static void main(String[] args) {
        try {
            TASDatabase db= new TASDatabase();
            Badge b2 = db.getBadge("08D01475");
            Punch p = new Punch(b2, 1, 1);
            System.out.println(p.printOriginalTimestamp());
            
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }      
    }
    //John Jones, Cody Stancil-Johnson, Tyler Greenwood, Michael Harvey
}
