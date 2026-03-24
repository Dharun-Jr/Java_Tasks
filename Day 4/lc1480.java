class Solution {
    public int[] runningSum(int[] a) {

        int[] r = new int[a.length];

        r[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            r[i] = r[i - 1] + a[i];
        }

        return r;
    }
}
