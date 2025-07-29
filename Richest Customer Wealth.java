/*
  * LeetCode Problem: 1672 - Richest Customer Wealth
  * Problem Link: https://leetcode.com/problems/richest-customer-wealth/
  */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
            sum=0;
        }return ans;
        
    }
}
