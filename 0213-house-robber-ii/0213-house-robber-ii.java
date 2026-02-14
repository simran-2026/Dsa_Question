class Solution {

    // helper for normal house robber (linear)
    private int robLinear(int[] nums, int start, int end) {
        int last = 0;      // dp[i-1]
        int sl = 0;     // dp[i-2]

        for (int i = start; i <= end; i++) {
           
            int curr = Math.max(nums[i]+sl, last);

            sl = last;
            last = curr;
        }
        return last;
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // case 1: exclude last house
        int case1 = robLinear(nums, 0, n - 2);

        // case 2: exclude first house
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }
}
