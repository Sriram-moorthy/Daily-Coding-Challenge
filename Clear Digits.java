/*
 Leetcode: 3174 - Clear Digits
 Leetcode link:https://leetcode.com/problems/clear-digits/
*/
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
         for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(Character.isDigit(c)){
                if(sb.length()>0){
                     sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
