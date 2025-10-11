/*
 Leetcode: 128 - Longest Consecutive Sequence
 Leetcode link:https://leetcode.com/problems/longest-consecutive-sequence/
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
       HashSet<Integer> set=new HashSet<>();
       int longest=1;
       for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
       }
       int count=0;
       for(int num:set){
            if(!set.contains(num-1)){
                int start=num;
                count=1;
                while(set.contains(start+1)){
                    start=start+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
       return longest;
    }
}
