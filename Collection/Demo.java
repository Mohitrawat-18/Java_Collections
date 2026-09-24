package Collection;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);

        // size()
        int n = c.size();
        System.out.println(n); // 3

        // isEmpty()
        System.out.println(c.isEmpty()); // false

        // contains(Object o) -> equals()
        System.out.println(c.contains(20)); // true

        // Object toArray()
        // Object[] obj = c.toArray();
        // for (Object o : obj) {
        // System.out.println(o);
        // }

        // Overloaded toArray gives any type <T> of array
        // Integer[] arr = c.toArray(new Integer[0]);
        // for (Integer i : arr) {
        // System.out.println(i);
        // }

        // remove(Object o)
        // c.remove(30);
        // System.out.println(c);

        // addAll()
        c.addAll(List.of(4, 5, 6, 7));
        System.out.println(c);

        // containsAll()
        System.out.println(c.containsAll(List.of(4, 6)));

        // removeAll()
        // c.removeAll(List.of(6, 7));
        // System.out.println(c);

        // retainAll()
        c.retainAll(List.of(10, 20));
        System.out.println(c);

        // clear()
        c.clear();
        System.out.println(c);
    }
}
