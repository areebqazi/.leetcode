class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int tribonacci(int n) {
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);
        return trib(n);
    }
    public int trib(int n){
         if(map.containsKey(n)){
            return map.get(n);
        }
        int result=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        map.put(n,result);
        return result;
    }
}