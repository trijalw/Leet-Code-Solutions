// ==========================================================
// 904. Fruit Into Baskets
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 59 ms (Beats 13%)
// Memory     : 70.7 MB (Beats 30%)
// Link       : https://leetcode.com/problems/fruit-into-baskets/
// ==========================================================

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int left = 0;
        for (int i =0;i<fruits.length;i++) {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while (map.size()>2) {
                int fruit = fruits[left];
                map.put(fruit,map.get(fruit)-1);
                if (map.get(fruit)==0) {
                    map.remove(fruit);
                }
                left++;
            }
            int length = i - left + 1;
            if (length>maxCount) {
                maxCount = length;
            }
        }
        return maxCount;
    }
}