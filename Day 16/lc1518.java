class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while(empty != 0){
            if(empty - numExchange >=0){
                total++;
                empty++;
            }else{
                break;
            }
            empty -= numExchange;
        }
        return total;
        
        
    }
}
