// ==========================================================
// 167. Two Sum II - Input Array Is Sorted
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 96%)
// Memory     : 48.3 MB (Beats 79%)
// Link       : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// ==========================================================

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] arr = new int[2];
        int sum = 0;
        int left = 0;
        int right = numbers.length-1;
        for (int i =0;i<numbers.length;i++) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }  
            else if (sum>target) {
                right--;
            }
            else if (sum<target) {
                left++;
            }
        }
        return arr;
    }
}