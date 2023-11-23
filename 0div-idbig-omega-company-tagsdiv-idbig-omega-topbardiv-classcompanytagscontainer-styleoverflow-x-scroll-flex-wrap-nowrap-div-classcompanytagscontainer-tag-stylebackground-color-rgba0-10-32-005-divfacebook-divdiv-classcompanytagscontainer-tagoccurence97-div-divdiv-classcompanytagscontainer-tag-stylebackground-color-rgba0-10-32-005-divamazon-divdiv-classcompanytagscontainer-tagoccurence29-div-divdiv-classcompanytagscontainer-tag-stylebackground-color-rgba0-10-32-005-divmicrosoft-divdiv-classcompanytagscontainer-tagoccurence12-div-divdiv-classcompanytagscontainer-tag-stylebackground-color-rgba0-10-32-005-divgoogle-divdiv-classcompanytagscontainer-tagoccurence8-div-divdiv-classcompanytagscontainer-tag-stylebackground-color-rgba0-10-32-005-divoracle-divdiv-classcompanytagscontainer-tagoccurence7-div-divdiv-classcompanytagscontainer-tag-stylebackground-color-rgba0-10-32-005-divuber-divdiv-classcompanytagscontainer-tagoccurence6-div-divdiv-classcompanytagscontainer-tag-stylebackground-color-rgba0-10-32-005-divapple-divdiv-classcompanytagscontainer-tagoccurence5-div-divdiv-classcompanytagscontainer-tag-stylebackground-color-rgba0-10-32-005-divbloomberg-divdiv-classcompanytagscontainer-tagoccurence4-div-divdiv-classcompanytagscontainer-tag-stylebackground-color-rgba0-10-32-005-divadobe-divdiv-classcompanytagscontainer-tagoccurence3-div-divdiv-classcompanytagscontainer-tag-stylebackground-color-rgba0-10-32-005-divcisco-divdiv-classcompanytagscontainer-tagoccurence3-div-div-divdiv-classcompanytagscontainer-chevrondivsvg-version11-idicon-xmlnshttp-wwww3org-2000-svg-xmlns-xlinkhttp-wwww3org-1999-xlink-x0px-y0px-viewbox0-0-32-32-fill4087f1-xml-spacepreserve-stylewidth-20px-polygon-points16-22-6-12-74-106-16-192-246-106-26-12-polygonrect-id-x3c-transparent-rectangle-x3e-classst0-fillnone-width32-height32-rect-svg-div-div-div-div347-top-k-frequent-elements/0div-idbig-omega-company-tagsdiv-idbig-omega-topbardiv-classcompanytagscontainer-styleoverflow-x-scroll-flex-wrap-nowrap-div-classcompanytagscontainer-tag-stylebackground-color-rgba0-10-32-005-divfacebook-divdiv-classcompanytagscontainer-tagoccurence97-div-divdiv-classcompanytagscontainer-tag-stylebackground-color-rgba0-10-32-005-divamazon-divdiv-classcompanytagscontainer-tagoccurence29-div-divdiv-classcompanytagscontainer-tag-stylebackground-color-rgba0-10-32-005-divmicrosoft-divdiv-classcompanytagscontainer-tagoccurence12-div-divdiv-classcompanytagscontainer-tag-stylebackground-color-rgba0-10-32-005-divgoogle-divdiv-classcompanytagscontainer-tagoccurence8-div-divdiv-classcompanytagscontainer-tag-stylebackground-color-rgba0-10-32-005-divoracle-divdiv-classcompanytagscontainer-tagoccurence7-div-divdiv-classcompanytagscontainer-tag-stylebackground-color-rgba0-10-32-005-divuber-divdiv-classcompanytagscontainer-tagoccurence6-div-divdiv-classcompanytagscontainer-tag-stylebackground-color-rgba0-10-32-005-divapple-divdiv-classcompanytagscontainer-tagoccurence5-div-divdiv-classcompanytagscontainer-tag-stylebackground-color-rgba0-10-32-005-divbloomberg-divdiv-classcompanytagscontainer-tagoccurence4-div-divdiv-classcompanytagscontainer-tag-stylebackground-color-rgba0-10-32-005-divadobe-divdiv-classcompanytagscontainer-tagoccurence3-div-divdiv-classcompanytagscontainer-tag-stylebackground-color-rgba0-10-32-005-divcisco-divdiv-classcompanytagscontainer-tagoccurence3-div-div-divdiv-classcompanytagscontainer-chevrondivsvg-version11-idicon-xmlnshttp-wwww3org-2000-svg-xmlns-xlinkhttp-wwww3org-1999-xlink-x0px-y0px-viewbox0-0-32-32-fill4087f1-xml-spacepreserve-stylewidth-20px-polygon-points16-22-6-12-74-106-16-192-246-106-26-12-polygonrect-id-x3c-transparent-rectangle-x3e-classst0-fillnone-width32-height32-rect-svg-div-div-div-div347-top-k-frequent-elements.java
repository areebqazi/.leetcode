class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue());
        
        for (int key: map.keySet()){
            queue.offer(new Pair<Integer, Integer>(key, map.get(key)));
        }
        
        int[] ans = new int[k];
        int idx = 0;
        
        while (k > 0){
            ans[idx++] = queue.poll().getKey();
            k--;
        }
        
        return ans;
    }
}