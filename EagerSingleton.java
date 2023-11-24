package com.awsravi.j8M;

public class EagerSingleton {

    // The single instance of the class, created eagerly
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation outside the class
    private EagerSingleton() {
        // Private constructor to prevent instantiation outside the class
    }

    // Public method to access the single instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Other methods and properties of the class can be added here

    public void displayMessage() {
        System.out.println("This is an Eager Singleton instance.");
    }

    public static void main(String[] args) {
        // Example usage
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.displayMessage();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());
        
        /*Eager Initialization:

In the instance of the singleton class is created at the time of 
class loading or during the initialization phase.
The instance is created irrespective of whether it is needed or not.
This approach is simple and thread-safe but may lead to unnecessary resource 
utilization if the instance is not always needed during the application's lifecycle.
        */
        
    }
}
