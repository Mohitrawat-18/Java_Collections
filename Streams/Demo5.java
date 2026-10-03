package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {

        // Collectors class

        // toList(), toMap(), toSet()

        List<String> list = new ArrayList<>(List.of("AA", "BBB", "CCCC", "DD", "EEE"));
        List<Integer> list2 = new ArrayList<>(List.of(1, 12, 9, 7, 14));

        // groupingBy()
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(map);

        // partitioningBy()
        Map<Boolean, List<Integer>> map2 = list2.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(map2);

        // mapping function
        Map<Integer, List<String>> map3 = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x.length(),
                        Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));
        System.out.println(map3);

        // joining()
        String result = list.stream()
                .collect(Collectors.joining("-"));
        System.out.println(result);
    }
}
