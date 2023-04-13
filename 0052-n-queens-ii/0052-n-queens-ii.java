class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        queen(0, n, board);
        return count;
    }
    
    public void queen(int col, int n, char[][] board) {
        if (col == n) {
            count++;
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                queen(col + 1, n, board);
                board[row][col] = '.';
            }
        }
    }
    
    public boolean isSafe(int row, int col, int n, char[][] board) {
        int i, j;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (j = col; j >= 0; j--) {
            if (board[row][j] == 'Q')
                return false;
        }
        return true;
    }
}
