package Leetcode.FindNumberWithEvenNumberOfDigits;

public class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for(int i : nums) {
            int numOfDigits = 0;

            while (i != 0) {
                i /= 10;
                numOfDigits++;
            }

            if (numOfDigits % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}