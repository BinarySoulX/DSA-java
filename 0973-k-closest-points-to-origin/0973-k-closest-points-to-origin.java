class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Creates a Max-Heap based on the squared distance: (b_distance - a_distance)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );

        // Stream through all points
        for (int[] point : points){
            maxHeap.add(point);
            // If we have more than k elements, remove the one farthest away
            if (maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }
        // Gather the k closest points from the heap into the final answer array
        int[][] ans = new int[k][]; //######
        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }
        return ans;
    }
}//TC: O(n log k ) , SC=O(k)
//The Cheat Sheet RulesIf the problem asks for the $K$ Smallest / Closest elements $\rightarrow$ Use a Max-Heap (kick out the largest values when size > $k$).If the problem asks for the $K$ Largest / Most Frequent elements $\rightarrow$ Use a Min-Heap (kick out the smallest values when size > $k$).