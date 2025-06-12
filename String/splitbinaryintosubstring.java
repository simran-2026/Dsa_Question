// User function Template for Java

class Solution {
    public static int maxSubStr(String s) {
        // Write your code here
        int count0 = 0;
        int count1=0;
        int cnt = 0;
        for(int i = 0 ; i<s.length();i++){
            
            if(s.charAt(i) == '0'){
                count0++;
            }
            
            if(s.charAt(i) == '1'){
                count1++;
            }
            
            if(count0 == count1){
                cnt++;
            }
            
        }
        
         if (count0 != count1) 
    {
        return -1;
    }
        return cnt;
    }
}
