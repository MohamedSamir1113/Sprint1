package Assingment1;

public class ManageRide {
    String sourceArea;
    String destination;
    RideOffers rideOffers;
    User user;

    public ManageRide(String location, String destination, int userOffer) {
        this.sourceArea = location;
        this.destination = destination;
        this.rideOffers = new RideOffers(userOffer);
    }

    public void addDriverOffer(Driver driver, int offer) {
        DriverOffer driverOffer = new DriverOffer(offer, driver);
        rideOffers.addDriverOffer(driverOffer);
    }

    public void acceptDriverOffer(DriverOffer driverOffer) {
        Ride ride = new Ride(sourceArea, destination, driverOffer.offer, driverOffer.driver, user);
    }

    public static void endRide(Ride ride){
        ride.driver.addRide(ride);
        ride.driver.addCost(ride.agreedOffer);
        ride.user.addRide(ride);
    }
}
