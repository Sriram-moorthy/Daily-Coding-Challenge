class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxArea = 0;
        int left = 0 , right = height.size()-1;
        while(left < right){
            int width = right - left ;
            int length = min(height[left],height[right]);
            int area = width * length;
            maxArea = max(area, maxArea);
            if(height[left] <= height[right]) left++;
            else right--;
        }
        return maxArea;
    }
};
