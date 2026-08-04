class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         
         for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
            set.add(num);
        }
        for(int i=min;i<=max;++i){
            if(!set.contains(i)){
                list.add(i);
            }
        }return list;
    }
}