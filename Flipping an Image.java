/*
Leetcode: 832 - Flipping an Image
Leetcode link:https://leetcode.com/problems/flipping-an-image/
*/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                ans[i][j]=image[i][image[i].length-1-j];
            
                if(ans[i][j]==1){
                    ans[i][j]=0;
                }else if(ans[i][j]==0){
                    ans[i][j]=1;
                }
            }

            
        }
        return ans;
                
        
    }
}
