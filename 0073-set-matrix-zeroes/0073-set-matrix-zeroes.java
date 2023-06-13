class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row[]=new boolean[matrix.length];
        boolean col[]=new boolean[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]){
            for(int column=0;column<matrix[0].length;column++){
                matrix[i][column]=0;
            }
            }
        }
        for(int i=0;i<col.length;i++){
            if(col[i]){
            for(int roww=0;roww<matrix.length;roww++){
                matrix[roww][i]=0;
            }
            }
        }

    }
}