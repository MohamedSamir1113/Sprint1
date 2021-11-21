package Assingment1;

import java.util.Scanner;

public class WebApp<choice> {

    public static void main(String[] args) {
        String inputUsername, inputPassword, inputEmail ,nationalID ,Licence ,inputMobileNumber;

        Scanner scan = new Scanner(System.in);
        UserManager obj= new UserManager();
        do {
            System.out.println("Login or Create an account");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter username");
                    inputUsername = scan.next();
                    System.out.println("Enter password");
                    inputPassword = scan.next();
                    if(true);//obj.s1.login(inputUsername, inputPassword)
                    {
                        System.out.println("enter your location");
                        String location = scan.next();
                        System.out.println("enter your distinination");
                        String distination = scan.next();
                        customermanger m1= new customermanger();
                        m1.requestRide(location,distination);
                        System.out.println("enter your favorite areas");

                        Driver d1= new Driver();

                        for(int i=0; i<3;i++)
                        {
                            String fav = scan.next();

                            d1.addfavarea(fav);

                        }
                        if(d1.locationisfav(location))
                        {
                            System.out.println("Driver wake up");
                        }

                    }
                    break;
                }
                case 2: {
                    System.out.println("customer or driver an account");
                    int choice1 = scan.nextInt();
                    switch (choice1) {
                        case 1: {
                            System.out.println("Enter username");
                            inputUsername = scan.next();
                            System.out.println("Enter password");
                            inputPassword = scan.next();
                            System.out.println("Enter emial");
                            inputEmail = scan.next();
                            System.out.println("Enter phone number");
                            inputMobileNumber = scan.next();
                            UserAccount Account = new UserAccount(inputUsername, inputPassword, inputEmail, inputMobileNumber);
                            obj.s1.register(Account);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter username");
                            inputUsername = scan.next();
                            System.out.println("Enter password");
                            inputPassword = scan.next();
                            System.out.println("Enter emial");
                            inputEmail = scan.next();
                            System.out.println("Enter phone number");
                            inputMobileNumber = scan.next();
                            System.out.println("Enter national Id ");
                            nationalID = scan.next();
                            System.out.println("Enter national Id ");
                            Licence = scan.next();
                            AdminUser adminUser = new AdminUser();
                            if (adminUser.verfiyDriver(Licence, nationalID)) {
                                UserAccount Account = new UserAccount(inputUsername, inputPassword, inputEmail, inputMobileNumber);
                                obj.s1.register(Account);
                            } else {
                                System.out.println("invalid national id or licence failed to register");
                            }
                            break;
                        }
                    }

                    break;
                }
            }
        }
        while(true);

    }


}
