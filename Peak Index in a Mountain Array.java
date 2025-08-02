/*
Leetcode: Peak Index in a Mountain Array
Leetcode link:https://leetcode.com/problems/peak-index-in-a-mountain-array

*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}
