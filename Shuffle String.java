/*
 Leetcode: 1528 - Shuffle String
 Leetcode link:https://leetcode.com/problems/shuffle-string/
*/

// Approach 1:
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        char[] ans=new char[indices.length];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           ans[indices[i]]=ch[i];
        }
       for(int j=0;j<ans.length;j++){
            sb.append(ans[j]);
       }
       return sb.toString();
    }
}

// Approach 2:
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);    
    }
}
