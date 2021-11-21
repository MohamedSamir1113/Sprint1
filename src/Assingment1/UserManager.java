package Assingment1;

import java.util.ArrayList;

public  class UserManager  {

    Storage s1= new hashmap() {
        public void register(UserAccount account) {
            super.register(account);
        }
        public boolean login(String usname, String passwd) {
            return  super.login(usname ,  passwd);
        }

    };

}
