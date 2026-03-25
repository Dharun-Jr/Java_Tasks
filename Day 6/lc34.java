class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            if(nums[start] == target){
                break;
            }
            start++;
        }
        while(start<=end){
            if(nums[end] == target){
                break;
            }
            end--;
        }
        if(start<=end){
            return new int[] {start, end};
        }else{
            return new int[] {-1, -1};
        }
    }
}
