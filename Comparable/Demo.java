package Comparable;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(70, "Ram"));
        list.add(new Student(60, "Shyam"));
        list.add(new Student(60, "Amit"));
        list.add(new Student(85, "Arun"));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.name + " , " + s.marks);
        }
    }
}

class Student implements Comparable<Student> {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        if (this.marks != other.marks) {
            return this.marks - other.marks;
        }
        return this.name.compareTo(other.name);
    }
}
