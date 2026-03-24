class Solution {
    public int arraySign(int[] a) {

        int neg = 0;

        for (int x : a) {

            if (x == 0) return 0;

            if (x < 0) neg++;
        }

        if (neg % 2 == 0) return 1;

        return -1;
    }
}
