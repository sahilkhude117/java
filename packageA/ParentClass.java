// Package declaration
package packageA;

// Parent class with different access levels
public class ParentClass {
    
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // default access
    private String privateVar = "Private Variable";

    public void display() {
        System.out.println("Inside ParentClass (packageA):");
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}

