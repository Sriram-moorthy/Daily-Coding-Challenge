/*
 Leetcode: 3289 - The Two Sneaky Numbers of Digitville
 Leetcode link:https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
*/
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        int j=0;
        for(int index=0;index<nums.length;index++){
            if(index!=nums[index]){
                if(j<=1){
                    ans[j]=nums[index];
                    j++;
                }
            }
        }
        return ans;
    }
}
