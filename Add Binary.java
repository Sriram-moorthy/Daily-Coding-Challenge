/*
 Leetcode: 67 -  Add Binary
 Leetcode link:https://leetcode.com/problems/add-binary/
*/
// Approach 1:
class Solution {
    public String addBinary(String a, String b) {
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String binary=Integer.toBinaryString(sum);
        return binary;
    }
}

// Approach 2:
class Solution {
    public String addBinary(String a, String b) {
        if(a.equals("0")&&b.equals("0")){
            return "0";
        }
        int decimal1 = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char bit = a.charAt(i);
            decimal1 = decimal1 * 2 + (bit - '0'); 
        }
           int decimal2 = 0;
        
        for (int i = 0; i <b.length(); i++) {
            char bit = b.charAt(i);
            decimal2 = decimal2 * 2 + (bit - '0'); // shift left and add bit
        }
        int sum=decimal1+decimal2;
        String binary="";
        while(sum>0){
            int rem=sum%2;
            binary=rem+binary;
            sum=sum/2;
        }
        ;
        return binary;
      
         

    
    }
}
// ApproCH 3:
class Solution 
{
  public String addBinary(String a, String b) 
  {
    StringBuilder sb = new StringBuilder();
    int num = 0;
    int i=a.length() - 1;
    int j=b.length() - 1;

    while (i>= 0|| j>= 0||num == 1) 
    {
      if(i >= 0)
        num += a.charAt(i--) - '0';
      if(j >= 0)
        num += b.charAt(j--) - '0';
      sb.append(num % 2);
      num /= 2;
    }
    return sb.reverse().toString();
  }
}
