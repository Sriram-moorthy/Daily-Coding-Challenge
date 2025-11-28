/*
 Leetcode: 1423 - Maximum Points You Can Obtain from Cards
 Leetcode link:https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
*/
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0,rsum=0,maxSum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxSum=lsum;
        for(int j=k-1,rIndex=n-1;j>=0 && rIndex>=n-k;j--,rIndex--){
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[rIndex];
            maxSum=Math.max(maxSum,(lsum+rsum));
        }
        return maxSum;
    }
}
