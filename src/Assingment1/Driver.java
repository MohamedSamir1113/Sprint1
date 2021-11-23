package Assingment1;
import java.util.ArrayList;
public class Driver implements Observer
{
    boolean isVerified;
    ArrayList<String> FavAreas = new ArrayList<>();
    ArrayList<Ride> DriverHistory = new ArrayList();
    ArrayList<Ride> IntrestedRides = new ArrayList<>();
    String nationalID;
    String driverLicense;
    //Ride[] historyofrides;
    public Driver(){

    }
    public Driver(String Id, String Dl)
    {
        nationalID=Id;
        driverLicense=Dl;

    }

    public ArrayList<String> ListFavAreasRides()
    {
        return FavAreas;
    }
    public boolean locationisfav(String userlocation)
    {

        for(String i : FavAreas)
        {
            if(i.contentEquals(userlocation)) {
                return true;
            }
        }
        return false;
    }
    public void AddIntredRide(Ride r1, String Userlocation){
        for(String i : FavAreas)
        {
            if(i.contentEquals(Userlocation))
            {
                IntrestedRides.add(r1);

            }
        }
    }
    public void DisplayIntredRides()
    {
        for(Ride i : IntrestedRides)
        {
            System.out.println(i.getSourceArea()+" "+i.getDestination());
        }
    }

    public void addfavarea(String newfavarea)
    {
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

}