class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            if(check(i)){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
    public boolean check(int no){
        int sum=0;
        while(no!=0){
            sum+=no%10;
            no/=10;
        }
        return sum%2==0;
    }
}