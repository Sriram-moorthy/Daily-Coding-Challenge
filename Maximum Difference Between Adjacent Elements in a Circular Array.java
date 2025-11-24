/*
 Leetcode: 3423 - Maximum Difference Between Adjacent Elements in a Circular Array
 Leetcode link:https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
*/

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])>diff){
                diff=Math.abs(nums[i]-nums[i-1]);
            }
        }
        int maxDiff=Math.max(diff,Math.abs(nums[nums.length-1]-nums[0]));
        return maxDiff;
    }
}
