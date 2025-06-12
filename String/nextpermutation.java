class Solution {
    
    void swap( int [] arr , int i , int j){
        int temp = arr[i];
         arr[i]= arr[j];
         arr[j]= temp;
    }
    void reverse( int arr[] , int start, int end){
      while(start < end ){
          swap(arr ,start++, end--);
      }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
         int pivot = -1;
      // Find the first decreasing element from the end
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return ;
        }

         
         for(int i = n-1 ; i > pivot; i-- ){
            
             if (arr[pivot]<arr[i]){
                  swap (arr , pivot, i);
                  break;
             }
         }
         
         reverse(arr , pivot+1, arr.length-1);
        
    }
}
