package Functional_Programming;

import java.util.function.*;

public class Demo3 {
    public static void main(String[] args) {

        // // Primitive support
        // // IntFunction, LongFunction, DoubleFunction -> int/long/double -> R
        // IntFunction<String> a = x -> "Number : " + x;
        // System.out.println(a.apply(10)); // Number : 10

        // LongFunction<String> b = x -> "Number : " + x;
        // System.out.println(b.apply(10l)); // Number : 10

        // DoubleFunction<String> c = x -> "Number : " + x;
        // System.out.println(c.apply(10.0)); // Number : 10.0

        // // ToIntFunction, ToLongFunction, ToDoubleFunction -> T -> int/long/double
        // ToIntFunction<String> a1 = str -> str.length();
        // System.out.println(a1.applyAsInt("Ram")); // 3

        // IntConsumer print = x -> System.out.println("Number : " + x);
        // print.accept(100);

        // IntSupplier random = () -> 10;
        // System.out.println(random.getAsInt());

        // IntPredicate isEven = x -> x % 2 == 0;
        // System.out.println(isEven.test(21));

        ObjIntConsumer<String> a = (name, marks) -> System.out.println(name + " scored " + marks);
        a.accept("Shyam", 80);

        ObjDoubleConsumer<String> b = (name, salary) -> System.out.println(name + "'s salary is " + salary);
        b.accept("Amit", 25000);

        ObjLongConsumer<Long> c = (sNo, value) -> System.out.println(sNo + " value is " + value);
        c.accept(12l, 1234);

    }
}
