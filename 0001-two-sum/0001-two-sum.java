class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();//value, idx
        for(int idx=0;idx<nums.length;++idx){
            int complement=target-nums[idx];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),idx};
            }map.put(nums[idx],idx);
        }return new int[]{};
    }
}