class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int prefix =0;
        int min = Integer.MAX_VALUE;
         int j = 0;
        for(int i =0;i< arr.length;i++){
            prefix += arr[i];
            
               
               
               
                while(prefix>x){
                     min = Math.min(min, i-j+1);
                    prefix-=arr[j];
                    j++;
                }
                
            
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}
