// ==========================================================
// 283. Move Zeroes
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 92%)
// Memory     : 47.1 MB (Beats 99%)
// Link       : https://leetcode.com/problems/move-zeroes/
// ==========================================================

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length==0) return;
        int insPosition = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] !=0 ) {
                nums[insPosition] = nums[i];
                insPosition ++;
            }
        }
        for (int i = insPosition;i<nums.length;i++) {
            nums[i] = 0;
        }
        return;
    }
}