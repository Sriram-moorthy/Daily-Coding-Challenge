/*
 Leetcode: 1768 - Merge Strings Alternately
 Leetcode link:https://leetcode.com/problems/merge-strings-alternately/
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        String concat=word1+word2;
        for(int i=0;i<concat.length();i++){
            if(i<word1.length())
            sb.append(word1.charAt(i));
            if(i<word2.length())
            sb.append(word2.charAt(i));
        }
        return sb.toString();
  }
}
