class Solution {
    public int[] shuffle(int[] a, int n) {

        int[] r = new int[2 * n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            r[j++] = a[i];
            r[j++] = a[i + n];
        }

        return r;
    }
}
