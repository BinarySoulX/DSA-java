class Solution { //Pattern: PQ
    class Pair implements Comparable<Pair>{
        int val;
        int dist;
        public Pair(int val,int dist){
            this.val=val;
            this.dist=dist;
        }@Override
        public int compareTo(Pair other){
            if(this.dist!=other.dist){return other.dist-this.dist;}
            return other.val-this.val;//when a & b are =
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int num:arr){
            int dist=Math.abs(num-x);
            pq.offer(new Pair(num,dist));

            if(pq.size()>k){ pq.poll();}
        }   
        List<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }    
        Collections.sort(list);
        return list;
    }
}