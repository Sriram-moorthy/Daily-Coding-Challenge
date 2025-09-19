/*
 Leetcode: 1859 - Sorting the Sentence
 Leetcode link:https://leetcode.com/problems/sorting-the-sentence/
*/

class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            int num=str.charAt(str.length()-1)-'0';
            ans[num-1]=str.substring(0,str.length()-1);
        }
        return String.join(" ",ans);
        
    }
}
