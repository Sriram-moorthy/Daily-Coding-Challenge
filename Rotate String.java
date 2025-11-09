/*
 Leetcode: 796 - Rotate String
 Leetcode linkhttps://leetcode.com/problems/rotate-string/
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if((s+s).contains(goal)){
            return true;
        }
        return false;
    }
}
