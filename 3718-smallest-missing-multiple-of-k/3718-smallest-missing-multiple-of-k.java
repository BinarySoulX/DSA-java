class Solution {
    public int missingMultiple(int[] nums, int k) {
     Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Start checking multiples of k: k, 2k, 3k...
        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }
        
        return multiple;   
    }
}