class Solution {
    class Info implements Comparable<Info>{
        int soldiers;
        int row;
        public Info(int soldiers,int row){
            this.soldiers=soldiers;
            this.row=row;
        }
        @Override
        public int compareTo(Info i2){
            if(this.soldiers==i2.soldiers){return this.row-i2.row;}
            return this.soldiers-i2.soldiers;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]=new int[k];
        PriorityQueue<Info> pq=new PriorityQueue<>();

        for(int i=0;i<mat.length;++i){
            int count=0;
            for(int j=0;j<mat[0].length;++j){
                if(mat[i][j]==1){++count;}
            }pq.add(new Info(count,i));
        }

        for(int i=0;i<k;++i){
            ans[i]=pq.remove().row;
        }
        return ans;
    }
}