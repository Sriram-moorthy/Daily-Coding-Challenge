/*
Leetcode: 9 - Palindrome Number
https://leetcode.com/problems/palindrome-number
*/

class Solution {
    public boolean isPalindrome(int x) {    int temp=x;
        int ans=0;
        if(temp<0){
            return false;
        }else if(temp==0){
            return true;
        }else{
            while(temp>0){
                int rem=temp%10;
                 ans=ans*10+rem;
                temp/=10;
            }
            if(ans==x){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}
