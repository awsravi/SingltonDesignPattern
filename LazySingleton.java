package com.awsravi.j8M;
public class LazySingleton {

    // The single instance of the class, initialized lazily
    private static LazySingleton instance;

    // Private constructor to prevent instantiation outside the class
    private LazySingleton() {
        // Private constructor to prevent instantiation outside the class
    }

    // Public method to access the single instance, creating it if necessary
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // Other methods and properties of the class can be added here

    public void displayMessage() {
        System.out.println("This is a Lazy Initialization Singleton instance.");
    }

    public static void main(String[] args) {
        // Example usage
        LazySingleton singleton = LazySingleton.getInstance();
        singleton.displayMessage();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.hashCode());
        
        /*
         Lazy Initialization:

In the instance of the singleton class is created only when it is first requested.
The instance is created inside the getInstance method,
 and it checks if an instance already exists before creating a new one.
This approach is more resource-efficient as it avoids unnecessary instance creation. 
However, it requires synchronization to make it thread-safe.
         */
        
        
    }
}
