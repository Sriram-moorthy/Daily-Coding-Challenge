/*
 Leetcode : 1945 - Sum of Digits of String After Convert
 Leetcode link:https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
*/
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb= new StringBuilder();
      
        for(int i=0;i<s.length();i++){
            int num=(int)(s.charAt(i))-96;
            sb.append(String.valueOf(num));
        }
        while(k>0){
            int sum=0;
            for(int j=0;j<sb.length();j++){
                int digit=sb.charAt(j)-'0';
                sum+=digit;
            }
            sb=new StringBuilder(String.valueOf(sum));
            k--;
        }
         return Integer.parseInt(sb.toString());
    }
}
