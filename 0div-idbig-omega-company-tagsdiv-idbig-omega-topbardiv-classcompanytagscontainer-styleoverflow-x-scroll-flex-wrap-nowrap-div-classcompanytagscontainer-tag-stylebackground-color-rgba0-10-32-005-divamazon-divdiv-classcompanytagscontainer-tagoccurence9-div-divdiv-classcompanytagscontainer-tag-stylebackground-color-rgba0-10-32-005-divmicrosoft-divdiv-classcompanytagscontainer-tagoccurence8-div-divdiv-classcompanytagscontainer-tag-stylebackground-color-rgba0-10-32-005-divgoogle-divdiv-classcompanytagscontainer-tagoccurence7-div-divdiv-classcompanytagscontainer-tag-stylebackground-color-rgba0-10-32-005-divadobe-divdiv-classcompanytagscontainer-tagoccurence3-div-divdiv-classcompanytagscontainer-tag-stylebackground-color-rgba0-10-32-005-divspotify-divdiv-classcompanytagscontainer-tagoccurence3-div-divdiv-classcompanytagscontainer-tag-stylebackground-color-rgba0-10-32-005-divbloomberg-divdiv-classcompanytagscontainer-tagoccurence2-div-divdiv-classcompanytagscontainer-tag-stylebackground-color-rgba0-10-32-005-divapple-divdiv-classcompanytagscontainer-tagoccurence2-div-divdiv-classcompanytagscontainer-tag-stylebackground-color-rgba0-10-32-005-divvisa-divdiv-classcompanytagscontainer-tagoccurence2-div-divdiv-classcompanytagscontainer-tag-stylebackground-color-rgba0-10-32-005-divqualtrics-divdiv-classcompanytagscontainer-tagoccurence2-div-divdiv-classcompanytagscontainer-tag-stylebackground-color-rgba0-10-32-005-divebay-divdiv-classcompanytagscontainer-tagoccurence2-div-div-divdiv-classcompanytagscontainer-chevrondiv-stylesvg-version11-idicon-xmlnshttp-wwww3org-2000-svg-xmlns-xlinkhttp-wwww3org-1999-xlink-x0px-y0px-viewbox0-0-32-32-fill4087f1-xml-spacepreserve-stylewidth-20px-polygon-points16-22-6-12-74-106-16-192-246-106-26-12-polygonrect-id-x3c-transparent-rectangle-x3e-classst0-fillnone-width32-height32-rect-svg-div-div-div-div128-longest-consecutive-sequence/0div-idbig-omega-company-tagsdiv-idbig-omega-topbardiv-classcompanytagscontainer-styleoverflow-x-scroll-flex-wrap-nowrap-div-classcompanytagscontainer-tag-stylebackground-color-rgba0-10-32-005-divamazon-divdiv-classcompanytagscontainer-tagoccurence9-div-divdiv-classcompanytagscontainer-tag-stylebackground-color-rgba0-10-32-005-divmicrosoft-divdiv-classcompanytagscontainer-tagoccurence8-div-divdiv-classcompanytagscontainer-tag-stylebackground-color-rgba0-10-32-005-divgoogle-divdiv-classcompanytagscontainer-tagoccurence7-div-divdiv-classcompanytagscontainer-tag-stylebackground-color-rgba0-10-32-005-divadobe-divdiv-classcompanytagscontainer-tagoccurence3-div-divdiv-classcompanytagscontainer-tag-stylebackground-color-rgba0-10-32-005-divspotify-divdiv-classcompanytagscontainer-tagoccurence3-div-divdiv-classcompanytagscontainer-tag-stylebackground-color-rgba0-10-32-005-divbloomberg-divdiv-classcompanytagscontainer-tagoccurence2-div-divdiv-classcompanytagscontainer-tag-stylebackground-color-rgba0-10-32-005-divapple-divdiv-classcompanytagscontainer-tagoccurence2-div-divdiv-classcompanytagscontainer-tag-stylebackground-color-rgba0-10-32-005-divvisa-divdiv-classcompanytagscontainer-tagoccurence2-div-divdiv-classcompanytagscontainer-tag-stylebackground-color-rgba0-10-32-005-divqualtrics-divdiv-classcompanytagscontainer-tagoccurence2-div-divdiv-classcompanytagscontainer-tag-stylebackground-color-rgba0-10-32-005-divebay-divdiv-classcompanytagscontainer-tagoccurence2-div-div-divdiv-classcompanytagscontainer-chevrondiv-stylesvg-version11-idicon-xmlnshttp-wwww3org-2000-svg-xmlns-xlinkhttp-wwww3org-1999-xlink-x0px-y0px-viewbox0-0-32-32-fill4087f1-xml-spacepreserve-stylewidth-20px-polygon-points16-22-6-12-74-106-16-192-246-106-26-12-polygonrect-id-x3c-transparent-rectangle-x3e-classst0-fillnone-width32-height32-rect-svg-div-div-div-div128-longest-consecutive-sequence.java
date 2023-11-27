class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        HashSet<Integer>set= new HashSet<>();
        for(int i:arr) set.add(i);
        
        int count=1;
        for(int i:arr){
            if(!set.contains(i-1)){
                int curr = i;
                int temp = 1;
                while(set.contains(curr+1)){
                    curr++;
                    temp++;
                }
                count = Math.max(temp,count);
            }
        }
        return count;
    }
}