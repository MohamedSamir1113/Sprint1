package Assingment1;

public class AdminUser {
    public boolean verfiyDriver(String dl, String nid)
    {
        if(dl.length()==5 && nid.length()==5 )
        {
            System.out.println("valid national id or licence");
            return true;
        }
        return false;
    }
}
