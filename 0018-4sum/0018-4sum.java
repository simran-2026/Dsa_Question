class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

       int n = nums.length;
       for(int i =0; i<n-3;i++){
         
         if(i>0 && nums[i-1]==nums[i]){
            continue;
         }


        for(int j =i+1;j<n-2;j++){
             if(j > i+1 && nums[j-1] == nums[j]){
                
                continue;
             }

            int left = j+1;
            int right=n-1;
            while(left < right){
                long val = (long) nums[i]+nums[j]+nums[left]+nums[right];
                if(val== target){
                    res.add(Arrays.asList( nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right --;
                    while(left < right && nums[left] == nums[left-1])left++;
                    while(left <right && nums[right] == nums[right+1])right--;
                }else if(val > target){
                    right--;
                }else{
                    left++;
                }
            }


        }
       }
       return res ;
    }
}