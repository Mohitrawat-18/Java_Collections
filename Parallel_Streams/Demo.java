package Parallel_Streams;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        
        // Parallel Streams
        list.parallelStream()
            .map(x -> x * 2)
            .forEachOrdered(System.out::println);

    }
}
