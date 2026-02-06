import java.util.*;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxWindow = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= (long) nums[i] * k) {
                j++;
            }
            maxWindow = Math.max(maxWindow, j - i);
        }

        return n - maxWindow;
    }
}
