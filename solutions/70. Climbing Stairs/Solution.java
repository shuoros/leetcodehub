class Solution {
    
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int last = 0, current = 1, tmp;
        for (int i = 2; i <= n; i++) {
            tmp = last + current;
            last = current;
            current = tmp;
        }
        return current + last;
    }
    
}
