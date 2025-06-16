
    class Solution {
    static boolean match(String wild, String pattern) {
        int n = wild.length();
        int m = pattern.length();
        
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        
        // Initialize first column (pattern is empty)
        for (int i = 1; i <= n; i++) {
            if (wild.charAt(i-1) == '*') {
                dp[i][0] = dp[i-1][0];
            } else {
                dp[i][0] = false;
            }
        }
        
        // Initialize first row (wild is empty)
        for (int j = 1; j <= m; j++) {
            dp[0][j] = false;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (wild.charAt(i-1) == pattern.charAt(j-1) || wild.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (wild.charAt(i-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[n][m];
    }
}
