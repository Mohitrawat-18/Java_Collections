package Iterable;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int value = itr.next();
            if (value == 30) {
                list.remove(value);
            }

            System.out.println(value);
        }
    }
}

// Concurrent Modification Exception -> Fail fast