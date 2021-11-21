package Assingment1;
import java.util.ArrayList;
public class Driver implements Observer
{
    ArrayList<String> FavAreas = new ArrayList<>();
    ArrayList<Ride> DriverHistory = new ArrayList();
    //Ride[] historyofrides;

    public ArrayList<String> ListFavAreasRides()
    {
        return FavAreas;
    }
    public void locationisfav(String userlocation)
    {

        for(String i : FavAreas)
        {
            if(i.contentEquals(userlocation)) {
                System.out.println("hey Driver i am sfosfdosdfjsofisjfsofskfnsfo");
                display();

            }

        }

    }

    public void display(){
        System.out.println("what's up my nigga");
    }

    public void addfavarea(String newfavarea)
    {

        FavAreas.add(newfavarea);
    }


}
