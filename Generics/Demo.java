package Generics;

public class Demo {
    public static void main(String[] args) {
        // Box box = new Box(20);
        // System.out.println(box.getValue()); // 20

        // Box box1 = new Box("Hello");
        // Box box2 = new Box(20);
        // Box box3 = new Box(true);

        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Raman");
        Box<Boolean> b3 = new Box<>(false);
        System.out.println(b1.getValue() + " " + b2.getValue() + " " + b3.getValue());

        // System.out.println(box1.getValue() + 5); // No operations can be done

        // String s = (String) b1.getValue(); // Compile-time error
    }
}

// class Box {
// private int value;

// Box(int value) {
// this.value = value;
// }

// public int getValue() {
// return this.value;
// }

// public void setValue(int value) {
// this.value = value;
// }
// }

// One way is use Object as Data type
// generic Box -> type information is lost
// class Box {
// private Object value;

// Box(Object value) {
// this.value = value;
// }

// public Object getValue() {
// return this.value;
// }

// public void setValue(Object value) {
// this.value = value;
// }
// }

// Generics
// T -> placeholder , <T> -> Type Parameter
class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}