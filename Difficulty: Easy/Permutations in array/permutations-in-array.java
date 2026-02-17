class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr2.length;
        int i =0;
        while(i<arr1.length)
        {
             if(arr1[i] + arr2[n-i-1] <k ){
                return false;
            }
        i++;
            
        }return true;
    }
}