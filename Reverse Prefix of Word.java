/*
 Leetcode: 2000 - Reverse Prefix of Word
 Leetcode link:https://leetcode.com/problems/reverse-prefix-of-word/
*/

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                sb.append(word.substring(0,i+1));
                sb.reverse();
                sb.append(word.substring(i+1));
                flag=true;
                break;
            }
        }
        if(flag==true){
            return sb.toString();
        }
        return word;
        
        
        
    }
}
