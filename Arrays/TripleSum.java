class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0;i<n-2;i++){
            int start = i+1;
            int end = n-1;
            while(start<end){
                int temp = arr[start]+ arr[end];
                if(temp + arr[i] == target){
                    return true;
                }else if(temp>target-arr[i]){
                    end--;
                    
                }else{
                    start++;
                }
            }
        }
        return false;
    }
}
