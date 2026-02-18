class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        int i=0;
        int n = nums.length;
        while(i < nums.length-2){
             if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
             }
             int left = i+1;
             int right= nums.length-1;
             while(left<right){
                 int val = nums[i]+nums[left]+nums[right];
               
                if(val == 0){
                List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    res.add(ans);
                    left++;
                    right--;
                while( left < right && nums[left]== nums[left-1] )left++;
                while( left <right && nums[right]==nums[right+1])right--;
               
                }else if(val>0){
                    right--;
                }else{
                    left++;
                }

               
             }
              i++;
        }
        return res;
    }
}