// Superclass
class Person {
    private String name; // Private member

    // Constructor
    public Person(String name){
        this.name = name;
    }

    // Public getter for private member
    public String getName(){
        return name;
    }

    // Public setter for private member
    public void setName(String name){
        this.name = name;
    }
    
}

// Subclass
class Student extends Person {
    private int studentId;

    // Constructor
    public Student(String name,int studentId){
        super(name);
        this.studentId = studentId;
    }

    // Method in subclass accessing private member indirectly
    public void displayInfo() {
        // Access private 'name' field from superclass using the public getter
        System.out.println("Student id :" + studentId);
        System.out.println("Student name is :" + getName());
    }
}

public class PrivateDemo {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("sahil", 1);

        // Display student information
        student.displayInfo();

        // Modify private 'name' field in superclass using the public setter
        student.setName("bob");
        
        // Display updated student information
        student.displayInfo();
    }
}

