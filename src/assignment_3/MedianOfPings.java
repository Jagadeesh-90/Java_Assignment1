package assignment_3;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfPings {
    double median(ArrayList<Double> roundTripTimes){
        Collections.sort( roundTripTimes);
        System.out.println("Trip times : " +  roundTripTimes);
        int mid =  roundTripTimes.size()/2;
        if( roundTripTimes.size() % 2 == 0 ){
            double ans =  roundTripTimes.get(mid) +  roundTripTimes.get(mid-1);
            return ans/2;
        }
        else return  roundTripTimes.get(mid-1);
    }
}
