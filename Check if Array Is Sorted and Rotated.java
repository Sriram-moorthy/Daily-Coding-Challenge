/*
 Leetcode 1752 - Check if Array Is Sorted and Rotated
 Leetcode link:https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
*/

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n= nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                count=count+1;
            }
        }
        if(nums[n-1]>nums[0]){
            count++;
        }
        return count<=1;
    }
}
