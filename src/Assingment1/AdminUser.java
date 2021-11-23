package Assingment1;

import java.util.ArrayList;

public class AdminUser {

    public boolean verifyRegistration(Driver driver) {
        if (verifyLength(driver.getNationalID()) && verifyLength(driver.getDriverLicense())) {
            driver.setVerified(true);
            return true;
        }
        return false;
    }

    public boolean verifyLength(String verifiable){
        return verifiable.length() == 10;
    }

    public ArrayList<Driver> pendingList(ArrayList<Driver> allDrivers){
        ArrayList<Driver> unverified = new ArrayList<>();
        allDrivers.forEach(driver -> {
            if(!driver.isVerified()){
                unverified.add(driver);
            }
        });
        return unverified;
    }

}