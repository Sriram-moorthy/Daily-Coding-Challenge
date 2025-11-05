/*
 Leetcode: 50 - Pow(x, n)
 Leetcode link:https://leetcode.com/problems/powx-n/
*/

class Solution {
    public double myPow(double x, int n) {
        long power=n;
        if(n<0){
            x=1/x;
            power=-power;
        }
       return expo(x,power);
    }
    public double expo(double x,long n){
        if(n==0){
            return 1;
        }
        double half=expo(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return half*half*x;
    }
}
