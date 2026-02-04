class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int j = 0;
        while (j < nums.length - 2) {

            if (j > 0 && nums[j] == nums[j - 1]) {
                j++;
                continue;
            }

            int i = j + 1;
            int k = nums.length - 1;

            while (i < k) {
                int sum = nums[j] + nums[i] + nums[k];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[j], nums[i], nums[k]));
                    i++;
                    k--;

                    while (i < k && nums[i] == nums[i - 1]) i++;
                    while (i < k && nums[k] == nums[k + 1]) k--;

                } else if (sum > 0) {
                    k--;
                } else {
                    i++;
                }
            }
            j++;
        }
        return res;
    }
}
