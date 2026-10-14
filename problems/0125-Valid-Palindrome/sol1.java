// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 44%)
// Memory     : 44 MB (Beats 96%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================

class Solution {
    public boolean isPalindrome(String s) {
        if (s==null) return true;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            else {
                if(s.charAt(left)!=s.charAt(right)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}