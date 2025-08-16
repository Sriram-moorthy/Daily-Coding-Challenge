/*
 Leetcode: 922 - Sort Array By Parity II
 Leetcode link:https://leetcode.com/problems/sort-array-by-parity-ii/
*/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        int evenIndex=0;
        int oddIndex=1;
        for(int num:nums){
            if(num%2==0){
                ans[evenIndex]=num;
                evenIndex+=2;
            }else{
                ans[oddIndex]=num;
                oddIndex+=2;
            }
        }
        return ans;
        
    }
}
