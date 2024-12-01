package Leetcode.MaxConsecutiveOnes;

// 1 variant of solution
// runtime 0ms
// time complexity O(N)

//class Solution {
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        int current = 0;
//
//        for(int i : nums) {
//            if (i == 1) {
//                current++;
//            } else {
//                current = 0;
//            }
//            max = Math.max(max, current);
//        }
//        return max;
//    }
//}

// 2 variant of solution
// runtime 0ms
// time complexity O(N)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for(int i : nums) {
            current = current * i + i; // т.к. массив двоичный использую такой метод подсчёта
            max = Math.max(max, current);
        }
        return max;
    }
}