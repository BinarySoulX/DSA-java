class Solution { //Pattern: optimal Bucket Sort approach_
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int buckets[]=new int[100001];
        long k=(long)k1+k2;
        long sum=0;
        int max=0;

        for(int i=0;i<nums1.length;++i){
            int diff=Math.abs(nums1[i] - nums2[i]);
            buckets[diff]++;
            sum+=diff; //for check edge case
            max=Math.max(max,diff);
        }
        if(sum<=k){return 0;} //edge case

        for(int i=max; i>0 && k>0;--i){
            if(buckets[i]>0){
                long move=Math.min(k, (long)buckets[i]);
                buckets[i]-=move;
                buckets[i-1]+=move;
                k-=move;
            }
        }
        long ans=0;
        for(int i=1;i<buckets.length;++i){
            ans+=(long)i*i*buckets[i];
        }return ans;
    }
}