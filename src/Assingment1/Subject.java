package Assingment1;

public interface Subject {

    Observer o1 = new Driver() {};
    public void subscribe(Driver D);
    public void unsubscribe(Driver D);
    public void notifyDriver();
    };


