/*
 Leetcode: 633 - Sum of Square Numbers
 Leetcode link:https://leetcode.com/problems/sum-of-square-numbers/
*/

class Solution {
    public boolean judgeSquareSum(int c) {
        long first=0,last=(long)Math.sqrt(c),sum=0;
        for(long i=first,j=last;i<=j ; ){
            sum=(i*i)+(j*j);
            if(sum==c){
                return true;
            }
            else if(sum>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
