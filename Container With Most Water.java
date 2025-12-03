/*
 Leetcode: 11 -  Container With Most Water
 Leetcode link:https://leetcode.com/problems/container-with-most-water/description/
*/
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,maxArea=0;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
