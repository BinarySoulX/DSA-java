class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastThisCitations = n - i;
            if (citations[i] >= papersWithAtLeastThisCitations) {
                return papersWithAtLeastThisCitations;
            }
        }
        
        return 0;
    }
}