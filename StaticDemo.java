public class StaticDemo {

    // Static variable
    static int count = 0;

    // Instance variable
    int instanceVariable;

    // Static block
    static {
        System.out.println("Static block executed - Class is loaded.");
        count = 10; // Initializing static variable
    }

    // Constructor
    public StaticDemo() {
        instanceVariable = ++count; // Increment static count for each instance
        System.out.println("Constructor called, instanceVariable: " + instanceVariable);
    }

    // Static method
    public static void displayCount() {
        System.out.println("Current count (static variable): " + count);
    }

    // Non-static method
    public void showInstanceVariable() {
        System.out.println("Instance variable for this object: " + instanceVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");

        // Accessing static method without creating an object
        StaticDemo.displayCount();

        // Creating instances
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        // Accessing static and non-static methods
        obj1.showInstanceVariable();
        obj2.showInstanceVariable();
        StaticDemo.displayCount();
    }
}

