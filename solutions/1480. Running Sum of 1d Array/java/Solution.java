class Solution {
    
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i] + ((i - 1 == -1) ? 0 : result[i - 1]);
        }
        return result;
    }
    
}
