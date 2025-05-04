class Solution {
    public int hIndex(int[] citations) {
        int maxElement = Arrays.stream(citations).max().getAsInt();
        int arr[] = new int[maxElement+1];
        for(int i:citations)  arr[i]++;
        int count = 0 ;
        for(int i = arr.length-1; i>=0 ; i--){
            count+=arr[i];
            if(count>=i) return i;
        }
        return 0 ;
    }
}