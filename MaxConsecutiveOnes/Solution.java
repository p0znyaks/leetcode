package Leetcode.MaxConsecutiveOnes;

// runtime 3ms
// time complexity O(N)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for(int i : nums) {
            if (i == 1) {
                current++;
            } else {
                current = 0;
            }
            max = Math.max(max, current);
        }
        return max;
    }
}