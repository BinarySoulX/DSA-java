class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int idx1=1;
        int idx2=1;
        int last1=arr1[0];
        int last2=arr2[0];

    
        for(int i=2;i<n;++i){
            if(last1>last2){
                arr1[idx1++]=nums[i];last1=nums[i];
            }else{arr2[idx2++]=nums[i];last2=nums[i];}
        }
        idx1=0;
        while(idx1!=n){
            if(arr1[idx1]==0){break;}
            result[idx1]=arr1[idx1];
            ++idx1;
        }
        idx2=0;
        while(idx2!=n){
            if(arr2[idx2]==0){break;}
            result[idx1]=arr2[idx2];
            ++idx2;++idx1;
        }return result;
    }
}