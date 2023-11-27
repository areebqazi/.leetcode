class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char k = s.charAt(i);
            char l = s.charAt(j);
            if(!Character.isLetter(k) && !Character.isDigit(k)){
                i++;
                continue;
            }
            if(!Character.isLetter(l) && !Character.isDigit(l)){
                j--;
                continue;
            }
            if(Character.toUpperCase(k) != Character.toUpperCase(l)) 
                return false;
            i++;
            j--;
        }
        return true;
    }
}