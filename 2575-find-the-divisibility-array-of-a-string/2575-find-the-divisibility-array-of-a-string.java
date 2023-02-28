class Solution {
    public int[] divisibilityArray(String word, int m) {
        int arr[]=new int[word.length()];
        long prev_rem=0;
        for(int i=0;i<word.length();i++){
            long curr_digit=word.charAt(i)-'0';
            prev_rem=prev_rem*10+curr_digit;
            if(prev_rem%m==0){
                arr[i]=1;
                prev_rem=0;
            }
            else
                arr[i]=0;
            
            prev_rem=prev_rem%m;
        }
        return arr;
    }
}