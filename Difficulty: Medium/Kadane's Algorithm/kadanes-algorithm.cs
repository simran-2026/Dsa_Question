class Solution {
    public int maxSubarraySum(int[] arr) {
        // code here
        int res = arr[0];
        int max= arr[0];
        for(int i=1;i<arr.Length;i++){
            max = Math.Max(max+arr[i], arr[i]);
            res = Math.Max(max,res);
        }
        return res;
    }
}