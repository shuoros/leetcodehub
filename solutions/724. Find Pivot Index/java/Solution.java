class Solution {
    
    public int pivotIndex(int[] nums) {
        int sumFrom0 = 0;
        int sum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (sumFrom0 == sum - sumFrom0 - nums[i])
                return i;
            sumFrom0 += nums[i];
        }
        return -1;
    }
    
}
