/*
 Leetcode: 53 - Maximum Subarray
 Leetcode link:https://leetcode.com/problems/maximum-subarray/
*/

// Approach 1: kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
        
    }
}

// Approach 2:
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
               if(sum>max){
                    max=sum;
                }
               
            }
             
            sum=0;
        }
        return max;
        
    }
}
