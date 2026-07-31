class Solution {//Pattern: freq-array+Greedy
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq); //we r considering num
        int ans=0;
        int push=1;
        int count=0; //so we can incr. push as required
        for(int i=25;i>=0;--i){
            if(freq[i]==0){break;}

            ans+=freq[i]*push;
            ++count;
            if(count==8){
                ++push;
                count=0;
            }
        }return ans;



    }
}