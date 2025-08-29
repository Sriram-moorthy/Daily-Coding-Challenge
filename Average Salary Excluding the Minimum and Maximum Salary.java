/*
Leetcode: 1491 - Average Salary Excluding the Minimum and Maximum Salary
Leetcode link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
*/

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        double avg=sum/(salary.length-2);
        return avg;
    }
}
