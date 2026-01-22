class Solution {
    public int minFlips(String s) {
        // Code here
        int flips0=0;
        int flips1=0;
        
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(i%2==0 ){
                if(c!='0'){
                    flips0++;
                }
                if(c!='1') flips1++;
            }else{
                if(c!='0'){
                    flips1++;
                }
                if(c!='1') flips0++;
            }
            
        }
        return Math.min(flips0,flips1);
    }
}