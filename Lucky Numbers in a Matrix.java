/*
 Leetcode: 1380 - Lucky Numbers in a Matrix
 Leetcode link:https://leetcode.com/problems/lucky-numbers-in-a-matrix/
*/

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
      ArrayList<Integer> list = new ArrayList<>();
      int n=matrix.length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int col=-1;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<n;k++){
                if(matrix[k][col]>min){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(min);
            }
        }
        return list;
    }
}
