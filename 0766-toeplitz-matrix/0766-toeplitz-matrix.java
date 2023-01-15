class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            if(!check(0,i,matrix))
                return false;
        }
        for(int i=1;i<matrix.length;i++){
            if(!check(i,0,matrix))
                return false;
        }
        return true;
    }
    boolean check(int x,int y,int matrix[][]){
        int no=matrix[x][y];
        while(x<matrix.length && y<matrix[0].length){
                if(matrix[x][y]!=no)
                    return false;
                x++;
                y++;
            } 
        return true;
    }
}