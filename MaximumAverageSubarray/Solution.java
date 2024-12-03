package Leetcode.MaximumAverageSubarray;

// runtime 1ms
// time complexity O(N)
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int res = sum;

        for(int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            res = Math.max(res, sum);
        }

        return (double) res / k;
    }
}
