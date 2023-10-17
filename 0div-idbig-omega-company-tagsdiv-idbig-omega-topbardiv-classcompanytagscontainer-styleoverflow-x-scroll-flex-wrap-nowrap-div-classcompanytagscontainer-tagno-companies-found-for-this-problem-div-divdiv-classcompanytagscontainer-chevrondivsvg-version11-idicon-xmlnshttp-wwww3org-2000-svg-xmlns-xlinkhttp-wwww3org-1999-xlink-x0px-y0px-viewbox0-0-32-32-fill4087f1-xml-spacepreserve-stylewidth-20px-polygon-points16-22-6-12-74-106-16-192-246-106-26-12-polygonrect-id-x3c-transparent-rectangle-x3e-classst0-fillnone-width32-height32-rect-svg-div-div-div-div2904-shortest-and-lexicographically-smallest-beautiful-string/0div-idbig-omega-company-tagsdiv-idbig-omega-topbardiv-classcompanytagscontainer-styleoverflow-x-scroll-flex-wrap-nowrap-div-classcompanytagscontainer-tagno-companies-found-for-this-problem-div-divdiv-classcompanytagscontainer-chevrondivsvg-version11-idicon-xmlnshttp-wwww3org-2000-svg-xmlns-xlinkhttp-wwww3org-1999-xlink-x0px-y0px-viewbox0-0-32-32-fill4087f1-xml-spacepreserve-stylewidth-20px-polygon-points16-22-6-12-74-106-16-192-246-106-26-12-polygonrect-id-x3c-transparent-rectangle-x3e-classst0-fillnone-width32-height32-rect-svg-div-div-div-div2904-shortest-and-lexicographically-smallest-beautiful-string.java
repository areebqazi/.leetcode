class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String>list=new ArrayList<>();
        int small=s.length();
        for(int i =0;i<s.length();i++){
            for(int j =i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                if(check(temp,k)) {
                    list.add(temp);
                    if(temp.length()<small)
                        small=temp.length();
                }
            }
        }
        for(int j=0;j<list.size();){
            if(list.get(j).length()>small)
                list.remove(j);
            else
                j++;
        }
        if(list.isEmpty()) return "";
        return Collections.min(list);
}
    public boolean check(String s,int k){
        int count=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)-'0'==1)
                count++;
        }
        return count==k;
    }
}