class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int curr:nums){
            if(curr>=max1){
                max2=max1;
                max1=curr;
            }else if(max2<curr){
                max2=curr;
            }
        }
        return (max1-1)*(max2-1);
    }
}