/*
 Leetcode: 3065 - Minimum Operations to Exceed Threshold Value I
 Leetcode link:https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/
*/
class Solution {
    public int minOperations(int[] nums, int k) {
        int min_op=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                min_op++;
            }
        }
        return min_op;
    }
}
