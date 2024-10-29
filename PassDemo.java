public class PassDemo {

    // Method to demonstrate pass-by-value with primitive
    public static void modify(int num) {
        num = 50;  // This change won't affect the original variable
    }

    // Method to demonstrate pass-by-reference-like behavior with an object
    public static void modify(MyObject obj) {
        obj.value = 50;  // Modifies the object's internal value
    }

    public static void main(String[] args) {
        int number = 10;
        modify(number);
        System.out.println("After modifyPrimitive, number: " + number); // Output: 10

        MyObject myObj = new MyObject();
        myObj.value = 10;
        modify(myObj);
        System.out.println("After modifyObject, myObj.value: " + myObj.value); // Output: 50
    }
}

class MyObject {
    int value;
}
