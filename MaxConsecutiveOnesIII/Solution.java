package Leetcode.MaxConsecutiveOnesIII;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int nullCounter = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                nullCounter++;
            }

            if (nullCounter > k) {
                if (nums[left] == 0) {
                    nullCounter--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}