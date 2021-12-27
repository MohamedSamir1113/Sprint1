package Assingment1;

import java.util.ArrayList;

public class FavAreasclass implements Subject {
    ArrayList<Driver> lisofdirvers = new ArrayList<Driver>();
    String UserLocation;
    FavAreasclass(){
    }

    FavAreasclass(String userloc){
        UserLocation=userloc;
    }
    public void subscribe(Driver D){
        lisofdirvers.add(D);
    }
    public void unsubscribe(Driver D){
        lisofdirvers.remove(D);
    }
    public void notifyDriver()
    {
        for(Driver i : lisofdirvers)
        {
            i.locationisfav(UserLocation);


        }
    }
}
