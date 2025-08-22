/*
Leetcode: 169 - Majority Element
Leetcode link:https://leetcode.com/problems/majority-element/

*/

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                num=nums[i];
                break;
            }
            count=0;
            
        }
        return num;
    }
}
