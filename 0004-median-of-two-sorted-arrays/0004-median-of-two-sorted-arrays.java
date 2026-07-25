class Solution {
    private static double compute(int ans[]){
        int n=ans.length;
        boolean check=(n%2==0)?true:false;
        if(!check){
            return (double)ans[n/2];
        }else{
            int mid1=ans[n/2];
            int mid2=ans[(n/2)-1];
            return (double) (mid1+mid2)/2;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int ans[]=new int[m+n];
        int p1=0,p2=0;
        int idx=0;
        while(p1<m && p2<n){
            if(nums1[p1]<=nums2[p2]){
                ans[idx++]=nums1[p1];
                ++p1;
            }else{
                ans[idx++]=nums2[p2];
                ++p2;
            }
        }
        while(p1!=m){ //if left in nums1
            ans[idx++]=nums1[p1];++p1;
        }
        while(p2!=n){  //if left in nums2
            ans[idx++]=nums2[p2];++p2;
        }
        if(ans.length==1){return (double)ans[0];}
        return compute(ans);
    }
}