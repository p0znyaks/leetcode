package Leetcode.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

// runtime 0ms
// time complexity O(N)
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) resultList.add("FizzBuzz");
            else if (i % 5 == 0) resultList.add("Buzz");
            else if (i % 3 == 0) resultList.add("Fizz");
            else resultList.add(Integer.toString(i));
        }
        return resultList;
    }
}