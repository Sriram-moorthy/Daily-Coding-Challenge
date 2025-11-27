/*
 Leetcode: 3731 - Find Missing Elements
 Leetcode link:https://leetcode.com/problems/find-missing-elements
*/

class Solution{
    public List<Integer> findMissingElements(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            set.add(num);
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
