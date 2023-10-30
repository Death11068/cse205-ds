class Solution {
    
    public boolean backspaceCompare(String s, String t) {
        return getCompareString(s).equals(getCompareString(t));
    }

    private Stack<Character> getCompareString(String source) {
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            
            if (currentChar != '#') {
                stack.push(currentChar);
            
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}