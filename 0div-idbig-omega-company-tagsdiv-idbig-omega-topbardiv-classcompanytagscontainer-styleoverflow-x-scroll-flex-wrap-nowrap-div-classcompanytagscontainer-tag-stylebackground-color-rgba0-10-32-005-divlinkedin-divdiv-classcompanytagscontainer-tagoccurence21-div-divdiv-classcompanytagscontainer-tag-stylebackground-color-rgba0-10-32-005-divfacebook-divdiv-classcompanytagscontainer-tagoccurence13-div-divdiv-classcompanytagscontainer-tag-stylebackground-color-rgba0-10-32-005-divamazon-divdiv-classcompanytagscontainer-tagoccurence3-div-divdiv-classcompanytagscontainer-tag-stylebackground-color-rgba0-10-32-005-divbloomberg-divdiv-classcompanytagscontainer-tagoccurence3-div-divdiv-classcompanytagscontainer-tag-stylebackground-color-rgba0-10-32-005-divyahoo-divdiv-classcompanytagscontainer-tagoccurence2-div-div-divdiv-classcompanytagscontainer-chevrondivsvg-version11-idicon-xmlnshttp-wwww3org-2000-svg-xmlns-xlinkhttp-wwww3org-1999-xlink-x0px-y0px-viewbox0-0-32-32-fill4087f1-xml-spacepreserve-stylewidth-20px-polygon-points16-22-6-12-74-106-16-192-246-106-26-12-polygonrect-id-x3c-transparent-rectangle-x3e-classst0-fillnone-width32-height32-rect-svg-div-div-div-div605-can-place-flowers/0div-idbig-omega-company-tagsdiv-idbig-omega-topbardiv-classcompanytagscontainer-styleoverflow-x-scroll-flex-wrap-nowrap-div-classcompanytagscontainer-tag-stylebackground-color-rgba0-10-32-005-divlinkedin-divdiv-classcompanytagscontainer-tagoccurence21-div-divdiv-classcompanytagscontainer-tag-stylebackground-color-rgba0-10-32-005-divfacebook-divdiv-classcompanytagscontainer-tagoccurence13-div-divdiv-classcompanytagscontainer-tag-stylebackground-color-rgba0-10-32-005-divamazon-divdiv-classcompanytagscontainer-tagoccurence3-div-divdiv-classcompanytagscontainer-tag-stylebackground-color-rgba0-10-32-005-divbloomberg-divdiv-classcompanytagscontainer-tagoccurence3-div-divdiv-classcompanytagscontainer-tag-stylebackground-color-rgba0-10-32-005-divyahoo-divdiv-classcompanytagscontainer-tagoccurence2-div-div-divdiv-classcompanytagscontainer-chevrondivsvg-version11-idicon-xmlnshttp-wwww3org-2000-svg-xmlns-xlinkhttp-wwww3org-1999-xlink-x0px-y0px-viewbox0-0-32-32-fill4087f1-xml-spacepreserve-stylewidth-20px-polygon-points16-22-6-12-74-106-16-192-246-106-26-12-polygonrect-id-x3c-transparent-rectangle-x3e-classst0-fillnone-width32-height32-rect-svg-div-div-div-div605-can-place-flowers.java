class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int l =flowerbed.length;
        if(l==1){
            if(flowerbed[0]==0 && n==1) return true;
            else return false;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        if(n==0) return true;
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--;
            }
            if(n==0) return true;
        }
        if(flowerbed[l-1]==0 && flowerbed[l-2]==0){
            flowerbed[l-1]=1;
            n--;
        }
        return n==0;
    }
}