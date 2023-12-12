class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target) {
                int s = 0;
                int e = matrix[0].length - 1;

                while (s <= e) {
                    int m = s + (e - s) / 2;
                    
                    if (matrix[mid][m] == target) {
                        return true;
                    } else if (matrix[mid][m] > target) {
                        e = m - 1;
                    } else {
                        s = m + 1;
                    }
                }
                return false;
            } else if (matrix[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
