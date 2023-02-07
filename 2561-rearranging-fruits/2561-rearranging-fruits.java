class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer>map1=new HashMap<>();        
        HashMap<Integer,Integer>map2=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        
        //Tree Set to get all the values with distint frequencies
        TreeSet<Integer>set=new TreeSet<>();
        long sum=0;
                
        //count the frequency  the elements in both the arrays
        for(int i=0;i<basket1.length;i++){
            map1.put(basket1[i],map1.getOrDefault(basket1[i],0)+1);
            map2.put(basket2[i],map2.getOrDefault(basket2[i],0)+1);
        }
        
        for(int i=0;i<basket1.length;i++)
            set.add(basket1[i]);
        for(int j=0;j<basket2.length;j++)
            set.add(basket2[j]);
        
        //if off number of frequencies are present return -1
        for(int i:set){
            if((map1.getOrDefault(i,0)+map2.getOrDefault(i,0))%2!=0)
                return -1;
             if(map1.getOrDefault(i,0)!=map2.getOrDefault(i,0)){
for(int j=0;j<Math.abs(map1.getOrDefault(i,0)-map2.getOrDefault(i,0))/2;j++)
                 a.add(i);
             }   
        }
        
        //There can be two ways to swap 
        //Either multiply the element with the miimum number
        //OR
        //Add the number itself
        
        int min=set.first();
        for(int i=0;i<a.size()/2;i++){
        sum+=Math.min(a.get(i),2*min);
        }
        return sum;
     }
}