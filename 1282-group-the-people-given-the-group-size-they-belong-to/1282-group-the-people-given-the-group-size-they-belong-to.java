class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>result = new ArrayList<>();
        HashMap<Integer,List<Integer>>map = new HashMap<>();
        for(int i =0;i<groupSizes.length;i++){
            List<Integer>temp;
            if(map.containsKey(groupSizes[i])){
                temp = map.get(groupSizes[i]);
                temp.add(i);
                
            }else {
                temp = new ArrayList<>();
                temp.add(i);
            }
            map.put(groupSizes[i],temp);
        }
        for(Map.Entry<Integer,List<Integer>>m:map.entrySet()){
            int no = m.getKey();
            int pair = m.getValue().size()/no;
            List<Integer>ans = m.getValue();
            List<Integer>temp = new ArrayList<>();
            int count=0;
            for(int i=0;i<ans.size();i++){
                temp.add(ans.get(i));
                count++;
                if(count==no){
                    result.add(temp);
                    temp = new ArrayList<>();
                    count=0;
                }
            }
        }
        return result;
    }
}