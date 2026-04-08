import java.util.*;
public class HashMapImplementation{
    public static void main(String[] args) {
        Map<String,Integer> m= new HashMap<>();
        m.get("hello");
        System.out.println(m.get("hi")); // no erorr
        System.out.println(m.getOrDefault(m, null));

    }
}
