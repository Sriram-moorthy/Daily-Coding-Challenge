/*
Leetcode: 977 -  Squares of a Sorted Array
Leetcode link:https://leetcode.com/problems/squares-of-a-sorted-array/
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
        
    }
}
