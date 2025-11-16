/*
 Leetcode: 1592 - Rearrange Spaces Between Words
 Leetcode link:https://leetcode.com/problems/rearrange-spaces-between-words/
*/

class Solution {
    public String reorderSpaces(String text) {
        StringBuilder sb=new StringBuilder();
        int spaceCount=0;
        for(char c:text.toCharArray()){
            if(c==' ') spaceCount++;
        }
        String[] arr=text.trim().split("\\s+");
        int wordCount=arr.length;
        if(wordCount==1){
            sb.append(arr[0]);
            sb.append(" ".repeat(spaceCount));
            return sb.toString();
        }
        int finalSpace=spaceCount/(wordCount-1);
        int leftover=spaceCount%(wordCount-1);
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(" ".repeat(finalSpace));
            }
        }
        sb.append(" ".repeat(leftover));
        return sb.toString();
    }
}
