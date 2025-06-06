class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        int n = arr.length;
        int res=0;
        Map<Integer,Integer> pI = new HashMap<>();
        int sum =0;
        for(int i =0;i<n;i++){
            sum = ((sum +arr[i])%k+k)%k;
            if(sum==0){
                res = i+1;
                
            }
            else if(pI.containsKey(sum))
            {
                res = Math.max(res,i-pI.get(sum));


            }else{
                pI.put(sum,i);
            }
        }
        
        return res;
    }
}
