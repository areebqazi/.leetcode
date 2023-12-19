class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = s2.length();int m = s1.length();
        int a[]=new int[26];
        for(int i=0;i<s1.length();i++)  a[s1.charAt(i)-97]++;

        for(int i=0;i<=l-m;i++){
            String temp = s2.substring(i,i+m);

            int b[]=new int[26];
            for(int j=0;j<temp.length();j++)  b[temp.charAt(j)-97]++;
            
            int count=0;
            
            for(int k=0;k<26;k++){
                if(a[k]==b[k]) count++;
            }
            
            if(count==26) return true;
        }
        return false;
    }
}