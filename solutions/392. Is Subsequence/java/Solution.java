class Solution {
    
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        short lastFoundedIndex = -1;
        for (char c : sArr) {
            boolean founded = false;
            short foundedIndex = -1;
            for (short j = 0; j < tArr.length; j++) {
                if(j == lastFoundedIndex) continue;
                if (c == tArr[j] && j > lastFoundedIndex) {
                    founded = true;
                    foundedIndex = j;
                    break;
                }
            }
            if (!founded) return false;
            lastFoundedIndex = foundedIndex;
        }
        return true;
    }
    
}
