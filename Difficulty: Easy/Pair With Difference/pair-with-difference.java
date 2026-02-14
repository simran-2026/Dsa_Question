
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
      int i =0;
      int j =1; 
      Arrays.sort(arr);
      while(i<arr.length&& j<arr.length){
          
          if(i==j){
              j++;
              continue;
          }
          
          if(arr[j]-arr[i] == x){
              return true;
          }else if(arr[j]-arr[i] < x){
              j++;
          }else{
              i++;
          }
      }
      return false ;
        
    }
}
