class Solution {
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int pointer = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[i - 1])
                if (++pointer != i) nums[pointer] = nums[i];
        return ++pointer;
    }
    
}
