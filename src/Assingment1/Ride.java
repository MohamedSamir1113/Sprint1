package Assingment1;

public class Ride extends Driver
{
    String SourceArea;
    String Destination;
    Driver d1 = new Driver();
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
        System.out.println("hey Driver i am notifier");

    }
}

