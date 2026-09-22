package Generics;

public class GenericMethod {
    public static void main(String[] args) {
        Integer y = getResult(20);
        String s = getResult("Shyam");

        System.out.println(y);
        System.out.println(s);

        // Type inference - Automatically figures out the data type of a variable
        printPair(11, "Hello");
    }

    public static <T> T getResult(T x) {
        return x;
    }

    public static <T, U> void printPair(T first, U second) {
        System.out.println(first + " , " + second);
    }

    // Generic Methods
    // <T> returnType methodName(T parameter){}
}
