class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int j=0;
        int k =arr.length-1;
        int sum =0;
        for(int i =0;i<arr.length-2;i++){
           
               j =i+1;
               k = arr.length-1;
               while(j<k){
                   sum= arr[i]+arr[j]+arr[k];
                   if(sum ==target){
                       return true;
                   }
                  
                   if(sum > target){
                       k--;
                   }else{
                       j++;
                   }
               }
            }
    
        return false;
    }
}
