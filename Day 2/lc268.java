class Solution {
    public int missingNumber(int[] a) {

        int n = a.length;

        int exp = n * (n + 1) / 2;
        int sum = 0;

        for (int x : a) sum += x;

        return exp - sum;
    }
}
