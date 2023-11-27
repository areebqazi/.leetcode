class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        if(arr.length==1) return 1;
        HashSet<Integer>set = new HashSet<>();
        for(int i:arr) set.add(i);
        ArrayList<Integer>a=new ArrayList<>();
        for(int i:set) a.add(i);
        Collections.sort(a);
        
        int count = 0;
        int temp=1;
        for(int i =0;i<a.size()-1;i++){
            if(a.get(i)+1==a.get(i+1)) temp++;
            else {
                if(count<temp) count=temp;
                temp=1;
            }
        }
        if(count<temp) count= temp;
        return count;
    }
}