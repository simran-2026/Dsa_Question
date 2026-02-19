class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            while(nums[nums[i]-1] !=nums[i]){
                int ci = nums[i] -1;
                int temp = nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
        }
        for(int i =0;i<n;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
            }
        }
        return res;
    }
}