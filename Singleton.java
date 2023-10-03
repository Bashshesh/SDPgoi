public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside the class.
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //instanseы как по книжке
            instance = new Singleton();
        }
        return instance;
    }
}

