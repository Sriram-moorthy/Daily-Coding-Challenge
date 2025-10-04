/*
 Leetcode: 282 - Move Zeroes
 Leetcode link:https://leetcode.com/problems/move-zeroes/
*/
 // Approach 1:
class Solution {
    public void moveZeroes(int[] nums) {
        int place=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[place]=nums[i];
                place++;
            }
            
        }
        while(place<nums.length){
            nums[place]=0;
            place++;
        }
    }
}

// Approach 2:
class Solution {
    public void moveZeroes(int[] nums) {
        boolean moved;
        for(int i=0;i<nums.length;i++){
            moved=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]==0 && nums[j]!=0){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    moved=true;
                }
            }
            if(!moved){
                break;
            }
        }
        
    }
}
