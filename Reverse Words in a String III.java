/*
Leetcode: 557 - Reverse Words in a String III
Leetcode link:https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/
// Approach 1;
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder rev=new StringBuilder(words[i]);
            sb.append(rev.reverse());
            if(i<words.length-1)
            sb.append(" ");

            
        }
        return sb.toString();
    }
}

// Approach 2:
class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder rev=new StringBuilder(words[i]);
            sb.append(rev.reverse());
            if(i<words.length-1)
            sb.append(" ");

            
        }
        return sb.toString();
    }
}
