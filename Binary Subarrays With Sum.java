/*
 Leetcode: 930 - Binary Subarrays With Sum
 Leetcode link:https://leetcode.com/problems/binary-subarrays-with-sum/description/
*/
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums,goal)-count(nums,goal-1);
    }
    public int count(int[] nums,int goal){
        if(goal<0) return 0;
        int count=0,left=0,right=0,sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count=count+(right-left)+1;
            right++;
        }
        return count;
    }
}
