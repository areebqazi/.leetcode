class Solution {
    public int[] plusOne(int[] digits) {
           for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            } else if (i > 0) {
                digits[i] = 0;
            } else {
                int[] newNo = new int[digits.length+1];
                newNo[0] = 1;
                digits=newNo;
            }
        }
        return digits;
    }
}