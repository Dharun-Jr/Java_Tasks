class Solution {
    public String maximumOddBinaryNumber(String s) {

        int c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') c++;
        }

        int z = s.length() - c;

        String ans = "";

        for (int i = 0; i < c - 1; i++) ans += "1";
        for (int i = 0; i < z; i++) ans += "0";

        ans += "1";

        return ans;
    }
}
