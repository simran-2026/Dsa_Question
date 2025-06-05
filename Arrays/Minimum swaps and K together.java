class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int  n = arr.length;
        
         
        // Find the number of elements <= k
        int good = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k)
                good += 1;
        }

        // Initialize min swaps with good as the max possible
        // value
        int bad = 0, minSwaps = good;
        for (int i = 0; i < n; i++) {
            // If the current element > k, then increment the
            // count of bad elements in the current sliding
            // window
            if (arr[i] > k) {
                bad += 1;
            }
            // If we complete the first sliding window,
            // calculate min swaps
            if (i == good - 1) {
                minSwaps = Math.min(minSwaps, bad);
            } else if (i >= good) {
                // Exclude the elements from the start of the
                // sliding window to maintain its size as 'good'
                if (arr[i - good] > k)
                    bad -= 1;
                // For every sliding window of size 'good', find
                // the minimum swaps required
                minSwaps = Math.min(minSwaps, bad);
            }
        }
        // Return the minimum swaps
        return minSwaps;
    }
}
