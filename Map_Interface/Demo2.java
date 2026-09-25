package Map_Interface;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Ram");
        map.put(102, "Shyam");
        map.put(103, "Aman");
        map.put(104, "Amit");

        // System.out.println(map.firstKey()); // 101
        // System.out.println(map.lastKey());

        // System.out.println(map.firstEntry());
        // System.out.println(map.lastKey());

        // System.out.println(map.headMap(103));
        // System.out.println(map.tailMap(102));

        // System.out.println(map.subMap(101, 103));

        // System.out.println(map.higherKey(102));

    }
}
