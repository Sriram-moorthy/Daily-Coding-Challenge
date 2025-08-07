/*
Leetcode: 58 - Length of Last Word
Leetcode link:https://leetcode.com/problems/length-of-last-word/
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int length=0;
        boolean flag=false;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
                flag=true;
            }else if(flag){
                break;
            }
        }
        return length;
        
    }
}
