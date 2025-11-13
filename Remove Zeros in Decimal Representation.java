/*
 Leetcode:3726 - Remove Zeros in Decimal Representation
 Leetcode link:https://leetcode.com/problems/remove-zeros-in-decimal-representation/
*/

class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long rev=0;
        while(n>0){
            long digit=n%10;
            if(digit!=0){
                ans=ans*10+digit;
            }
            n=n/10;
        }
        while(ans>0){
            long digit=ans%10;
            rev=rev*10+digit;
            ans/=10;
        }
        return rev;
    }
}
