class Solution {
    int loop;
    private int convert(char ch,String str,int idx){
        if(ch=='I'){
            if(str.length()!=idx+1 && str.charAt(idx+1)=='V'){ ++loop;return 4;}
            if(str.length()!=idx+1 && str.charAt(idx+1)=='X'){ ++loop;return 9;}
            return 1;
        }
        if(ch=='V'){return 5;}
        if(ch=='X'){
            if(str.length()!=idx+1 && str.charAt(idx+1)=='L'){ ++loop;return 40;}
            if(str.length()!=idx+1 && str.charAt(idx+1)=='C'){ ++loop;return 90;}
            return 10;
        }
        if(ch=='L'){return 50;}
        if(ch=='C'){
            if(str.length()!=idx+1 && str.charAt(idx+1)=='D'){ ++loop;return 400;}
            if(str.length()!=idx+1 && str.charAt(idx+1)=='M'){ ++loop;return 900;}
            return 100;
        }
        if(ch=='D'){return 500;}
        if(ch=='M'){return 1000;}
        return -1; 
    }
    public int romanToInt(String s) {
        loop=0;
        int ans=0;
        for(;loop<s.length();++loop){
            ans+=convert(s.charAt(loop),s,loop);
        }return ans;
    }
}