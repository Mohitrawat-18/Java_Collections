package Iterable;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = { "Ram", "Shyam", "Arun", "Amit" };
        NameContainer container = new NameContainer(names);

        Iterator<String> itr = container.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Enhanced for loop
        // ForEach loop
        for (String name : container) {
            System.out.println(name);
        }
    }
}

// Custom Collection
class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < size;
            }

            @Override
            public String next() {
                return names[position++];
            }
        };
    }
}
