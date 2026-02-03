class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int prefix =0;
        int min = Integer.MAX_VALUE;
        int j=0;
        for(int i = 0; i< nums.length;i++){
            prefix+=nums[i];
            while(prefix >=target){
                min=Math.min(min, i-j+1);
                prefix-=nums[j];
                j++;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}