class Solution {
    public int minCostToMoveChips(int[] p) {

        int e = 0, o = 0;

        for (int x : p) {
            if (x % 2 == 0) e++;
            else o++;
        }

        return Math.min(e, o);
    }
}
