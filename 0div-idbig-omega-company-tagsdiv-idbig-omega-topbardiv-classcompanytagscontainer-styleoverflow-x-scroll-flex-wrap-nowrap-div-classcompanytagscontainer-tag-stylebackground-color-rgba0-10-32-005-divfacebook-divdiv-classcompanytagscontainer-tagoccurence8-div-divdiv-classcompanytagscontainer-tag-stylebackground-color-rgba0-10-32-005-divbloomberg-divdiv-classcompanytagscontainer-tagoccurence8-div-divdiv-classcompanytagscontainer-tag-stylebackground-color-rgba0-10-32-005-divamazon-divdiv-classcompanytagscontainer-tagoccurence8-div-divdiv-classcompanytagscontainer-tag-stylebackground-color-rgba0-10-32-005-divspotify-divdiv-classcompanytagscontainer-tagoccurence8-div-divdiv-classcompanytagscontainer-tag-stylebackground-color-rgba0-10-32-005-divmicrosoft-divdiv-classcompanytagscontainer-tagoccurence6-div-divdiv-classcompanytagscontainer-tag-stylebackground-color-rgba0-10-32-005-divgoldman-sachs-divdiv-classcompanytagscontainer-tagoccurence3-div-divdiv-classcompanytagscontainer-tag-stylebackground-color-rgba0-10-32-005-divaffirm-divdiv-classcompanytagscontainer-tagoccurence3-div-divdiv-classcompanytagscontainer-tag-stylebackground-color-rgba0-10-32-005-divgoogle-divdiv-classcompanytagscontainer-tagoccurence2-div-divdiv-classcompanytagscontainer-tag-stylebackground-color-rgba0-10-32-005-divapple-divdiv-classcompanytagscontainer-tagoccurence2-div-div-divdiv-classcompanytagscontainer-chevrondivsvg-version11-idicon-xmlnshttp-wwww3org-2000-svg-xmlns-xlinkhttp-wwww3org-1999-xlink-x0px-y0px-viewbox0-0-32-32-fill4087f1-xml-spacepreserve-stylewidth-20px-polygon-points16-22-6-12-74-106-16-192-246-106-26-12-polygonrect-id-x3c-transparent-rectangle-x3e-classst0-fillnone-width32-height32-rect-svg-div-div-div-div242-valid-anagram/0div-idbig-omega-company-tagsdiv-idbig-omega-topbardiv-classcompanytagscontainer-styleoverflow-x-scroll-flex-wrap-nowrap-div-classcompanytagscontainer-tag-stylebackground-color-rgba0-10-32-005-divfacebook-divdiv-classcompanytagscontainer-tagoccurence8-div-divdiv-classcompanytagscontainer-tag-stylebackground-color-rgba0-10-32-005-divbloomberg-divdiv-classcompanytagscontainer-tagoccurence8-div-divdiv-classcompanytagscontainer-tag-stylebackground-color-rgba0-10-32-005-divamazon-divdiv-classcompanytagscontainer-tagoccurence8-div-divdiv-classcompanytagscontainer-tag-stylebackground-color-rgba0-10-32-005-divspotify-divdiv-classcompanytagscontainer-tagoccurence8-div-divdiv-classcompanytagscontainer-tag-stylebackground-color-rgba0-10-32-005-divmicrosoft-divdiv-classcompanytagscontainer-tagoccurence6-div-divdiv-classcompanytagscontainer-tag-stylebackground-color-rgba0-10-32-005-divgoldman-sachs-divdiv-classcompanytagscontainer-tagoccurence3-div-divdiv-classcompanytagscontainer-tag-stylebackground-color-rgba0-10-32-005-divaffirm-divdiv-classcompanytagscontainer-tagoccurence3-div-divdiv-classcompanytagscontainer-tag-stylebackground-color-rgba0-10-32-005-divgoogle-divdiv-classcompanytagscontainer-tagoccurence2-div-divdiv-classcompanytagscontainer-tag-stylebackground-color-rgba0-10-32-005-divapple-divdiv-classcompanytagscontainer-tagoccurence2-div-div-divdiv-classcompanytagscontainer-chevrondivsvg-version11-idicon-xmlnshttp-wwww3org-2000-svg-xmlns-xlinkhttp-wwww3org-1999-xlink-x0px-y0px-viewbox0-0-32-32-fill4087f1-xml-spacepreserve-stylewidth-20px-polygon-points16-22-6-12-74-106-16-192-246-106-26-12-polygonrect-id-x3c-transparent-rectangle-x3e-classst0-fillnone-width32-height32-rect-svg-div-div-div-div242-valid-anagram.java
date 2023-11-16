class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[26];
                int b[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}