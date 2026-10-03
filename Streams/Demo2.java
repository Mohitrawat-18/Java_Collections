package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(11, 28, 43, 4, 19, 21));

        // Collection
        list.stream()
                .filter(x -> x > 20)
                .map(x -> x * 2)
                .forEach(System.out::println);

        // Array
        Integer[] arr = { 11, 12, 13, 14, 15 };
        Arrays
                .stream(arr)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));

        // Stream.of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));

        // Empty Stream
        Stream.empty();

        // Infinite Stream -> iterate(), generate()
        Stream
                .iterate(1, x -> x + 1)
                .limit(10)
                .forEach(System.out::println);

        Stream
                .generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
