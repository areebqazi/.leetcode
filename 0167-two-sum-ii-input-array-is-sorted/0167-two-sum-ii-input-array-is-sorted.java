class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i]) && i<map.get(target-numbers[i])){
                a[0]=i+1;
                a[1]=map.get(target-numbers[i])+1;
            }
        }
        return a;
    }
}