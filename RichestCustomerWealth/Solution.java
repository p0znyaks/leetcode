package Leetcode.RichestCustomerWealth;

// runtime 0ms
// time complexity O(N*M)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int clients[] : accounts) {
            int currSum = 0;
            for(int bankWealth : clients) {
                currSum += bankWealth;
            }
            maxWealth = Math.max(maxWealth, currSum);
        }
        return maxWealth;
    }
}