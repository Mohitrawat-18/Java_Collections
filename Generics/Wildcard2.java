package Generics;

import java.util.*;

// Wildcards with upper bound (extends)
public class Wildcard2 {
    public static void main(String[] args) {
        // List<Dog> dogs = new ArrayList<>();
        // dogs.add(new Dog());
        // dogs.add(new Dog());

        // fun(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
    }

    static void fun(List<? extends Animal> values){
        for(Animal a : values){
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
