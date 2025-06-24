class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[]) {
        // Code here
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int [] temp = arr.clone();
        Arrays.sort(temp);
        int cnt=0;
         HashMap <Integer, Integer> map = new HashMap<>();
         
         
         for(int i =0; i<n;i++){
             map.put(arr[i], i);
         }
         
         for(int i = 0 ; i<n;i++){
             if(temp[i] != arr[i]){
              
                int j=  map.get(temp[i]);  
                
                // swapping part 
                int x = arr[i];
                arr[i]= arr[j];
                arr[j]= x;
                
                
                
                map.put(arr[i], i);
                map.put(arr[j],j);
                
                   cnt++;
             }
         }
         
         return cnt;
    }
}
