package Assingment1;

public class Ride {
    String source;
    String destination;
    int agreedOffer;
    Driver driver;
    User user;
    int rating=0;

    public Ride() {

    }

    public Ride(String source, String destination, int agreedOffer, Driver driver, User user) {
        this.source = source;
        this.destination = destination;
        this.agreedOffer = agreedOffer;
        this.driver = driver;
        this.user= user;

    }

    public String getSourceArea() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

