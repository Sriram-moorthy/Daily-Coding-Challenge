/* LeetCode Problem: How Many Numbers Are Smaller Than the Current Number
  Problem Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] ans=new int[nums.length];
         int count=0;
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[i]!=nums[j])&&(nums[i]>nums[j])){
                    count+=1;
                }
            }
            ans[i]=count;
            count=0;
        }
         return ans;
    }
}
