/*
Leetcode: 1608 - Special Array With X Elements Greater Than or Equal X
Leetcode link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
*/

class Solution {
    public int specialArray(int[] nums) {
      Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= (n - i)) {
                if (i == 0 || nums[i - 1] < (n - i)) {
                    return n - i;
                }
            }
        }
        return -1;
    }
}
