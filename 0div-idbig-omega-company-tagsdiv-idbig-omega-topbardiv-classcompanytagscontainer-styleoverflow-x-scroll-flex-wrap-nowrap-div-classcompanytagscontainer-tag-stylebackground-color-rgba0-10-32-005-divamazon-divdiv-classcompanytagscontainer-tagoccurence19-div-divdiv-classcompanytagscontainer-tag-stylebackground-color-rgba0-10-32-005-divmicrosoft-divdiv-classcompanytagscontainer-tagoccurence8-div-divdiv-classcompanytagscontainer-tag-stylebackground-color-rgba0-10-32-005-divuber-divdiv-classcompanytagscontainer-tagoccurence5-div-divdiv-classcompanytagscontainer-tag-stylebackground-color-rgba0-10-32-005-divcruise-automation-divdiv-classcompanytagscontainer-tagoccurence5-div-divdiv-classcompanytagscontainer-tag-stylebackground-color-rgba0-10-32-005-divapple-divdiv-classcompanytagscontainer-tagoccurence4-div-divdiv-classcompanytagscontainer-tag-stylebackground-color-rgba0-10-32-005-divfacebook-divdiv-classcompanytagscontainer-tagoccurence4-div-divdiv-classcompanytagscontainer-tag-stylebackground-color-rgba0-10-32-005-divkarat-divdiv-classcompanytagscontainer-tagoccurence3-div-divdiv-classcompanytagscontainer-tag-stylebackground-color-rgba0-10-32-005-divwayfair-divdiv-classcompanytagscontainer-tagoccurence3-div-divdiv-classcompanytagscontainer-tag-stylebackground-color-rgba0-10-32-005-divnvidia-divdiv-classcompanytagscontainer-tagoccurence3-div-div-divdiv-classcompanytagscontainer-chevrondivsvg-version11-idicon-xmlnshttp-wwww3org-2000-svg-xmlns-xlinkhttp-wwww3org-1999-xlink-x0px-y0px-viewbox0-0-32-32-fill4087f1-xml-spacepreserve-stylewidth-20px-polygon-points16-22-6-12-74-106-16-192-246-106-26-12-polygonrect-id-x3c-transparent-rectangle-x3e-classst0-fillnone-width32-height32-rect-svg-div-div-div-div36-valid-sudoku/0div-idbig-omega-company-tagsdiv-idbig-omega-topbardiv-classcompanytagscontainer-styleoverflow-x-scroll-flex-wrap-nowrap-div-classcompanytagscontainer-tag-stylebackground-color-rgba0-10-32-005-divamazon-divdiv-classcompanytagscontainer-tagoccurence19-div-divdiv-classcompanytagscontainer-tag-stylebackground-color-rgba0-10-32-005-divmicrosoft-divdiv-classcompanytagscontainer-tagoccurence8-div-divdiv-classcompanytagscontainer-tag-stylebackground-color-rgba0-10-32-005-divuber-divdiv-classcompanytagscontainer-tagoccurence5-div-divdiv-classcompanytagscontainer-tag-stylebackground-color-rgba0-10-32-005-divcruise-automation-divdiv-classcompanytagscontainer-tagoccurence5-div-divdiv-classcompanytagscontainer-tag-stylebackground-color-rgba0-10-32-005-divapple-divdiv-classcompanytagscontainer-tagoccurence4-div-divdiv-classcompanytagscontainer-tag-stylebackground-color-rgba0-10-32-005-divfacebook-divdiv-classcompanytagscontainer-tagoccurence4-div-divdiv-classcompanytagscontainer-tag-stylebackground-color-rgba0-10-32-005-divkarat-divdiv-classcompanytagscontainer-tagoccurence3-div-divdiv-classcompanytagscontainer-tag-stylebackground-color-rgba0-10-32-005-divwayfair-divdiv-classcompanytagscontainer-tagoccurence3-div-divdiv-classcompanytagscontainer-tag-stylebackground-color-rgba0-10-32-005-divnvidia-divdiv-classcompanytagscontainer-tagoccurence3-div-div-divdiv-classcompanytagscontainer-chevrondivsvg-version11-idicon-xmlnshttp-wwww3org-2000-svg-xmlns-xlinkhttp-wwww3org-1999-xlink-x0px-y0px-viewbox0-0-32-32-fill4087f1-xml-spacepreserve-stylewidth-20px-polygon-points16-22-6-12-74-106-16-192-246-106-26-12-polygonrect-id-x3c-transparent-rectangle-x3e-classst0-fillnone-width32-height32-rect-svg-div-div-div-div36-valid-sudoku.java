class Solution {
    public boolean isValidSudoku(char[][] board) {
     
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!rowCol(i,j,board)) return false;
            }
        }
        for(int i =0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!box(i,j,board)) return false;
            }
        }
        return true;
    }
    public boolean rowCol(int i ,int j,char board[][]){
        HashSet<Character>row=new HashSet<>();
        HashSet<Character>col=new HashSet<>();
        for(int k=0;k<9;k++){
            if((board[i][k]!='.' && !row.add(board[i][k])) ) return false;
        }
        for(int k=0;k<9;k++){
            if((board[k][j]!='.' && !col.add(board[k][j])) ) return false;
        }
        
        return true;
    }
    public boolean box(int i ,int j,char board[][]){
        HashSet<Character>set=new HashSet<>();
        for(int k=i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                if(board[k][l]!='.' && !set.add(board[k][l])) return false;
            }
        }
        return true;
    }
}