package Set_Interface;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(23);
        set.add(45);
        set.add(12);
        set.add(37);

        // Sorted Set

        // System.out.println(set.first()); // 12
        // System.out.println(set.last()); // 45

        // System.out.println(set.headSet(37));
        // System.out.println(set.tailSet(37));

        // System.out.println(set.subSet(23, 45));

        // Navigable Set
        // System.out.println(set.lower(37)); // 23
        // System.out.println(set.higher(12)); // 23

        // System.out.println(set.floor(37)); // 37
        // System.out.println(set.ceiling(23)); // 23

        // System.out.println(set.pollFirst());
        // System.out.println(set.pollLast());
        // System.out.println(set.descendingSet());

        // Iterator<Integer> it = set.descendingIterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        System.out.println(set.headSet(37, true));
        System.out.println(set.tailSet(37, true));

        System.out.println(set.subSet(23, true, 45, true));
    }
}
