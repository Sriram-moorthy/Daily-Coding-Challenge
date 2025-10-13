/*
 Leetcode: 7 - Reverse Integer
 Leetcode link:https://leetcode.com/problems/reverse-integer/
*/

class Solution {
    public int reverse(int num) {
        int ans=0;
        while(num!=0){
            int digit=num%10;
            if(ans<Integer.MIN_VALUE/10 || ans>Integer.MAX_VALUE/10){
                return 0;
            }
            ans=ans*10+digit;
            num=num/10;
        }
        
        return ans;

        
    }
}
