class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int rowLength=matrix.length;
      int colLength=matrix[0].length;
      int low=0;
      int  high= rowLength*colLength-1;

        while(low<=high){

            int guess= low+(high-low)/2;

            int row =guess/colLength;
            int col= guess%colLength;

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
              low=guess+1;
            }else{
                high=guess-1;
            }
        }
        return false;
    }
}