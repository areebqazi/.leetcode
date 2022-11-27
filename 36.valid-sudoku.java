import java.util.HashSet;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> Rset = new HashSet<>(); 
        HashSet<Character> Cset = new HashSet<>(); 
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.') continue;
                else 
                    if(!Rset.add(board[i][j])) return false;
                }
            Rset = new HashSet<>();
            }
        for(int j=0;j<board.length;j++){
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.')continue;
                    else{
                    if(!Cset.add(board[i][j])) return false;
                    }
            }
            Cset = new HashSet<>();
        }        
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!check3(i,j,board)) return false;
            }
        }
        return true;
        }
    public boolean check3(int i,int j,char[][] board){
        HashSet<Character> set3 = new HashSet<>();
        for(int m=i;m<3+i;m++){
            for(int n=j;n<3+j;n++){
                if(board[m][n]=='.') continue;
                else {
                    if(!set3.add(board[m][n])) return false;
                }
            }
        }
        return true;
    }
    }
// @lc code=end

