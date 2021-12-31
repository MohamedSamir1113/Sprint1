package Assingment1;

import java.util.ArrayList;

class User {
    ArrayList<Ride> ridesHistory;

    public ArrayList<Ride> getRidesHistory() {
        return ridesHistory;
    }

    public void addRide(Ride ride) {
        ridesHistory.add(ride);
    }

    public void rateRide(Ride ride, int rating) {
        if (ride.getRating() == 0) {
            if(rating<=5 && rating>=1) {
                ride.setRating(rating);
            }
            else{
                System.out.println("Error: you should enter a number between 1 and 5");
            }
        }
    }
}