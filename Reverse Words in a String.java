/*
 Leetcode: 151 - Reverse Words in a String
 Leetcode link:https://leetcode.com/problems/reverse-words-in-a-string/
*/

class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
       

    }
}
