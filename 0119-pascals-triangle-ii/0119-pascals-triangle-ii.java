class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>a=new ArrayList<>();
        a.add(1);
        if(rowIndex==0)
            return a;
        a.add(1);
        if(rowIndex==1)
            return a;
        List<Integer>b=new ArrayList<>();
        for(int i=2;i<=rowIndex;i++){
            b.clear();
            b.add(1);
            for(int j=1;j<=i-1;j++){
               b.add(a.get(j)+a.get(j-1));
            }
            b.add(1);
            a.clear();
            for(int j=0;j<b.size();j++){
                a.add(b.get(j));
            }
        }
    return a;
    }
}