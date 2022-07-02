class Solution {
    
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int last = 0, current = 1, tmp;
        for (int i = 2; i <= n; i++) {
            tmp = last + current;
            last = current;
            current = tmp;
        }
        return current;
    }
    
}
