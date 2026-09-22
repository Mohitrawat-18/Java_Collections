package Generics;

public class Casting {
    public static void main(String[] args) {
        // Upcasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        // Downcasting
        Object obj2 = "Raman";
        // String s2 = obj2; // Type Mismatch
        String s2 = (String) obj2;
        System.out.println(s2);

        // Downcasting can be dangerous
        // Object obj3 = 10;
        // String s3 = (String) obj3;
        // System.out.println(s3); // ClassCastException
    }
}
