package Map_Interface;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Amit");
        map.put(102, "Arun");
        map.put(103, "Raman");

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // System.out.println(map.containsKey(102));
        // System.out.println(map.containsValue("Ram"));

        // System.out.println(map.get(102));

        // New key adds -> returns null
        // duplicate key adds -> returns Raman
        // System.out.println(map.put(104, "Shyam"));

        // map.remove(103);

        // Map<Integer, String> map2 = new HashMap<>();
        // map2.put(105, "Aditya");
        // map.putAll(map2);
        // System.out.println(map);

        // map.clear();

        // Set<Integer> set = map.keySet();
        // System.out.println(set);

        // Collection<String> c = map.values();
        // System.out.println(c);// [Amit, Arun, Raman]

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // System.out.println(entries);

        // System.out.println(map.getOrDefault(104, "UNKNOWN"));
        // map.putIfAbsent(103, "Shyam");

        // remove(key) -> removes if any key matches
        // remove(key,value) -> removes it both key and value matches
        // map.remove(101, "Aditya");

        // map.replace(102, "Sohan");
        // map.replace(102, "Arun","Ajay");

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // for (Map.Entry<Integer, String> entry : entries) {
        // Integer key = entry.getKey();
        // String value = entry.getValue();

        // System.out.println(key + " , " + value);
        // }

        Map<Integer, String> map2 = Map.of(101, "Shyam", 102, "Ram");
        System.out.println(map2);
    }
}

// put() -> always replaces
// putIfAbsent -> does not replace existing value