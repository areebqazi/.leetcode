class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0;i<matrix.length;i++){
            int s= 0;
            int e= matrix[0].length-1;
            if(target>matrix[i][e]) continue;
            while(s<=e){
                int mid = (s+e)/2;
                if(matrix[i][mid]==target) return true;
                else if(matrix[i][mid]>target)  e=mid-1;
                else s=mid+1;
            }
        }
        return false;
    }
}