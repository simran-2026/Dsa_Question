class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
      int n = nums.size();
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< n; i++){
            if(nums.get(i) == i+1){
                res.add(nums.get(i));
            }
        }
        
        return res;
    
   
    
    }
}  // code here
       
