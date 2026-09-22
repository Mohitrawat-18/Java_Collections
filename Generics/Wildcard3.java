package Generics;
import java.util.*;

// Generics with lower bounds
public class Wildcard3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
    }

    public static void fun(List<? super Animal> values){
        // writing
        values.add(new Animal());

        // reading
        for(Object obj : values){
            Animal a = (Animal) obj;
            a.eat();
        }
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal{
    @Override 
    void eat(){
        System.out.println("Dog Eating");
    }
    void bark(){
        System.out.println("Barking");
    }
}
