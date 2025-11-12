/*
 Leetcode: 1684 - Count the Number of Consistent Strings
 Leetcode link:https://leetcode.com/problems/count-the-number-of-consistent-strings/
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean flag=false;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int n=word.length();
            for(int j=0;j<n;j++){
                flag=false;
                if(allowed.contains(String.valueOf(word.charAt(j)))){
                    flag=true;
                }
                else{
                    break;
                }
            }
            if(flag==true){
                count+=1;
            }
        }
        return count;
    }
}
