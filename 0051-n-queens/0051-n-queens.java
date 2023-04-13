class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        List<List<String>>ans=new ArrayList<>();
        int leftrow[]=new int[n];
        int upperDiagonal[]=new int[2*n-1];
        int lowerDiagonal[]=new int[2*n-1];
        solve(0,ans,board,leftrow,upperDiagonal,lowerDiagonal);
        return ans;

    }
    public void solve(int col,List<List<String>>ans,char[][]board,int leftrow[],int upperDiagonal[],int lowerDiagonal[]){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && upperDiagonal[board.length-1+col-row]==0 && lowerDiagonal[row+col]==0){
                //put the queen
                board[row][col]='Q';
                leftrow[row]=1;
                upperDiagonal[board.length-1+col-row]=1;
                lowerDiagonal[row+col]=1;

                //call the recursion 
                solve(col+1,ans,board,leftrow,upperDiagonal,lowerDiagonal);

                //backtracking part
                board[row][col]='.';
                leftrow[row]=0;
                upperDiagonal[board.length-1+col-row]=0;
                lowerDiagonal[row+col]=0;
            }
        }
    }
    public List<String> construct(char [][] board){
        List<String>cur=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str=new String(board[i]);
            cur.add(str);
        }
        return cur;
}
}