class Solution {
    
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            else if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')) return false;
            else if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) != ')') return false;
            else if (!stack.isEmpty() && stack.peek() == '[' && s.charAt(i) != ']') return false;
            else if (!stack.isEmpty() && stack.peek() == '{' && s.charAt(i) != '}') return false;
            else if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else if (!stack.isEmpty() && stack.peek() == '[' && s.charAt(i) == ']') stack.pop();
            else if (!stack.isEmpty() && stack.peek() == '{' && s.charAt(i) == '}') stack.pop();
        }
        return stack.isEmpty();
    }
    
}
