package Leetcode.RunningSumOf1dArray;

// runtime 0ms
// time complexity O(N)
public class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
                nums[i + 1] += nums[i];
        }
        return nums;
    }
}