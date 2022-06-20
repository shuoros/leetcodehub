class Solution {
    
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            steps++;
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
        }
        return steps;
    }
    
}
