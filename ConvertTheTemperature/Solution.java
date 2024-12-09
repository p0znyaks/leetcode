package Leetcode.ConvertTheTemperature;

// runtime 0ms
// time complexity O(1)
public class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.8 + 32;
        return ans;
    }
}