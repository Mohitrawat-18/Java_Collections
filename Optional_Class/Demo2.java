package Optional_Class;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Optional<User> user = getUser();

        user.map(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out::println);

        Optional<String> name = Optional.of("Raman");
        Optional<String> result = name.filter(x -> x.length() > 10);
        System.out.println(result.orElse("Empty"));
    }

    private static Optional<User> getUser(){
        Address a  = new Address();
        a.city = "Mumbai";

        User u = new User();
        u.address = a;

        return Optional.of(u);
    }
}

class User{
    public Address address;
}

class Address{
    public String city;
}

// map() -> Function (T -> R)
// flatMap()
// filter()