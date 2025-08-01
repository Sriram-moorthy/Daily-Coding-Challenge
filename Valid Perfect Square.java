/*
Leetcode: 367 - Valid Perfect Square
Leetcode link:https://leetcode.com/problems/valid-perfect-square
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        int ans=(int)Math.sqrt(num);
        if(num==(ans*ans)){
            return true;
        }else{
            return false;
        }
        
    }
}
