class Solution {
    int majorityElement(int arr[]) {
        // code here
        int max =0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        int[] freq= new int[max+1];
        for(int e : arr){
            freq[e]++;
        }
        int req= arr.length/2;
        for(int i = 0; i <freq.length;i++){
            if(freq[i]>req){
                return i;
            }
        }
        return -1;
    }
}