// ==========================================================
// 1004. Max Consecutive Ones III
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 96%)
// Memory     : 52.2 MB (Beats 55%)
// Link       : https://leetcode.com/problems/max-consecutive-ones-iii/
// ==========================================================

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0;right<nums.length;right++) {
            if (nums[right]==0) {
                zeroCount++;
            }
            while (zeroCount>k) {
                if (nums[left]==0) {
                    zeroCount--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}