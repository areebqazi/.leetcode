class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int count =0;
        int arr[]=new int[n];
        int result[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ind=queries[i][0];
            int col=queries[i][1];
            
            if(ind-1>=0 && arr[ind-1]==arr[ind] && arr[ind]!=0)
                count--;
            if(ind+1<arr.length && arr[ind+1]==arr[ind] && arr[ind]!=0)
                count--;
            
            
            result[i]=count;
            arr[ind]=col;
            
            
            if(ind-1>=0 && arr[ind-1]==arr[ind]  && arr[ind]!=0) 
                count++;
            if(ind+1<arr.length && arr[ind+1]==arr[ind] && arr[ind]!=0)
                count++;
            
            result[i]=count;
    }
        return result;
}
}