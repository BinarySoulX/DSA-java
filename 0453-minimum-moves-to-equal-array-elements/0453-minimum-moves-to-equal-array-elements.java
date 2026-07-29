class Solution {                    //Pattern: Observation(Math)
    public int minMoves(int[] nums) {
        int moves=0;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            min=Math.min(num,min);
        }
        for(int num:nums){
            moves+=num-min;
        }return moves;



    }
}