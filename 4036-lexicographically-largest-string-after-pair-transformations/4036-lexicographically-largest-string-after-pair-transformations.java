class Solution {
    public String[] largestString(int[] nums) {
        String ans[]=new String[nums.length];
        
        for(int i=0;i<nums.length;++i){
            int curr=nums[i];
            StringBuilder sb=new StringBuilder();
            int power=0;
            int z=curr/(1<<25);//mapping z
            curr=curr%(1<<25);//no. of char without z
            while(curr>0){
                if((curr&1)==1){
                    sb.append((char)('a'+power));
                }
                curr>>=1;
                ++power;
            }
            while(z-->0){
                sb.append('z');
            }
            ans[i]=sb.reverse().toString();
        }return ans;
    }
}