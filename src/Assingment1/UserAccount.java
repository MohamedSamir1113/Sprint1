package Assingment1;

public class UserAccount {
    String username ,password ,email ,MobileNumber;
    public UserAccount()
    {

    }
    public UserAccount(String u, String p, String e , String n)
    {
        username=u;
        password=p;
        email=e;
        MobileNumber=n;
        System.out.println("this is a constructor");
    }

}
