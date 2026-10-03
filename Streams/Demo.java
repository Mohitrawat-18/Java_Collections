package Streams;

import java.util.*;
// import java.util.stream.*;;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(11, 28, 43, 4, 19, 21));

        // Stream<Integer> s = list.stream();
        // s= s.filter(x -> x > 20);
        // s= s.map(x -> x * 2);
        // s.forEach(System.out::println);

        list.stream()
                .filter(x -> x > 20)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}
