class Solution {
    public int reverse(int x) {
        char sign='+';
        if(x<0) sign='-';
        StringBuilder sb=new StringBuilder(x+"");
        String c;
        if(sb.charAt(0)=='-'){
            sb.deleteCharAt(0);
            c="2147483648";
        }
        else
            c="2147483647";
        int j=sb.length()-1;
       for(int i=0;i<sb.length()/2;i++){
           char k=sb.charAt(j);
           sb.setCharAt(j,sb.charAt(i));
           sb.setCharAt(i,k);
           j--;
       }
        if(sb.length()<10){
            if(sign=='-')
            sb.insert(0,'-');
            return Integer.parseInt(sb.toString());
        }
        // to check outwards range
        int i=0;
        while(i<c.length()){
            if(sb.charAt(i)>c.charAt(i))
                return 0;
            else if(sb.charAt(i)<c.charAt(i))
                break;
            i++;
        }
        if(sign=='-')
            sb.insert(0,'-');
        return Integer.parseInt(sb.toString());
    }
}