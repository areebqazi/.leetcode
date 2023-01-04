class Solution {
    public int smallestRangeI(int[] A, int k) {
        Arrays.sort(A);
        if(A[0]+k >= A[A.length-1]-k)
            return 0;
        return A[A.length-1]-k-(A[0]+k);
        
    }
}