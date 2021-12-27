package Assingment1;

public class Ride extends Driver
{
    String SourceArea;
    String Destination;
    double Offer;

    public Ride()
    {

    }

    public Ride(String location , String destination)
    {
        SourceArea=location;
        Destination=destination;

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

