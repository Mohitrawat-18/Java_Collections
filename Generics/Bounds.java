package Generics;

public class Bounds {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 10;
        b1.printDouble(); // 10.0
        // Box<String> b1 = new Box<>(); // error
    }
}

// Bounds in Generics
// Upper Bound -> T is atleast Number or its subtype

class Box<T extends Number> {
    T value;

    public void printDouble() {
        System.out.println(value.doubleValue());
    }

}
