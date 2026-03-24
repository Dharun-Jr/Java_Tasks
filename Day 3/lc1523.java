class Solution {
    public int countOdds(int l, int h) {

        int d = h - l;

        if (l % 2 == 0 && h % 2 == 0) {
            return d / 2;
        }

        return d / 2 + 1;
    }
}
