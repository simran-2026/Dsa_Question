class Solution {
    int median(int mat[][]) {
        // code here
        
    int n = mat.length;
        int m = mat[0].length;

        // Initializing the minimum and maximum values
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Iterating through each row of the matrix
        for (int i = 0; i < n; i++) {
          
            // Updating the minimum value if current element is smaller
            if (mat[i][0] < min) 
              	min = mat[i][0];

            // Updating the maximum value if current element is larger
            if (mat[i][m - 1] > max) 
              	max = mat[i][m - 1];
        }

        // Calculating the desired position of the median
        int desired = (n * m + 1) / 2;

        // Using binary search to find the median value
        while (min < max) {
          
            // Calculating the middle value
            int mid = min + (max - min) / 2;

            // Counting the number of elements less than or equal to mid
            int place = 0;
            for (int i = 0; i < n; i++) {
                place += upperBound(mat[i], mid);
            }

            // Updating the search range based on the count
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        // Returning the median value
        return min;
    }

    // Helper function to find the upper bound of a number in a row
    static int upperBound(int[] row, int num) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= num) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
