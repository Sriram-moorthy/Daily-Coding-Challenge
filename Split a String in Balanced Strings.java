/*
 Leetcode: 1221 -  Split a String in Balanced Strings
 Leetcode link:https://leetcode.com/problems/split-a-string-in-balanced-strings/
*/

class Solution {
    public int balancedStringSplit(String s) {
        int r_count=0;
        int l_count=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r_count++;
            }else{
                l_count++;
            }
            if(r_count==l_count){
                count++;
                r_count=0;
                l_count=0;
            }
        }
        return count;
        
    }
}
