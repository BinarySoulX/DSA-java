class Solution {
    public int maxProduct(int n) {
        int len=String.valueOf(n).length();
        int product=1;
        if(len==2){
            while(n>0){
                int last=n%10;
                product*=last;
                n/=10;
            }return product;
        }
        else{
            int pos=0;
            int ans[]=new int[len];
            while(n>0){
                int last=n%10;
                ans[pos++]=last;
                n/=10;
            }
            int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
            for(int i=0;i<ans.length;++i){
                if(ans[i]>max1){
                    max2=max1;
                    max1=ans[i];
                }else if(max1>=ans[i] && max2<ans[i]){
                    max2=ans[i];
                }
            }return max1*max2;
        }
    }
}