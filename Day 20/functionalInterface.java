import java.util.*;

public class FunctionalInterface{
    public static void main(String[] args) {
        
        Predicate<Integer> isEven=n->n%2==0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));
        Consumer<String> val=name -> System.out.println(name);
        val.accept("Edlyn");
        Supplier<Double> val=()->Math.random();
        System.out.println(val.get());
        
    }
}
