class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0)
                 max=Math.max(max,find(grid,i,j));
            }
        }
        return max;
    }
    public int find(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) 
            return 0;
        int val = grid[i][j];
        grid[i][j]=0;
        return val+ find(grid, i-1, j)+ find(grid, i+1, j)+ find(grid, i, j-1)+ find(grid, i, j+1);
    }
}