class Solution {
    
    static char flip(char  ch ){
        return (ch =='0') ? '1': '0';
    }
    
    
    static int getflip( String s ,  char expected){
        int flipcount = 0;
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != expected){
                flipcount++;
                
            }
            expected  = flip(expected);
            
        }
    return flipcount;
    
    
    }
    public int minFlips(String s) {
        // Code here
      int minflip = Math.min (getflip(s , '0'), getflip(s,'1'));
       return minflip ;
      
    }
}
