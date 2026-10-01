package Functional_Programming;

import java.util.*;
// import java.util.function.*;

public class Demo2 {
    public static void main(String[] args) {

        // // Function Interface
        // Function<Integer, Integer> sq = x -> x * x;
        // System.out.println(sq.apply(6)); // 36

        // // Consumer Interface
        // Consumer<Integer> print = x -> System.out.println(x);
        // print.accept(12); // 12

        // // Supplier Interface
        // Supplier<Double> random = () -> Math.floor(Math.random() * 10 + 1);
        // System.out.println(random.get());

        // // Predicate Interface
        // Predicate<Integer> isEven = x -> x % 2 == 0;
        // System.out.println(isEven.test(25)); // false

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // for (Integer values : list) {
        // System.out.println(values);
        // }

        // Iterable forEach() method use Consumer interface.
        list.forEach(x -> System.out.println(x));
    }
}
