class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n,n,"",result);
        return result;
    }
    public void generate(int open , int close , String s,  List<String>result){
        if(open ==0 && close ==0){
            result.add(s);
            return;
        }
        
        if(open>0){
            generate(open-1,close,  s+"(",result);
        }
        
        if(open<close){
            generate(open,close-1 , s+")" , result);
        }
    }
}