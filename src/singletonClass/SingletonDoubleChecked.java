package singletonClass;

public class SingletonDoubleChecked {

    // Private static instance variable
    private static volatile SingletonDoubleChecked instance;

    // Private constructor to prevent instantiation
    private SingletonDoubleChecked() {
        // Initialization code, if any
    }

    // Public static method to get the singleton instance
    public static SingletonDoubleChecked getInstance() {
        // First check: lazy initialization without synchronization
        if (instance == null) {
            // Synchronized block to ensure only one instance is created
            synchronized (SingletonDoubleChecked.class) {
                // Double check: ensure instance is still null before creating
                if (instance == null) {
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }

    // Example method of the singleton instance
    public void doSomething() {
        System.out.println("SingletonDoubleChecked instance is doing something.");
    }

    public static void main(String[] args) {
        // Test singleton instance
        SingletonDoubleChecked singleton = SingletonDoubleChecked.getInstance();
        singleton.doSomething();
    }
}
