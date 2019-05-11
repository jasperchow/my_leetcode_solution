class Solution {
    public int maxSubArray(int[] nums) {
        // Using dynamic programming to tackle,Subproblem: what is the maximum subarray up to current index? max(current_max + num[currrent_index], num[current_index])
        int global_max = nums[0];
        int current_max = nums[0];
        // start from the second element
        for(int i = 1; i < nums.length; i++){
            current_max = Math.max(current_max + nums[i], nums[i]);
            global_max = Math.max(current_max,global_max);
        }
        return global_max;
    }
}