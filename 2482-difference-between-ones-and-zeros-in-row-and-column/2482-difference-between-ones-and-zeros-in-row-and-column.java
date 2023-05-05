class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row0[] = new int[grid.length];
        int col0[] = new int[grid[0].length];
        int row1[] = new int[grid.length];
        int col1[] = new int[grid[0].length];
        for(int i=0;i<row0.length;i++){
            int a[]=row(grid,i,row0.length);
            row0[i]=a[0];
            row1[i]=a[1];
        }
        for(int i=0;i<col0.length;i++){
            int b[]=col(grid,i,col0.length);
            col0[i]=b[0];
            col1[i]=b[1];
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=row1[i]+col1[j]-row0[i]-col0[j];
            }
        }
        return grid;
    }
    public int[] row(int grid[][],int r,int length){
        int row[]=new int[2];
        for(int i=0;i<grid[0].length;i++){
            if(grid[r][i]==0)
                row[0]++;
            if(grid[r][i]==1)
                row[1]++;
        }
        return row;
    }
    public int[] col(int grid[][],int c,int length){
        int col[]=new int[2];
        for(int i=0;i<grid.length;i++){
            if(grid[i][c]==0)
                col[0]++;
            if(grid[i][c]==1)
                col[1]++;
        }
        return col;
    }
}