class Solution { 
    static int MAX_CHAR = 26;
    public static int solve(int n, String s) {
        // code here
        char[] seq = s.toCharArray();
        char [] seen = new char[MAX_CHAR];
        
        int res = 0 ;
        int occupied = 0;
        
        
        for(int i = 0 ; i<seq.length; i++){
            int ind = seq[i] -'A';
            
            if(seen [ind]==0){
                seen[ind]=1;
                if(occupied <n){
                    occupied ++;
                    seen[ind]=2;
                }
                else 
                {
                    res++;
                }
            }else{
                if(seen[ind] == 2){
                    occupied --;
                    seen[ind]=0;
                }
            }
            
        }
        return res;
    }
}
