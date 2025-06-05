class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
         int cs =0;
         
         int ms = Integer.MIN_VALUE;
        
          for(int i =0;i<arr.length;i++){
              cs = arr[i] + cs ;
              
              if(cs>ms){
                  ms = cs;
              }
              if(cs < 0 ){
                  cs = 0;
              }
              
          }
          return ms;
          
    }
}
