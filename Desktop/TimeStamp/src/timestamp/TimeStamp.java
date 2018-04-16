package timestamp;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TimeStamp {

    public static void main(String[] args) {
        try {
            TASDatabase db= new TASDatabase();
            GregorianCalendar c = new GregorianCalendar();
            c.setTimeInMillis(1501670964000L);
            ArrayList<Punch> punchList = db.getDailyPunchList(new Badge("4E6E296E", ""), c);
            System.out.println(punchList.size());
            for (Punch p : punchList) {
                System.out.println(p.printOriginalTimestamp());
            }
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }      
    }
    //John Jones, Cody Stancil-Johnson, Tyler Greenwood, Michael Harvey
}
