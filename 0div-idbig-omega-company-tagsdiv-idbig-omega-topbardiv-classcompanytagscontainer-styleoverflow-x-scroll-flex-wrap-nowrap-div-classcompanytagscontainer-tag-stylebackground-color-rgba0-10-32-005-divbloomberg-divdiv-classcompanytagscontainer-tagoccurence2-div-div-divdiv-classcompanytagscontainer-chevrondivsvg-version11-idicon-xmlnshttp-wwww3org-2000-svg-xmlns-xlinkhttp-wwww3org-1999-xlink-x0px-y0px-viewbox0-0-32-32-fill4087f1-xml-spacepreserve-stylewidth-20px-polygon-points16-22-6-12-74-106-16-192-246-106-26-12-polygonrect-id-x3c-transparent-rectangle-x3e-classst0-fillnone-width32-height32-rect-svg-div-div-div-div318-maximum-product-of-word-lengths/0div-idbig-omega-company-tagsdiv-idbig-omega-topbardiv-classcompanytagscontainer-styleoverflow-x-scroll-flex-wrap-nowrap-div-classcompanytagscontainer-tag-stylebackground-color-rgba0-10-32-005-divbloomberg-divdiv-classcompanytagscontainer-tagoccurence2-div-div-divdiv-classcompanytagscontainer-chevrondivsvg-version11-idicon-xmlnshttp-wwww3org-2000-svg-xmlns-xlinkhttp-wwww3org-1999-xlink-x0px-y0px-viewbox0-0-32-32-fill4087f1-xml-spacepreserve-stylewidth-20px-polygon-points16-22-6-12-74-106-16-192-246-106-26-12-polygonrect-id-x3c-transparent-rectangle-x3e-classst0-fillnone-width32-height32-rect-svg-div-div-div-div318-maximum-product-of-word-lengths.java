class Solution {
    public int maxProduct(String[] words) {
        HashMap<String,int[]>map = new HashMap<>();
        for(String s : words){
            int arr[] = new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-97]++;
            }
            map.put(s,arr);
        }
        
        int p = 0; 
        for(int i=0;i<words.length;i++ ){
            String s1 = words[i];
            for(int j= i+1;j<words.length;j++){
                String s2 = words[j]; 
                boolean flag = true;
                
                int a[]= map.get(s1);
                int b[]= map.get(s2);
                for(int k=0;k<26;k++){
                    if(a[k]>0 && b[k]>0) flag = false;
                }
                if(flag){
                   p= Math.max(p, (s1.length()*s2.length()));
                }
            }
        }
        
        return p ; 
    }
}