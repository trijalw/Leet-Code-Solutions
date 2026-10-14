// ==========================================================
// 724. Find Pivot Index
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 96%)
// Memory     : 46.8 MB (Beats 99%)
// Link       : https://leetcode.com/problems/find-pivot-index/
// ==========================================================

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0;i<nums.length;i++) {
            sum+=nums[i];
        }
        int leftSum = 0;
        for (int i = 0;i<nums.length;i++) {
            if (leftSum == sum-nums[i]) {
                return i;
            }
            leftSum+=nums[i];
            sum-=nums[i];
        }
        return -1;

    }
}