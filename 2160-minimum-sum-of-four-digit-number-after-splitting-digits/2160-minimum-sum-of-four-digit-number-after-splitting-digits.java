class Solution {
    public int minimumSum(int num) {
        String s=num+"";
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++)
            arr[i]=s.charAt(i)-'0';
        Arrays.sort(arr);
        int a=arr[0]*10+arr[2];
        int b=arr[1]*10+arr[3];
        return a+b;
    }
}