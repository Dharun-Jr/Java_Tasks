class Solution {
    public String categorizeBox(int l, int w, int h, int m) {

        boolean b = false;
        boolean hv = false;

        long v = 1L * l * w * h;

        if (l >= 10000 || w >= 10000 || h >= 10000 || v >= 1000000000) {
            b = true;
        }

        if (m >= 100) {
            hv = true;
        }

        if (b && hv) return "Both";
        if (b) return "Bulky";
        if (hv) return "Heavy";

        return "Neither";
    }
}
