class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>set=new HashSet<>();
        int c[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            set.add(A[i]);
            System.out.println(set);
            for(int j=i;j>=0;j--){
                if(set.contains(B[j]))
                   count++;
            }
             c[i]=count;
        }
        return c;
    }
}