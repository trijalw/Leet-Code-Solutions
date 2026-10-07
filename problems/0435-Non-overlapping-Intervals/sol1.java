// ==========================================================
// 435. Non-overlapping Intervals
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 46 ms (Beats 73%)
// Memory     : 115.9 MB (Beats 21%)
// Link       : https://leetcode.com/problems/non-overlapping-intervals/
// ==========================================================

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length<2) {
            return 0;
        }
        int count = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prevEnd = intervals[0][1];
        for (int i =1;i<intervals.length;i++) {
            if (intervals[i][0] < prevEnd) {
                count++;
            }
            else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}