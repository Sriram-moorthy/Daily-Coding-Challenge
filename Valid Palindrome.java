/*
 Leetcode: 125 - Valid Palindrome
 Leetcode link:https://leetcode.com/problems/valid-palindrome/
*/

// Approach 1:
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s==null ||s.length()==1){
            return true;
        }
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();;
        StringBuilder sb=new StringBuilder(str);
        if((sb.reverse().toString()).equals(str)){
            return true;
        }
        return false;
        
    }
}

//Approach 2:
class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(str.length()==0 || str==null ||str.length()==1){
            return true;
        }
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
        
    }
}
