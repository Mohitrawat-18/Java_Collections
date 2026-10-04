package Optional_Class;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Optional<String> name = getName();

        System.out.println(name.get());  // get()

        // isPresent()
        if(name.isPresent()){
            System.out.println(name.get());
        }

        // ifPresent()
        name.ifPresent(System.out::println);

        // orElse()
        name.orElse("UNKNOWN");

        // orElseGet()
        name.orElseGet(() -> "UNKNOWN");

        // orElseThrow()
        System.out.println(name.orElseThrow());

        // ifPresentOrElse()
        name.ifPresentOrElse(System.out::println, () -> System.out.println("UNKNOWN"));
    }

    public static Optional<String> getName(){
        // return Optional.empty(); // Optional.empty()
        return Optional.of("Raman"); 
        // return Optional.ofNullable();
    }
}
