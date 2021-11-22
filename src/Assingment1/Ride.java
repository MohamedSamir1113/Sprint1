package Assingment1;

public class Ride extends Driver
{
    String SourceArea;
    String Destination;
    Driver d1 = new Driver();
    double Offer;
    public Ride()
    {

    }
    public Ride(String location , String destination)
    {
        SourceArea=location;
        Destination=destination;

    }

    public void notifyDriver()
    {
        d1.locationisfav(SourceArea);
    }
    public String getSourceArea()
    {
        return SourceArea;
    }
    public String getDestination()
    {
        return Destination;
    }


}

