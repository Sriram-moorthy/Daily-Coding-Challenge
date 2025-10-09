/*
 Leetcode: 2149 - Rearrange Array Elements by Sign
 Leetcode link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
*/

// Approach 1:
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos=0;
        int neg=1;
        int[] ans=new int[n];
         for(int num:nums){
            if(num>0){
                ans[pos]=num;
                pos+=2;
            }else{
                ans[neg]=num;
                neg+=2;
            }
         }
        return ans;
      
    }
}

// Approach 2:
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] clone=nums.clone();
        int index=0;
        int n=nums.length;
        int[] ans=new int[n];
          int place=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                nums[place]=nums[i];
                place++;
            }
        }
        int j=0;
        while(place<nums.length){
            if(clone[j]<0){
                nums[place]=clone[j];
                place++;
            }
            j++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                index=i;
                break;
            }
        }
        int k=0,posIndex=0,negIndex=index;
        while(posIndex<index && negIndex<n){
            ans[k++]=nums[posIndex++];
            ans[k++]=nums[negIndex++];
        }
        return ans;
      
    }
}

// Approach 3:
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
       ArrayList<Integer> pos=new ArrayList<>();
       ArrayList<Integer> neg=new ArrayList<>();
       
      for(int i=0;i<n;i++){
        if(nums[i]>0){
            pos.add(nums[i]);
        }else{
            neg.add(nums[i]);
        }
      }
        int index = 0;
        int i = 0, j = 0;
        while (i < pos.size() && j < neg.size()) {
            ans[index++] = pos.get(i++);
            ans[index++] = neg.get(j++);
        }

        while (i < pos.size()) {
            ans[index++] = pos.get(i++);
        }
        while (j < neg.size()) {
            ans[index++] = neg.get(j++);
        }
        return ans;
    }
}
