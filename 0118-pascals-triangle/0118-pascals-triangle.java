class Solution {
    public List<List<Integer>> generate(int numRows) {
        int row=1;
        List<List<Integer>> list=new ArrayList<>();
        while(row<=numRows){
            int val=1; List<Integer> rowData=new ArrayList<>();
            for(int blocks=1;blocks<=row;++blocks){
                rowData.add(val);
                val=(val*(row-blocks))/(blocks);
            }list.add(rowData);
            ++row;
        }return list;
    }
}