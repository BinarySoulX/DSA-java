class Solution { //Pattern: Cycle Decomposition of Permutaion
    private static int addUp(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }return sum;
    }

    public int minSwaps(int[] nums) {
        int info[][]=new int[nums.length][3];

        for(int idx=0;idx<nums.length;++idx){   //{digitSum,ele,idx}
            info[idx][0]=addUp(nums[idx]);
            info[idx][1]=nums[idx];
            info[idx][2]=idx;
        }
        Arrays.sort(info, (x,y)->x[0]!=y[0] ? Integer.compare(x[0],y[0]): Integer.compare(x[1],y[1]) );
        //So a permutation -->will generate cycle (n-c=min no. of swaps)
        boolean vis[]=new boolean[nums.length];
        int cycles=0;
        for(int idx=0;idx<nums.length;++idx){
            if(vis[idx]){continue;}
            ++cycles;
            int path=idx;
            while(!vis[path]){
                vis[path]=true;
                path=info[path][2];
            }
        }return nums.length-cycles;
    }
}