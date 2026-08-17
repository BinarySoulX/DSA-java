class Solution { //Pattern: 2pointer
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;
        while (i >= 0 || j >= 0) {
            
            while (i >= 0) {     // Find next valid character in s
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                }
                else if (skipS > 0) {
                    skipS--;
                    i--;
                }
                else {break;}
            }
            while (j >= 0) {// Find next valid character in t
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                }
                else if (skipT > 0) {
                    skipT--;
                    j--;
                }
                else {break;}                    
            }

            
            if (i < 0 || j < 0) {// One string has a character, the other doesn't
                return i == j;
            }

            // Valid characters are diff
            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            --i;--j;
        }return true;
    }
}