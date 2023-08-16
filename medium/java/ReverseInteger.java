/*
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
 * then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    Example 1:
        Input: x = 123
        Output: 321
    Example 2:
        Input: x = -123
        Output: -321
    Example 3:
        Input: x = 120
        Output: 21 
    Example 4:
        Input: x = 1534236469
        Output: 0
 */

package medium.java;

public class ReverseInteger {
    public int reverse(int x) { 
        if (x < -2147483648 || x > 2147483647) {
            return 0;
        }
        String reversedTextX = new StringBuilder(String.valueOf(x)).reverse().toString();
        if(x < 0) {
            reversedTextX = "-" + reversedTextX.substring(0, reversedTextX.length() - 1);
        }
        int ans = 0;
        try {
            ans = Integer.parseInt(reversedTextX);
        } catch (NumberFormatException ex) {
            return 0;
        }
        return ans; 
    }
}

/**
 * My solution on LeetCode:
 * https://leetcode.com/problems/reverse-integer/solutions/3919965/solution-by-vijani/
 */