class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int i =0;
        int j =0;
        int k =arr.length-1;
        while(i<=k){
            if(arr[i]<a){
                swap(arr,j,i);
                i++;
                j++;
            }else if(arr[i]>b){
                swap(arr,k,i);
                k--;
            }else{
                i++;
            }
        }
    }
}