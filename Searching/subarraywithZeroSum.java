class Solution {
    public int findSubarray(int[] arr) {
        // code here.
    
        int n = arr.length;
       int prefixSum = 0;
       int count = 0 ;
        Map<Integer, Integer> prefixSumFrequency = new HashMap<>();
        prefixSumFrequency.put(0, 1); // Initialize with prefix sum 0 occurring once
        
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSumFrequency.containsKey(prefixSum)) {
                count += prefixSumFrequency.get(prefixSum);
                prefixSumFrequency.put(prefixSum, prefixSumFrequency.get(prefixSum) + 1);
            } else {
                prefixSumFrequency.put(prefixSum, 1);
            }
        }
        
        return count;
       
    }
    
}
