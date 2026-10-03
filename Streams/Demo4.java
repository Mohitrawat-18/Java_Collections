package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {

        // Terminal Operations

        List<Integer> list = new ArrayList<>(List.of(2, 14, 11, 9, 7));

        List<Integer> list2 = list.stream()
                .map(x -> x + 1)
                // .forEach(System.out::println); // forEach
                .toList(); // toList()

        System.out.println(list2);

        List<Integer> list3 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList()); // collect()

        System.out.println(list3);

        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b); // reduce()

        System.out.println(sum.get());

        long num = list.stream()
                .filter(x -> x > 10)
                .count(); // count()

        System.out.println(num);

        // findFirst()
        Optional<Integer> num3 = list.stream()
                .filter(x -> x > 10)
                .findFirst();

        System.out.println(num3.get());

        // findAny()
        Optional<Integer> num1 = list.stream()
                .filter(x -> x > 10)
                .findAny();

        System.out.println(num1.get());

        // anyMatch()
        boolean num2 = list.stream()
                .filter(x -> x > 10)
                .anyMatch(x -> x % 2 == 0); // also allMatch() and noneMatch()

        System.out.println(num2);

        // sum, max, min, average -> Primitive Streams

    }
}
