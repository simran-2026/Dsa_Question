class Solution {
    
    
    static boolean isPossible(int [] stalls , int k , int minimumPossible){
        int n = stalls.length;
        int cows = 1 ; 
        int lp= stalls[0];
        for(int i = 1; i<n;i++){
            if( stalls[i] - lp >= minimumPossible){
                cows++;
                lp = stalls[i];
                
            }
            if(cows == k){
                return true;
            }
        }
        return false;
        
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int start = 1; 
        int end = stalls[n-1]- stalls[0];
        
        int ans = -1;
        
        while (start<=end){
            int mid = (start +end )/2;
            
            if(isPossible ( stalls , k , mid )){
                ans = mid;
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return ans; 
    }
}
