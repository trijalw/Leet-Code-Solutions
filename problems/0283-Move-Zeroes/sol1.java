// ==========================================================
// 283. Move Zeroes
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 208 ms (Beats 5%)
// Memory     : 47.7 MB (Beats 76%)
// Link       : https://leetcode.com/problems/move-zeroes/
// ==========================================================

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0;i<nums.length;i++) {
            for (int j = i+1;j<nums.length;j++) {
                if (nums[i]==0) {
                    int temp = 0;
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        return;
    }
}