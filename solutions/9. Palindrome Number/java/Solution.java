class Solution {
    
    public boolean isPalindrome(int x) {
        String xAsStr = String.valueOf(x);
        if(xAsStr.startsWith("-")) return false;
        return xAsStr.equals(new StringBuilder(xAsStr).reverse().toString());
    }
    
}
