// ==========================================================
// 167. Two Sum II - Input Array Is Sorted
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 100%)
// Memory     : 47.8 MB (Beats 98%)
// Link       : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// ==========================================================

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] arr = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left<right) {
            if (numbers[left]+numbers[right]==target) {
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }
            else if (numbers[left]+numbers[right]>target) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr;
    }
}