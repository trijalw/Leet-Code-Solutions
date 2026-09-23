// ==========================================================
// 875. Koko Eating Bananas
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 25 ms (Beats 19%)
// Memory     : 47.8 MB (Beats 58%)
// Link       : https://leetcode.com/problems/koko-eating-bananas/
// ==========================================================

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int high = piles[piles.length-1];
        int low = 1;
        int minMax = Integer.MAX_VALUE;
        int min = 0;
        while (low<=high) {
            int mid = low+((high-low)/2);
            long hours = 0;
            for (int i =0;i<piles.length;i++) {
                if (piles[i]%mid == 0) {
                    hours+= piles[i]/mid;
                }
                else {
                    hours += piles[i]/mid + 1;
                }
            }
            if (hours<=h){
                min = mid;
                high=mid-1;
                if (minMax>min) {
                    minMax = min;
                }
            } 
            else if (hours>h) {
                low = mid+1;
            }
        }
        return minMax;
    }
}