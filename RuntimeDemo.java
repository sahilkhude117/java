// Superclass
class Animal {
    // Method that will be overridden in the subclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimeDemo {
    public static void main(String[] args) {
        // Creating superclass reference but subclass object
        Animal animal;

        // Assigning Dog object to animal reference
        animal = new Dog();
        animal.sound(); // Calls Dog's sound() method (Dynamic method dispatch)

        // Assigning Cat object to animal reference
        animal = new Cat();
        animal.sound(); // Calls Cat's sound() method (Dynamic method dispatch)
    }
}

