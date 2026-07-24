class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> pair = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        int n = nums.length;

        // 2 nested loops: store all pair XORs
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pair.add(nums[i] ^ nums[j]);
            }
        }
        // Iterate over pair XORs and each element
        for (int x : pair) {
            for (int num : nums) {
                ans.add(x ^ num);
            }
        }

        return ans.size();
    }
}