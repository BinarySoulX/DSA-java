class Solution {//Pattern: DP
    private static boolean solve(String s, Set<String> set, Boolean[] dp) {
        if (s.length() == 0) return true;
        
        if (dp[s.length()] != null) return dp[s.length()];

        for (int i = 1; i <= s.length(); ++i) {
            if (set.contains(s.substring(0, i)) && solve(s.substring(i), set, dp)) {
                return dp[s.length()] = true;
            }
        }

        return dp[s.length()] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> guide = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length() + 1];
        return solve(s, guide, dp);
    }
}