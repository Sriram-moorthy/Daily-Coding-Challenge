/*
 Leetcode: 414 -Third Maximum Number
 Leetcode link:https://leetcode.com/problems/third-maximum-number/
*/


class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2){
            return nums[1];
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        int count=0;
        
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
                count++;
            }
        }
        if(count==0||count==1){
            return nums[nums.length-1];
        }
        return list.get(list.size()-3);
    }
}
