lass Solution {
    long countTriplets(int n, int sum, long arr[]) {
        
        Arrays.sort(arr);
        int ans = 0 ;
        
        for(int i = 0; i< n-2; i++){
            int j = i+1;
            int k = n-1;
            
            while(j< k){
                if(arr[i]+arr[j]+arr[k]>=sum){
                    k--;
                }else{
                    ans += k-j;
                    j++;
                    
                }
            }
            
        }
        return ans ;
        
        
    }
}
