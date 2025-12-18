class Solution {
    public int minimumDifference(int[] nums, int k) {
       if (k==0) return 0;
       Arrays.sort(nums);
       int minDifference=Integer.MAX_VALUE;
       for(int i=0;i+k-1<nums.length;i++){
        minDifference=Math.min(minDifference,nums[i+k-1]-nums[i]);

       } 
       return minDifference;
    }
}