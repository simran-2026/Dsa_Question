class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
         Arrays.fill(dp, -1);
        return util(nums,0,dp);
    }

    public static int util(int[]nums,int i,int[] dp ){
          
          if(i>=nums.length){
            return 0;
          }
          if(dp[i]!=-1){
            return dp[i];
          }


          dp[i]= Math.max(util(nums,i+1,dp), nums[i]+util(nums,i+2,dp));
          return dp[i];
    }
}