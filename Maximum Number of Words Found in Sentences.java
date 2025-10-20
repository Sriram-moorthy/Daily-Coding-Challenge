/*
 Leetcode: 2114 - Maximum Number of Words Found in Sentences
 Leetcode link:https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        int count;
        for(int i=0;i<sentences.length;i++){
            count=0;
            String s=sentences[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max+1;

        
    }
}
