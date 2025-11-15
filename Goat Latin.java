/*
 Leetcode: 824 -  Goat Latin
 leetcode link:https://leetcode.com/problems/goat-latin/
*/
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb= new StringBuilder();
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            String word=str[i];
            if(word.charAt(0)=='a'||word.charAt(0)=='A'||word.charAt(0)=='e'||word.charAt(0)=='E'||word.charAt(0)=='i'||word.charAt(0)=='I'||word.charAt(0)=='o'||word.charAt(0)=='O'||word.charAt(0)=='u'||word.charAt(0)=='U'){
          sb.append(word);
            }
            else{
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }
            sb.append("ma");
            for(int j=0;j<=i;j++){
                sb.append("a");
            }
            if(i!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
