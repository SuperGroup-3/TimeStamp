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
            if (dailypunchlist.get(i).getPunchtypeid()==1){
                //change timestamp to millis
                long in = dailypunchlist.get(i).getOriginaltimestamp().getTimeInMillis(); //Change original to adjusted later
                insidePair = true;
                i++;
                //find matching clock out punch
                while (insidePair){
                    if (dailypunchlist.get(i).getPunchtypeid()==0){ //ignore unmatched pairs
                        //change timestamp to millis
                        long out = dailypunchlist.get(i).getOriginaltimestamp().getTimeInMillis(); //Change original to adjusted later
                        insidePair = false;
                    }
                    else{
                        i++;
                    }
                }
            }
            //subtract clock in milli from clock out milli
            //divide ^ by 1000 to convert to seconds
            //divide ^ by 60 to get minutes
        }
        return totalMinutes;
    }
}
