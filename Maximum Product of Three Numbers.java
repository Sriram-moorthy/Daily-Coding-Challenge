/*
 Leetcode: 628 - Maximum Product of Three Numbers
 Leetcode link:https://leetcode.com/problems/maximum-product-of-three-numbers/
*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       long product1=1L* nums[0]*nums[1]*nums[nums.length-1];
       long product2= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
       if((int)product1>(int)product2){
        return (int)product1;
       }
       return (int)product2;
        
    }
}
