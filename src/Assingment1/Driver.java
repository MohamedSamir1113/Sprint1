package Assingment1;
import java.util.ArrayList;
public class Driver
{
    ArrayList<String> FavAreas = new ArrayList<>();
    ArrayList<Ride> DriverHistory = new ArrayList();
    //Ride[] historyofrides;

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

    public void addfavarea(String newfavarea)
    {
        System.out.println(newfavarea);
        FavAreas.add(newfavarea);
    }


}
