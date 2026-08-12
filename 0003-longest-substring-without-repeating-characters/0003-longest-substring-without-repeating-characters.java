class Solution {
    public int lengthOfLongestSubstring(String s) {
//Pattern: HashSet + Sliding Window
        int count=0,left=0;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();++i){
            while (st.contains(s.charAt(i))) {
                st.remove(s.charAt(left));
                ++left;
            }
            st.add(s.charAt(i));
            count = Math.max(count, i - left + 1);
        }return count;
    }
}