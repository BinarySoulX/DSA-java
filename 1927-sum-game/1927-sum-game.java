class Solution { //Pattern: Math
    public boolean sumGame(String num) {
        int len=num.length();
        int sum1=0,countQ1=0;
        int sum2=0,countQ2=0;
        for(int i=0;i<len/2;++i){
            char ch=num.charAt(i);
            if(ch=='?'){++countQ1;}
            else{sum1+=ch-'0';}
        }
        for(int i=len/2;i<len;++i){
            char ch=num.charAt(i);
            if(ch=='?'){++countQ2;}
            else{sum2+=ch-'0';}
        }
        //CASES
        if((countQ1+countQ2)%2!=0){return true;}
        else{
            int diff=sum1-sum2;
            int target=((countQ2-countQ1)/2)*9;
            return !(diff==target);
        }
    }
}