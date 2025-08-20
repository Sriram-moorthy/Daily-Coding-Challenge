/*
 Leetcode: 1464 -  Maximum Product of Two Elements in an Array
 Leetcode link:https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
*/

class Solution {
    public int maxProduct(int[] nums) {
       int max=-1;
       int secondMax=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            secondMax=max;
            max=nums[i];
           
        }
        else if(nums[i]>secondMax){
            secondMax=nums[i];
        }

       }
       return (max-1)*(secondMax-1);
        
    }
}
