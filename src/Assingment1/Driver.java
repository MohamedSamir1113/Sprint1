package Assingment1;
import java.util.ArrayList;
public class Driver implements Observer
{
    ArrayList<String> FavAreas = new ArrayList<>();
    ArrayList<Ride> DriverHistory = new ArrayList();
    ArrayList<Ride> IntrestedRides = new ArrayList<>();

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
                System.out.println("hey Driver i am sfosfdosdfjsofisjfsofskfnsfo");
                display();
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
                
                System.out.println(r1);

                IntrestedRides.add(r1);

            }
        }
    }
    public void DisplayInstresed()
    {
        for(Ride x : IntrestedRides) {
            System.out.println(x);
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
