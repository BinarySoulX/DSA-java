class Solution {
    public int maxArea(int[] height) {
        //Pattern: 2pointers
        int maxWater=0;
        int l1p=0, l2p=height.length-1;

        while(l1p<l2p){
            int ht=Math.min(height[l1p],height[l2p]), width=l2p-l1p;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);
            //move pointers
            if(height[l1p]<=height[l2p]){++l1p;}
            else{--l2p;}
        }return maxWater;
    }
}