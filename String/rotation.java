class Solution {
    // Function to check if two strings are rotations of each other or not.
     static int[] lps(String s){
         
         int n = s.length();
         int [] lps= new int [n];
          
          int prefix =0 ;
          int suffix = 1;
          
          while (suffix<n){
              // match 
              if(s.charAt(prefix)==s.charAt(suffix)){
                  prefix++;
                  lps[suffix] = prefix ;
                  suffix++;
                  
              }
              else{
                  if(prefix ==0){
                      lps[suffix]=0;
                      suffix++;
                  }
                  else
                  {
                      prefix = lps[prefix-1];
                  }
              }
              
              
          }
          return lps;
     }
   
    public static boolean areRotations(String s1, String s2) {
        // Your code here
    
    
    
        String txt = s1 +s1 ;
        String pat = s2;
        
        
        int n= txt.length();
        int m = pat.length();
        
        
        int i =0;
        int j = 0; 
        int[] lps = lps(s2);
        
       while(i<n){
           if(txt.charAt(i) == pat.charAt(j)){
               i++;
               j++;
               
           } 
           if(j==m){
               return true;
               
           }
           else if( i<n && pat.charAt(j) != txt.charAt(i)){
               if(j==0){
                   i++;
                   
               }else{
                   j = lps[j-1];
               }
           }
           
       }
       return false;
    }
}
