class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        boolean isValid = true;
        for(char ch:s.toCharArray()) {
            if(!isValid) {
                break;
            }
            if(ch == '{' || ch == '[' || ch == '(') {
                deque.push(ch);
            } else if(deque.size() > 0){
                char top = deque.peek();
                boolean isValidClosing = false;
                if(top == '{' && ch == '}'){
                    isValidClosing = true;
                } else if (top == '(' && ch == ')') {
                    isValidClosing = true;
                } else if (top == '[' && ch == ']') {
                    isValidClosing = true;
                } else {
                    isValid = false;
                }
                if(isValidClosing) {
                    deque.pop();
                }
            } else {
                isValid = false;
            }
        }
        if(isValid && deque.size()>0){
            isValid = false;
        }
        return isValid;
    }
}
