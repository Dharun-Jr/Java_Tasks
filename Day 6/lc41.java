class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, 1);
        }
        for(int ctr=1; ctr<=100001; ctr++){
            if(!map.containsKey(ctr)){
                return ctr;
            }
        }

        return -1;
    }
}
