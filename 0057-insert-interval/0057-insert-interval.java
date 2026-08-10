class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //aprroach: handling the curr interval pushing ,
        //new interval pushing and the merging inerval logic
        List<int[]> ans=new ArrayList<>();
        
        for(int curr[]:intervals){
        
            if(curr[1]<newInterval[0]){// Case 1: Current interval finishes completely before the new one starts
            ans.add(curr);
            }
            else if(newInterval[1]<curr[0]){// Case 2: New interval finishes completely before the current one starts
            ans.add(newInterval);
            newInterval=curr;
            }
            else{// Case 3: Overlap detected! Dynamically stretch boundaries
            newInterval[0]=Math.min(newInterval[0], curr[0]);
            newInterval[1] = Math.max(newInterval[1], curr[1]);
            }
        }
        ans.add(newInterval); //pushing the final interval
        return ans.toArray(new int[ans.size()][]);
    }
}