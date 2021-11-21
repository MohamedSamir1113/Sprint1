package Assingment1;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class hashmap implements Storage
{
    Integer key=1;
    HashMap<Integer, UserAccount> Accounts = new HashMap<Integer, UserAccount>();

    public void register(UserAccount account)
    {
        Accounts.put(key,account);
        key++;
    }
    public boolean login(String usname, String passwd)
    {
        for (Integer i : Accounts.keySet()) {

            if(Accounts.get(i).username.contentEquals(usname) && Accounts.get(i).password.contentEquals(passwd)  )
            {
                System.out.println("valid, welcome user");
                return true;
            }
        }
        return false;
    }

}





