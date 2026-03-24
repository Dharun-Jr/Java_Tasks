class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        int ind = 0;

        while(ind<start.length() && ind<end.length()){
            if(start.charAt(ind) == end.charAt(ind)){
                ind++;
            }else{
                break;
            }
        }

        return end.substring(0, ind);

    }
}
