class Solution {
    public static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sort012(int[] arr) {
        // code here
        int i=0;
        int k =arr.length-1;
        int j=0;
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==2){
                swap(arr,i,k);
                k--;
                
            }else{
                i++;
            }
        }
    }
}