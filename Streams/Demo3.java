package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4, 12, 13, 1, 14, 13, 8));

        // Intermediate operations
        list.stream()
                .filter(x -> x > 5) // filter()
                .map(x -> x * 2) // map
                .peek(System.out::println) // peek()
                .sorted() // sorted
                .distinct() // distinct
                .forEach(System.out::println);

        // flatMap()
        List<List<Integer>> list2 = List.of(
                List.of(1, 2),
                List.of(3, 4));

        list2.stream()
                .flatMap(x -> x.stream())
                .map(x -> x * 2)
                .forEach(System.out::println);

        Stream
                .iterate(1, x -> x + 1) // iterate()
                .limit(5) // limit
                .skip(2) // skip
                .forEach(System.out::println);

    }
}
