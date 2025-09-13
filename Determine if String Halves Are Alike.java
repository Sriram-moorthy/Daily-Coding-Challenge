/*
 Leetcode 1704 - Determine if String Halves Are Alike
 Leetcode link:https://leetcode.com/problems/determine-if-string-halves-are-alike/
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        char ch[] = s.toCharArray();
        int a_count =0;
        int n = ch.length/2;
        for(int i=0;i<n;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                a_count++;
            }
        }
        int b_count =0;
        for(int j=n;j<ch.length;j++){
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U'){
                b_count++;
            }
        }
        return a_count==b_count;
    }
}
