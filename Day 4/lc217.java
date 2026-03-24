import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] a) {

        HashSet<Integer> s = new HashSet<>();

        for (int x : a) {

            if (s.contains(x)) return true;

            s.add(x);
        }

        return false;
    }
}
