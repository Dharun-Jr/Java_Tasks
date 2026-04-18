import java.util.*;

public class SortingLambda {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Banana");
        words.add("Watermelon");
        words.add("Grapes");
        words.add("Apple");
        Collections.sort(words,(a,b)->a.compareTo(b)); // ascending order
        System.out.println("Ascending order: "+words);
        Collections.sort(words,(a,b)->b.compareTo(a)); // descending order
        System.out.println("Descending order: "+words);

        words.sort(String::compareTo); // sorted alphabetically

        // reverse order using method reference
        words.sort(Comparator.reverseOrder());
        System.out.println("Reverse order using method reference: "+words);
    }
}
