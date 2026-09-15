// ==========================================================
// 912. Sort an Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 29 ms (Beats 33%)
// Memory     : 77.9 MB (Beats 90%)
// Link       : https://leetcode.com/problems/sort-an-array/
// ==========================================================

class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if (n<2) return nums ;
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int[n-mid];
        for (int i = 0;i<mid;i++) {
            left[i] = nums[i];
        }
        for (int j=mid;j<n;j++) {
            right[j-mid] = nums[j];
        }
        int [] arr = new int[nums.length];
        left = sortArray(left);
        right =sortArray(right);
        merge(left,right,arr);
        return arr;
    }
    public int[] merge(int[] left,int[] right,int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i<left.length) {
            arr[k++] = left[i++];
        }
        while (j<right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }
}