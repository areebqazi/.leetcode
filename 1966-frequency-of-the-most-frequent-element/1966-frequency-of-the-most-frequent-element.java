import java.util.Arrays;

class Solution {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, maxFreq = 1;
        long total = 0;

        for (int j = 1; j < nums.length; j++) {
            total += (long)(nums[j] - nums[j - 1]) * (j - i);

            while (total > k) {
                total -= nums[j] - nums[i];
                i++;
            }

            maxFreq = Math.max(maxFreq, j - i + 1);
        }

        return maxFreq;
    }
}
