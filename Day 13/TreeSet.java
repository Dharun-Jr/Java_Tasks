package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);

        System.out.println(set);

        set.remove(20);
        System.out.println(set);

        System.out.println(set.contains(30));
        System.out.println(set.contains(100));

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        TreeSet<Integer> treeSet = new TreeSet<>(set);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        System.out.println(treeSet.higher(30));
        System.out.println(treeSet.lower(30));

        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.floor(25));

        System.out.println(treeSet.descendingSet());

        treeSet.pollFirst();
        treeSet.pollLast();
        System.out.println(treeSet);
    }
}
