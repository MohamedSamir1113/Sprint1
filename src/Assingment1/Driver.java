package Assingment1;

import java.util.ArrayList;

public class Driver implements Observer {
    boolean isVerified;
    ArrayList<String> FavAreas;
    ArrayList<Ride> IntrestedRides;
    String nationalID;
    String driverLicense;
    FavAreasclass objfavarea;
    ArrayList<Ride> ridesHistory;
    int balance;

    public Driver() {
        objfavarea.subscribe(this);
    }

    public Driver(String Id, String Dl) {
        nationalID = Id;
        driverLicense = Dl;
        objfavarea.subscribe(this);
    }

    public ArrayList<String> ListFavAreasRides() {
        return FavAreas;
    }

    public boolean locationisfav(String userlocation)//checks if the input of the user is in driver's fav area update of observer pattern
    {
        for (String i : FavAreas) {
            if (i.contentEquals(userlocation)) {
                return true;
            }
        }
        return false;
    }

    public void AddIntredRide(Ride r1, String Userlocation) { // user inputting his rides
        for (String i : FavAreas) {
            if (i.contentEquals(Userlocation)) {
                IntrestedRides.add(r1);
            }
        }
    }

    public void DisplayIntredRides()//
    {
        for (Ride i : IntrestedRides) {
            System.out.println(i.getSourceArea() + " " + i.getDestination());
        }
    }

    public void addfavarea(String newfavarea) {
        FavAreas.add(newfavarea);
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public ArrayList<Ride> getRidesHistory() {
        return ridesHistory;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addCost(int cost){
        balance += cost;
    }

    public void addRide(Ride ride) {
        ridesHistory.add(ride);
    }
}
