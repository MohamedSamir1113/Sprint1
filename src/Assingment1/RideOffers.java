package Assingment1;

import java.util.ArrayList;

public class RideOffers {
    ArrayList<DriverOffer> driverOffers;
    int userOffer;

    public RideOffers(int userOffer) {
        this.userOffer = userOffer;
    }

    public ArrayList<DriverOffer> getDriversOffers() {
        return driverOffers;
    }

    public void addDriverOffer(DriverOffer offer) {
        driverOffers.add(offer);
    }
}
