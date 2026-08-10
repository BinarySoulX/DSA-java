class Solution {//TC & SC: O(1)
    public List<Integer> sequentialDigits(int low, int high) {
        //Pattern:  Number Generation (we would generate all of them)
        List<Integer> ans=new ArrayList<>();
        int minLen=String.valueOf(low).length();
        int maxLen=String.valueOf(high).length();

        for(int len=minLen;len <= maxLen;len++){ //try every possible valid length
            for(int start=1;start<=10-len;++start){ // try every possible starting digit
                     int num=0;
                     int digit=start;
                     // Build the number
                for (int i = 0; i < len; i++) {
                    num = num * 10 + digit;
                    digit++;
                }

                // Check if within range
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }return ans;
    }
}