/*
 Leetcode: 1678 - Goal Parser Interpretation
 Leetcode link:https://leetcode.com/problems/goal-parser-interpretation/
*/

class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.startsWith("()",i)){
                sb.append("o");
                i++;
            }
            if(command.startsWith("(al)",i)){
                sb.append("al");
                i=i+3;
            }
        }
        return sb.toString();
    }
}
