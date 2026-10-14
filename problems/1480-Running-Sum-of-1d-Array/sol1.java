// ==========================================================
// 1480. Running Sum of 1d Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.8 MB (Beats 98%)
// Link       : https://leetcode.com/problems/running-sum-of-1d-array/
// ==========================================================

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i =0;i<nums.length;i++) {
            sum+=nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}