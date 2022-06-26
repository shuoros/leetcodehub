class Solution {
    
    public int reverse(int x) {
        try {
            if (x > 0)
                return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString().replaceFirst("0*", ""));
            else if (x < 0)
                return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString().replaceFirst("0*", "").replaceAll("-", "")) * -1;
            else return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
}
