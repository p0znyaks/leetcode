package Leetcode.SquaresOfASortedArray;

// runtime 1ms
// time complexity O(N)
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int curr;

        for(int i = nums.length; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                curr = nums[right];
                right--;
            } else {
                curr = nums[left];
                left++;
            }
            res[i] = curr * curr;
        }

        return res;
    }
}