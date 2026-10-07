// ==========================================================
// 860. Lemonade Change
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 98%)
// Memory     : 72.1 MB (Beats 93%)
// Link       : https://leetcode.com/problems/lemonade-change/
// ==========================================================

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i =0;i<bills.length;i++) {
            if (bills[i]==5) {
                five++;
            }
            else if (bills[i]==10) {
                if (five>0) {
                    five--;
                    ten++;
                }
                else return false;
            }
            else {
                if (ten>0 && five>0) {
                    ten--;
                    five--;
                }
                else if (five>=3) {
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}