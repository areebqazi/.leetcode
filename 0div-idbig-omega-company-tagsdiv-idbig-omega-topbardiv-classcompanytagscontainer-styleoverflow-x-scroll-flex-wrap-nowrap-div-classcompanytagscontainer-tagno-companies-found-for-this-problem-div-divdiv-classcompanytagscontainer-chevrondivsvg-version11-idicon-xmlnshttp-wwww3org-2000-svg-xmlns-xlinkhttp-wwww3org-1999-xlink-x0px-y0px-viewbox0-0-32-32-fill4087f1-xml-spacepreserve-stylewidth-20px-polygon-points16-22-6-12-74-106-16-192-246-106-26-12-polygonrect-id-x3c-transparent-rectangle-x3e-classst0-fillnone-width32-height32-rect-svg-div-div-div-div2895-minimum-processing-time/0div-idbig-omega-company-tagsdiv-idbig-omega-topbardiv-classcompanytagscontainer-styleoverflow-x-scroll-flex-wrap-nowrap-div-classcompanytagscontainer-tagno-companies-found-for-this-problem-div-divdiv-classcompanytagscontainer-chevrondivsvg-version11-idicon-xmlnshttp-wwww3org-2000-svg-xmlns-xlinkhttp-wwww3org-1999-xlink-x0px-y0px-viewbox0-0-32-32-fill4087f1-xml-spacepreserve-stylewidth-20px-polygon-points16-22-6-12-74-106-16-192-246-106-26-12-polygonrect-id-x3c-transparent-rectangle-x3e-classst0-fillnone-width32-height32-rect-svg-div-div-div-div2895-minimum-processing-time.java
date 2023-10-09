class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int result=0;
        int j = processorTime.size()-1;
        for(int i=0;i<tasks.size();i+=4){
            int no = processorTime.get(j);
            int temp = Math.max(no+tasks.get(i),Math.max(no+tasks.get(i+1),Math.max(no+tasks.get(i+2),no+tasks.get(i+3))));
            result = Math.max(result,temp);
            j--;
        }
        return result;
    }
}