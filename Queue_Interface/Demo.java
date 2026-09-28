package Queue_Interface;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // single ended queue

        // enqueue -> adding elements
        q.add(1); // exception
        q.offer(2);
        q.offer(3);

        // front access
        System.out.println(q.peek()); // 1
        System.out.println(q.element());

        // remove element
        q.remove();
        q.poll();
    }
}
