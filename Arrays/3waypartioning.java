class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public boolean threeWayPartition(int arr[], int a, int b) {
        // code here
         int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] < a) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] >= a && arr[mid] <= b) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return true;
    }
}
