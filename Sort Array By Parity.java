/*
 Leetcode:905 - Sort Array By Parity
 Leetcode link:https://leetcode.com/problems/sort-array-by-parity/
*/


// Approach 1: Two pointer method
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int eIndex=0;
        int oIndex=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[eIndex]=nums[i];
                eIndex++;
            }else{
                ans[oIndex]=nums[i];
                oIndex--;
            }
        }
        return ans;

        
    }
}

// Approach 2: Bubble sort method
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]%2==0){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                    
                }
            }
            if(!swapped){
                break;
            }
        }
        return nums;

        
    }
}
