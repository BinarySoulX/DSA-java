class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;++i){
            sum+=(nums.length%(i+1)==0)?nums[i]*nums[i]:0;
        }return sum;
    }
}