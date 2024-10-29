// Outer class
class OuterClass {
    private String outerData = "Outer class data";

    // Non-static inner class
    class InnerClass {
        void display() {
            // Accessing outer class private member
            System.out.println("Accessing from InnerClass: " + outerData);
        }
    }

    // Static nested class
    static class StaticNestedClass {
        void show() {
            // Directly accessing static members of outer class (if any)
            System.out.println("Static Nested Class Method Called");
        }
    }

    // Method demonstrating local inner class
    public void localInnerClassDemo() {
        class LocalInnerClass {
            void print() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.print();
    }

    // Method demonstrating anonymous inner class
    public void anonymousInnerClassDemo() {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Anonymous Inner Class Runnable");
            }
        };
        runnable.run();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass outer = new OuterClass();

        // Creating an instance of InnerClass using OuterClass instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Calling method of inner class

        // Creating an instance of StaticNestedClass directly
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.show(); // Calling method of static nested class

        // Calling method with Local Inner Class
        outer.localInnerClassDemo();

        // Calling method with Anonymous Inner Class
        outer.anonymousInnerClassDemo();
    }
}

