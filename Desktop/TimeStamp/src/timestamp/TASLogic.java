package timestamp;

import java.util.ArrayList;

/**
 *
 * @author Michael Harvey
 */
public class TASLogic {

    public static int calculateTotalMinutes(ArrayList<Punch> dailypunchlist, Shift shift){
        int totalMinutes = 0;
        boolean insidePair = false; 
        for (int i=0;i<dailypunchlist.size();++i){
        //check for clock in punch
        //find matching clock out punch
        //change timestamps to millis
        //subtract clock out milli from clock in milli
        //divide ^ by 1000 to convert to seconds
        //divide ^ by 60 to get minutes
        }
        return totalMinutes;
    }
}
