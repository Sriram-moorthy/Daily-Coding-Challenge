/*
 Leetcode: 1313 - Decompress Run-Length Encoded List
 Leetcode link:https://leetcode.com/problems/decompress-run-length-encoded-list/
*/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            while(freq!=0){
                list.add(nums[i+1]);
                freq--;
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
