// Package declaration
package packageB;

// Importing ParentClass from packageA
import packageA.ParentClass;

public class ChildClass extends ParentClass {
    
    public void displayAccess() {
        System.out.println("Inside ChildClass (packageB):");
        
        // Accessing variables from ParentClass
        System.out.println("Public Variable: " + publicVar);         // Accessible
        System.out.println("Protected Variable: " + protectedVar);   // Accessible because ChildClass extends ParentClass
        
        // Default and private variables are not accessible in different packages
        // System.out.println("Default Variable: " + defaultVar);    // Error: Not accessible
        // System.out.println("Private Variable: " + privateVar);    // Error: Not accessible
    }

    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.display();

        ChildClass child = new ChildClass();
        child.displayAccess();
    }
}

