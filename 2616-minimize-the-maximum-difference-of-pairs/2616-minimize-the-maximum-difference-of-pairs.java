import java.util.*;

class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p == 0) return 0;

        Arrays.sort(nums);

        int left = 0;
        int right = nums[nums.length - 1] - nums[0]; // max possible diff
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFormPairs(nums, p, mid)) {
                answer = mid;
                right = mid - 1; // try smaller max difference
            } else {
                left = mid + 1;  // need bigger max difference
            }
        }
        return answer;
    }

    // Greedy check
    private boolean canFormPairs(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i + 1] - nums[i] <= maxDiff) {
                count++;
                i += 2; // skip both
            } else {
                i++; // try next element
            }
            if (count >= p) return true;
        }
        return false;
    }
}
