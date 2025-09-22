/*
Leetcode: 1662 - Check If Two String Arrays are Equivalent
Leetcode link:https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length ==1 && word2.length==1){
            if(word1[0].equals(word2[0])){
              return true;
            }else{
                return false;
            }
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        if(word1.length>=1){
            for(int i=0;i<word1.length;i++){
                sb.append(word1[i]);
            }
        }
        if(word2.length>=1){
             for(int j=0;j<word2.length;j++){
                sb1.append(word2[j]);
            }
        }
        return sb.toString().equals(sb1.toString());
        
    }
}
