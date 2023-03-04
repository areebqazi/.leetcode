class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1)
            return arr[0];
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(mid%2!=0){
                if(arr[mid]==arr[mid+1])
                    right=mid-1;
                else if(arr[mid]==arr[mid-1])
                    left=mid+1;
                else 
                    return arr[mid];
            } 
            else {
                if(arr[mid]==arr[mid+1])
                    left=mid+2;
                else if(arr[mid]==arr[mid-1])
                    right=mid-2;
                else 
                    return arr[mid];
            }
            if(left==right)
                return arr[left];
        }
        return arr[mid];
    }
}