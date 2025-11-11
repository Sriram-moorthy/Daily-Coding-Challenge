/*
 Leetcode: 1323 -  Maximum 69 Number
 Leetcode link:https://leetcode.com/problems/maximum-69-number/
*/

class Solution {
    public int maximum69Number (int num) {
        String n=String.valueOf(num);
        char[] arr=n.toCharArray();
        for(int i=0;i<n.length();i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}
