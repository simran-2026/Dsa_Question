class Solution {
    public int solveWordWrap(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int[] dp = new int [n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n] =0;
        for(int curr = n-1; curr>=0;curr--){
            int sum =0;
             for(int i = curr; i<n;i++){
                 sum+=arr[i];
                 int tot =sum + (i-curr);
                 
                 
                 if(tot >k ){
                     break;
                 }
                 if(i == n-1){
                     dp [curr] = Math.min(dp[curr],0);
                 } else{
                     int cost = (k-tot) *(k-tot);
                     dp[curr]=Math.min(dp[curr] , cost+dp[i+1]);
                 }
             }
        }
        return dp[0];
    }
}
