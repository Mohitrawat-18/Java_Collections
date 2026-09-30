package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ram", 105, 75));
        list.add(new Student("Shyam", 104, 80));
        list.add(new Student("Amit", 103, 60));

        Collections.sort(list,(s1,s2) -> s1.marks - s2.marks);

        for(Student s:list){
            System.out.println(s.name+" , "+s.rollNo+" , "+s.marks);
        }
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
