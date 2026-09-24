package List_Interface;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        // List Interface

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // get()
        // System.out.println(list.get(2));

        // set()
        list.set(2, 40);
        // System.out.println(list);

        // add()
        list.add(2, 30);
        System.out.println(list);

        // addAll() + of()
        // list.addAll(4, List.of(50, 60, 30));
        // System.out.println(list);

        // remove()
        // list.remove(5);
        // System.out.println(list);

        // indexOf()
        System.out.println(list.indexOf(30)); // 2

        // lastIndexOf()
        System.out.println(list.lastIndexOf(30)); // 5

        // listIterator()
        // Iterator<Integer> itr = list.listIterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        ListIterator<Integer> itr = list.listIterator(4);
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // copyOf()
        List<Integer> list2 = List.copyOf(list);
        System.out.println(list2);
    }
}