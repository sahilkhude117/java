// Superclass
class Animal {
    public String name = "Animal";

    // Superclass constructor
    public Animal(){
        System.out.println("Animal Constructor is called");
    }

    // Parameterized constructor
    public Animal(String name){
        this.name = name;
        System.out.println("Animal contstructor is called with " + name);
    }

    // Superclass method
    public void makeSound(){
        System.out.print( " Makes Sound :");
    }
}

// Subclass
class Dog extends Animal {
    String name = "Dog"; // Subclass variable with same name as superclass

    // Subclass constructor
    public Dog() {
        // Use of super() to call superclass constructor
        super();
        System.out.println("Dog Constructor is called");
    }

    // Subclass constructor with parameter
    public Dog(String name) {
        // Use of super(name) to call superclass parameterized constructor
        super(name);
        this.name = name;
        System.out.println("Dog parameterized constructor called with name: " + name);
    }

    // Subclass method overriding the superclass method
    @Override
    public void makeSound() {
        // Calling superclass method using super
        super.makeSound();
        System.out.println(": Dog Barks");
    }

    // Method to show variable access using super
    public void displayNames() {
        System.out.println("Name in superclass: " + super.name); // Accessing superclass variable
        System.out.println("Name is subclass: " + this.name);     // Accessing subclass variable
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        System.out.println("Creating Dog with no-arg constructor:");
        Dog dog1 = new Dog(); // Calls superclass and subclass constructors

        System.out.println("\nCreating Dog with parameterized constructor:");
        Dog dog2 = new Dog("Buddy"); // Calls parameterized constructor of both superclass and subclass

        System.out.println("\nDemonstrating method overriding:");
        dog2.makeSound(); // Calls overridden method

        System.out.println("\nDemonstrating variable access:");
        dog2.displayNames(); // Shows use of super to access superclass variable
    }
}

