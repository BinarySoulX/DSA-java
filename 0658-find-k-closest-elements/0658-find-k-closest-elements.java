class Solution { //Pattern: PQ/Sliding window(Pre-Sorted)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int possibleWindow_f=0;
        int possibleWindow_l=arr.length-k;

        while(possibleWindow_f < possibleWindow_l){
            int mid=possibleWindow_f +(possibleWindow_l-possibleWindow_f)/2;

            if(x - arr[mid] > arr[mid + k] - x){
                possibleWindow_f=mid+1;
            }else{
                possibleWindow_l=mid;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=possibleWindow_f;i<possibleWindow_f+k;++i){
            list.add(arr[i]);
        }return list;
    }
}