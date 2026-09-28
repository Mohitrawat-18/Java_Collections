package Queue_Interface;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        // Priority Queue

        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(23);
        pq.add(11);
        pq.add(27);
        System.out.println(pq.poll()); // 11
        System.out.println(pq);

        // max heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a);
        pq2.add(12);
        pq2.add(23);
        pq2.add(11);
        pq2.add(27);
        System.out.println(pq2.poll()); // 27
    }
}
