
/*
 Leetcode: 28 -  Find the Index of the First Occurrence in a String
 Leetcode link:https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
*/

// Approach 1:
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
           
                if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            
            
        }
        return -1;
        
    }
}

// Approach 2:
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            int end=needle.length()+i;
            if(end<=haystack.length()){
                if(haystack.substring(i,end).equals(needle)){
                return i;
            }
            }
            
        }
        return -1;
        
    }
