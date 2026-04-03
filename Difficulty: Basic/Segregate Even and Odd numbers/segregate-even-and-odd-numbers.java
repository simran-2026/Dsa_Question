class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int n = arr.length;
        int j =0;
        for(int i =0; i<n;i++){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
        Arrays.sort(arr, 0,j);
        Arrays.sort(arr,j,n);
    }
}