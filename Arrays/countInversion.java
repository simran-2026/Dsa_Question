class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int i = 0;
        int j = i+1;
        int count =0;
        
         while (j <arr.length-1){
             if(arr[i] <arr[j]){
                 i++;
                 j++;
                 
             }
             if(arr[i]> arr[j]){
                 count ++;
                //  swap
                 int temp = arr[i];
                 arr[i]= arr[j];
                 arr[j]=arr[i];
                 
                 // count it from starting 
                 i = 0 ; 
                 j = i+1;
             }
             
         }
         return count;
    }
}
