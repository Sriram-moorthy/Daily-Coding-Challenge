/*
 Leetcode: 2418 - Sort the People
 Leetcode link:https://leetcode.com/problems/sort-the-people/
*/
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        for (int i=0;i<n-1;i++) {
            int maxIndex=i;
            for (int j=i+1;j<n;j++) {
                if (heights[j]>heights[maxIndex]) {
                    maxIndex=j;
                }
            }
            int temp=heights[maxIndex];
            heights[maxIndex]=heights[i];
            heights[i]=temp;

            String str=names[maxIndex];
            names[maxIndex]=names[i];
            names[i]=str;
        }
        return names;
    }
}
