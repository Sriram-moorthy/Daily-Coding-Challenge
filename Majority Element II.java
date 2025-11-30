/*
 Leetcode: 229 - Majority Element II
 Leetcode link:https://leetcode.com/problems/majority-element-ii/
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        int count1=0,count2=0;
        int element1=0,element2=0;
        for(int i=0;i<nums.length;i++){
            if(element1==nums[i]) count1++;
            else if(element2==nums[i]) count2++;
            else if(count1==0){
                count1=1;
                element1=nums[i];
            }else if(count2==0){
                count2=1;
                element2=nums[i];
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(element1==nums[i]) count1++;
            if(element2==nums[i]) count2++;
        }
        int majority=nums.length/3;
        if(count1>majority) list.add(element1);
        if(count2>majority && element2!=element1) list.add(element2);
        return list;
    }
}
