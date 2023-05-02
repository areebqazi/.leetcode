class Solution {
    public int firstCompleteIndex(int[] arr, int[][] matrix) {
        HashMap<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            int temp[]=new int[2];
                temp[0]=i;
                temp[1]=j;
                map.put(matrix[i][j],temp);
            }
        }
        int row[]=new int[matrix.length];
        int col[]=new int[matrix[0].length];
        for(int i=0;i<arr.length;i++){
            int a[] = map.get(arr[i]);
            row[a[0]]++;
            col[a[1]]++;
            if(row[a[0]]==matrix[0].length || col[a[1]]==matrix.length)
                return i;
        }
        return -1;
    }
}