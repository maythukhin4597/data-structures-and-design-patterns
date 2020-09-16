package creational.singleton.headfirst;

public class Singleton {
    static volatile Singleton instance; //The volatile keyword ensures that multiple threads
                                // handle the instance variable correctly when it is
                                // being initialized to the Singleton instance.

    private Singleton() {

    }

    // normal singleton method
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    // synchronized singleton method
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //double checking
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
