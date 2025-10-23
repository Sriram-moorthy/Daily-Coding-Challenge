/*
 Leetcode: 342 - Power of Four
 Leetcode link:https://leetcode.com/problems/power-of-four/
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        return helper(n,0);
    }
    public boolean helper(int n,int x){
        double power =Math.pow(4,x);
        if(power==n){
            return true;
        }
        if(power>n || power>Integer.MAX_VALUE){
            return false;
        }
        return helper(n,x+1);

    }
}
