class Solution {
    public int minPatches(int[] nums, int n) {
        int patchCount = 0;
        long till = 0;
        int i=0;
        while( till < n){
            if(i < nums.length && till >= nums[i]-1){
                till += nums[i];
                i++;
            }else{
                till += (till+1);
                patchCount++;
            }
        }
        return patchCount;
    }
}
