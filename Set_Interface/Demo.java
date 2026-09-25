package Set_Interface;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Raman");
        set.add("Amit");
        set.add("Arun");

        System.out.println(set);
        System.out.println(set.contains("Arun"));

    }

}
