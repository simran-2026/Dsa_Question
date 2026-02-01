import java.util.*;

class Solution {
    public int minimumCost(int[] nums) {
        // First element is always included
        int cost = nums[0];
        
        // Get the rest of the array
        int[] rest = Arrays.copyOfRange(nums, 1, nums.length);
        
        // Sort remaining elements
        Arrays.sort(rest);
        
        // Add two smallest from remaining
        cost += rest[0] + rest[1];
        
        return cost;
    }
}
