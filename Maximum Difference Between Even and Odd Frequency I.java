/*
 Leetcode: 3442 - Maximum Difference Between Even and Odd Frequency I
 Leetcode link:https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
*/
class Solution {
    public int maxDifference(String s) {
       int[] freq=new int[26];
       for(char c:s.toCharArray()){
        freq[c-'a']++;
       }
       int odd_max=Integer.MIN_VALUE;
       int even_min=Integer.MAX_VALUE;
       for(int f:freq){
            if(f==0){
                continue;
            }
            if(f%2==0){
                even_min=Math.min(even_min,f);
            }else{
                odd_max=Math.max(odd_max,f);
            }
       }
       if(odd_max==Integer.MIN_VALUE || even_min==Integer.MAX_VALUE){
        return 0;
       }
       return odd_max-even_min;
    }
}
