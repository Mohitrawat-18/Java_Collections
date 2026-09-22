package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());

        // fun(animals);
    }

    // static void fun(List<Animal> animals){
    //     for(Animal animal:animals){
    //         animal.eat();
    //     }
    // }

    // Wildcards
    static void fun(List<?> values){
        for(Object obj:values){
            System.out.println(obj.getClass().getName());
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
    void bark(){
        System.out.println("Barking");
    }
}