class Solution {
    static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }
           
            if (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }

        return nums;
    }
}
