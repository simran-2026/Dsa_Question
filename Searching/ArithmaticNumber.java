class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
        if (c==0){
          return (a==b) ?1:0; 
        }
        if((b-a)%c != 0){
            return 0;
        }
        
        int k = (b-a)/c;
        return (k>=0) ?1:0;
    }
}
