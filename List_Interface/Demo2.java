package List_Interface;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {

        // ArrayList class

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // ensureCapacity()
        list.ensureCapacity(100);

        // trimTosize()
        list.trimToSize();
    }
}
