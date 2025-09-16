/*
 Leetcode: 657 - Robot Return to Origin
 Leetcode link:https://leetcode.com/problems/robot-return-to-origin/
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                x=x-1;
            }else if(ch=='R'){
                x=x+1;
            }else if(ch=='U'){
                y=y+1;
            }else{
                y=y-1;
            }
        }
        return x==0 && y==0;
    }
}
