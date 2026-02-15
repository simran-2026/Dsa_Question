// User function Template for Java

class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        if(c==0){
            if(a==b){
                return 1;
            }else{
                return 0;
            }
        }
        
        
        int val = b-a;
        
        if(val % c ==0 && val/c >=0)
        {
            return 1;
            
        }
        return 0;
    }
}