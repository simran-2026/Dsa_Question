class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n = arr.length;
        int w = n/k;
         int s = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i = 0 ; i< n; i++){
             map.put(arr[i], map.getOrDefault(arr[i],0)+1);
         }
         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
             if(entry.getValue()>w){
                 s++;
                 
             }
             
         }
         return s;
    }
}
