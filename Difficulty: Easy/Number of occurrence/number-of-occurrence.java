class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        int i =0;
        while(i < arr.length){
            if(arr[i]==target){
                while( i<arr.length && arr[i] ==target  ){
                  count++;
                    i++;
                }
            }else{
            i++;
                
            }
        }
        return count;
    }
}
