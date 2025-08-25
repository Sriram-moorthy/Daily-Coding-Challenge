/*
Leetcode: 2011 -  Final Value of Variable After Performing Operations
Leetcode link:https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
*/

//Approach 1:

class Solution {
    public int finalValueAfterOperations(String[] operations) {
    int ans=0;
    for(String value:operations){
        ans+=(44-value.charAt(1));
    }
    return ans;
}
}

//Approach 2:

class Solution {
    public int finalValueAfterOperations(String[] operations) {
     int X=0;
     for(int i=0 ; i<operations.length ; i++){
        String op = operations[i];
        if(op.equals("X++") || op.equals("++X")){
            X++;
        }
        else{
            X--;
        }
     }    
     return X;
    }
}
