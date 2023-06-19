class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
       List<int[]>a=new ArrayList<>();
        int i =0;
        for(int j=0;j<intervals.length;j++)
            a.add(intervals[j]);
        while(i<a.size()-1){
            if(a.get(i)[1]>=a.get(i+1)[0]){
                int temp[]={a.get(i)[0],Math.max(a.get(i)[1],a.get(i+1)[1])};
                a.remove(i);
                a.remove(i);
                a.add(i,temp);
            }
            else{
                i++;
            }
        }
        int arr[][]=new int[a.size()][2];
        for(int j=0;j<a.size();j++){
            arr[j]=a.get(j);
        }
        return arr;
    }
}