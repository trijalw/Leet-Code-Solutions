// ==========================================================
// 189. Rotate Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 55%)
// Memory     : 268.9 MB (Beats 19%)
// Link       : https://leetcode.com/problems/rotate-array/
// ==========================================================

class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return;
    }
    public int[] reverse(int [] nums,int left,int right) {
        while (left<right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left++;
        }
        return nums;
    }
}


// Reversal algorithm is simple to rotate a array what we want is [B][A] from [A][B].
// To do it we use reverse a then reverse b and then reverse the whole array
// This case if for left rotate

// For right rotate which is given here
// first reverse whole array then first k then remaing