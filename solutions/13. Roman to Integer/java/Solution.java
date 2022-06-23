class Solution {
    
    private final Map<Character, Integer> rToI = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private final Map<String, Integer> hybrid = new HashMap<>() {{
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};

    public int romanToInt(String s) {
        char[] sAsCharArray = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < sAsCharArray.length; i++) {
            if (i + 1 != sAsCharArray.length &&//
                    hybrid.containsKey(String.valueOf(sAsCharArray[i]) + String.valueOf(sAsCharArray[i + 1]))) {
                sum += hybrid.get(String.valueOf(sAsCharArray[i]) + String.valueOf(sAsCharArray[i + 1]));
                i++;
            } else {
                sum += rToI.get(sAsCharArray[i]);
            }
        }
        return sum;
    }
    
}
