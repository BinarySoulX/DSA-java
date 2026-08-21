class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int calc=numbers[start]+numbers[end];

            if(calc==target){
                return new int[]{start+1,end+1};
            }

            if(target<calc){
                --end;
            }else if(target>calc){
                ++start;
            }
        }return new int[]{};
    }
}