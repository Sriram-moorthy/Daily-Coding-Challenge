/*
 Leetcode: 989 - Add to Array-Form of Integer
 Leetcode link:https://leetcode.com/problems/add-to-array-form-of-integer/
*/
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=num.length-1;
        int carry=k;
        while(i>=0||carry>0){
            if(i>=0){
                carry+=num[i];
                i--;
            }
            list.add(carry%10);
            carry/=10;
        }
        Collections.reverse(list);
        return list;

    }
}
