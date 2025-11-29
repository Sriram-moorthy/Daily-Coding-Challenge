/*
 Leetcode : 1004 - Max Consecutive Ones III
 Leetcode link:https://leetcode.com/problems/max-consecutive-ones-iii/
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,maxLength=0,zeros=0;
        while(right<nums.length){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                int length=right-left+1;
                maxLength=Math.max(maxLength,length);

            }
            right++;
           
        }
        return maxLength;
    }
}
