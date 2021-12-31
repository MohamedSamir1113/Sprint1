package Assingment1;

import java.util.ArrayList;

public class AdminUser {

    public void verifyRegistration(Driver driver) {
        driver.setVerified(true);
    }

    public ArrayList<Driver> pendingList(ArrayList<Driver> allDrivers) {
        ArrayList<Driver> unverified = new ArrayList<>();
        allDrivers.forEach(driver -> {
            if (!driver.isVerified()) {
                unverified.add(driver);
            }
        });
        return unverified;
    }
}
