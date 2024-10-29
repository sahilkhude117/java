// Interface with shared constants
interface Constants {
    int MAX_SPEED = 120;
    int MIN_SPEED = 0;
    String VEHICLE_TYPE = "car";

}

// Class implementing the Constants interface
class Car implements Constants {
    private int speed;

    // Constructor to initialize speed
    public Car(int speed) {
        if (speed > MAX_SPEED) {
            this.speed = MAX_SPEED;  // Using MAX_SPEED from the interface
        } else if (speed < MIN_SPEED) {
            this.speed = MIN_SPEED;  // Using MIN_SPEED from the interface
        } else {
            this.speed = speed;
        }
    }

    // Display information about the car
    public void displayInfo() {
        System.out.println("Vehicle Type: " + VEHICLE_TYPE); // Accessing VEHICLE_TYPE
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class to run the program
public class InterfaceDemo {
    public static void main(String[] args) {
        Car car1 = new Car(150); // Speed exceeds MAX_SPEED, should be capped
        Car car2 = new Car(50);  // Within the allowed range

        car1.displayInfo();
        car2.displayInfo();
    }
}

