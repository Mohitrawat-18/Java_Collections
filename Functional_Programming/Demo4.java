package Functional_Programming;

import java.util.function.*;

public class Demo4 {
    public static void main(String[] args) {

        // Functional Composition

        // (x+2) * 3 -> x+2, x=3
        // Function<Integer, Integer> equation = x -> ((x + 2) * 3);
        // System.out.println(equation.apply(2));

        Function<Integer, Integer> addTwo = x -> x + 2; // f(x)
        Function<Integer, Integer> multiplyThree = x -> x * 3; // g(x)
        // int a = addTwo.apply(3);
        // int b = multiplyThree.apply(a);

        // int ans = multiplyThree.apply(addTwo.apply(3)); //g(f(x))

        // andThen()
        int ans = addTwo.andThen(multiplyThree).apply(2);

        // compose() -> opposite of andThen()
        int ans2 = addTwo.compose(multiplyThree).apply(2);

        // System.out.println(ans);
        // System.out.println(ans2);

        Predicate<Integer> isGreater = x -> x > 10;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // and() -> &&
        // System.out.println(isGreater.and(isEven).test(15));

        // or() --> ||
        // System.out.println(isGreater.or(isEven).test(15));

        // negate() -> !
        // Predicate<Integer> isOdd = isEven.negate();
        // System.out.println(isOdd.test(24));

        Consumer<String> printName = System.out::println;
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        Consumer<String> pipeline = printName.andThen(printUpperCase);
        pipeline.accept("Ramcharan");
    }
}
