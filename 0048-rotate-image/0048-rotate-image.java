class Solution {
    private static void swap(int[][] matrix,int row1,int col1,int row2,int col2){
        int temp=matrix[row1][col1];
        matrix[row1][col1]=matrix[row2][col2];
        matrix[row2][col2]=temp;
    }
    private static void swap(int matrix[],int n){
        int start=0,end=n-1;
        while(start<end){
            int temp=matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            ++start;--end;
        }
    }

    public void rotate(int[][] matrix) {
        //Step 1: Transpose of matrix (by swapping upper & lower traingular ele)
        //Step 2: reverse the row
        int n=matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
        for(int row[]:matrix){
            swap(row,n);
        }
    }
}