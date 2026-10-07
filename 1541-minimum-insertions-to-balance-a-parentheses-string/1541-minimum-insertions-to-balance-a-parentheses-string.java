class Solution { //Pattern: Stack (Just remove the Stack Logic)
    public int minInsertions(String s) {
        int open = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } 
            else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } 
                else {
                    count++; 
                }

                if (open > 0) {
                    open--;
                } 
                else {
                    count++; 
                }
            }
        }
        count += 2 * open;
        return count;
    }
}