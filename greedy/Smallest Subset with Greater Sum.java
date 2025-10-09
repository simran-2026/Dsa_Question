
class Solution {
    // Function to find the minimum length of a subset
    int minSubset(int[] arr) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        
        
        sum = sum/2;
        Arrays.sort(arr);

        int res = 0, curr_sum = 0;
        for (int i = n - 1; i >= 0; i--) {

            curr_sum += arr[i];
            res++;

            // Current sum greater than sum
            if (curr_sum > sum)
                return res;
        }
        return res;
        
    }
}
