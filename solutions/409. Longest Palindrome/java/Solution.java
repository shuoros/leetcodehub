class Solution {
    
    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        Set<Character> appearances = new HashSet<>();
        short answer = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (appearances.contains(s.charAt(i))) {
                appearances.remove(s.charAt(i));
                answer++;
            } else {
                appearances.add(s.charAt(i));
            }
        }
        return answer * 2 + ((appearances.size() != 0) ? 1 : 0);
    }
    
}
