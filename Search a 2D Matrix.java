/*
Leetcode:74 - Search a 2D Matrix
Leetcode link:https://leetcode.com/problems/search-a-2d-matrix/
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return true;
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        if(matrix[rStart][cMid]==target){
            return true;
        }
        if(matrix[rStart+1][cMid]==target){
            return true;
        }

        if(cMid-1>=0 && target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        if(cMid+1<cols && target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
           return binarySearch(matrix,rStart,cMid+1,cols-1,target); 
        }
        if(cMid-1>=0 && target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
    }

    boolean binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return false;
    }
}
