package Comparable;

import java.util.*;

public class Demo2 {
    // Sort by Comparator Interface
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram", 105, 75));
        list.add(new Student("Shyam", 104, 80));
        list.add(new Student("Amit", 103, 60));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByRollNo();
        Comparator<Student> c3 = new SortByMarks();

        Collections.sort(list,c1);
    }
}

class Student{
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class SortByName implements  Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollNo implements  Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
        return s1.rollNo - s2.rollNo;
    }
}

class SortByMarks implements  Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
        return s1.marks - s2.marks;
    }
}