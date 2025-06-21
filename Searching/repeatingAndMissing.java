class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        
        int repeating = -1;
        int missing = -1;
        ArrayList <Integer> res = new ArrayList<>();
       HashSet <Integer> set = new HashSet<>();
      
      
      for(int num :arr){
          if(set.contains(num)){
              repeating = num;
          }
          set.add(num);
      }
      
      
      for(int i = 1; i <=n;i++){
          if(!set.contains(i)){
              missing = i ;
              break;
          }
      }
      res.add(repeating);
      res.add(missing);
      
       return res;
    }
}
