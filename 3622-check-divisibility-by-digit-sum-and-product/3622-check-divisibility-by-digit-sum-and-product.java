class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0,pro=1;
        while(temp>0){
            int last=temp%10;
            sum+=last;
            pro*=last;
            temp/=10;
        }
        return ( n%(sum+pro)==0 );
    }
}