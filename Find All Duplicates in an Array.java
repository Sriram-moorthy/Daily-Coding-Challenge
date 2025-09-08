/*
 Leetcode: 422 - Find All Duplicates in an Array
 Leetcode link:https://leetcode.com/problems/find-all-duplicates-in-an-array/
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(nums[index]);
            }
        }
        return list;
        
    }
}
