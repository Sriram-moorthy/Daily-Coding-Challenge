/*
Leetcode:2643 - Row With Maximum Ones
Leetcode link:https://leetcode.com/problems/row-with-maximum-ones/
*/

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int count=0;
        int max=0;
        int row=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count+=1;
                }
            }
            if(count>max){
                max=count;
                row=i;
            }
            count=0;
        }
        ans[0]=row;
        ans[1]=max;
        return ans;
        
    }
}
