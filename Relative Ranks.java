class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] arr=score.clone();
        Arrays.sort(score);
        HashMap<Integer,String> map = new HashMap<>();
        if(n>=1) map.put(score[n-1],"Gold Medal");
        if(n>=2) map.put(score[n-2],"Silver Medal");
        if(n>=3) map.put(score[n-3],"Bronze Medal");
        for(int i=n-4;i>=0;i--){
            map.put(score[i],String.valueOf(n-i));
        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}
